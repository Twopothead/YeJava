import java.util.Random;
//import java.util.*;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.lang.Math;
public class Random10_99 {
	 private static int[] SetToInt(Set<Integer> allSet) {
	        // 先将set集合转为Integer型数组
	        Integer[] temp = allSet.toArray(new Integer[] {});//关键语句
	        // 再将Integer型数组转为int型数组
	        int[] intArray = new int[temp.length];
	        for (int i = 0; i < temp.length; i++) {
	            intArray[i] = temp[i].intValue();
	        }
	        return intArray;
	    }
	public static int[] unique(int [] arr){
        //实例化一个set集合
        Set set = new HashSet();
        //遍历数组并存入集合,如果元素已存在则不会重复存入
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        //返回Set集合的数组形式
       // System.out.println(set.toArray());
        int[] num = SetToInt(set);
        return num;
       // return  set.toArray();
    }
  public static void main(String[] args){
				Random r = new Random(System.currentTimeMillis());
			  //Random(System.currentTimeMillis());
				int []RandomArray;
				RandomArray = new int[50];
				for(int i=0;i<50;i++){
							RandomArray[i] = Math.abs(r.nextInt() % 90)+10;
			         		//System.out.println(RandomArray[i]);
			  }
	 			int[] array = (int[])unique(RandomArray);
	 			int k=1;
			  for (int i = 0; i < array.length; i++,k++) {
			     	System.out.print(array[i]+"\t");
					 	if(k%10==0)	System.out.print("\n");
				}
				System.out.println();
    }

}
