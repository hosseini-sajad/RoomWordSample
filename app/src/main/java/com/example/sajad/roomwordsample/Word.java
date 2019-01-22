package com.example.sajad.roomwordsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


//Specify the name of the table if you want it to be different from the name of the class.
@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    @ColumnInfo(name = "Word")  //Specify the name of the column in the table if you want it to be different from the name of the member variable.
    private String mWord;


    public Word(@NonNull String word) {this.mWord = word;}

    public String getWord(){return this.mWord;}

    public int getId() {
        return id;
    }
}