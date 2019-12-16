package checkweight;

import java.util.HashMap;

class CheckWeight {
	
	 static boolean checkWeight(int arr [], int num) {
			HashMap<Integer, Integer> a = new HashMap<>();
			for(int i = 0; i<arr.length;i++) {
				a.put(arr[i], 0);
			}
			if(a.containsKey(num))
				return true;
			for (int j = 0; j<arr.length; j++) {
				if(a.containsKey(num - arr[j]))
					return true;
			}
			return false;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,15,12,1,4,5};
		int num = 6;
		System.out.println(checkWeight(arr, num)); 
	}
	

}
