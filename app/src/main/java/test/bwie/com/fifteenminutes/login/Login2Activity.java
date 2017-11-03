package test.bwie.com.fifteenminutes.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import test.bwie.com.fifteenminutes.R;
import test.bwie.com.fifteenminutes.register.ResigterActivity;

public class Login2Activity extends AppCompatActivity {
    private EditText et,et1;
    private Button b;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        et= (EditText) findViewById(R.id.et);
        tv= (TextView) findViewById(R.id.tv);
        et1= (EditText) findViewById(R.id.et1);
        b= (Button) findViewById(R.id.bb);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(Login2Activity.this, ResigterActivity.class);
                startActivity(it);
                overridePendingTransition(R.anim.sele,R.anim.sele);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone=et.getText().toString();
                String password=et1.getText().toString();

            }
        });
    }
}
