package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    private int id;
    @Autowired
    Cheating cheat;

    public void setId(int id) {
        this.id = id;
    }

    public void setCheat(Cheating cheat) {
        this.cheat = cheat;
    }

    public void callCheat(){
        System.out.println("Student1 Calling Cheating");
        cheat.cheating();
    }
}
