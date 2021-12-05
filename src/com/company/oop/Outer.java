package com.company.oop;

public class Outer {
    int x;
    class Inner{
        public String y;

        public void setY(String y) {
            this.y = y;
        }

        public String getY() {
            return y;
        }
        public void show(){
            System.out.println("innerin adı: " + y);
        }
    }
    Inner inner = new Inner();

    public void show(){
        System.out.println(x);
//        System.out.println(y);   CAN NOT ACCES İNNER CLASS FIELDS DIRECTLY
        System.out.println(inner.y);  // CAN ACCESS IT AFTER INSTANTIATE BECAUSE INNER STILL NOT CREATED UNTIL USE OF NEW
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.x =6;
        outer.inner.y="come on";
        outer.show();

        Outer.Inner secondInner = new Outer().new Inner(); // sadece inner yaratırken bile outer yaratmak zorundayız
        secondInner.setY("ahmet");
        secondInner.show();
    }
}

// SADECE BİR CLASSI EXTEND EDEBİLİR YADA SADECE BİR İNTERFACE İ İMPLEMENT EDEBİLİR.
