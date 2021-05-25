package project.admin.student;

import com.sun.source.doctree.SystemPropertyTree;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    //variable setup
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    String alternateEmail;
    String emailAddress;
    String CompanyName="Epsilson";
    String companysuffix="@Epsilon.com";
    int passL=8;

    //constructor
    public Email(String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        System.out.println("Email Created for : " + this.firstName + " " + this.lastName);
            this.department=setDepartment();
        //System.out.println("Department : " + this.department); commented as too Much unnecessary Data
             this.password=randomPassword(passL);
        System.out.println("your Password is : " + this.password);
        emailAddress=firstName.toLowerCase()+lastName.toLowerCase()+"."+department.toLowerCase()+companysuffix.toLowerCase();
        System.out.println(emailAddress);
    }



    //ask for department
    private String setDepartment(){
        System.out.print("New Worker : "+firstName+" Enter the Department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None");
        Scanner in=new Scanner(System.in);
        int dptChoice=in.nextInt();

        if(dptChoice==1){
                 return "Sales";
        }
        else if(dptChoice==2){
                return "Development";
        }
        else if(dptChoice==3){
                return "Accounting";
        }
        else{
                return "";
        }
    }

    //generation of a Random Password
    private String randomPassword(int passL){
        String passwordSet="QWERTYUIOPASDFGHJKLZXCVBNM0123456789!@#$%^&*";
        char[] password = new char[passL];
        for(int i = 0; i< passL; i++){
            int random=((int) (Math.random() * passwordSet.length()));
            password[i]=passwordSet.charAt(random);
        }
        return new String(password);
    }
    //Set the mailbox capacity
    public void setmailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }


    //set the alternate email
    public void setAlternateEmail(String Ae){
        this.alternateEmail=Ae;
    }
    //change password
    public void changePassword(String password){
        this.password=password;
    }

    public int getMailBoxCapacity(){
      return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }

    public String getInfo(){
        return firstName + " " +lastName + "\n" + CompanyName + "\n" + mailboxCapacity;
    }



 }
