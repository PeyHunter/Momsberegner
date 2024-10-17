package org.example;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount");

        int amount = scanner.nextInt();

        if (amount < 0) {
            System.out.println("Negative amount");
            return;
        }

        MomsTaligen taligen = new MomsTaligen();

        ArrayList<MomsTaligen> momsTabel = new ArrayList<>();
        momsTabel.add(taligen);

        System.out.println(momsTabel);

        int momsResult = taligen.moms(10000);


        System.out.println(momsResult);

    }
}