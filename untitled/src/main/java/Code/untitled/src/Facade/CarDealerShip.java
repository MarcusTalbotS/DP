package Code.untitled.src.Facade;

import java.util.Scanner;

import Code.untitled.src.Builder.Builder;
import Code.untitled.src.Builder.BuilderLada;
import Code.untitled.src.Builder.BuilderTesla;
import Code.untitled.src.Builder.BuilderToyota;
import Code.untitled.src.Builder.Director;
import Code.untitled.src.Car.Car;
import Code.untitled.src.Decorator.Cupholder;
import Code.untitled.src.Decorator.MachineGun;
import Code.untitled.src.Decorator.Spoiler;


public class CarDealerShip {

    private final Director director;
    private final Builder ladaBuilder;
    private final Builder teslaBuilder;
    private final Builder toyotaBuilder;

    public CarDealerShip() {
        this.director = new Director();
        this.ladaBuilder = new BuilderLada();
        this.teslaBuilder = new BuilderTesla();
        this.toyotaBuilder = new BuilderToyota();
    }

    public Car getCar() {
        Scanner s = new Scanner(System.in);
        Car car = null;
        String input;
        boolean cont = false;

        System.out.println("Options: ");
        System.out.println("LadaA - family edition Lada");
        System.out.println("LadaB - sport edition Lada");
        System.out.println("TeslaA - model x Tesla");
        System.out.println("TeslaB - roadster Tesla");
        System.out.println("ToyotaA - family edition Toyota");
        System.out.println("ToyotaB - sport edition Toyota");
        while (!cont) {
            switch (s.next()) {
                case "LadaA" -> {
                    director.buildLadaA(ladaBuilder);
                    car = ladaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "LadaB" -> {
                    director.buildLadaB(ladaBuilder);
                    car = ladaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "TeslaA" -> {
                    director.buildTeslaA(teslaBuilder);
                    car = teslaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "TeslaB" -> {
                    director.buildTeslaB(teslaBuilder);
                    car = teslaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                    cont = true;
                }
                case "ToyotaA" -> {
                    director.buildToyotaA(toyotaBuilder);
                    car = toyotaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                }
                case "ToyotaB" -> {
                    director.buildToyotaB(toyotaBuilder);
                    car = toyotaBuilder.build();
                    System.out.println("price: " + car.getPrice());
                }
                default -> System.out.println("Please enter valid car type");
            }
        }

        System.out.println("""
            Decorate your vehicle using:
            - Spoiler    || 80
            - Cupholder  || 300
            - Machinegun || 1000
            Type "Done" to finish your car
            """);
        input = s.next();
        while (!input.equalsIgnoreCase("Done")) {
            switch (input) {
                case "Spoiler" -> {
                    car = new Spoiler(car);
                    System.out.println("price: " + car.getPrice());
                }
                case "Cupholder" -> {
                    car = new Cupholder(car);
                    System.out.println("price: " + car.getPrice());
                }
                case "Machinegun" -> {
                    car = new MachineGun(car);
                    System.out.println("price: " + car.getPrice());
                }
                default -> System.out.println("Invalid decoration");
            }
            input = s.next();
        }
        System.out.println("total price: " + car.getPrice());
        System.out.println("Is this what you want? \n");
        car.print();
        System.out.println();
        System.out.println(" Y - yes || N - no");
        while (true){
            input = s.next();
            if (input.equalsIgnoreCase("Y")) {
                System.out.println("here is your car");
                return car;
            } else if (input.equalsIgnoreCase("N")) {
                return this.getCar();
            } else {
                System.out.println("Could not recognise input, Please enter Y or N");
            }
        }
    }

}