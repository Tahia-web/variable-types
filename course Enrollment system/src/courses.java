public class courses {
    String cname;
    int sumofstudents;
    int numberofattendend;

    static String universityname= IUEA;
    public courses( String n, int s,int a){
     cname=n;
     sumofstudents=s;
     numberofattendend=a;}
    public void course(){
        System.out.println("the course name is" + cname);
        System.out.println("the sumofstudents is " + sumofstudents);
        System.out.println(" the number of students that attended is " + numberofattendend);
    }



}
