package com.example.md22intentfilters;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    EditText etLName;
    Button btnEdit;
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLName = (EditText) findViewById(R.id.etLName);

    }

    public void onClick(View v) {

        switch(v.getId()) {
            case R.id.btnTime:
                Intent intent = new Intent("ru.startandroid.intent.action.showtime");
                startActivity(intent);
                break;
            case R.id.btnDate:
                intent = new Intent("ru.startandroid.intent.action.showdate");
                startActivity(intent);
                break;
            case R.id.btnEdit:
                intent = new Intent(this, EditRes.class);
                intent.putExtra("lname", etLName.getText().toString());
                startActivity(intent);
            case R.id.btnName:
                intent = new Intent(this, NameActivity.class);
                startActivityForResult(intent, 1);
                break;
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null) {
            return;
        }
        
        tvName = (TextView) findViewById(R.id.tvName);
        String name = data.getStringExtra("name");
        tvName.setText("Your name is " + name);
    }
}