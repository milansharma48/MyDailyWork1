import java.util.Scanner;

public class grade {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int rollNo;
        System.out.println("enter your roll number : ");
        rollNo=sc.nextInt();
        System.out.println("roll number is :"+rollNo);

        int english;
        System.out.println("enter marks of english");
        english=sc.nextInt();
        int Maths;
        System.out.println("enter marks of maths");
        
        Maths=sc.nextInt();
        int Hindi;
        System.out.println("enter marks of hindi");
        
        Hindi=sc.nextInt();

        int SST;
        System.out.println("enter marks of sst");
         SST=sc.nextInt();


    
        int totalMarks;
        totalMarks=english+Maths+Hindi+SST;
        System.out.println("total Marks of student :"+totalMarks);


        int average=(english+Hindi+Maths+SST)/4 ;
        System.out.println("the average percentage : "+average);


        if(average<=100){
            if(average>=90){
                System.out.println("A++");
            }
            else if (average>=80) {
                System.out.println("A");
                
            }
            else if (average>=70) {
                System.out.println("B");
                
            }
            else if (average>=60) {
                System.out.println("B++");
                
            }
            else if (average>=50) {
                System.out.println("C");
                
            }
           else  if (average>=40) {
                System.out.println("C++");
                
            }
            else if(average>=30){

            System.out.println("D");
            }
        }
         if (average<=20) {
            
        }{
            System.out.println("FAIL");

        }
    
       
        
     
        




    }
}
