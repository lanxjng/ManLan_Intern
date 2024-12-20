package Section5_3;

import java.util.Scanner;

public class CourseScore {
    private String id;
    private float score;
    private String name;

    public CourseScore() {
    }

    public CourseScore(String id, float score, String name) {
        this.id = id;
        this.score = score;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--Nhập thông tin điểm--");
        System.out.println("Nhập ID: ");
        this.id = sc.nextLine();
        System.out.println("Nhập điểm: ");
        this.score = Float.parseFloat(sc.nextLine());
        System.out.println("Nhập Tên: ");
        this.name = sc.nextLine();
    }
    public  void infor(){
        System.out.println("ID: "+id);
        System.out.println("Score: "+score);
        System.out.println("Name: "+name);
        if(score<5){
            System.out.println("Rank: Yếu");
        } else if (score>=5 && score<7) {
            System.out.println("Rank: TB");
        }else if (score>=7 && score<8) {
            System.out.println("Rank: Khá");
        }else if (score>=8 && score<9) {
            System.out.println("Rank: Giỏi");
        }else {
            System.out.println("Rank: Xuất Sắc");
        }
    }
}
