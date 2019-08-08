//create a class for method to calculate factorial.

class method{
	public static int factorial(int a){

		int fact=1;
		if (a==0){
			 fact=1;
		}
		else if (a==1){
			 fact=1;
		}
		else{
			for(int i=1;i<=a;i++){
				fact = fact * i;
			}
		}

		return fact;

	}
}

class Factorial_operation{
	public static void main(String args[]){
		int x= 5;
		System.out.print("factorial of "+x+" is "+method.factorial(x)+"\n");
	}
}