import java.util.Scanner;
class ArrayOprations 
{
    static Scanner scn=new Scanner(System.in);
	static void retrive(int rt[]){
		System.out.print("\nPlease enter index number that you want to retrive : ");
		int index=ArrayOprations.scn.nextInt();
		if(index<rt.length){
		for(int i=0;i<rt.length;i++){
			if(i==index){
				System.out.print("\nvalue of index number "+i+" is : "+rt[i]+"\n");
				break;
			
			}
		
		}

		}

		else{
				System.out.print("\nplease enter valid index number :\n ");
			}

		
	}

	static int [] copy(int [] rto){

		int brt []=new int[rto.length];
		for(int i=0;i<rto.length;i++){
			brt[i]=rto[i];
		}
		return brt;
	}

	static int[] replace(int [] rpl){
		System.out.print("\nPlease enter index number that you want to replace : ");
		int rpl2=scn.nextInt();
		int [] res;
		if(rpl2<rpl.length){
		System.out.print("\nPlease enter the value : ");
		int value=scn.nextInt();
		res=new int[rpl.length];
		for(int i=0;i<rpl.length;i++){
			if(i==rpl2){
				res[i]=value;

			}
			else{
				res[i]=rpl[i];
			}

		}
        }
		else{
			System.out.print("\nplease enter valid index number :\n ");
			res=null;
		}


        return res;
	}

	static int [] delete(int [] delt){
		int [] res;
		System.out.print("\nPlease enter index number that you want to delete : ");
		int rpl2=scn.nextInt();
		if(rpl2<delt.length){
			 res=new int[delt.length-1];
		for(int i=0,j=0;i<delt.length;i++){
			if(i!=rpl2){
				res[j]=delt[i];
				j++;
				
			}
			
		}

		}

		else{
			System.out.print("\nplease enter valid index number :\n ");
			res=null;
		}
          return res;
	}

	static int[] insertion(int [] instr){
		int [] res;
		System.out.print("\nPlease enter index number where you want to insert : ");
		int rpl2=scn.nextInt();
		if(rpl2<instr.length){
		System.out.print("\nPlease enter the value : ");
		int value=scn.nextInt();
		res=new int[instr.length+1];
		for(int i=0,j=0;i<instr.length;i++,j++){
			if(i==rpl2){
				res[j]=value;
				res[j+1]=instr[i];
				j++;
			}
			else{
				res[j]=instr[i];
			}
			
		}

		}

		else{
			System.out.print("\nplease enter valid index number :\n ");
			res=null;
		}
          return res;
	}
}




