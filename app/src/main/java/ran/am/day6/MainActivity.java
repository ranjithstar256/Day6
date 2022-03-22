package ran.am.day6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed;
    EditText ed2;
    String s;
    String s1;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor edtr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=findViewById(R.id.editTextTextPersonName); /// initial inside
        ed2=findViewById(R.id.editTextTextPersonName2); /// initial inside
        sharedPreferences=getSharedPreferences("horiz",MODE_PRIVATE);
        edtr=sharedPreferences.edit();

    }

    public void savsf(View view) {
        s= ed.getText().toString();
        s1= ed2.getText().toString();
        edtr.putString("na",s);
        edtr.putString("lo",s1);
        edtr.commit();
        Toast.makeText(this, "Data saved!", Toast.LENGTH_SHORT).show();
    }
}