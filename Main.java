// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) throws Exception {
//         try (// System.out.println("Hello, World!");
//         Scanner sc = new Scanner(System.in)) {
//             int a = sc.nextInt();
//             int b = sc.nextInt();
//             int c  = a+b;
//             System.out.println(c);
//         }
//     }
// }

import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    // ======check eligibility=========
    // int age = sc.nextInt();
    // if(age>18){
    //   System.out.println("Adult");
    // }else{
    //   System.out.println("Not adult");
    // }

    // odd and even number ===============
    // int number = sc.nextInt();
    // if (number%2 == 0){
    //   System.out.println("Even");      
    // }else{
    //   System.out.println("Odd");
    // }

    // check max number ============
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // if(a==b){
    //   System.out.println("Equal");      
    // }else if(a>b){
    //   System.out.println("a is Greater");
    // }else{
    //   System.out.println("a is lesser");
    // } 

    // check which button is pressed ============
    
    // if else method =========
    // int button = sc.nextInt();
    // if(button == 1){
    //   System.out.println("Hello");
    // }else if(button == 2){
    //   System.out.println("Namaste");
    // }else if(button ==3){
    //   System.out.println("Bonjour");
    // }else{
    //   System.out.println("Invalid button");
    // }

    // switch case =======
    int button = sc.nextInt();
    switch (button){
      case 1 : System.out.println("Hello");   
      break;
      case 2 : System.out.println("Namaste");   
      break;
      case 3 : System.out.println("Bonjour");   
      break;
      default : System.out.println("Invalid button");
    }
    
  }
}