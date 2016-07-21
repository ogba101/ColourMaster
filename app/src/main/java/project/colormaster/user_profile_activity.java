package project.colormaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.ObjectOutputStream;

public class user_profile_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile_activity);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,activity_profile_manager.class);
        startActivity(intent);
    }


    public void btnready(View v )
    {
        Intent intent = new Intent(this,Lesson_Menu_Activity.class);
        startActivity(intent);
    }

    public void btneditp(View v )
    {
        Intent intent = new Intent(this,login_plusdel.class);
        startActivity(intent);
    }
    public void btnviewprogress(View v )
    {
        Intent intent = new Intent(this,progress_report_activity.class);
        startActivity(intent);
    }
    public void btndeletep(View v )
    {
        Intent intent = new Intent(this,activity_profile_manager.class);
        startActivity(intent);
    }

}
