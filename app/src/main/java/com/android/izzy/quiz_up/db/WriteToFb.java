package com.android.izzy.quiz_up.db;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class WriteToFb {

    Context context;

    public WriteToFb(Context context) {
        this.context = context;
    }

    FirebaseDatabase db = FirebaseUtils.getFirebaseDatabase();
    ArrayList<QuizUpQuestion> arraylist = new ArrayList<>();
    private void allQuestion() {


        arraylist.add(new QuizUpQuestion("Galileo was an Italian astronomer who developed?", "Telescope", "Airoplane", "Electricity", "Train", "Telescope"));

        arraylist.add(new QuizUpQuestion("Who is the father of Geometry ?", "Aristotle", "Euclid", "Pythagoras", "Kepler", "Euclid"));

        arraylist.add(new QuizUpQuestion("Who was the legendary Benedictine monk who invented champagne ?", "Govind Ballabh Pant", "Dom Perignon", "Randi Altschu", "Hovannes Adamian", "Dom Perignon"));

        arraylist.add(new QuizUpQuestion("The first woman in space was ?", "Valentina Tereshkova", "Sally Ride", "Naidia Comenci", "Tamara Press", "Valentina Tereshkova"));

        arraylist.add(new QuizUpQuestion("Name the largest freshwater lake in the world ?", "Lake Baikal", "Lake Victoria", "Lake Malawi", "Lake Superior", "Lake Superior"));

        arraylist.add(new QuizUpQuestion("The Indian to beat the computers in mathematical wizardry is", "Ramanujam", "Rina Panigrahi", "Raja Ramanna", "Shakunthala Devi", "Shakunthala Devi"));

        arraylist.add(new QuizUpQuestion("Who is Larry Pressler ?", "Politician", "Painter", "Actor", "Tennis player", "Politician"));

        arraylist.add(new QuizUpQuestion("Michael Jackson is a distinguished person in the field of ?", "Pop Music", "Jounalism", "Sports", "Acting", "Pop Music"));

        arraylist.add(new QuizUpQuestion("What kind of weapon is a falchion ?", "Sword", "Arrow", "Gun", "Nuclear Bomb", "Sword"));

        arraylist.add(new QuizUpQuestion("Name the seventh planet from the sun.", "Saturn", " Earth", "Jupiter", "Uranus", "Uranus"));

        arraylist.add(new QuizUpQuestion("Who is known as the ' Saint of the gutters ?", "B.R.Ambedkar", "Mother Teresa", "Mahatma Gandhi", "Baba Amte", "Mother Teresa"));

        arraylist.add(new QuizUpQuestion("Who invented the famous formula E=mc^2", "Albert Einstein", "Galilio", "Sarvesh", "Bill Gates", "Albert Einstein"));

        arraylist.add(new QuizUpQuestion("Who was elected as president of us 2016", "Donald Trump", "Hilary Clinton", "Jhon pol", "Barack Obama", "Donald Trump"));

        arraylist.add(new QuizUpQuestion("Who was the founder of company Microsoft", "Bill Gates", "Bill Clinton", "Jhon rio", "Steve jobs", "Bill Gates"));

        arraylist.add(new QuizUpQuestion("Who was the founder of company Apple ?", "Steve Jobs", "Steve Washinton", "Bill Gates", "Jobs Wills", "Steve Jobs"));

        arraylist.add(new QuizUpQuestion("Who was the founder of company Google ?", "Steve Jobs", "Bill Gates", "Larry Page", "Sundar Pichai", "Larry Page"));

        arraylist.add(new QuizUpQuestion("Who invented the rabies vaccination ?", "Sachin Tendulkar", "Mary Anderson", "Hal Anger", "Louis Pasteur", "Louis Pasteur"));

        arraylist.add(new QuizUpQuestion("who has won ballon d'or of 2015 ?", "Lionel Messi", "Cristiano Ronaldo", "Neymar", "Kaka", "Lionel Messi"));

        arraylist.add(new QuizUpQuestion("who has won ballon d'or of 2014 ?", "Neymar", "Lionel Messi", "Cristiano Ronaldo", "Kaka", "Cristiano Ronaldo"));

        arraylist.add(new QuizUpQuestion("the Founder of the most famous gaming platform steam is ?", "Bill Cliton", "Bill Williams", "Gabe Newell", "Bill Gates", "Gabe Newell"));


    }

    public void addQuizToFb(){
        allQuestion();
        DatabaseReference ref = db.getReference().child("quiz");

        ref.child("questions").setValue(arraylist).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Log.d("success",task.toString());
                }else {
                    Log.d("failure",task.toString());
                }
            }
        });

    }
}
