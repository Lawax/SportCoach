package com.cybersporttech.sportcoach.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.cybersporttech.sportcoach.R;
import com.cybersporttech.sportcoach.controller.ConvocationAdapter;
import com.cybersporttech.sportcoach.model.Convoc.Convocation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;


public class ReadConvocationActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ConvocationAdapter adapter;
    private List<Convocation> convocationList;
    private ProgressBar progressBar;

    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_convocation);

        progressBar = findViewById(R.id.activity_convo_bar);

        recyclerView = findViewById(R.id.recyclerview_convocation);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        convocationList = new ArrayList<>();
        adapter = new ConvocationAdapter(this, convocationList);

        recyclerView.setAdapter(adapter);

        db = FirebaseFirestore.getInstance();

        db.collection("convocations").get()
                .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {

                        progressBar.setVisibility(View.GONE);

                        if(!queryDocumentSnapshots.isEmpty()){

                            List<DocumentSnapshot> list = queryDocumentSnapshots.getDocuments();

                            for(DocumentSnapshot d : list){

                                Convocation c = d.toObject(Convocation.class);
                                convocationList.add(c);

                            }

                            adapter.notifyDataSetChanged();

                        }


                    }
                });

    }
}

