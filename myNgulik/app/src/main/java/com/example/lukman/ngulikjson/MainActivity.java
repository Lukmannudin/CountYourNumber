package com.example.lukman.ngulikjson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello = (TextView)findViewById(R.id.textJson);
        String contactJSONString =
                "{\"name\": {\"firstName\":\"Jhon\",\"lastName\":\"Doe\"}, \"title\":\"Missing Person\"}";
        try {
            JSONObject contact = new JSONObject(contactJSONString);
            JSONObject name = contact.getJSONObject("name");
            String firstName = name.getString("firstName");
            String lastName = name.getString("lastName");
            String test = name.getString("name");
            Log.d("first",test);
        } catch (JSONException e) {
            e.printStackTrace();
        }


        Log.d("Tst", "onCreate: ");

    }
}
