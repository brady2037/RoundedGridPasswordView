package io.github.brady2037.rounded.gridpasswordview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import io.github.brady2037.rounded.gridpasswordview.gridpasswordview.GridPasswordView;

public class MainActivity extends AppCompatActivity {
    GridPasswordView gridPasswordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridPasswordView = (GridPasswordView) findViewById(R.id.inputTradingPwdPwView);
        gridPasswordView.setOnPasswordChangedListener(new GridPasswordView.OnPasswordChangedListener() {
            @Override
            public void onChanged(String psw) {

            }

            @Override
            public void onMaxLength(String psw) {
                if (psw.equals("123456")) {
                    Toast.makeText(MainActivity.this, "验证成功", Toast.LENGTH_SHORT).show();
                    gridPasswordView.clearPassword();
                } else {
                    Toast.makeText(MainActivity.this, "密码错误请重新输入", Toast.LENGTH_SHORT).show();
                    gridPasswordView.clearPassword();
                }
            }
        });
    }
}
