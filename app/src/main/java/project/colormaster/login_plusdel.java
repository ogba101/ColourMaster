package project.colormaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login_plusdel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_plusdel_layout);
    }

    public void btncreatep(View v )
    {
        Intent intent = new Intent(this,activity_profile_manager.class);
        startActivity(intent);
    }
}
