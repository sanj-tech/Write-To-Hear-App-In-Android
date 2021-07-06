package com.jsstech.texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
EditText textEdit;
Button bt_click;
TextToSpeech textToSpeech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textEdit=findViewById(R.id.edtText);
        bt_click=findViewById(R.id.btClick);



                textToSpeech=new TextToSpeech(getApplicationContext(),new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int i) {
                        if (i!=TextToSpeech.ERROR){
                            textToSpeech.setLanguage(Locale.UK);

                        }

                    }
                });
                bt_click.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textToSpeech.speak(textEdit.getText().toString(),TextToSpeech.QUEUE_FLUSH,null);

                    }
                });


            }




    }
