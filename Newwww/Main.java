package Newwww;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws exeption.MyException {
        Scanner in = new Scanner( System.in);
        exeption a = new exeption();
        String s = in.nextLine();
        String[]s1 = s.split(" ");
        a.longs(s1);
        input es = new input();
        es.gos(s1[0],s1[2],s1[1]);
    }}
class input{
    public void gos(String x,String y,String z) throws exeption.MyException {
        exeption a = new exeption();
        lass tem = new lass();
        String[]i=tem.finall(a.clean(z),a.clean(a.find(x)),a.clean(a.find(y))).split("");
        if (i.length > 41) {
            System.out.println((String.join("",Arrays.copyOfRange(i, 0, 41)))+ "...");}
        else {
            System.out.println(tem.finall(a.clean(z),a.clean(a.find(x)),a.clean(a.find(y))));
        }
    }
}
class exeption {
    public String clean (String x){
       if (x.contains("\"")){
        for (char c : ("\"").toCharArray()) {
            x = x.replace(String.valueOf(c), "");
        }} return x ;
    }
    public String find (String x) throws MyException {
        if (x.contains("\"")){
            if (x.length() > 12) {
                System.out.println("недопустимая длина значения");
                throw new MyException();
            }}
        else if (Integer.parseInt(x)>10){
                System.out.println("недопустимая длина значения");
                throw new MyException();
        }return x;}
    public void longs (String[]x)throws MyException{
        if (x.length>3){
            System.out.println("недопустимая длина выражения");
            throw new MyException();
        }
    }
    static class MyException extends Throwable {
        public MyException() {
        }
    }
}
class lass {
            public String finall (String z, String A, String B){

        raschet auto= new raschet();
                switch (z) {
                    case ("*") -> {return("\""+(auto.doubless(A, B))+"\"");}
                    case ("+") -> System.out.println("\""+(auto.pluss(A, B))+"\"");
                    case ("-") -> System.out.println("\""+(auto.minuss(A, B))+"\"");
                    case ("/") -> {return("\""+(auto.delenie(A, B))+"\"");}
                    default -> System.out.println("значение выражения не соответсвует задоному значению");
                }
                return z;
            }
}
class raschet {
        public String pluss(String x, String y) {
            return (x + y);
        }
        public String minuss(String x, String y) {
            return (x.replaceFirst(y, ""));
        }
        public String delenie(String str, String x) {
            String[] dela = str.split("");
            int leng = (dela.length) / Integer.parseInt(x);
            String[] subArray = Arrays.copyOfRange(dela, 0, leng);
            return ((String.join("", subArray)));
        }
        public String doubless(String word, String x) {
            return (word.repeat(Integer.parseInt(x)));
        }
    }









