package com.veegadiego.loginfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    Button btnAceptar;
    EditText Usuario;
    EditText pass;
    LinearLayout mLinearLayout;
    TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mLinearLayout = findViewById(R.id.lll);

        Usuario = findViewById(R.id.Edit_Usuario);
        pass = findViewById(R.id.Edit_pass);
        respuesta = findViewById(R.id.text_respuesta);

        btnAceptar = findViewById(R.id.Btn_aceptar);

        btnAceptar.setOnClickListener(this);
        btnAceptar.setOnLongClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        Log.i("id ", viewId+"");
        switch (viewId){
            case R.id.Btn_aceptar:
                respuesta.setText((Usuario.getText()));

        }

    }

    @Override
    public boolean onLongClick(View v) {
        int viewId = v.getId();
        Log.i("id ", viewId+"");
        switch (viewId){
            case R.id.Btn_aceptar:
                respuesta.setText((pass.getText()));
                return true;

        }
        return false;
    }
}
