import java.util.ArrayList;
public class ArrayListPractice3{
	public static void main(String[]args){
		ArrayList<Integer> listA = new ArrayList<>();
		ArrayList<Integer> listB = new ArrayList<>();
		ArrayList<Integer> listC = new ArrayList<>();

		System.out.println("List A: " + FillList(listA));
		System.out.println("List B: " + FillList(listB));
		System.out.println("List A + List B = ListC: " + CombineList(listA,listB,listC));
		System.out.println("List C: " + PrintList(listC));
		System.out.println("No Duplicate #s - List C: " + RemoveDuplicate(listC));
	}
	public static ArrayList<Integer> FillList(ArrayList<Integer> list){
		for(int x = 0; x < 10; x++){
			list.add( (int)(Math.random()*10) );
		}
		return list;
	}
	public static ArrayList<Integer> CombineList(ArrayList<Integer> listA, ArrayList<Integer> listB,  ArrayList<Integer> listC){
		for(int x = 0; x < listA.size(); x++)
			listC.add(listA.get(x));
		for(int x = 0; x < listB.size(); x++)
			listC.add(listB.get(x));
		return listC;
	}
	public static String PrintList(ArrayList<Integer> listC){
		String output = "";
		for(int x = 0; x < listC.size(); x++){
			if (x == listC.size() - 1)
				output += (listC.get(x));
			else
				output += (listC.get(x) + ", ");
		}
		return output;
	}
	public static ArrayList<Integer> RemoveDuplicate(ArrayList<Integer> listC){
		for(int x = listC.size()-1; x > 0; x--){
			for(int a = 0; a < x; a++){
				if (listC.get(x) == listC.get(a))
					listC.set(x, 11);
			}
			for(int b = listC.size()-1; b > 0; b--){
				if (11 == listC.get(b))
					listC.remove(b);
			}
		}
		return listC;
	}
}