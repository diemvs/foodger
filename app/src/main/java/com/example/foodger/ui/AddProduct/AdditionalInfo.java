package com.example.foodger.ui.AddProduct;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDialogFragment;

import com.example.foodger.R;

public class AdditionalInfo extends AppCompatDialogFragment {
    private TextView caloriesTextView;
    private TextView proteinTextView;
    private TextView fatnessTextView;
    private TextView carbohydratesTextView;
    private TextView shelfLifeTextView;

    public void setConceptions(String calories, String protein, String fatness, String carbohydrates){

        if(calories != ""){
            caloriesTextView.setText(calories);
        }
        if(protein != ""){
            proteinTextView.setText(protein);
        }

    }

    public AdditionalInfo(String calories, String protein, String carbohydrates, String fatness, String shelfLife){
                _calories = calories;
                _protein = protein;
                _carbohydrates = carbohydrates;
                _fatness = fatness;
                _shelfLife = shelfLife;
    }





    @Override
    public Dialog onCreateDialog(Bundle savedInstance){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        final LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_layout, null);

        caloriesTextView = view.findViewById(R.id.caloriesTextEdit);
        proteinTextView = view.findViewById(R.id.proteinTextEdit);
        fatnessTextView = view.findViewById(R.id.fatnessTextEdit);
        carbohydratesTextView = view.findViewById(R.id.carbohydratesTextEdit);
        shelfLifeTextView = view.findViewById(R.id.shelfLifeTextView);

        if(_calories != ""){
            caloriesTextView.setText(_calories);
        }
        if(_protein != ""){
            proteinTextView.setText(_protein);
        }
        if(_carbohydrates != "") {
            carbohydratesTextView.setText(_carbohydrates);
        }
        if(_fatness != ""){
            fatnessTextView.setText(_fatness);
        }
        if(_shelfLife != ""){
            shelfLifeTextView.setText(_shelfLife);
        }

        //int i = Integer.parseInt (myString);

        shelfLifeTextView.addTextChangedListener(new TextWatcher(){
            @SuppressLint("ResourceAsColor")
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }


            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(shelfLifeTextView.getText().toString().isEmpty() != true) {
                    long i = Long.parseLong(shelfLifeTextView.getText().toString());
                        if (i > 10000) {
                            Log.d("YOUR_SHELF_LIFE = ", shelfLifeTextView.getText().toString());
                            //shelfLifeTextView.setTextColor(R.color.Red);
                            shelfLifeTextView.setBackgroundColor(getResources().getColor(R.color.Red));
                        } else {
                            shelfLifeTextView.setBackgroundColor(getResources().getColor(R.color.White));

                        }
                }
            }
        });

        fatnessTextView.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }


            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(fatnessTextView.getText().toString().isEmpty() != true) {
                    long i = Long.parseLong(shelfLifeTextView.getText().toString());
                    if (i > 1000) {
                        fatnessTextView.setBackgroundColor(getResources().getColor(R.color.Red));
                    } else {
                        fatnessTextView.setBackgroundColor(getResources().getColor(R.color.White));
                    }
                }
            }
        });

        carbohydratesTextView.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }


            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(carbohydratesTextView.getText().toString().isEmpty() != true) {
                    long i = Long.parseLong(carbohydratesTextView.getText().toString());
                    if (i > 1000) {
                        carbohydratesTextView.setBackgroundColor(getResources().getColor(R.color.Red));
                    } else {
                        carbohydratesTextView.setBackgroundColor(getResources().getColor(R.color.White));
                    }
                }
            }
        });

        proteinTextView.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }


            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(proteinTextView.getText().toString().isEmpty() != true) {
                    long i = Long.parseLong(proteinTextView.getText().toString());
                    if (i > 1000) {
                        proteinTextView.setBackgroundColor(getResources().getColor(R.color.Red));
                    } else {
                        proteinTextView.setBackgroundColor(getResources().getColor(R.color.White));
                    }
                }
            }
        });

        caloriesTextView.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }


            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(caloriesTextView.getText().toString().isEmpty() != true) {
                    long i = Long.parseLong(caloriesTextView.getText().toString());
                    if (i > 1000) {
                        caloriesTextView.setBackgroundColor(getResources().getColor(R.color.Red));
                    } else {
                        caloriesTextView.setBackgroundColor(getResources().getColor(R.color.White));
                    }
                }
            }
        });

        shelfLifeTextView.setOnKeyListener(
                new View.OnKeyListener() {
                    @Override
                    public boolean onKey(View v, int keyCode, KeyEvent event) {

                        return false;
                    }
                });

        builder.setView(view)
                    .setTitle("Введите данные")
                    .setNegativeButton("Отмена", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i){
                            _calories = "";
                            _protein = "";
                            _carbohydrates = "";
                            _fatness = "";
                            _shelfLife = "";

                            String buf[] = {_calories, _protein, _carbohydrates, _fatness, _shelfLife};
                            sendResult(Activity.RESULT_OK, buf);
                        }
                    })
                    .setPositiveButton("Ок", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i){

                            String calories = caloriesTextView.getText().toString();
                            String protein = proteinTextView.getText().toString();
                            String fatness = fatnessTextView.getText().toString();
                            String carbohydrates = carbohydratesTextView.getText().toString();
                            String shelfLife = shelfLifeTextView.getText().toString();

                            String buf[] = {calories, protein, carbohydrates, fatness, shelfLife};

                            sendResult(Activity.RESULT_OK, buf);
                        }
                    });

        return builder.create();
    }

    private void sendResult( int resultCode, String[] result ) {

        if ( getTargetFragment() == null )
            return;

        Intent i = new Intent();
        i.putExtra( "DIALOG_RESULT", result );
        getTargetFragment().onActivityResult( getTargetRequestCode(), resultCode, i );
    }


    private String _calories = null;
    private String _protein = null;
    private String _carbohydrates = null;
    private String _fatness = null;
    private String _shelfLife = null;
}