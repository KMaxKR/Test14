import Laptops.LaptopSpecs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LaptopSpecs laptop = new LaptopSpecs("",0,0,"","",0);

        List<LaptopSpecs> laptopList = new ArrayList<>();
        laptopList.add(new LaptopSpecs("Asus",2022,1450,"Ryzen","Rx", 16));
        laptopList.add(new LaptopSpecs("Lenovo",2021,1250,"Intel","RTX", 16));
        laptopList.add(new LaptopSpecs("MSI",2021,1345,"Intel","Rx", 24));
        laptopList.add(new LaptopSpecs("Hp",2020,999,"Ryzen","Rx", 8));
        laptopList.add(new LaptopSpecs("Asus",2022,1899,"Ryzen","RTX", 64));
        laptopList.add(new LaptopSpecs("Asus",2023,2560,"Intel","RTX", 32));

        int minimalPrice = 1200;
        List<LaptopSpecs> filterByCpu = laptopList.stream().filter(e -> e.getCPU().equals("Intel")).filter(e -> e.getYear() > 2021).collect(Collectors.toList());
        List<LaptopSpecs> filterByPrice = laptopList.stream().filter(e -> e.getPrice() > minimalPrice).collect(Collectors.toList());
        System.out.println(filterByCpu + "\n\n\n");
        System.out.println(filterByPrice);
    }
}