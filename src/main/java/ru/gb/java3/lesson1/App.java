package ru.gb.java3.lesson1;


import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {
        String[] arr = {"a","b","c","d"};
        Integer[] arr1 ={1,2,3,4,5};
        App app = new App();

        app.change(arr);
        System.out.println(arr[0] +" "+arr[3]);
        ArrayList arrayList = new ArrayList();
        arrayList =app.toList(arr1);
        for (Object o : arrayList) {
            System.out.print(o+" ");
        }
        Fruit apple1 = new Apple();
        Fruit apple2 = new Apple();
        Fruit orange1 = new Orange();
        Fruit orange2 = new Orange();

    }

    private <T1> ArrayList<T1> toList(T1[] arr) {
        ArrayList<T1> list = new ArrayList<>();
        Collections.addAll(list,arr);
//        for (T1 a: arr){
//            list.add(a);
//        }
        return list;
    }

    private <T1> void change(T1[] arr) {
        for(int i = 0; i< arr.length; i++){
            T1 t1 = arr[0];
            if(i== arr.length-1){
                arr[0]= arr[i];
                arr[i]=t1;

            }
        }

    }
}
