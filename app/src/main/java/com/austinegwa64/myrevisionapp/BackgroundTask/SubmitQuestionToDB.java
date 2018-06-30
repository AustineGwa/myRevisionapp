package com.austinegwa64.myrevisionapp.BackgroundTask;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by gwaza on 3/24/2018.
 */

public class SubmitQuestionToDB extends AsyncTask<String , String , String> {

    Context ctx;
    ProgressDialog progressDialog;

    public SubmitQuestionToDB(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

        progressDialog = new ProgressDialog(ctx);
        progressDialog.setMessage("loading...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();
    }

    @Override
    protected String doInBackground(String... params) {

        String myUrl = "http://192.168.56.1:8080/questions";
        String output;

       String  quizTitle = params[0] ;
       String  quizDescription = params[1];
       String quizTag = params[2];

        try {
            URL url = new URL(myUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            OutputStream os = connection.getOutputStream();

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(os, "UTF-8"));

            String data = URLEncoder.encode("quizTitle", "UTF-8") + "=" + URLEncoder.encode(quizTitle , "UTF-8") +"&" +
                    URLEncoder.encode("quizDescription", "UTF-8") + "=" + URLEncoder.encode(quizDescription , "UTF-8") +"&" +
                    URLEncoder.encode("quizTag", "UTF-8") + "=" + URLEncoder.encode(quizTag , "UTF-8");

                    bufferedWriter.write(data);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    os.close();

           InputStream is = connection.getInputStream();
           is.close();

           output = "question sent succesfully";

        } catch (MalformedURLException e) {
            e.printStackTrace();
            output = "error " + "cannot find server at the mommemt";
        } catch (IOException e) {
            e.printStackTrace();
            output = "error " + "failed to connect to database";
        }

        return output;
    }

    @Override
    protected void onPostExecute(String result) {
        progressDialog.dismiss();
        Toast.makeText(ctx, result, Toast.LENGTH_SHORT).show();
    }
}
