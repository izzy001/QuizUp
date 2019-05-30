package com.android.izzy.quiz_up.db;

import android.support.annotation.NonNull;

import com.android.izzy.quiz_up.ui.QuizUpSession;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class GetQuestions {
    FirebaseDatabase db = FirebaseUtils.getFirebaseDatabase();
    DatabaseReference ref = db.getReference().child("quiz");

    public List<QuizUpQuestion> getAllOfTheQuestions(){
        final List<QuizUpQuestion>questions = new ArrayList<>();
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                QuizUpQuestion quiz = dataSnapshot.getValue(QuizUpQuestion.class);
                questions.add(quiz);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        return questions;

    }
}
