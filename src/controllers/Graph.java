package controllers;

import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class Graph
{
	 public double x;
     static HashMap<String,HashMap<String,Integer>> mp=new HashMap<String,HashMap<String,Integer>>();
     static HashMap<String,Integer>dist=new HashMap<String,Integer>();
     static int cnt=0;
      void CreateGraph(String a, String b,Integer c)
    {
        dist.put(a,Integer.MAX_VALUE);
        dist.put(b,Integer.MAX_VALUE);
        if(mp.containsKey(a))
        {
            HashMap<String,Integer>temp=new HashMap<String,Integer>();
            temp=mp.get(a);
            temp.put(b,c);
            mp.put(a,temp);
        }
        else{
            HashMap<String,Integer>temp=new HashMap<String,Integer>();
            temp.put(b,c);
            mp.put(a,temp);
            
        }
     
    }
     void DisplayGraph()
    {
        for (Map.Entry mapElement : mp.entrySet())
        { 
            String key = (String)mapElement.getKey(); 
            System.out.print(key + "->");
            HashMap<String,Integer> value = (HashMap)mapElement.getValue() ;
            for(Map.Entry valueEl : value.entrySet())
            {
                String val1 = (String)valueEl.getKey();
                Integer val2 = (Integer)valueEl.getValue();
                System.out.print(val1+ ":" +val2+ "  ");
            }
            System.out.println("");
        }
        
        
    }
     void shortestPath(String src,String des)
    {
        if(!mp.containsKey(src))
        {
            System.out.println("This city as a source is not available");
            return;
        }
        SortedMap<Integer, String> s = new TreeMap<Integer, String>();
        dist.put(src,0);
        s.put(0,src);
        while(s.size()>0)
        {
            int nodeDist =s.firstKey();
            String node =s.get(nodeDist);
            s.remove(nodeDist);
            HashMap<String,Integer> T = new HashMap<String,Integer>();
            if(mp.containsKey(node))
            T = mp.get(node);
            if(T.size()>0)
            {
                for(Map.Entry valueEl : T.entrySet())
              {
                int v= (int)valueEl.getValue();
                String k = (String)valueEl.getKey();
                if(nodeDist+v < dist.get(k))
                {
                    if(s.containsKey(v))
                    {
                        s.remove(v);
                    }
                    int c=nodeDist+v;
                    dist.put(k,c);
                    cnt=cnt+1;
                    s.put(c,k);
                }
               // System.out.println(dist);
          
                
              }
            }
        }
        System.out.println("Source is " + src);
        System.out.println("Destination is " + des);
        System.out.println("Shortest distance between "+ src + " and " + des+ " is " + dist.get(des));
        System.out.println("Cost between "+ src + " and " + des+ " is " + (dist.get(des))*1.5);
        x = (dist.get(des))*1.5;
        giveCost(x);
    }
     void giveCost(double x)
     {
     	double y;
     	y = x;
     }
    static void DeleteNode(String src,String des)
    {
        if(!mp.containsKey(src))
        {
            System.out.println("This city as a source is not available");
            return;
        }
        else
        {
            HashMap<String,Integer>temp=new HashMap<String,Integer>();
            temp=mp.get(src);
            temp.remove(des);
            mp.put(src,temp);
        }
        
    }
    static void Ammend(String src,String des,Integer x)
    {
        HashMap<String,Integer>temp=new HashMap<String,Integer>();
        temp=mp.get(src);
        temp.put(des,x);
        mp.put(src,temp);

    }
   
}