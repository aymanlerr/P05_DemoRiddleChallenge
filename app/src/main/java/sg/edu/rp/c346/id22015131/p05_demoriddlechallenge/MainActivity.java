package sg.edu.rp.c346.id22015131.p05_demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnRevealQ1, btnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswersActivity.class);
                intent.putExtra("question", "Q1");
                startActivity(intent);
            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswersActivity.class);
                intent.putExtra("question", "Q2");
                startActivity(intent);
            }
        });
    }
}