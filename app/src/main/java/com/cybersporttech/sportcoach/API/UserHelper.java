package com.cybersporttech.sportcoach.API;

import com.cybersporttech.sportcoach.model.Member.Membre;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.auth.User;

public class UserHelper {

    private static final String COLLECTION_NAME = "membre";

    // --- COLLECTION REFERENCE ---

    public static CollectionReference getMembreCollection(){
        return FirebaseFirestore.getInstance().collection(COLLECTION_NAME);
    }

    // --- CREATE ---

    public static Task<Void> createMembre(String uid,String nom, String prenom, String club, int categorie, int telephone, String mail, boolean isCoach) {
        Membre membreToCreate = new Membre(uid,nom,prenom,club,categorie,telephone,mail,isCoach);
        return UserHelper.getMembreCollection().document(uid).set(membreToCreate);
    }

    // --- GET ---

    public static Task<DocumentSnapshot> getMembre(String uid){
        return UserHelper.getMembreCollection().document(uid).get();
    }

    // --- UPDATE ---

    public static Task<Void> updateMembrename(String uid, String nom) {
        return UserHelper.getMembreCollection().document(uid).update("nom", nom);
    }

    public static Task<Void> updateIsCoach(String uid, Boolean iscoach) {
        return UserHelper.getMembreCollection().document(uid).update("iscoach", iscoach);
    }

    // --- DELETE ---

    public static Task<Void> deleteMembre(String uid) {
        return UserHelper.getMembreCollection().document(uid).delete();
    }

}