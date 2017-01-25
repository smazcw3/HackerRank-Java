import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {         
         //Added code from here
         Comparator<Student> comp = new Comparator<Student>(){
         
         	public int compare(Student s1, Student s2){
				if(s1.getCgpa() > s2.getCgpa()){
					return -1;
				}
				else if(s1.getCgpa() < s2.getCgpa()){
					return 1;
				}
				else{
					int compare = s1.getFname().compareTo(s2.getFname());
					if(compare != 0){
						return compare; 
					}
					else{
						if(s1.getToken() > s2.getToken()){
							return -1;
						}
						else if(s1.getToken() < s2.getToken()){
							return 1;
						}
					}
				}
				return 0;
         	}
         };
         
         Scanner in = new Scanner(System.in);
         int totalEvents = Integer.parseInt(in.nextLine());
         PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>(totalEvents, comp);
         while(totalEvents > 0){
        	 String event = in.next();
	         if(event.equals("ENTER")){
	        	 String fathername  = in.next(); 
	        	 double cgpa = in.nextDouble();
	        	 int token = in.nextInt();
	        	 Student student = new Student(token, fathername, cgpa);
	        	 priorityQueue.add(student);
	         }
	         else{
	        	 priorityQueue.poll();
	         }
	         totalEvents--;
      }
         
         if(priorityQueue.isEmpty()){
        	 System.out.println("EMPTY");
         }
         else{
        	 while(!priorityQueue.isEmpty()){
            	 Student st = priorityQueue.poll();
            	 System.out.println(st.getFname());
        	 }
         }
         in.close();
    } 
}
