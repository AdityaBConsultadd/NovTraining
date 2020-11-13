package DAY3;

public class Operators {
//    different types of operators and there uses
//    unary
//    increment/ decrement (++,--)
//      post/pre
//    + positive
//    - neg

//    binary
//    two operands
//    add
//    sub
//    multi
//    div
//    mod


//    assignment operators
//    ==   if the value are same or equal or not
//    +=  addition and assignment at the same time
//    -=  subs and assignment at the same time
//    *=
//    /=
//    %=  to get rem
//    ^= 2^2 =4
//    >>=

//    relational operators
//    >,<,<=,>=

//    ternary
    public static void main(String[] args) {
//        unary
        int number1 =-5;
        int number2 = 7;

//        System.out.println("increment");
//        System.out.println("pre"+ (++number1));
//        System.out.println("post" + (number1++));
//        System.out.println(number1);

        number2+=number2;
        System.out.println("additon assignment"+number2);
        number2*=number2;
        System.out.println(number2+"multi");
        number2/=number2;
        System.out.println(number2+"division");
        number2%=number2;
        System.out.println(number2+"mod");
//        number2 = number2 + number2;
        number2-=number2;
        System.out.println(number2+"sub");

        boolean equality = number1==number2;
        System.out.println(equality);


//        logical and relational operators
        boolean check;
        check=number1>number2;
        System.out.println(check);
        check=number1>=number2;
        System.out.println(!check);


//        logical
//        AND &&
//        OR ||

//        bitwise
//        & AND
//        | OR
//        ~ NOT
//       1 AND 1 = 1
//        0 AND 1 = 0
//        values  AND
//        a  b
//        0   1 =0
//        1  0= 0
//        1  1 = 1

//        OR table
//        a   b
//        0    0 =0
//        0    1=1
//        1    1=1
        int a=11001100;
        int b=~a;
        System.out.println(a&b);


//        ternary
        System.out.println("If 2 is greater than 4");

        System.out.println((2>4)?"":"NO");


//    a= 110011   a>>2  = 111100


    }
}
