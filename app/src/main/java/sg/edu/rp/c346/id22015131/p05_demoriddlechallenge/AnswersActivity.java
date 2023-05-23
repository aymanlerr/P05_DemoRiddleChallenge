package sg.edu.rp.c346.id22015131.p05_demoriddlechallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswersActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);

        tv = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String questionSelected = intentReceived.getStringExtra("question");
        if (questionSelected.equals("Q1")) {
            tv.setText(questionSelected + " answer is: Queue");
        } else {
            tv.setText(questionSelected + " answer is: Gone");
        }
    }
}