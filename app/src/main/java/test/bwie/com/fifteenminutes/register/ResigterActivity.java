package test.bwie.com.fifteenminutes.register;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import test.bwie.com.fifteenminutes.R;
import test.bwie.com.fifteenminutes.login.Login2Activity;
import test.bwie.com.fifteenminutes.login.LoginIView;

public class ResigterActivity extends AppCompatActivity implements LoginIView {
    private TextView tv;
    private EditText et,et1;
    private Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login3);
        tv= (TextView) findViewById(R.id.tv);
        et= (EditText) findViewById(R.id.et);
        et1= (EditText) findViewById(R.id.et1);
        b= (Button) findViewById(R.id.bb);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(ResigterActivity.this,Login2Activity.class);
                startActivity(it);
                finish();
                overridePendingTransition(R.anim.sele,R.anim.sele);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone=et.getText().toString();
                String password=et1.getText().toString();
                RegisterPresenter presenter=new RegisterPresenter(ResigterActivity.this);
                presenter.getdata(phone,password);
            }
        });
    }
}
