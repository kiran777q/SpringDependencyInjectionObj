package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cheating {
    public Cheating() {
        System.out.println("Cheating object creating");
    }

    public void cheating(){
       System.out.println("Inside Cheating Class");

   }

}
