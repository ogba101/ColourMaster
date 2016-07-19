package project.colormaster;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_profile_manager extends AppCompatActivity
{
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_manager);
<<<<<<< HEAD
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
       android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
    public void btn_add_profile (View v )
    {
        Intent intent = new Intent(context, login_activity.class);
        startActivity(intent);
    }
=======
       }
    public void btnaddp(View v )
    {
        Intent intent = new Intent(this,login_activity.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
>>>>>>> 5992592b9325efffb21d70edcac328dc512c6642
}
