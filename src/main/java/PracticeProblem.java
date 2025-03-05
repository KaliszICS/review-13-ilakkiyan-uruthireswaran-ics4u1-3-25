import java.util.*;

public class PracticeProblem {

	public static void swap(ArrayList<String> arr, int x, int y) {
		if (x >= 0 && x < arr.size() && y >= 0 && y < arr.size()) {
			String z = arr.get(x);
			arr.set(x, arr.get(y));
			arr.set(y, z);
		}
	}

	public static ArrayList<Double> createArrayList(double[] ar) {
		ArrayList<Double> arr = new ArrayList<>();
		for (double num : ar) {
			arr.add(num);
		}
		return arr;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], ages[i]);
		}
		return map;
	}

	public static void increaseAge(HashMap<String, Integer> map, String name) {
		if (map.containsKey(name)) {
			map.put(name, map.get(name) + 1);
		}
	}

	public static void main(String args[]) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Dream");
		arr.add("Clean");
		arr.add("Drive");
		arr.add("Tree");
		arr.add("Potato");

		swap(arr, 2, 4);
		System.out.println(arr);

		double[] ar = {2.3, 4.2, 1.2, 5.3, 3.0};
		ArrayList<Double> list = createArrayList(ar);
		System.out.println(list);

		String[] names = {"John", "Joane", "Kelsey"};
		int[] ages = {20, 25, 26};
		HashMap<String, Integer> map = combineParallelArrays(names, ages);
		System.out.println(map);

		HashMap<String, Integer> maps = new HashMap<>();
		maps.put("John", 40 + 1);
		maps.put("Dwayne", 46 + 1);
		maps.put("Kevin", 43 + 1);

		System.out.println(maps);
	}

}
