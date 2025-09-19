package fuctional;

public class Calculator {
   FuctionalInterface add=((a, b) -> a + b);
   FuctionalInterface sub=((a, b) -> a - b);
   FuctionalInterface mul=((a, b) -> a * b);

public void add(Integer a){
   a++;
}
   public static void main(String[] args) {
      Integer i=10;
      Calculator calculator=new Calculator();
      calculator.add(i);
      System.out.println(i);
   }
}
