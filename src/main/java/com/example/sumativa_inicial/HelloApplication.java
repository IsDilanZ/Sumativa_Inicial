package com.example.sumativa_inicial;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    }

    public static void main(String[] args) {
        //Caizapasto VIllarreal Dilan Ismael
        for (int i=1 ; i <= 101 ; i++ ){
            if (i%3==0 && i%5==0) {
                System.out.println("fizzbuzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            } else if (i%5==0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}