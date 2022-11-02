package com.codestates.seb.calculator;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("===Java Calculator===");

    Scanner input = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
    // TODO...
    while(true) {
      double thrid = 0;

      System.out.print("앞자리 숫자 : ");
      double firstNum = input.nextDouble();


      System.out.print("연산자 입력 (+, -, *, /) : ");
      String signal = input.next();

      while (!("+".equals(signal) || "-".equals(signal) || "*".equals(signal) || "/".equals(signal))) {
        System.out.print("잘못된 입력입니다 (+, -, *, /) : ");
        signal = input.next();
      }

      System.out.print("뒷자리 숫자 : ");
      double secondNum = input.nextDouble();


      if ("+".equals(signal)) {
        thrid = firstNum + secondNum;
      } else if ("-".equals(signal)) {
        thrid = firstNum - secondNum;
      } else if ("*".equals(signal)) {
        thrid = firstNum * secondNum;
      } else if ("/".equals(signal)) {
        thrid = firstNum / secondNum;
      }
      DecimalFormat df = new DecimalFormat("#.########");
      System.out.println("결과 : " + df.format(firstNum) +" " + signal + " " + df.format(secondNum) + " " +  "=" + " " + df.format(thrid));

      System.out.print("계속 하시겠습니까? (y / n) : ");
      String quest = input.next();

      while (!("y".equals(quest) || "n".equals(quest))) {
        System.out.print("잘못된 입력입니다 (y / n) : ");
        quest = input.next();
      }

      if ("y".equals(quest)) {
        continue;
      }else{
        break;
      }
    }
  }




}
