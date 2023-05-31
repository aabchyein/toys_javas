import java.util.Scanner;
public class MaxMins {
    public int min(int A, int B) { // main에서 받은 값을 넣어 작은값을 찾아냄
        int result = 0;
        try {
            if (A<B) {
                result = A;
            } else if (B<A) {
                result = B;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result; //결과인 작은값을 다시 main으로 보내줌
    }
    public static void main(String[] args) {
        try {
            Scanner myObj = new Scanner(System.in); // 스캐너로 2개의 int 값(first,second)을 입력받음
            int first = 0;
            int second = 0;
            first = myObj.nextInt();
            second = myObj.nextInt();

            MaxMins maxmins = new MaxMins();
            int result = maxmins.min(first, second); //입력된 값을 fuction min으로 보냄
            System.out.println("작은 값: " + result); //2개의 값 중 작은 값을 출력
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
