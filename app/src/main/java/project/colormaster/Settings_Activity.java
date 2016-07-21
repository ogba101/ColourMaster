package project.colormaster;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class Settings_Activity extends AppCompatActivity {
    ToggleButton toggle,tg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);
        toggle=(ToggleButton)findViewById(R.id.toggleButton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!isChecked) {
                    AudioManager amanager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
                //amanager.setStreamMute(AudioManager.STREAM_NOTIFICATION, true);
                 amanager.setStreamMute(AudioManager.STREAM_ALARM, true);
                 amanager.setStreamMute(AudioManager.STREAM_MUSIC, true);
                }
                else{

                    AudioManager amanager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
                    //amanager.setStreamMute(AudioManager.STREAM_NOTIFICATION, false);
                    amanager.setStreamMute(AudioManager.STREAM_ALARM, false);
                    amanager.setStreamMute(AudioManager.STREAM_MUSIC, false);
//            amanager.setStreamMute(AudioManager.STREAM_RING, false);
//            amanager.setStreamMute(AudioManager.STREAM_SYSTEM, false);

                }
            }
        });

    }


//        // Check which checkbox was clicked
//        if (!checked) {
//            AudioManager amanager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
//            //amanager.setStreamMute(AudioManager.STREAM_NOTIFICATION, true);
//            amanager.setStreamMute(AudioManager.STREAM_ALARM, true);
//            amanager.setStreamMute(AudioManager.STREAM_MUSIC, true);
////            amanager.setStreamMute(AudioManager.STREAM_RING, true);
////            amanager.setStreamMute(AudioManager.STREAM_SYSTEM, true);
//        }
//        else

//        }
        }




