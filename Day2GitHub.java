import java.util.*;

public class Day2GitHub{
	public static void main(String[]args){

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