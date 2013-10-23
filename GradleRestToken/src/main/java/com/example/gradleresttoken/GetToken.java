package com.example.gradleresttoken;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;


//import com.google.cloud.sql.jdbc.internal.Util;

public class GetToken extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_token);

        MyAsyncTask myTask = new MyAsyncTask(this);  //can pass other variables as needed
        myTask.execute();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
