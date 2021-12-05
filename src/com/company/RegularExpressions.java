package com.company;

public class RegularExpressions {
    public static void main(String[] args) {
        String st = new String("deneme");
        System.out.println(st.matches("."));  // check if string only 1 character
        System.out.println("d".matches("[abc]")); // again just one char but only in brackets
        System.out.println("d".matches("[^abc]")); // again just one but not in bracket
        System.out.println("dd".matches("[a-z]")); // again just one char  from a to z
        System.out.println("dd".matches("[a-z][a-z]")); // should be 2 char 1. from a to z 2. also a to z
        System.out.println("abc".matches("ab"));

        System.out.println("------------------------------");

        System.out.println("5".matches("\\d")); // one char and digit lower case d
        System.out.println("5".matches("\\D")); // not a digit upper case D
        System.out.println(" ".matches("\\s")); // for space lower s
        System.out.println(" ".matches("\\S")); // for  not space upper s
        System.out.println(" ".matches("\\w")); // for letter or digit and underscore lower w
        System.out.println(" ".matches("\\W")); // for not letter nor digit

        System.out.println("------------------------------");

        System.out.println("lfklkd".matches(".*"));     // . any char * means that n times so all string matches
        System.out.println("şlfkş".matches("[abc]*"));  // just abc chars n times can be used
        System.out.println("cvv".matches("[cv]+"));     // c and v should be used 1 or more times
        System.out.println("jkkljl".matches("[jkl]{3,89}"));  // length should be range 3 to 89 and just this 3 chars should be use
        System.out.println("aaa@gmail.com".matches(".*@gmail.*"));  // to confirm gmail account basically
        System.out.println("kfjhgk_dk-gh".matches("\\w*"));  // n times letter or digit and underscore

        System.out.println("------------------------------");

        int b =10101;
        System.out.println(String.valueOf(b).matches("b[01]*"));  // not binary so it is false

    }
}
