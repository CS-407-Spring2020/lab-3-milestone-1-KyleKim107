package com.example.lab3milestone1;

import androidx.appcompat.app.AppCompatDialogFragment;

import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.Dialog;


public class ExampleDialog extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog (Bundle saveInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("information").
                setMessage("this is a Dialog")
                .setPositiveButton("ok", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface , int i){



                    }

                        }
                );

        return builder.create();
    }


}
