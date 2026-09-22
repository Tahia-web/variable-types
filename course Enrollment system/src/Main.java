//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        courses courses1=new courses("BIT",80,60);
        courses courses2=new courses("SOFTWARE",40,30);
        courses courses3=new courses("COMPUTERSCI",90,60);
        courses courses4=new courses("CYBERSECURITY",80,50);
        courses1.course();
        courses2.course();
        courses3.course();
        courses4.course();
        double averageattendance=courses1.numberofattendend+courses2.numberofattendend+courses3.numberofattendend+courses4.numberofattendend/4;
        System.out.println("averageattendance is " + averageattendance);
        




    }
    }
