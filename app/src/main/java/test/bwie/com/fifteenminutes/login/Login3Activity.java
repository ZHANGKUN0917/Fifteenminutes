package test.bwie.com.fifteenminutes.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import test.bwie.com.fifteenminutes.R;

public class Login3Activity extends AppCompatActivity {
    private Button b,b1;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b= (Button) findViewById(R.id.b);
        b1= (Button) findViewById(R.id.b1);
        tv= (TextView) findViewById(R.id.tvv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(Login3Activity.this,Login2Activity.class);
                startActivity(it);
                finish();

            }
        });
    }
}
