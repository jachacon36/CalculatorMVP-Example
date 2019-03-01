package com.example.joker.calculatormvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.joker.calculatormvp.R;
import com.example.joker.calculatormvp.presenter.Presenter;
import com.example.joker.calculatormvp.presenter.PresenterInterface;

public class View extends AppCompatActivity implements ViewInterface {

    private PresenterInterface presenterInterface;
    private EditText editTextNumber1,editTextNumber2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.edtNumber1);
        editTextNumber2 = findViewById(R.id.edtNumber2);
        textView= findViewById(R.id.result);

        presenterInterface = new Presenter(this);// instancia al presentador

    }

    public void onClick(android.view.View view) {
        String number1 = editTextNumber1.getText().toString();
        String number2 = editTextNumber2.getText().toString();
        presenterInterface.sumar(number1,number2);// se pasan los numeros al presentador
    }

    @Override
    public void showResult(String result) {
        textView.setText(result);
    }

    @Override
    public void showError(String error) {
        textView.setText(error);
    }
}
