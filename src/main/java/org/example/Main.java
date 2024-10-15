package org.example;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MomsTaligen taligen = new MomsTaligen();

        ArrayList<MomsTaligen> momsTabel = new ArrayList<>();
        momsTabel.add(taligen);

        System.out.println(momsTabel);

        int result = taligen.moms(20);

        System.out.println(result);


    }
}