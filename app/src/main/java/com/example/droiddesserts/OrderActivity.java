package com.example.droiddesserts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {
    private static final String TAG_ACTIVITY = OrderActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.sameday:
                if (checked)// Same day service
                    displayToast(getString(R.string.chosen) +getString(R.string.messenger));
            break;

            case R.id.nextday:
                if (checked) // Next day delivery
                    displayToast(getString(R.string.chosen) +getString(R.string.ground));
            break;

            case R.id.pickup:
                if (checked)// Pick up
                    displayToast(getString(R.string.chosen) +getString(R.string.pick_up));
            break;
             default:
                 Log.d(TAG_ACTIVITY, getString(R.string.nothing_clicked));
             break;
        }
    }
}
