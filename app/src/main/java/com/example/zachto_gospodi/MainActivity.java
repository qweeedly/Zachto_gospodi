package com.example.zachto_gospodi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void signIn(View view) {
            showInputDialog();

    }
    private void showInputDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Авторизация:");
        builder.setMessage("Введите ваш логин и пароль:");
        View strings = getLayoutInflater().inflate(R.layout.strings_sign,null);
        final EditText login = strings.findViewById(R.id.LoginTV);
        final EditText password = strings.findViewById(R.id.PasswordTV);

        builder.setView(strings);
        builder.setPositiveButton("Добавить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).setNegativeButton("Отмена",null);

        builder.show();
    }

    public void BankList(View view) {
        Intent a = new Intent(MainActivity.this,BanksList.class);
        startActivity(a);
    }
}
