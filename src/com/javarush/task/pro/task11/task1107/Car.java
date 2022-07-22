package com.javarush.task.pro.task11.task1107;

/* 
Двигатель — сердце автомобиля
*/

public class Car {
    Engine engine = new Engine();

    public static void main(String[] args) {
        Car car = new Car();
        car.engine.start();
        car.engine.stop();
    }
    class Engine{
        private boolean isRunning;

        public void start(){
            this.isRunning = true;
        }
        public void stop(){
            this.isRunning = false;
        }
    }

}
