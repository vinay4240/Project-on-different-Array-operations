import java.util.Scanner;
class Test 
{
	static int oprationValue;
	static Scanner scn=new Scanner(System.in);
	static int userdata [];
	static int copyuserdata;
	public static void main(String[] args) 
	{
		int index;
		
		
		System.out.print("Please Enter Element no that you want to in array:");
		index=Test.scn.nextInt();
		userdata=new int[index];
		System.out.println("\n\nPlease Enter  The Elements of array:");
		for(int i=0;i<userdata.length;i++){
			System.out.print("\nEnter "+(i+1)+" Element:");
			userdata[i]=Test.scn.nextInt();
		}

        System.out.println("\n\nyour enter array are:\n");
		Test.display(userdata);

		System.out.println("\n\nPlease select one number for performing opration on array \n");
		Test.selection();
		
		

	}


	static void display(int c[]){
		
		System.out.print("[");
        System.out.print(c[0]);
	
		for(int i=1;i<c.length;i++){
			
			System.out.print(","+c[i]);
			

		}

		System.out.print("]");




	}

	static void selection(){
		System.out.println("[1] Retriving  the array");
		System.out.println("[2] copy the array");
		System.out.println("[3] replace the array");
		System.out.println("[4] delete the array");
		System.out.println("[5] insertion in the array");

		System.out.print("\nyour are selecting  :");
		Test.oprationValue=scn.nextInt();
		if(Test.oprationValue==1) {
			
			ArrayOprations.retrive(userdata);
			
		}
		else if(Test.oprationValue==2){
			System.out.print("\nold array  :");
			Test.display(userdata);
			System.out.println("");;
			userdata=ArrayOprations.copy(userdata);
			System.out.print("\ncopy array  :");
			Test.display(userdata);
			System.out.println("");;
		}
		else if(Test.oprationValue==3){
			System.out.print("\nold array  :");
			Test.display(userdata);
			System.out.println("");;
			userdata=ArrayOprations.replace(userdata);
			if(userdata!=null){
			System.out.print("\narray after replace  :");
			Test.display(userdata);
			System.out.println("");
			}
		}
		else if(Test.oprationValue==4){

			System.out.print("\nold array  :");
			Test.display(userdata);
			System.out.println("");
			userdata=ArrayOprations.delete(userdata);
			if(userdata!=null){
			System.out.print("\narray after delete  :");
			Test.display(userdata);
			System.out.println("");
			}

		}
		else if(Test.oprationValue==5){

			System.out.print("\nold array  :");
			Test.display(userdata);
			System.out.println("");
			userdata=ArrayOprations.insertion(userdata);
			if(userdata!=null){
			System.out.print("\narray after insert  :");
			Test.display(userdata);
			System.out.println("");
			}

		}
		else{
			System.out.println("\n\nPlease select valid option\n\n");
			Test.selection();
			
		}

	}
}
