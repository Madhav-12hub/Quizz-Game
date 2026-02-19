import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class QuestionService {
    Question [] question=new Question[5];


    public QuestionService() {
        question[0]=new Question(001,"Is Array Fixed","Fixed","Not Fixed","Varies","None of the Above","Modified", "Fixed");
        question[1] = new Question(102, 
        "Which data structure allows dynamic resizing?", 
        "Array", 
        "ArrayList", 
        "int[]", 
        "String", 
        "Modified", 
        "ArrayList");
        question[2] = new Question(103, 
        "Which method is the entry point of a Java program?", 
        "start()", 
        "run()", 
        "main()", 
        "init()", 
        "Modified", 
        "main()");
        question[3] = new Question(104, 
        "What is the size of int in Java?", 
        "2 bytes", 
        "4 bytes", 
        "8 bytes", 
        "Depends on system", 
        "Modified", 
        "4 bytes");
        question[4] = new Question(105, 
        "Which concept allows one object to take many forms?", 
        "Encapsulation", 
        "Abstraction", 
        "Polymorphism", 
        "Inheritance", 
        "Modified", 
        "Polymorphism");
    }
    public void displayquestion(){
        Scanner sc = new Scanner(System.in);
        int i=0;
        int score=0;


        
        for(Question q : question){
            System.out.println("Question. "+ q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1 " +q.getOpt1());
            System.out.println("2 " +q.getOpt2());
            System.out.println("3 " +q.getOpt3());
            System.out.println("4 " +q.getOpt4());
            System.out.println("5 " +q.getOpt5());

            System.out.print("Enter option number (1-5): ");
            int choice = sc.nextInt();

          String userAnswer = "";

            switch (choice) {
                case 1:userAnswer= q.getOpt1(); 
                    break;
                case 2:userAnswer= q.getOpt2(); 
                    break;
                case 3:userAnswer= q.getOpt3(); 
                    break;
                case 4:userAnswer= q.getOpt4(); 
                    break;
                case 5:userAnswer= q.getOpt5(); 
                    break;
                default:
                    break;
            }
           

            if(userAnswer.equalsIgnoreCase(q.getAns())){
                System.out.println("correct answer.");
                score++;
            }else{
                System.out.println("Wrong answer proceed to next..");
                System.out.println("Correct Answer is: " + q.getAns() + "\n");
            }

            i++;  
        }
        System.out.println("The Quizz is finished!!!!");
            System.out.println("The Score is " + score);


    }

    
    
}
