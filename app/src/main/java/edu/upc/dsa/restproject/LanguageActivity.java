package edu.upc.dsa.restproject;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;
import android.view.View;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class LanguageActivity extends AppCompatActivity {

    TextView messageView;
    Button catalanlanguage, englishlanguage, spanishlanguage, returnBtn2;
    Context context;
    Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        // referencing the text and button views
        messageView = (TextView) findViewById(R.id.textView2);
        catalanlanguage = findViewById(R.id.catalanlanguage);
        englishlanguage = findViewById(R.id.englishlanguage);
        spanishlanguage = findViewById(R.id.spanishlanguage);
        returnBtn2 = findViewById(R.id.returnBtn2);
        String language;

        // setting up on click listener event over the button
        // in order to change the language with the help of
        // LocaleHelper class
        englishlanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(LanguageActivity.this, "en");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.textView2));
                spanishlanguage.setText(resources.getString(R.string.spanishlanguage));
                catalanlanguage.setText(resources.getString(R.string.catalanlanguage));
                englishlanguage.setText(resources.getString(R.string.englishlanguage));
                englishlanguage.setText(resources.getString(R.string.englishlanguage));
                returnBtn2.setText(resources.getString(R.string.ReturnBtn2));
                String language="en";
            }
        });

        catalanlanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(LanguageActivity.this, "ca");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.textView2));
                spanishlanguage.setText(resources.getString(R.string.spanishlanguage));
                catalanlanguage.setText(resources.getString(R.string.catalanlanguage));
                englishlanguage.setText(resources.getString(R.string.englishlanguage));
                englishlanguage.setText(resources.getString(R.string.englishlanguage));
                returnBtn2.setText(resources.getString(R.string.ReturnBtn2));
                String language="ca";

            }
        });

        spanishlanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = LocaleHelper.setLocale(LanguageActivity.this, "es");
                resources = context.getResources();
                messageView.setText(resources.getString(R.string.textView2));
                returnBtn2.setText(resources.getString(R.string.ReturnBtn2));
                spanishlanguage.setText(resources.getString(R.string.spanishlanguage));
                catalanlanguage.setText(resources.getString(R.string.catalanlanguage));
                englishlanguage.setText(resources.getString(R.string.englishlanguage));
                englishlanguage.setText(resources.getString(R.string.englishlanguage));
                String language="es";

            }
        });

    }

    public void returnFunction(View view) {
        Intent intentRegister = new Intent(LanguageActivity.this, LoginActivity.class);
        startActivity(intentRegister);
    }
}
