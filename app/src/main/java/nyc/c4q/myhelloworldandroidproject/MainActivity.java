package nyc.c4q.myhelloworldandroidproject;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Running code in onCreate with Darnell!");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG, "Running code in onStart with Darnell!");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG, "Running code in onResume with Darnell!");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG, "Running code in onPause with Darnell!");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG, "Running code in onStop with Darnell!");
    }

}
