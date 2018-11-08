package cn.refactor.smoothcheckbox;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSample(View v) {
        startActivity(new Intent(this, SampleActivity.class));
    }

    public void toListView(View v) {
        startActivity(new Intent(this, SampleListViewActivity.class));
    }
}
