package project.admin.student;

public class Main {

    public static void main(String[] args) {

        Email em1=new Email("Dhiraj","Chauhan");
        em1.setmailboxCapacity(500);
        System.out.println(em1.getInfo());


    }
}