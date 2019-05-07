package sg.edu.rp.c346.simpleclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    // Variable declaration //
    Button userClick;
    EditText userInput;
    TextView userOutDisplay;
    ToggleButton userToggleBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Link field variables to UI components //
        userClick = findViewById(R.id.displayBtn);
        userInput = findViewById(R.id.userInput);
        userOutDisplay = findViewById(R.id.userOutput);
        userToggleBtn = findViewById(R.id.toggleButtonEnabled);


        // Bind click listener //
        userClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String userText = userInput.getText().toString();
                userOutDisplay.setText(userText);
            }
        });

        // bind toggle listener //
        userToggleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if (!userToggleBtn.isChecked()) {
                    userInput.setEnabled(false);
                } else {
                    userInput.setEnabled(true);
                }
            }
        });


    }
}
