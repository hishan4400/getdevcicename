package aruna.com.getdevcicename;

import android.bluetooth.BluetoothAdapter;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //USE: adb shell settings list global
        //Some devices uses "device_name" anothers uses "wifi_p2p_device_name"
        String deviceName = Settings.System.getString(getContentResolver(), "device_name");
         Log.v("MainActivity", "system device_name: " + deviceName);
        
        deviceName = Settings.System.getString(getContentResolver(), "wifi_p2p_device_name");
        
        Log.v("MainActivity", "system device_name: " + deviceName);

        BluetoothAdapter myDevice = BluetoothAdapter.getDefaultAdapter();
        deviceName = myDevice.getName();
        Log.v("MainActivity", "bluethooth device_name: " + deviceName);

        deviceName = android.os.Build.MODEL;
        Log.v("MainActivity", "Build.MODEL: " + deviceName);

    }
}
