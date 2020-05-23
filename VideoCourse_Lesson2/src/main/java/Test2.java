public class Test2 {
    public static void main(String[] args) {
        byte a = 120;
        byte a2 = 100;

        short b = 2000;
        short b2 = -900;

        int c  = 12345;
        int c2 = -24567;
        int c3 = 1000000;
        int c4 = 1_000_000;

        long d = 200000;
        long d2 = 45000000;

        //Тип задания переменных типа char
        char f = '4';
        char f2 = 'Ъ';
        char f3 = 300; // f3 содержит значение 300 символа в unicode - используем 10-ую систему счисления
        char f4 = '\u1234'; //используем 16-ти -ую систему счисления

        System.out.println(f4);

        //Представление числа в разных системах счисления
        int g = 60;
        System.out.println("В десятичной системе: " + g);
        int g2 = 0B111100; //0B обязательно для указания того,что число в двоичной системе или 0b
        System.out.println("В двоичной системе: " + g2);
        int g3 = 074;
        System.out.println("В восьмиричной системе: " + g3);
        int g4 = 0x3C;
        System.out.println("В шестнадцатиричной системе: " + g4);

        //Домашнее задание
        byte a3 = 12;
        System.out.println("В десятичной системе a3: " + a3);
        byte a4 = 0xC;
        System.out.println("В шестнадцатиричной системе a4: " + a4);
        byte a5 = 014;
        System.out.println("В восьмиричной системе a5: " + a5);
        byte a6 = 0B1100;
        System.out.println("В двоичной системе a6: " + a6);

        short b3 = 1300;
        System.out.println("В десятичной системе b3: " + b3);
        short b4 = 0x514;
        System.out.println("В шестнадцатиричной системе b4: " + b4);
        short b5 = 02424;
        System.out.println("В восьмиричной системе b5: " + b5);
        short b6 = 0B10100010100;
        System.out.println("В двоичной системе b6: " + b6);

        int c5 = 0;
        System.out.println("В десятичной системе c5: " + c5);
        int c6 = 0x0;
        System.out.println("В шестнадцатиричной системе c6: " + c6);
        int c7 = 00;
        System.out.println("В восьмиричной системе c7: " + c7);
        int c8 = 0B0;
        System.out.println("В двоичной системе c8: " + c8);

        long d3 = 123456789;
        System.out.println("В десятичной системе d3: " + d3);
        long d4 = 0x75BCD15;
        System.out.println("В шестнадцатиричной системе d4: " + d4);
        long d5 = 0726746425;
        System.out.println("В восьмиричной системе d5: " + d5);
        long d6 = 0B111010110111100110100010101;
        System.out.println("В двоичной системе d6: " + d6);
    }
}
