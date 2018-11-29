import java.util.ArrayList;
import java.util.*;

public class Day2GitHub{
	public static int convertToNumber(ArrayList<Integer> list){
		if(list.size() == 0){
			return 0;
		}
		double a = list.size()-1;
		double ten = 10.0;
		int finalnum = 0;
		for(int i = 0; i < list.size(); i++){
			int power = (int)Math.pow(ten, a);
			list.set(i, list.get(i) * power);
			a--;
			finalnum = finalnum + list.get(i);
		}
		return finalnum;

	}

	public static void main(String[]args){
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(8);
		list1.add(9);
		list1.add(5);
		list1.add(0);

		System.out.println(convertToNumber(list1));

		ArrayList<Integer> list = convertToArrayList(8950);
		System.out.println(list);

		ArrayList<Integer> list2 = convertToArrayList(9071);
		System.out.println(list2);

	}

	public static ArrayList<Integer> convertToArrayList(int chain){
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		while(chain > 0){
			i++;
			list.add(0,chain%10);
			chain = chain/10;
		}

		return list;
	}
}