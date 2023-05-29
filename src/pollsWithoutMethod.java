import java.util.Scanner;

public class polls {
    public static void main(String[] args) {
        System.out.println("> 이름을 입력하세요");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String name = myObj.nextLine();
        System.out.println("이름)" + name);
        int[] answers = new int[4];

        String[][] polls = {{"1. 교수는 수업 전 강의 목표를 정확히 제시하였습니까?"},
                            {"2. 강의의 내용은 체계적이고 성의있게 구성되었는가?"},
                            {"3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?"},
                            {"4. 강의 진행 속도는 적절하였는가?"},
                            };

        for (int first=0; first < polls.length; first = first +1) {
            System.out.println(polls[first][0]);
            System.out.println("(1)전혀 아니다. (2)아니다. (3)그렇다. (4)매우 그렇다.");
            answers[first] = myObj.nextInt();
        
        };

        

        System.out.println("----------설문 종료----------");
        System.out.println("----------설문 결과----------");
        System.out.println("1."+ answers[0]+ " 2."+ answers[1]+ " 3."+ answers[2]+ " 4."+ answers[3]);

      // return 0;
    }
}