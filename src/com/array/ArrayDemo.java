package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayDemo {
	public static void main(String[] args) {
		ArrayDemo arrayDemo = new ArrayDemo();
		arrayDemo.g();
	}
	
	public void q(){
		//声明数组
		String[] arr;
		int arr1[];
		String[] array = new String[5];
		int score[] = new int[3];
	}
	public void w(){
		//初始化数组
		//静态初始化
		int arr2[] = new int[]{1,2,3,4,5};
		String[] array1 = {"马超","张角","关羽","曹操","张飞"};
		String[] array2 = new String[]{"貂蝉","吕布","孙尚香","大乔","小乔"};
		int score[] = new int[3];
		//动态初始化
		for(int i=0;i<score.length;i++){
			score[i] = i+1;
		}
	}
	public void e(){
		//查看数组长度
		String[] array1 = {"马超","张角","关羽","曹操","张飞"};
		int length = array1.length;
		System.out.println("length: "+array1.length);
	}
	public void r(){
		//遍历数组
		String[] array1 = {"马超","张角","关羽","曹操","张飞"};
		for(int i =0;i<array1.length;i++){
			System.out.println(array1[i]);
		}
	}
	public void t(){
		//int数组转成string数组
		int[] array3 = {1,2,3,4,5,6,7,8,9,0};
		String arrString = Arrays.toString(array3);
		System.out.println(arrString);
	}
	public void y(){
		//从array中创建arrayList
		String[] array1 = {"马超","张角","关羽","曹操","张飞"};
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array1));
		System.out.println(arrayList);
	}
	public void u(){
		//数组中是否包含某一个值
		String a = "马超";
		String[] array1 = {"马超","张角","关羽","曹操","张飞"};
		if(Arrays.asList(array1).contains(a)){
			System.out.println("马超在这里");
		}
	}
	public void i(){
		//将数组转成set集合
		String[] array2 = new String[]{"貂蝉","吕布","孙尚香","大乔","小乔"};
		Set<String> set = new HashSet<>(Arrays.asList(array2));
		System.out.println(set);
	}
	public void o(){
		//将数组转成list集合
		String[] array2 = new String[]{"貂蝉","吕布","孙尚香","大乔","小乔"};
		List<String> list = new ArrayList<>();
		for(int i=0;i<array2.length;i++){
			list.add(array2[i]);
		}
		System.out.println(list);
		
		String[] arr = {"1","2","3"};
		List<String> list2 = Arrays.asList(arr);
//		Iterator<String> it = list2.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		System.out.println(list2);
	}
	public void p(){
		//Arrays.fill()填充数组
		int[] arr3 = new int[5];
		//System.out.println(Arrays.toString(arr3));	//[0, 0, 0, 0, 0]
		Arrays.fill(arr3, 10);
		for(int i =0;i<arr3.length;i++){
			System.out.println(arr3[i]);
		}
		System.out.println(Arrays.toString(arr3));
	}
	public void a(){
		//数组排序
		int[] arr4 = {3,4,1,2,6,8,4};
		Arrays.sort(arr4); //.sort(int[] a) 放入数组的名称
		for(int i = 0;i<arr4.length;i++){
			//System.out.println(arr4[i]);
		}
		
		//对指定位置进行排序
		int[] arr5 = {3, 7, 2, 1, 9,3,45,7,8,8,3,2,65,34,5};
		Arrays.sort(arr5, 1, 4); //.sort(a, fromIndex, toIndex) 从第几个到第几个之间进行排序
		for(int i=0;i<arr5.length;i++){ 
			System.out.println(arr5[i]);
		}
	}
	public void s(){
		//复制数组
		int[] arr6 = {3,5,7,9};
		int[] arr7 = Arrays.copyOf(arr6, 10); //指定新数组的长度
		System.out.println(Arrays.toString(arr7));	//[3, 5, 7, 9, 0, 0, 0, 0, 0, 0]
		
		int[] arr8 = Arrays.copyOfRange(arr6, 1, 3); //只复制从索引[1]到索引[3]之间的元素(不包括索引[3]的元素)
		System.out.println(Arrays.toString(arr8));
		for(int i=0;i<arr8.length;i++){
			System.out.println(arr8[i]);
		}
	}
	public void d(){
		//比较两个数组
		int[] arr6 = {3,5,7,9};
		int[] arr9 = {1,2,3,4,5,6,7,8,9,0};
		boolean arr10 = Arrays.equals(arr6, arr9);
		System.out.println(arr10);
	}
	public void f(){
		//去重复
		int[] arr11 = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3};
		Set<Integer> set = new HashSet<>();
		for(int i =0;i<arr11.length;i++){
			set.add(arr11[i]);
		}
		System.out.println(set);
		int[] arr12 = new int[set.size()];
		Iterator<Integer> it = set.iterator();
		int j=0;
		while(it.hasNext()){
			arr12[j++] = it.next();
			//j++;
		}
		System.out.println(Arrays.toString(arr12));
	}
	public void g(){
		//查询数组中的最大值和最小值
		int[] arr13 = {10, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3};
		//最大值
		int max = arr13[0];
		for(int i=1;i<arr13.length;i++){
			if(max<arr13[i]){
				max = arr13[i];
			}
		}
		System.out.println(max);
		
		//最小值
		int min = arr13[0];
		for(int i=0;i<arr13.length;i++){
			if(min>arr13[i]){
				min=arr13[i];
			}
		}
		System.out.println(min);
	}
}
