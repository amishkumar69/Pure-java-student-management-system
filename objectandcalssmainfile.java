package OOPS;

import java.util.ArrayList;
import java.util.Scanner;

public class objectandcalssmainfile {

	public static void main(String[] args) throws Exception {
		
		ArrayList<ObjectAndClassclassfile> list = new ArrayList<ObjectAndClassclassfile>();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Add Student data ");
			System.out.println("2. Display Student data");
			System.out.println("3. Delet Student Data");
			System.out.println("4. Update Student Data");
			System.out.println("5. Exit");
			
			int key = input.nextInt();
			
			input.nextLine();
			
			
			
			switch (key) {
			case 1: {
				
				ObjectAndClassclassfile sd = new ObjectAndClassclassfile();
				
				System.out.println("Enter name");
				String name = input.next();
				System.out.println("Enter Age");
				int age = input.nextInt();
				System.out.println("Enter Roll no");
				int rollno = input.nextInt();
				System.out.println("Enter Gender");
				String gender = input.next();
				
				System.out.println();
				
				boolean exist =  false;
				
				for(ObjectAndClassclassfile st : list)
				{
					if (st.rollno == rollno) {
						exist = true;
						break;
					}
				}
				
				if (exist) {
					System.out.println("This enter youir roll no not other");
					System.out.println();
				}else {
					sd.setdata(name, age, rollno, gender);
					
					list.add(sd);
					
					System.out.println("Data is added sucess ful");
				}
		
				
				break;
				
			}
			case 2: {
				if(list.isEmpty()) {
					System.out.println("List is empty");
				}else {
					for(ObjectAndClassclassfile st : list) {
						System.out.println(st);
					}
				}
				break;
			}
			case 3: {
				
				System.out.println("Enter Delet roll.no");
				
				boolean found = false;
				
				
				int delroll = input.nextInt();
				
				for(int i =0; i <= list.size(); i++) {
					
					if(list.get(i).rollno == delroll) {
						
						list.remove(i);
						
						found = true;
						
						System.out.println("Data is deleted sucessfull");
						break;
					}
					
				}
				
				if(!found) {
					System.out.println("Data is not found");
				}
				break;
				
			}
			case 4: {
				System.out.println("Enter rollno to update data");
				
				int updateroll = input.nextInt();
				
				ObjectAndClassclassfile student = null;
				
				boolean found = false;
				
				for(ObjectAndClassclassfile st : list) {
					
					if(st.rollno == updateroll) {
						found = true;
						
						student = st;
						
						break;
						}
				}
				
				if(!found) {
					System.out.println("Enter a va;id roll no");
					break;
				}
				
//				User found
				
				System.out.println("What you want to upgrade");  
				System.out.println("1. Update name");
				System.out.println("2. Update Gender");
				System.out.println("3. Update Age");
				
				int updata = input.nextInt();
			
				input.nextLine();
				
				switch (updata) {
				case 1: {
					System.out.println("Enter name to upgrade");
					String updatedname = input.next();
					student.name = updatedname;
					
					System.out.println("Data upgraded");
				
					break;
				}
				case 2:{
					System.out.println("Updrade  Gender");
					
					String UpdateGender = input.next();
					
					student.gender = UpdateGender;
					System.out.println("Gender Updated");
					
					break;
				}
				case 3:{
					System.out.println("Enter updaet age");
					int updateAge = input.nextInt();
				student.age = updateAge;
				
				System.out.println("Age updated");
				
				break; 
				}
				default:
					System.out.println("Enter correct feield to upgrade");
				}
				break;
			}
			case 5: {
				System.out.println("Exiting progrm");
				
				System.exit(0);
			}
			
			default:
				System.out.println("Invalid Selection");
			}
		}
	
		


	}

}
