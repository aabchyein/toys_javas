import java.util.Scanner;

public class MaxMins {

  // Max() Method 생성
  public int Max(int x, int y) {
    int result = 0; // Max값 변수 선언

    try {
      if (x > y) {
        result = x;
      } else {
        result = y;
      }
    }

    catch (Exception e) {
      // TODO: handle exception
    }
    return result;

  }

  // main
  public static void main(String[] args) {

    try {
      int MaxNumber = 0; // 결과값 변수 선언
      int first = 0; // 입력 받을 정수 변수 선언
      int second = 0; // 입력 받을 정수 변수 선언
      boolean loop = true; // while문 loop 변수 선언

      MaxMins mm = new MaxMins(); // Method Max() 호출

      Scanner sc = new Scanner(System.in); // 스캐너 호출

      while (loop) {
        System.out.print("정수 2개 입력: "); // 안내 문구
        first = sc.nextInt(); // 스캐너로 정수 입력받기
        second = sc.nextInt();

        if (first == second) { // 두 값이 같을 경우 다시 입력 받기
          System.out.println("※ 서로 다른 값을 입력하세요.");
        } else {
          MaxNumber = mm.Max(first, second); // result 값에 큰 수가 저장된다.
          loop = false;
        }

      }
      System.out.println("Max Number is: " + MaxNumber); // 결과 출력

    } catch (Exception e) {
      // TODO: handle exception
    }
    // return 0;
  }
}