package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleApp {

    String display = "";

    //public static void main(String[] args) {
    @RequestMapping("/")
    public String VehicleApp(){

         Vehicle v = new Vehicle();

         Car c = new Car();

         c.setColor("red");
         //c.setName("Porsche");
         c.setModel("LX");

         display = c.start() + "<br/>" + c.accelerate();

         //System.out.println(c.getName());
         //System.out.println(c.getColor());
         //System.out.println(c.start());
         //System.out.println(c.accelerate());

        return c.toString();
    }

}
