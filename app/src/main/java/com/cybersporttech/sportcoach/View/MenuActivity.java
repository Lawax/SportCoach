package com.cybersporttech.sportcoach.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import com.cybersporttech.sportcoach.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;



public class MenuActivity extends AppCompatActivity {


    private TextView mSportCoach;
    private EditText memail_user;
    private EditText nom_user;
    private Button mdeconnexion;
    private Button mConsulterUneConvocation;
    private Button mCreerUneConvocation;
    private Button mEnregistrerUnMembre;

    FirebaseAuth mFirebaseAuth;
    FirebaseUser mFirebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();



        mSportCoach = findViewById(R.id.activity_nom_appli_text) ;
        memail_user = findViewById(R.id.email_user);
        nom_user = findViewById(R.id.nom_user);
        mdeconnexion = findViewById(R.id.deconnexion_bton);
        mConsulterUneConvocation = findViewById(R.id.activity_consult_convocation_btn);
        mCreerUneConvocation = findViewById(R.id.activity_creation_convocation_btn);
        mEnregistrerUnMembre = findViewById(R.id.activity_register_member_btn);

        memail_user.setText(getIntent().getExtras().getString("data"));



        mEnregistrerUnMembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerActivity = new Intent(MenuActivity.this, RegisterActivity.class);
                startActivity(registerActivity);
            }

        });
        mEnregistrerUnMembre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MenuActivity.this,RegisterActivity.class);
                myIntent.putExtra ("data",memail_user.getText().toString());
                startActivity(myIntent);
                // passing data to Register activity
            }
        });
        mConsulterUneConvocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent= new Intent(MenuActivity.this, ReadConvocationActivity.class);
                startActivity (myIntent);
            }
        });

        mCreerUneConvocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MenuActivity.this, ConvocationActivity.class);
                startActivity(myIntent);
            }
        });


        mdeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(MenuActivity.this, MainActivity.class);
                startActivity (MainActivity);
            }
        }

        );
        mdeconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            FirebaseAuth.getInstance().signOut();
            Intent intent = new Intent(MenuActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            //Disconnection from the app, and back button action cancelling
            }
        });





    }

}
