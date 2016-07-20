package project.colormaster;
import android.app.Application;

/**
 * Created by OGBA on 16-07-19.
 */
public class GlobalClass  extends Application {
    int btnClicked; // the id of the button clicked
    int scores[][]=new int[9][10];// 9 profiles 10 values

    public void setBtnClicked(int value)
    {
        btnClicked=value;
    }
    public int getBtnClicked()
    {
        return btnClicked;
    }

}
