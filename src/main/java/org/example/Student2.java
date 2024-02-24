package org.example;

public class Student2 {
    private int id;
    Cheating cheat;

    public void setId(int id) {
        this.id = id;
    }

    public void setCheat(Cheating cheat) {
        this.cheat = cheat;
    }

    public void letsCheat(){
        System.out.println("Student2 Calling Cheating");
        cheat.cheating();

    }

}
