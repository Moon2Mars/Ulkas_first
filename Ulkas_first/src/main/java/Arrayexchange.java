
public class Arrayexchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {20,30,90,80,40};
int newarray[] = new int[5];
for(int value: arr) 
{System.out.println(" " +value);

}
for(int pos=0; pos<arr.length;pos++)
{
	System.out.println("NewArray:" +pos);
	newarray[pos]=arr[pos];
	System.out.println(newarray[pos]);
	
}

	}
}
