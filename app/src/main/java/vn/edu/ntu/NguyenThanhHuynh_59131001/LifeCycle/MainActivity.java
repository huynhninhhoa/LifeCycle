package vn.edu.ntu.NguyenThanhHuynh_59131001.LifeCycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {
    //gọi id TextView
    TextView txt_Time;

    public MainActivity() {
    //Không tham số
    }

    public MainActivity(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d( "LifeCycle", "onCreate Called" );
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();

        //Phương thức hiển thị thời gian hệ thống qua TextView
        txt_Time = findViewById(R.id.txt_Time);
        SimpleDateFormat simpleDF = new SimpleDateFormat("HH:mm:ss");
        String dateTime = simpleDF.format(new Date());
        txt_Time.setText(dateTime);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "LifeCycle",  "onStart Called" );
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( "LifeCycle",  "onRestart Called" );
        Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "LifeCycle", "onResume Called" );
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();

        //Phương thức hiển thị thời gian hệ thống qua TextView
        txt_Time = findViewById(R.id.txt_Time);
        SimpleDateFormat simpleDF = new SimpleDateFormat("HH:mm:ss");
        String dateTime = simpleDF.format(new Date());
        txt_Time.setText(dateTime);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "LifeCycle",  "onPause Called" );
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onPause Called");
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy Called");
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
