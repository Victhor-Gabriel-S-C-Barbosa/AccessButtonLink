package victhor.gabriel.appvicthor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnAcessLink);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.udemy.com/course/desenvolvimento-android-do-absoluto-zero-para-iniciantes/")));
            }
        });
    }
}