package com.example.gradleresttoken;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.UserRecoverableAuthException;

import java.io.IOException;

/**
 * Created by vvarm1 on 10/22/13.
 */
public class MyAsyncTask extends AsyncTask<Void, Void, String> {
    String mEmail;
    String mScope="audience:server:client_id:844764221064-upjlk4kusu4m5e6codrciktnevu26vb0.apps.googleusercontent.com";
    String token;
    private Context context;
    private String TAG="com.example.graleresttoken";
    public MyAsyncTask(Context context){
        this.context = context;
    }

    @Override
    protected String doInBackground(Void... params) {
        String token = null;

        try {
            token = GoogleAuthUtil.getToken(context, "develop.sapstrt@gmail.com", mScope);
        } catch (IOException transientEx) {

            Log.e(TAG, transientEx.toString());
        } catch (UserRecoverableAuthException e) {

            Log.e(TAG, e.toString());

        } catch (GoogleAuthException authEx) {

            Log.e(TAG, authEx.toString());
        }

        return token;
    }

    @Override
    protected void onPostExecute(String token) {
        Log.i(TAG, "Access token retrieved:" + token);
    }

}
