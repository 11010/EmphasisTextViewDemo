package bodor.com.emphasistextviewdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.athkalia.emphasis.EmphasisTextView;
import com.athkalia.emphasis.HighlightMode;

public class MainActivity extends AppCompatActivity {

    EmphasisTextView emphasisTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emphasisTextView = (EmphasisTextView) findViewById(R.id.emphasisTextView);
        emphasisTextView.setText("nihaosile");
       emphasisTextView.setTextToHighlight("nihao");
        emphasisTextView.setHighlightMode(HighlightMode.TEXT);
        emphasisTextView.setTextHighlightColor(R.color.colorPrimary);



        emphasisTextView.highlight();


    }
}
