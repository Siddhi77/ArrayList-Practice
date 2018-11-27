import java.util.ArrayList;
public class ArrayListPractice3{
	public static void main(String[]args){
		ArrayList<Integer> listA = new ArrayList<>();
		ArrayList<Integer> listB = new ArrayList<>();

		System.out.println(FillList(listA));
		System.out.println(FillList(listB));
		System.out.println(CombineList(listA,listB));

	}
	public static ArrayList<Integer> FillList(ArrayList<Integer> list){
		for(int x = 0; x < 10; x++){
			list.add( (int)(Math.random()*10) );
		}
		return list;
	}
	public static ArrayList<Integer> CombineList(ArrayList<Integer> listA, ArrayList<Integer> listB){
		ArrayList<Integer> listC = new ArrayList<>();
		for(int x = 0; x < listA.size(); x++)
			listC.add(listA.get(x));
		for(int x = 0; x < listB.size(); x++)
			listC.add(listB.get(x));
		return listC;
	}


}
