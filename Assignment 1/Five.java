class Student {
    private int studentId;
    private String name;
    private int m1;
    private int m2;
    private int m3;
    private int total;
    private double average;
    private int presentDays;
    private int totalDays;
    private String regularity;

    public Student(int studentId, String name, int m1, int m2, int m3, int presentDays, int totalDays) {
        this.studentId = studentId;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.presentDays = presentDays;
        this.totalDays = totalDays;

        total = m1 + m2 + m3;
        average = total / 3.0;
        double presentPercentage = (presentDays * 100.0) / totalDays;
        if (presentPercentage < 40) {
            regularity = "Irregular";
        } else if (presentPercentage >= 40 && presentPercentage < 80) {
            regularity = "Somewhat Regular";
        } else {
            regularity = "Very Regular";
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getM1() {
        return m1;
    }

    public int getM2() {
        return m2;
    }

    public int getM3() {
        return m3;
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public int getPresentDays() {
        return presentDays;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public String getRegularity() {
        return regularity;
    }
}

public class Five {
    public static void main(String[] args) {
        Student s = new Student(1, "Biplov Pokhrel", 80, 85, 90, 100, 280);
        System.out.println("Student ID: " + s.getStudentId());
        System.out.println("Name: " + s.getName());
        System.out.println("Marks in Subject 1: " + s.getM1());
        System.out.println("Marks in Subject 2: " + s.getM2());
        System.out.println("Marks in Subject 3: " + s.getM3());
        System.out.println("Total Marks: " + s.getTotal());
        System.out.println("Average Marks: " + s.getAverage());
        System.out.println("Present Days: " + s.getPresentDays());
        System.out.println("Total Days: " + s.getTotalDays());
        System.out.println("Regularity: " + s.getRegularity());
    }
}
