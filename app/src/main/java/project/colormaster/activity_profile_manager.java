package project.colormaster;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_profile_manager extends AppCompatActivity
{
    final Context context = this;
    Button [] profiles_array = new Button [9];
    int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_manager);

        Button btn_profile_1 = (Button)findViewById(R.id.profile_1);
        Button btn_profile_2 = (Button)findViewById(R.id.profile_2);
        Button btn_profile_3 = (Button)findViewById(R.id.profile_3);
        Button btn_profile_4 = (Button)findViewById(R.id.profile_4);
        Button btn_profile_5 = (Button)findViewById(R.id.profile_5);
        Button btn_profile_6 = (Button)findViewById(R.id.profile_6);
        Button btn_profile_7 = (Button)findViewById(R.id.profile_7);
        Button btn_profile_8 = (Button)findViewById(R.id.profile_8);
        Button btn_profile_9 = (Button)findViewById(R.id.profile_9);

        // create array of buttons
        profiles_array [0]=  btn_profile_1;
        profiles_array [1]=  btn_profile_2;
        profiles_array [2]=  btn_profile_3;
        profiles_array [3]=  btn_profile_4;
        profiles_array [4]=  btn_profile_5;
        profiles_array [5]=  btn_profile_6;
        profiles_array [6]=  btn_profile_7;
        profiles_array [7]=  btn_profile_8;
        profiles_array [8]=  btn_profile_9;



    }

    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.profile_1:
                num = 0;
                break;
            case R.id.profile_2:
                num = 1;
                break;
            case R.id.profile_3:
                num = 2;
                break;
            case R.id.profile_4:
                num = 3;
                break;
            case R.id.profile_5:
                num = 4;
                break;
            case R.id.profile_6:
                num = 5;
                break;
            case R.id.profile_7:
                num = 6;
                break;
            case R.id.profile_8:
                num = 7;
                break;
            case R.id.profile_9:
                num = 8;
                break;
        }


    }


    /*boolean [][] records = new boolean[9][9];
    int


    public int getNum() {
        return num;
    }
*/


    public void btnprofile(View v )
    {
        Intent intent = new Intent(this,user_profile_activity.class);
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
