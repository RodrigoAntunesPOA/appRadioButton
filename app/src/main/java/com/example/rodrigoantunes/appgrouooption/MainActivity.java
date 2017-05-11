package com.example.rodrigoantunes.appgrouooption;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
    {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validar(View v) {

        RadioButton rA = (RadioButton) findViewById(R.id.optA);
        RadioButton rB = (RadioButton) findViewById(R.id.optB);
        RadioButton rC = (RadioButton) findViewById(R.id.optC);
        RadioButton rD = (RadioButton) findViewById(R.id.optD);

        /*

        AlertDialog.Builder dialogo = new AlertDialog.Builder(this);

        dialogo.setTitle("Resposta");

        if (!rA.isChecked() && !rB.isChecked() && !rC.isChecked() && !rD.isChecked()) {
            dialogo.setMessage("Selecione uma resposta");
            dialogo.show();
        }
        else {
            if (rB.isChecked()) {
                dialogo.setMessage("Certa resposta");
            } else {
                dialogo.setMessage("Resposta errada");
            }

            dialogo.show();

        }
        */


        if (!rA.isChecked() && !rB.isChecked() && !rC.isChecked() && !rD.isChecked())
            {Toast.makeText(this, "Selecione uma resposta!",
                    Toast.LENGTH_SHORT
            ).show();}
        else {
            if (rB.isChecked()) {
                Toast.makeText(this, "Certa resposta!",
                        Toast.LENGTH_LONG
                ).show();
            } else {
                Toast.makeText(this, "Errouuuuu!",
                        Toast.LENGTH_SHORT
                ).show();
            }

            rA.setChecked(false);
            rB.setChecked(false);
            rC.setChecked(false);
            rD.setChecked(false);

        }

    }

}
