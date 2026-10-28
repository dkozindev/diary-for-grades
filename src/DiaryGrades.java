public class DiaryGrades {

    private String nameStudent;
    private int mathScore;
    private int rusLanguageScore;
    private int informaticScore;
    private int historyScore;
    private int physicScore;

    public DiaryGrades(String name) {
        this.nameStudent = name;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void info() {
        if (mathScore == 0) {
            System.out.println("Нет оценки по Математике!");
        } else {
            System.out.println("Оценка по математике: " + mathScore);
        }
        if (rusLanguageScore == 0) {
            System.out.println("Нет оценки по Русскому языку!");
        } else {
            System.out.println("Оценка по Русскому языку: " + rusLanguageScore);
        }
        if (informaticScore == 0) {
            System.out.println("Нет оценки по Информатике!");
        } else {
            System.out.println("Оценка по информатике: " + informaticScore);
        }
        if (historyScore == 0) {
            System.out.println("Нет оценки по Истории!");
        } else {
            System.out.println("Оценка по Истории: " + historyScore);
        }
        if (physicScore == 0) {
            System.out.println("Нет оценки по Физике!");
        } else {
            System.out.println("Оценка по Физике: " + physicScore);
        }

    }

    public void setScore(int mathScore, int rusLanguageScore, int informaticScore, int historyScore, int physicScore) {
        if (mathScore < 1 || mathScore > 5) {
            System.out.println("Поставьте оценку от 1 до 5 по Математике!");
        } else {
            this.mathScore = mathScore;
        }
        if (rusLanguageScore < 1 || rusLanguageScore > 5) {
            System.out.println("Поставьте оценку от 1 до 5 по Русскому языку!");
        } else {
            this.rusLanguageScore = rusLanguageScore;
        }
        if (informaticScore < 1 || informaticScore > 5) {
            System.out.println("Поставьте оценку от 1 до 5 по Информатике!");
        } else {
            this.informaticScore = informaticScore;
        }
        if (historyScore < 1 || historyScore > 5) {
            System.out.println("Поставьте оценку от 1 до 5 по Истории!");
        } else {
            this.historyScore = historyScore;
        }
        if (physicScore < 1 || physicScore > 5) {
            System.out.println("Поставьте оценку от 1 до 5 по Физике!");
        } else {
            this.physicScore = physicScore;
        }
    }
    @Override
    public String toString() {
        return nameStudent;
    }
}
