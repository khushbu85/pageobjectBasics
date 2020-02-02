package com.w2a.rough;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RoughWork {

	public static void main(String[] args) {

	int arr[] = {9,1,2,0,-2,5,6};
	System.out.println(Arrays.toString(arr));
	bubbleSort(arr);
	}
	
	public static void bubbleSort(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<(arr.length-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}