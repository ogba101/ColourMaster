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

    }

    public void btnprofile(View v )
    {
        Intent intent = new Intent(this,user_profile_activity.class);
        startActivity(intent);
    }

    public void btnready(View v )
    {
        Intent intent = new Intent(this,Lesson_Menu_Activity.class);
        startActivity(intent);
    }


    public void btncreatep(View v )
    {
        Intent intent = new Intent(this,activity_profile_manager.class);
        startActivity(intent);
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

}
