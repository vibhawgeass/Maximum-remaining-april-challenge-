package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {


    public static void main (String[] args) throws IOException
    {
        long max=-1,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of elements");
        int N=sc.nextInt();

        long arr[]=new long[N];
        for(int i=0;i<N;i++)
        {   System.out.println("enter the "+i+"element");
            arr[i]=sc.nextInt();
        }
        long max1 = -1;
        for(int j=0;j<N;j++)
            if(arr[j]>max1)
            {
                max1 = arr[j];
            }
        for(int i=0;i<N;i++)
        {
            if(arr[i]%max1 > max)
            {
                max=arr[i]%max1;
            }
        }
        System.out.println(max);
    }
}
