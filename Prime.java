class Prime{
	public static void main(String args[]){
		int num=Integer.parseInt(args[0]);
		int i=2,flag=1;
		while(i<num){
			if(num%i==0)
				flag=0;
		i++;
		}
		if(flag==1)
			System.out.println(num + " prime");
		else
			System.out.println(num+" not prime");
	}
}