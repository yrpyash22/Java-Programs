
// =========        Java Generics      ========= // 

/*
 * Generics --> Enable types (Class, Interfacs) to parameters difining:
 * class, interface asnd methods
 * A benefit is to eliminate the need to create multiple version
 * of method or Classes for various data types.
 * Use1 version for all reference data types
 */






 

// Function Generics
/* 
public class Assignment_18 {
public static <T> void displayArry(T[] arry)
{
    for(T  x: arry)
    {
        System.out.print(x + " ");
    }
    System.out.println();
}

public static <T> T getFirst(T[] arry)
{
    return arry[0];
}


public static void main(String[] args) {
    Integer[] intArry = { 1, 2, 5, 8 };
    Double[] doubleArry = { 1.5, 5.2, 256.2, 15.2 };
    Character[] charArry = { 'H', 'E', 'L', 'L', 'O' };
    String[] strArry = { "ABC", "EFG", "HIJ", "KLM" };

    displayArry(intArry);
    displayArry(doubleArry);
    displayArry(charArry);
    displayArry(strArry);

    System.out.println(getFirst(intArry));
    System.out.println(getFirst(doubleArry));
    System.out.println(getFirst(charArry));
    System.out.println(getFirst(strArry));
}
}*/











// Class Generics

/* 
class MyGeneric<T1> {
    T1 t1;
    MyGeneric(T1 t1) {
        this.t1 = t1;
    }
    public T1 getvalue() {
        return t1;
    }
}

public class Assignment_18 {
    public static void main(String[] args) {
        MyGeneric<Integer> myInt = new MyGeneric(10);
        MyGeneric<Double> mydouble = new MyGeneric(154.2);
        MyGeneric<Character> mychar = new MyGeneric('H');
        MyGeneric<String> mystr = new MyGeneric("Hello World");

        System.out.println(myInt.getvalue());
        System.out.println(mydouble.getvalue());
        System.out.println(mychar.getvalue());
        System.out.println(mystr.getvalue());
    }
}*/




/*
class MyGeneric<T1, T2> {
    T1 t1;
    T2 t2;
    MyGeneric(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    public T1 getvalue1() {
        return t1;
    }
    public T2 getvalue2() {
        return t2;
    }
}

public class Assignment_18 {
    public static void main(String[] args) {
        MyGeneric<Integer , Integer> myInt = new MyGeneric(10, 25);
        MyGeneric<Double, Integer> mydouble = new MyGeneric(154.2, 15);
        MyGeneric<Character, String> mychar = new MyGeneric('H', "Good Bye");
        MyGeneric<String, Character> mystr = new MyGeneric("Hello World", 'C');

        System.out.println(myInt.getvalue1() +" "+ myInt.getvalue2() );
        System.out.println(mydouble.getvalue1()+" "+ mydouble.getvalue2());
        System.out.println(mychar.getvalue1() +" "+ mychar.getvalue2());
        System.out.println(mystr.getvalue1()+" "+ mystr.getvalue2());
    }
}*/