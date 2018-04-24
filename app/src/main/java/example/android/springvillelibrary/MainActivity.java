package example.android.springvillelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTime(View view) {

        TextView infoText = findViewById(R.id.two);
        String screenTextPart1 = getResources().getString(R.string.openDaysOne);
        String screenTextPart2 = getResources().getString(R.string.openDaysTwo);
        String screenTextPart3 = getResources().getString(R.string.openDaysThree);

        String screenText = screenTextPart1 + "\n" + screenTextPart2 + "\n" +  screenTextPart3;
        infoText.setText(screenText);
    }

    public void showWeb(View view) {
        TextView infoText = findViewById(R.id.two);
        String screenText = getResources().getString(R.string.webSite);
        infoText.setText(screenText);
    }

    public void showPhone(View view) {
        TextView infoText = findViewById(R.id.two);
        String screenText = getResources().getString(R.string.phone);
        infoText.setText(screenText);
    }

    public void showAddress(View view) {
        TextView infoText = findViewById(R.id.two);
        String screenText = getResources().getString(R.string.address);
        infoText.setText(screenText);
    }
}
