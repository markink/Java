package les6.homework.task1;
import java.util.*;

import java.util.ArrayList;

public class Notebook {

    private String name;

    private int amountRAM;

    private int hardRAM;
    private String operatingSystem;
    private int price;
    private String color;

    public Notebook(String name, int amountRAM, String operatingSystem, int price, String color, int hardRAM) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.color = color;
        this.hardRAM = hardRAM;
    }


    public static List<String> propertiesForFilter(){

        List <String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("operatingSystem");
        list.add("price");
        list.add("model");
        list.add("hard disk");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + amountRAM +
                ", операционная система: " + operatingSystem + '\'' +
                ", цена: " + price +
                ", цвет: " + color + ", объём ЖД: " + hardRAM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHardRAM() {
        return hardRAM;
    }

    public void setHardRAM(int hardRAM) {
        this.hardRAM = hardRAM;
    }
}