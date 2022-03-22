package ran.am.day6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    SharedPreferences sharedPreferences;
    String s;
    String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.textView);
        sharedPreferences=getSharedPreferences("horiz",MODE_PRIVATE);
        s=sharedPreferences.getString("na","no data");
        s1=sharedPreferences.getString("lo","no data");
    }

    public void retr(View view) {
        tv.setText(s+"\n"+s1);
    }
}