package lesson_3;

public class Test_1 {
    public static void main(String[] args) {
        int a = 11;
        int b = 3;

        //операция "сложение"
        System.out.println(a+b);

        //операция деления
        //отсекается дробная часть
        System.out.println(a/b);

        double c = 11;
        double e = 3;
        //дробная часть сохраняется
        System.out.println(c/e);

        //операция "остаток от деления"
        int celayaChast = a/b;
        int ostatok = a%b;

        double c2 = 5.5;
        double c3 = 3.5;
        double c4 = c2%c3;

//        System.out.println(celayaChast);
        //результат: 2,тоесть число 3 вместилось в число 11 три раза и осталось еще два
//        System.out.println(ostatok);
//        System.out.println(c4);

        //postfix ++
        int x = 5;
        int y = 3;
        //z = (x -y)+1
        int z = x-y++;
        System.out.println("postfix: "+z);

        //prefix
        int x2 = 5;
        int y2 = 3;
        //z2=5-(3+1)
        int z2 = x2- ++y2;
        System.out.println("prefix: " +z2);

        //операция "+=" сначала прибавь,потом присвой
        int a2 = 5, b2 =3;
        a = a + 3;
        a2+=3;
        b2-=2;
        System.out.println("операция \"+=\"" + a2 + " " + b2);

        //оперция short circuit
        boolean aa = false;
        boolean bb = false;
        boolean zz = true;

        System.out.println(aa&&bb&&zz);

        //операция "!" отрицания
        System.out.println(!aa);

        int x3 = 10;
        int x4 = 50;
        int x5 = 100;
        int x6 = 0;

        boolean c5 = x3 > x4;
        boolean c6 = x3<x4 && x5 < x6; // true && false = false

        System.out.println(!c5);
        System.out.println(c6);

        //порядок операции &&, ||, !, ^
        int aaa = 10;
        int bbb = 3;

        int ccc = ++a - b*2;
        System.out.println(ccc);


    }
}
