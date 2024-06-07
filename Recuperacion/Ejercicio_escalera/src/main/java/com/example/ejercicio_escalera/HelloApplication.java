package com.example.ejercicio_escalera;
import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;
import java.io.IOException;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {}

    public static void main(String[] args) {
        //Caizapasto Dilan
        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter the number of stairs you want to print => ");
        int NumberOfElements = numberInput.nextInt();
        if (NumberOfElements < 0) {
            NumberOfElements = NumberOfElements * -1;
            for (int i = 0; i <= NumberOfElements; i++) {
                System.out.println("|_");
                for (int j = 0; j <= i; j++) {
                    System.out.print("  ");
                }
            }
        } else if (NumberOfElements > 0){
            for (int i = NumberOfElements; i >=0 ; i--) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("  ");
                }
                System.out.println("_|");
            }
            System.out.println("_|");
        } else {
            System.out.println("__");
        }
    }
}