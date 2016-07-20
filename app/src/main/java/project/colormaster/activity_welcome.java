package project.colormaster;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;


public class activity_welcome extends AppCompatActivity {
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_activity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                Intent i = new Intent(context,activity_profile_manager.class);
                startActivity(i);
            }
        }, 1500);

    }



}
