package nnk.com.activityone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Naveen on 10/2/2016.
 */

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        Toast.makeText(this, "I am OnCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "I am OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "I am OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this, "I am onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this, "I am onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(this, "I am onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this, "I am OnDestroy", Toast.LENGTH_SHORT).show();
    }
}
