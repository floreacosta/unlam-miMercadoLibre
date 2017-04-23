package com.example.flor.mimercadolibre;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProductDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        Button buttonBuyPdp = (Button) findViewById(R.id.buttonBuyPdp);

        buttonBuyPdp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button) {
                button.setBackgroundColor(Color.parseColor("#2193af"));
            }
        });
    }
}
