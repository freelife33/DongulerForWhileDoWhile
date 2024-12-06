package com.example.dongulerforwhiledowhile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText_Sayilar;   //EditText nesnesi oluşturuyoruz.
    Button button_CiftSayi;      //Button nesnesi oluşturuyoruz.
    Button button_TeSayi;        //Button nesnesi oluşturuyoruz.
    Button button_TumSayi;       //Button nesnesi oluşturuyoruz.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);


            editText_Sayilar = findViewById(R.id.editTextTextMultiLine_Sayilar); // Layout'ta oluşturduğumuz EditText nesnesini id'sine göre bulup burada oluşturduğumuz nesneye atıyoruz.
            button_CiftSayi = findViewById(R.id.button_CiftSayilar);             // Layout'ta oluşturduğumuz Button nesnesini id'sine göre bulup burada oluşturduğumuz nesneye atıyoruz.
            button_TeSayi = findViewById(R.id.button_TeSayilar);                 // Layout'ta oluşturduğumuz Button nesnesini id'sine göre bulup burada oluşturduğumuz nesneye atıyoruz.
            button_TumSayi = findViewById(R.id.button_TumSayilar);               // Layout'ta oluşturduğumuz Button nesnesini id'sine göre bulup burada oluşturduğumuz nesneye atıyoruz.


            return insets;
        });
    }


    // Burada layoutta oluşturduğumuz butonun onclick özelliğine atadığımız metodu tanımlıyoruz.
    public void CiftSayilar(View view) {

        editText_Sayilar.setText("");  // Layouttaki EditText'in içini boşaltıyoruz.

        for (int i = 0; i <= 100; i++) {                                                            // for döngüsü ile sayıları dönüyoruz.
            if (i % 2 == 0) {                                                                       //if ile çift sayıları buluyoruz.
                editText_Sayilar.setText(editText_Sayilar.getText() + " " + i);                     // Layouttaki EditTextin içene ekliyoruz.
                //editText_Sayilar.append(i+" ");                                                   // Alternatif olarak append metodu ile de ekliyoruz.
            }

        }
    }

    public void TekSayilar(View view) {
        editText_Sayilar.setText("");

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                editText_Sayilar.setText(editText_Sayilar.getText() + "\n " + i);
                //editText_Sayilar.append(i+" ");
            }
        }
    }

    public void TumSayilar(View view) {
        editText_Sayilar.setText("");

        for (int i = 0; i <= 100; i++) {
            editText_Sayilar.setText(editText_Sayilar.getText() + "\n" + i);
            //editText_Sayilar.append(i+" ");
        }
    }

}