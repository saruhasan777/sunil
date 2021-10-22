package org.array;

public class Arrays {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	System.out.println(a[3]);
	System.out.println(a[4]);
	System.out.println(a[2]);
	
	int len = a.length;
	System.out.println(len);
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}		
	
for (int b : a) {
	System.out.println(b
			);
	
}
}
}
