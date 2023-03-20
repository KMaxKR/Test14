package Laptops;

import java.util.Objects;

public class LaptopSpecs {
    private String name;
    private int year;
    private int price;
    private String CPU;
    private String Gpu;
    private int Ram;

    public LaptopSpecs(String name, int year, int price, String CPU, String Gpu, int Ram){
        this.name = name;
        this.year = year;
        this.price = price;
        this.CPU = CPU;
        this.Gpu = Gpu;
        this.Ram = Ram;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGpu() {
        return Gpu;
    }

    public int getRam() {
        return Ram;
    }
    @Override
    public String toString(){
        return  "\nName: " + name + "\n" +
                "Year: " + year + "\n" +
                "Price: " + price + "\n" +
                "Specs: " + "\n" +
                CPU + "\n" +
                Gpu + "\n" +
                Ram + " GB";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaptopSpecs that = (LaptopSpecs) o;
        return year == that.year && CPU.equals(CPU);
        //return year == that.year && Double.compare(that.price, price) == 0 && Ram == that.Ram && Objects.equals(name, that.name) && Objects.equals(CPU, that.CPU) && Objects.equals(Gpu, that.Gpu);
    }

    @Override
    public int hashCode() {
        return price;
    }
}
