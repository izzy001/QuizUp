package com.android.izzy.quiz_up.db;

import com.google.firebase.database.FirebaseDatabase;

public class FirebaseUtils {
    private static FirebaseDatabase firebaseDatabase = null;

    public static FirebaseDatabase getFirebaseDatabase() {
        if(firebaseDatabase == null){
            firebaseDatabase = FirebaseDatabase.getInstance();
        }
        return firebaseDatabase;
    }
}
