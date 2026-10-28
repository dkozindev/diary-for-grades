import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<DiaryGrades> diaryGrades = new ArrayList<>();
        diaryGrades.add(new DiaryGrades("Dima"));
        diaryGrades.add(new DiaryGrades("Ilya"));

        for (DiaryGrades dg : diaryGrades) {
            System.out.println("Ученик " + dg.getNameStudent());
            System.out.print("Введите оценку по Математике: ");
            int math = scan.nextInt();
            System.out.print("Введите оценку по Русскому языку: ");
            int rus = scan.nextInt();
            System.out.print("Введите оценку по Информатике: ");
            int inf = scan.nextInt();
            System.out.print("Введите оценку по Истории: ");
            int his = scan.nextInt();
            System.out.print("Введите оценку по Физике: ");
            int phy = scan.nextInt();
            dg.setScore(math, rus, inf, his, phy);
            System.out.println();
        }

        System.out.println();

        for (DiaryGrades dg : diaryGrades) {
            System.out.println("Оценки ученика " + dg.getNameStudent());
            dg.info();
            System.out.println("---------------");
        }


    }
}