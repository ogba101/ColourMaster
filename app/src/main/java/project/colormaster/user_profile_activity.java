package project.colormaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.ObjectOutputStream;

public class user_profile_activity extends AppCompatActivity {
    ObjectOutputStream h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile_activity);
    }
}
