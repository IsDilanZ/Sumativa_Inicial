package com.example.robotmoving;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
    }
    public static void main(String[] args) {
        int [] RobotSteps ={-10, -5, 2, 4, -8, 100};
        int positionY = 0;
        int positionX = 0;
        boolean signalPositiveY = true;
        boolean signalPositiveX = false;
        for (int steps=0 ; steps<=RobotSteps.length-1 ; steps++){
                if (steps % 2 == 0) {
                    if (signalPositiveY){
                        positionY = (positionY + RobotSteps[steps]);
                        signalPositiveY = false;
                    } else {
                        positionY = (positionY - RobotSteps[steps]);
                        signalPositiveY = true;
                    }
                } else {
                    if (signalPositiveX){
                        positionX = (positionX + RobotSteps[steps]);
                        signalPositiveX = false;
                    } else {
                        positionX = (positionX - RobotSteps[steps]);
                        signalPositiveX = true;
                    }
                }
        }
        System.out.println("( " + positionX + ", " + positionY + " )");
    }
}