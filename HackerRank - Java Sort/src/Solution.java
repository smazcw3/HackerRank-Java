import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution
{
   public static void main(String[] args){
	  Comparator<Student> comp = new Comparator<Student>(){
		@Override
		public int compare(Student o1, Student o2) {
			if (o1.getCgpa() > o2.getCgpa()){
				return -1;
			}
			else if(o1.getCgpa() < o2.getCgpa()){
				return 1;
			}
			else{
				int compare = o1.getFname().compareTo(o2.getFname());
				if(compare != 0){
					return compare;
				}
				else{
					if(o1.getId() > o2.getId()){
						return -1;
					}
					else if(o1.getId() < o2.getId()){
						return 1;
					}
				}
			}
			return 0;	
		}		  
	  };
  
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      PriorityQueue<Student> studentList = new PriorityQueue<Student>(testCases, comp);
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         testCases--;
      }
      while(!studentList.isEmpty()){
    	  Student st = studentList.poll();
    	  System.out.println(st.getFname());
      }
      in.close();
   }
}

