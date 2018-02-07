package sdu.cs58.burm.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //1.Explicit
    EditText nameEditTex,usernameEditText, passwordEditText;
    Button loginButton;
    String nameString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //2.Initial view ผูกตัวแปรบน java ให้รู้จักกับ element บน xml
        nameEditTex = findViewById(R.id.txtName);
        usernameEditText = findViewById(R.id.txtUsername);
        passwordEditText = findViewById(R.id.txtPassword);
        loginButton = findViewById(R.id.btnLogin);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nameString = nameEditTex.getText().toString();
                Toast.makeText(getApplicationContext(),"Hello "+nameString,Toast.LENGTH_SHORT).show();
            }
        });
    }//end method onCreate
}//end class
