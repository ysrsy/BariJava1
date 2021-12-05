package com.company;

class person{
    String name;

}
public class Methods {

    static void increment(int a){
        a++;
        System.out.println(a);
    }
    static void increment(int[] arr){
        for (int i=0;i< arr.length;i++) {
            arr[i]++;
        }
        for (int i:arr) {
            System.out.println(i);
        }
    }
    int min(int a,int b){
        int min = a<b?a:b;
        return min;
    }
    static int max(int a,int b){
        int max = a>b?a:b;
        return max;
    }

    static void change(String s){
        s="vcccv";
        System.out.println(s);
    }

    static void changeName(person p){
        p.name="ismet";
    }

    static void show(int ...a){
        for (int i:a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int a=123,b=56;
        int max =max(a,b);
        System.out.println(max);
//        static metod içinde sadece static metodlar çağrılabilir çünkü non-static methodlar class a aittir
//        ve o class instantiate edilmeddn metoduna ulaşamayız ama static metdo o class a ait değildir bağımsızdır
        Methods methods = new Methods();
        System.out.println(methods.min(a,b));
        increment(a);
        System.out.println(a);
//        a değişmedi ama fonksiyonun içinde arrtı oradaki değişiklik buraya yansımaz

        int[] arr ={1,2,3,4,5};
        increment(arr);
        for (int i:arr) {
            System.out.println(i);
        }
//        peki burda neden arrayin içi değişti burda arrayin adresi parametre olarak function a gitti bu yüzden ordaki değişiklik buryaya yansıdı
        String s = "asas";
        change(s);
        System.out.println(s);
//        String istisna immutable oldupu için ama diğer objelerde de function a giden şey adres oldupu için functiondaki değişiklik buraya da yansır
//        altta olduğu gibi
        person p = new person();
        p.name="Ahmet";
        System.out.println(p.name);
        changeName(p);
        System.out.println(p.name);
//        variable arguements
        show(1,2,3,4);
        show();
        show(new int[]{1,2,3,4,5,6,7,7});

    }
}
