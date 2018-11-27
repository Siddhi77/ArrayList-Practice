import java.util.ArrayList;
public class ArrayListPractice3{
	public static void main(String[]args){

		ArrayList<Integer> listA = new ArrayList<>();
		ArrayList<Integer> listB = new ArrayList<>();

		System.out.println(FillList(listA));
		System.out.println(FillList(listB));

	}
	public static ArrayList<Integer> FillList(ArrayList<Integer> list){
		for(int x = 0; x<10; x++){
			list.add( (int)(Math.random()*10) );
		}
		return list;
	}




}
