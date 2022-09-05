package lesson01;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 01
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        swap(arr1,1,4);

        //Задание 02
        System.out.println("Задание 02");
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);

        //Задание 03
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("Задание 03");
        System.out.println("Add fruits");
        or.addFruit(new Orange(),15);
        or1.addFruit(new Orange(),16);
        ap.addFruit(new Apple(),10);
        ap1.addFruit(new Apple(),5);
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        System.out.println("Sorting");
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());


    }
    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Задание 01: "+Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат: "+Arrays.toString(arr)+"\n================================");
    }
    public static <T> void asList(T[]arr){

        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Результат : "+alt+"\n================================");
    }
}