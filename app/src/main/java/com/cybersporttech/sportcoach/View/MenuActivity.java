package com.cybersporttech.sportcoach.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;



import com.cybersporttech.sportcoach.R;
import com.cybersporttech.sportcoach.controller.BaseActivity;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.auth.User;


public class MenuActivity extends BaseActivity {


    private TextView mSportCoach;
    private EditText memail_user;
    private EditText mclub_user;
    private EditText mcategorie_user;
    private EditText mtelephone_user;
    private Button mdeconnexion;
    private RadioButton update_btn;
    private RadioButton delete_btn;
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
        this.updateUIWhenCreating();



        mSportCoach = findViewById(R.id.activity_nom_appli_text) ;
        memail_user = findViewById(R.id.email_user_txt);
        mclub_user = findViewById(R.id.club_user_txt);
        mcategorie_user = findViewById(R.id.categorie_user_txt);
        mtelephone_user = findViewById(R.id.telephone_user_txt);
        mdeconnexion = findViewById(R.id.deconnexion_btn);
        update_btn = findViewById(R.id.update_btn);
        delete_btn = findViewById(R.id.delete_btn);
        mConsulterUneConvocation = findViewById(R.id.activity_consult_convocation_btn);
        mCreerUneConvocation = findViewById(R.id.activity_creation_convocation_btn);
        mEnregistrerUnMembre = findViewById(R.id.activity_register_member_btn);

        memail_user.setText(getIntent().getExtras().getString("data"));


        update_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //gérer le update ici page 5/chap1

            }
        });
        delete_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gérer le delete
            }
        });


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
    private void updateUIWhenCreating(){
        if (this.getCurrentUser() != null){
            String email = this.getCurrentUser().getEmail();
            this.memail_user.setText(email);
        }
    }

}
