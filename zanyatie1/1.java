/*
  Реализовать программу, получающую на вход в качестве аргумента имя человека и выводящую "Hello " + имя, в противном случае, если параметр не передавался, "Hello world".
*/

public class Test {
 public static void main(String[] args) {
 if (args[0].isEmpty()){
  System.out.println("Hello world!");
 }
 else {
  System.out.println("Hello " + args[0] + "!");
 }
 }
}
