package com.nkats.lunchlogger;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by atsushi on 14/01/26.
 */
public class LunchLoggerAddPlace extends Activity {
    static String TAG = "LunchLoggerAddPlace";
    static String EXTRA_PLACE_NAME = "PlaceName";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_place);
        final EditText mPlaceName = (EditText) findViewById(R.id.editText);

        findViewById(R.id.main_addbtn_title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(LunchLoggerAddPlace.this, LunchLoggerMainActivity.class);
                mIntent.putExtra(LunchLoggerAddPlace.EXTRA_PLACE_NAME, mPlaceName.getText().toString());
                Log.d(TAG, mPlaceName.getText().toString());
                startActivity(mIntent);
            }
        });
    }
}