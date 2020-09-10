//Purav Nisar
import java.util.*;
// Import the File class
import java.io.File; 
// Import this class to h&&le errors
import java.io.FileNotFoundException;  
// Import the Scanner class to read text files
import java.util.Scanner; 
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit; 
import java.util.HashMap;
import java.text.DecimalFormat;

//import java.Point;

//check for jumps in left and below direction and a non jump move after taking a jump i

public class fullgamealphabeta
{  
   public static String jumpWHITE(char board[][],int i,int j,int visited[][],double utility[][])
   { String result[]={"","",""};
     int visited1[][]= new int[16][16];
     System.out.println("In recurrsion");
    //pass k=0 and b=0 will call the function in main
    int a=0;
     int m,n;
     if(i-1>=0  && i-1<16 && j>=0 && j<16)
        {System.out.println("in upper");
         if(board[i-1][j]!='.')
            {
              m=i-2;
              n=j;  
            if(i-2>=0  && i-2<16 && j>=0 && j<16)
            {   
                if(board[i-2][j]=='.' &&visited1[i-2][j]!=1)
                   {System.out.println(" Going into Jump 1");
                    result[a]="J"+" "+j+","+i+" "+j+","+(i-2)+".";
                    visited1[i-2][j]=1;
                    if(m==15)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==14)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==13)
                      {
                        if(n==12||n==13||n==14||n==15)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==12)
                      {if(n==13||n==14||n==15)
                        {
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==11)
                      {if(n==14||n==15){

                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                         }
                      }
                      
                    //do all the above if else  or just keep a variable to maintain the depth and stop at depth 6;  
                    //return result[a];                   
                    //break;
                   }
            }
            }
        }
      a++;
      visited1=visited;  
      if(i-1>=0  && i-1<16 && j-1>=0 && j-1<16)
        {
         if(board[i-1][j-1]!='.')
            {
            if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
            {   System.out.println("in side");
                m=i-2;
                n=j-2;
                if(board[i-2][j-2]=='.' &&visited1[i-2][j-2]!=1)
                   {System.out.println(" Going into Jump 2");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i-2)+".";
                    visited1[i-2][j-2]=1;
                    if(m==15)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                       }
                      } 
                    else if(m==14)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==13)
                      {if(n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==12)
                      {if(n==13||n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==11)
                      {if(n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                       }
                      }
                    //return result[a]; 
                    //break;
                   }
            }
            }
        }
      a++;
      visited1=visited;  
      if(i>=0  && i<16 && j-1>=0 && j-1<16)
        {
         if(board[i][j-1]!='.')
            {
            if(i>=0  && i<16 && j-2>=0 && j-2<16)
            {   System.out.println("in left");
                m=i;
                n=j-2;
                if(board[i][j-2]=='.' &&visited1[i][j-2]!=1)
                   {System.out.println(" Going into Jump 3");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i)+".";
                    visited1[i][j-2]=1;
                    if(m==15)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==14)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==13)
                      {if(n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==12)
                      {if(n==13||n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==11)
                      {if(n==14||n==15){
                        result[a]=result[a]+jumpWHITE(board,m,n,visited1,utility);
                      }
                      }  
                    //return result[a]; 
                    //break;
                   }
            }
            }
          }
        int size=result[0].length();
        int count1=0,count2=0,count3=0;    
        for(int pn=0;pn<size;pn++)
            if(result[0].charAt(pn)==' ')
               count1++;
        size=result[1].length();    
        for(int pn=0;pn<size;pn++)
            if(result[1].charAt(pn)==' ')
               count2++; 
        size=result[2].length();    
        for(int pn=0;pn<size;pn++)
            if(result[2].charAt(pn)==' ')
               count3++;
        if(count1>=count2)
           {
            if(count1>=count3)
               return result[0];
            else return result[2]; 
           }
        else if(count2>=count3)
              return result[1];
        return result[2];                                  
   }

  public static String jumpbackWHITE(char board[][],int i,int j,int visited[][],double utility[][])
   { String result[]={"","","","","","","",""};
     int visited1[][]= new int[16][16];
     Boolean flagjb=false,flag1jb,flag2jb,flag3jb,flag4jb,flag5jb,r0=false,r1=false,r2=false,r3=false,r4=false,r5=false,r6=false,r7=false;
     //double utility0=Double.MAX_VALUE,utility1=Double.MAX_VALUE,utility2=Double.MAX_VALUE,utility3=Double.MAX_VALUE,utility4=Double.MAX_VALUE,utility5=Double.MAX_VALUE,utility6=Double.MAX_VALUE,utility7=Double.MAX_VALUE;
     System.out.println("In recurrsion");
     String resultFinaljb[];
     int finalx=19,finaly=19;
     String x="",y="";
     String result1="";
     //Map<Integer,Point> map = new TreeMap<>();
     ArrayList<Point> resulttemp=new ArrayList<Point>(); // or use array of user define objects thats is Point[] resulttemp=new Point[8];
     visited1=visited;
    //pass k=0 and b=0 will call the function in main
     int a=0;
     int m,n;
     if(i-1>=0  && i-1<16 && j+1>=0 && j+1<16)
        {System.out.println("in north-east");
         if(board[i-1][j+1]!='.')
            {
              m=i-2;
              n=j+2;  
            if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
            {   
                if(board[i-2][j+2]=='.' &&visited1[i-2][j+2]!=1)
                   {System.out.println(" Going into Jump 1");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i-2)+".";
                    visited1[i-2][j+2]=1;

                    if(m==15)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==14)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==13)
                      {if(n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==12)
                      {if(n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==11)
                      {if(n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                      
                    //do all the above if else  or just keep a variable to maintain the depth and stop at depth 6;  
                    //return result[a];                   
                    //break;
                   }
            }
            }
        }
      a++;
      //visited1=visited;  
      if(i>=0  && i<16 && j+1>=0 && j+1<16)
        {
         if(board[i][j+1]!='.')
            {
            if(i>=0  && i<16 && j+2>=0 && j+2<16)
            {   System.out.println("in east");
                m=i;
                n=j+2;
                if(board[i][j+2]=='.' &&visited1[i][j+2]!=1)
                   {System.out.println(" Going into Jump 2");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i)+".";
                    visited1[i][j+2]=1;
                    if(m==15)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==14)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==13)
                      {if(n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==12)
                      {if(n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==11)
                      {if(n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    //return result[a]; 
                    //break;
                   }
            }
            }
        }
      a++;
      //visited1=visited;  
      if(i+1>=0  && i+1<16 && j+1>=0 && j+1<16)
        {
         if(board[i+1][j+1]!='.')
            {
            if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
            {   System.out.println("in south-east");
                m=i+2;
                n=j+2;
                if(board[i+2][j+2]=='.' &&visited1[i+2][j+2]!=1)
                   {System.out.println(" Going into Jump 3");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i+2)+".";
                    visited1[i+2][j+2]=1;
                    if(m==15)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==14)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==13)
                      {if(n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==12)
                      {if(n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==11)
                      {if(n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    //return result[a]; 
                    //break;
                   }
            }
            }
          }
      a++;
      //visited1=visited;  
      if(i+1>=0  && i+1<16 && j>=0 && j<16)
        {
         if(board[i+1][j]!='.')
            {
            if(i+2>=0  && i+2<16 && j>=0 && j<16)
            {   System.out.println("in south");
                m=i+2;
                n=j;
                if(board[i+2][j]=='.' &&visited1[i+2][j]!=1)
                   {System.out.println(" Going into Jump 4");
                    result[a]="J"+" "+j+","+i+" "+(j)+","+(i+2)+".";
                    visited1[i+2][j]=1;
                    if(m==15)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==14)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==13)
                      {if(n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==12)
                      {if(n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==11)
                      {if(n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    //return result[a]; 
                    //break;
                   }
            }
            }
          }
      a++;
      //visited1=visited;  
      if(i+1>=0  && i+1<16 && j-1>=0 && j-1<16)
        {
         if(board[i+1][j-1]!='.')
            {
            if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
            {   System.out.println("in south-west");
                m=i+2;
                n=j-2;
                if(board[i+2][j-2]=='.' &&visited1[i+2][j-2]!=1)
                   {System.out.println(" Going into Jump 5");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i+2)+".";
                    visited1[i+2][j-2]=1;
                    if(m==15)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==14)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==13)
                      {if(n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==12)
                      {if(n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==11)
                      {if(n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    //return result[a]; 
                    //break;
                   }
            }
            }
          }    
        a++;
        //visited1=visited;  
        if(i-1>=0  && i-1<16 && j>=0 && j<16)
        {System.out.println("in upper");
         if(board[i-1][j]!='.')
            {
              m=i-2;
              n=j;  
            if(i-2>=0  && i-2<16 && j>=0 && j<16)
            {   
                if(board[i-2][j]=='.' &&visited1[i-2][j]!=1)
                   {System.out.println(" Going into Jump 6");
                    result[a]="J"+" "+j+","+i+" "+j+","+(i-2)+".";
                    visited1[i-2][j]=1;
                    if(m==15)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==14)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==13)
                      {if(n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==12)
                      {if(n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==11)
                      {if(n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                      
                    //do all the above if else  or just keep a variable to maintain the depth and stop at depth 6;  
                    //return result[a];                   
                    //break;
                   }
            }
            }
        }
      a++;
      //visited1=visited;  
      if(i-1>=0  && i-1<16 && j-1>=0 && j-1<16)
        {
         if(board[i-1][j-1]!='.')
            {
            if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
            {   System.out.println("in side");
                m=i-2;
                n=j-2;
                if(board[i-2][j-2]=='.' &&visited1[i-2][j-2]!=1)
                   {System.out.println(" Going into Jump 7");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i-2)+".";
                    visited1[i-2][j-2]=1;
                    if(m==15)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==14)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==13)
                      {if(n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==12)
                      {if(n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==11)
                      {if(n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    //return result[a]; 
                    //break;
                   }
            }
            }
        }
      a++;
      //visited1=visited;  
      if(i>=0  && i<16 && j-1>=0 && j-1<16)
        {
         if(board[i][j-1]!='.')
            {
            if(i>=0  && i<16 && j-2>=0 && j-2<16)
            {   System.out.println("in left");
                m=i;
                n=j-2;
                if(board[i][j-2]=='.' &&visited1[i][j-2]!=1)
                   {System.out.println(" Going into Jump 8");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i)+".";
                    visited1[i][j-2]=1;
                    if(m==15)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==14)
                      {if(n==11 ||n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==13)
                      {if(n==12||n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==12)
                      {if(n==13||n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==11)
                      {if(n==14||n==15){
                        result[a]=result[a]+jumpbackWHITE(board,m,n,visited1,utility);
                      }
                      }  
                    //return result[a]; 
                    //break;
                   }
            }
            }
          }  
        //int size=result[0].length();
        for(int pnn=0;pnn<8;pnn++)
           {
            System.out.println("RESULT "+pnn+"= "+result[pnn]);
           }  
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[0]!="")
                    {  System.out.println("In result0");
                       resultFinaljb=result[0].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1jb=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2jb=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4jb=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5jb=false;
                           }
                          }
                      }

                      if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[0];
                        //r0=true;
                        //utility0=utility[finalx][finaly];
                        //map.put(utility[finalx][finaly],true);
                        //map.put(utility[finalx][finaly],new Point(finalx,finaly));
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],0));
                      } 
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[1]!="")
                    {  System.out.println("In result1");
                       resultFinaljb=result[1].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1jb=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2jb=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4jb=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5jb=false;
                           }
                          }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[1];
                        //r1=true;
                        //utility1=utility[finalx][finaly];
                        //map.put(utility[finalx][finaly],true);
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],1));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[2]!="")
                    {  System.out.println("In result2");
                       resultFinaljb=result[2].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1jb=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2jb=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4jb=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5jb=false;
                           }
                          }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[2];
                        //r2=true;
                        //utility2=utility[finalx][finaly];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],2));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[3]!="")
                    {  System.out.println("In result3");
                       resultFinaljb=result[3].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1jb=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2jb=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4jb=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5jb=false;
                           }
                          }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[3];
                        //r3=true;
                        //utility3=utility[finalx][finaly];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],3));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[4]!="")
                    {  System.out.println("In result4");
                       resultFinaljb=result[4].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1jb=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2jb=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4jb=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5jb=false;
                           }
                          }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[4];
                        //r4=true;
                        //utility4=utility[finalx][finaly];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],4));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[5]!="")
                    {  System.out.println("In result5");
                       resultFinaljb=result[5].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1jb=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2jb=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4jb=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5jb=false;
                           }
                          }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[5];
                        //r5=true;
                        //utility5=utility[finalx][finaly];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],5));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[6]!="")
                    {  System.out.println("In result6");
                       resultFinaljb=result[6].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       System.out.println("result1 "+result1);
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1jb=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2jb=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4jb=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5jb=false;
                           }
                          }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      { System.out.println("In result6 flag");
                        System.out.println("Finalx "+finalx+" Finaly "+finaly);
                        //return result[6];
                        //r6=true;
                        //utility6=utility[finalx][finaly];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],6));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[7]!="")
                    {  System.out.println("In result7");
                       resultFinaljb=result[7].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);                       
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1jb=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2jb=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4jb=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5jb=false;
                           }
                          }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[7];
                        //r7=true;
                        //utility7=utility[finalx][finaly];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],7));
                      }
        if(resulttemp.size()!=0)
           {
            int resulttemplen=resulttemp.size();
            Point p=new Point(0,0,Double.MAX_VALUE,-1);
            Point temppoint=new Point(0,0,Double.MAX_VALUE,-1);
            for(int pointi=0;pointi<resulttemplen;pointi++)
            {      temppoint=resulttemp.get(pointi);
                if(p.utility>temppoint.utility)
                   p=temppoint;
            }
            return result[p.index];
           }                   
        return "";                                                                                                                         
   } 

  public static String jumpBLACK(char board[][],int i,int j,int visited[][],double utility[][])
   { String result[]={"","",""};
     int visited1[][]= new int[16][16];
     System.out.println("In recurrsion");
    //pass k=0 and b=0 will call the function in main
    int a=0;
     int m,n;
     if(i+1>=0  && i+1<16 && j+1>=0 && j+1<16)
        {System.out.println("in diagonal");
         if(board[i+1][j+1]!='.')
            {
              m=i+2;
              n=j+2;  
            if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
            {   
                if(board[i+2][j+2]=='.' &&visited1[i+2][j+2]!=1)
                   {System.out.println(" Going into Jump 1");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i+2)+".";
                    visited1[i+2][j+2]=1;
                    if(m==0)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==1)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==2)
                      {
                        if(n==0||n==1||n==2||n==3)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==3)
                      {if(n==0||n==1||n==2)
                        {
                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==4)
                      {if(n==0||n==1){

                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                         }
                      }
                      
                    //do all the above if else  or just keep a variable to maintain the depth and stop at depth 6;  
                    //return result[a];                   
                    //break;
                   }
            }
            }
        }
      a++;
      visited1=visited;  
      if(i+1>=0  && i+1<16 && j>=0 && j<16)
        {
         if(board[i+1][j]!='.')
            {
            if(i+2>=0  && i+2<16 && j>=0 && j<16)
            {   System.out.println("in side");
                m=i+2;
                n=j;
                if(board[i+2][j]=='.' &&visited1[i+2][j]!=1)
                   {System.out.println(" Going into Jump 2");
                    result[a]="J"+" "+j+","+i+" "+(j)+","+(i+2)+".";
                    visited1[i+2][j]=1;
                    if(m==0)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==1)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==2)
                      {
                        if(n==0||n==1||n==2||n==3)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==3)
                      {if(n==0||n==1||n==2)
                        {
                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==4)
                      {if(n==0||n==1){

                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                         }
                      }
                    //return result[a]; 
                    //break;
                   }
            }
            }
        }
      a++;
      visited1=visited;  
      if(i>=0  && i<16 && j+1>=0 && j+1<16)
        {
         if(board[i][j+1]!='.')
            {
            if(i>=0  && i<16 && j+2>=0 && j+2<16)
            {   System.out.println("in left");
                m=i;
                n=j+2;
                if(board[i][j+2]=='.' &&visited1[i][j+2]!=1)
                   {System.out.println(" Going into Jump 3");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i)+".";
                    visited1[i][j+2]=1;
                    if(m==0)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==1)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==2)
                      {
                        if(n==0||n==1||n==2||n==3)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==3)
                      {if(n==0||n==1||n==2)
                        {
                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==4)
                      {if(n==0||n==1){

                        result[a]=result[a]+jumpBLACK(board,m,n,visited1,utility);
                         }
                      }
                    //return result[a]; 
                    //break;
                   }
            }
            }
          }
        int size=result[0].length();
        int count1=0,count2=0,count3=0;    
        for(int pn=0;pn<size;pn++)
            if(result[0].charAt(pn)==' ')
               count1++;
        size=result[1].length();    
        for(int pn=0;pn<size;pn++)
            if(result[1].charAt(pn)==' ')
               count2++; 
        size=result[2].length();    
        for(int pn=0;pn<size;pn++)
            if(result[2].charAt(pn)==' ')
               count3++;
        if(count1>=count2)
           {
            if(count1>=count3)
               return result[0];
            else return result[2]; 
           }
        else if(count2>=count3)
              return result[1];
        return result[2];                                  
   }
   
   public static String jumpbackBLACK(char board[][],int i,int j,int visited[][],double utility[][])
   { String result[]={"","","","","","","",""};
     int visited1[][]= new int[16][16];
     Boolean flagjb=false,flag1jb,flag2jb,flag3jb,flag4jb,flag5jb;
     System.out.println("In recurrsion");
     String resultFinaljb[];
     int finalx=19,finaly=19;
     String x="",y="";
     String result1="";
     ArrayList<Point> resulttemp=new ArrayList<Point>();
    //pass k=0 and b=0 will call the function in main
     visited1=visited;
     int a=0;
     int m,n;
     if(i+1>=0  && i+1<16 && j-1>=0 && j-1<16)
        {System.out.println("in north-east");
         if(board[i+1][j-1]!='.')
            {
              m=i+2;
              n=j-2;  
            if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
            {   
                if(board[i+2][j-2]=='.' &&visited1[i+2][j-2]!=1)
                   {System.out.println(" Going into Jump 1");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i+2)+".";
                    visited1[i+2][j-2]=1;
                    System.out.println("Jump result"+result[a]);
                    if(m==0)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==1)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==2)
                      {
                        if(n==0||n==1||n==2||n==3)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==3)
                      {if(n==0||n==1||n==2)
                        {
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==4)
                      {if(n==0||n==1){

                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                         }
                      }  
                      
                    //do all the above if else  or just keep a variable to maintain the depth and stop at depth 6;  
                    //return result[a];                   
                    //break;
                   }
            }
            }
        }
      a++;
      //visited1=visited;  
      if(i>=0  && i<16 && j-1>=0 && j-1<16)
        {
         if(board[i][j-1]!='.')
            {
            if(i>=0  && i<16 && j-2>=0 && j-2<16)
            {   System.out.println("in east");
                m=i;
                n=j-2;
                if(board[i][j-2]=='.' &&visited1[i][j-2]!=1)
                   {System.out.println(" Going into Jump 2");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i)+".";
                    visited1[i][j-2]=1;
                    System.out.println("Jump result"+result[a]);
                    if(m==0)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==1)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==2)
                      {
                        if(n==0||n==1||n==2||n==3)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==3)
                      {if(n==0||n==1||n==2)
                        {
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==4)
                      {if(n==0||n==1){

                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                         }
                      }    
                    //return result[a]; 
                    //break;
                   }
            }
            }
        }
      a++;
      //visited1=visited;  
      if(i-1>=0  && i-1<16 && j-1>=0 && j-1<16)
        {
         if(board[i-1][j-1]!='.')
            {
            if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
            {   System.out.println("in south-east");
                m=i-2;
                n=j-2;
                if(board[i-2][j-2]=='.' &&visited1[i-2][j-2]!=1)
                   {System.out.println(" Going into Jump 3");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i-2)+".";
                    visited1[i-2][j-2]=1;
                    System.out.println("Jump result"+result[a]);
                    if(m==0)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==1)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==2)
                      {
                        if(n==0||n==1||n==2||n==3)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==3)
                      {if(n==0||n==1||n==2)
                        {
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==4)
                      {if(n==0||n==1){

                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                         }
                      }    
                    //return result[a]; 
                    //break;
                   }
            }
            }
          }
      a++;
      //visited1=visited;  
      if(i-1>=0  && i-1<16 && j>=0 && j<16)
        {
         if(board[i-1][j]!='.')
            {
            if(i-2>=0  && i-2<16 && j>=0 && j<16)
            {   System.out.println("in south");
                m=i-2;
                n=j;
                if(board[i-2][j]=='.' &&visited1[i-2][j]!=1)
                   {System.out.println(" Going into Jump 4");
                    result[a]="J"+" "+j+","+i+" "+(j)+","+(i-2)+".";
                    visited1[i-2][j]=1;
                    System.out.println("Jump result"+result[a]);
                    if(m==0)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==1)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==2)
                      {
                        if(n==0||n==1||n==2||n==3)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==3)
                      {if(n==0||n==1||n==2)
                        {
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==4)
                      {if(n==0||n==1){

                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                         }
                      }  
                    //return result[a]; 
                    //break;
                   }
            }
            }
          }
      a++;
      //visited1=visited;  
      if(i-1>=0  && i-1<16 && j+1>=0 && j+1<16)
        {
         if(board[i-1][j+1]!='.')
            {
            if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
            {   System.out.println("in north-east");
                m=i-2;
                n=j+2;
                if(board[i-2][j+2]=='.' &&visited1[i-2][j+2]!=1)
                   {System.out.println(" Going into Jump 5");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i-2)+".";
                    visited1[i-2][j+2]=1;
                    System.out.println("Jump result"+result[a]);
                    if(m==0)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==1)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==2)
                      {
                        if(n==0||n==1||n==2||n==3)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==3)
                      {if(n==0||n==1||n==2)
                        {
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==4)
                      {if(n==0||n==1){

                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                         }
                      }  
                    //return result[a]; 
                    //break;
                   }
            }
            }
          }    
        a++;
        //visited1=visited;  
        if(i+1>=0  && i+1<16 && j+1>=0 && j+1<16)
        {System.out.println("in diagonal");
         if(board[i+1][j+1]!='.')
            {
              m=i+2;
              n=j+2;  
            if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
            {   
                if(board[i+2][j+2]=='.' &&visited1[i+2][j+2]!=1)
                   {System.out.println(" Going into Jump 6");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i+2)+".";
                    visited1[i+2][j+2]=1;
                    System.out.println("Jump result"+result[a]);
                    if(m==0)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==1)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==2)
                      {
                        if(n==0||n==1||n==2||n==3)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==3)
                      {if(n==0||n==1||n==2)
                        {
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==4)
                      {if(n==0||n==1){

                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                         }
                      }  
                      
                    //do all the above if else  or just keep a variable to maintain the depth and stop at depth 6;  
                    //return result[a];                   
                    //break;
                   }
            }
            }
        }
      a++;
      //visited1=visited;  
      if(i+1>=0  && i+1<16 && j>=0 && j<16)
        {
         if(board[i+1][j]!='.')
            {
            if(i+2>=0  && i+2<16 && j>=0 && j<16)
            {   System.out.println("in below");
                m=i+2;
                n=j;
                if(board[i+2][j]=='.' &&visited1[i+2][j]!=1)
                   {System.out.println(" Going into Jump 7");
                    result[a]="J"+" "+j+","+i+" "+(j)+","+(i+2)+".";
                    visited1[i+2][j]=1;
                    System.out.println("Jump result"+result[a]);
                    if(m==0)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==1)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==2)
                      {
                        if(n==0||n==1||n==2||n==3)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==3)
                      {if(n==0||n==1||n==2)
                        {
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==4)
                      {if(n==0||n==1){

                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                         }
                      }  
                    //return result[a]; 
                    //break;
                   }
            }
            }
        }
      a++;
      //visited1=visited;  
      if(i>=0  && i<16 && j+1>=0 && j+1<16)
        {
         if(board[i][j+1]!='.')
            {
            if(i>=0  && i<16 && j+2>=0 && j+2<16)
            {   System.out.println("in right");
                m=i;
                n=j+2;
                if(board[i][j+2]=='.' &&visited1[i][j+2]!=1)
                   {System.out.println(" Going into Jump 8");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i)+".";
                    visited1[i][j+2]=1;
                    System.out.println("Jump result"+result[a]);
                    if(m==0)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }  
                    else if(m==1)
                      {if(n==0 ||n==1||n==2||n==3||n==4){
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                       }
                      }
                    else if(m==2)
                      {
                        if(n==0||n==1||n==2||n==3)
                        {System.out.println("Going into 2nd move");
                         result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==3)
                      {if(n==0||n==1||n==2)
                        {
                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                        }
                      }
                    else if(m==4)
                      {if(n==0||n==1){

                        result[a]=result[a]+jumpbackBLACK(board,m,n,visited1,utility);
                         }
                      }  
                    //return result[a]; 
                    //break;
                   }
            }
            }
          }  
        //int size=result[0].length();
        for(int pnn=0;pnn<8;pnn++)
           {
            System.out.println("RESULT "+pnn+"= "+result[pnn]);
           }   
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[0]!="")
                    {  
                       resultFinaljb=result[0].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1jb=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2jb=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3jb=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4jb=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5jb=false;
                              }
                            }
                      }

                      if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[0];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],0));
                      } 
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[1]!="")
                    { 
                       resultFinaljb=result[1].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1jb=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2jb=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3jb=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4jb=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5jb=false;
                              }
                            }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      { System.out.println("In flag of result1");
                        //return result[1];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],1));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[2]!="")
                    {  
                       resultFinaljb=result[2].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1jb=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2jb=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3jb=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4jb=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5jb=false;
                              }
                            }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[2];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],2));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[3]!="")
                    {  
                       resultFinaljb=result[3].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1jb=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2jb=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3jb=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4jb=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5jb=false;
                              }
                            }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[3];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],3));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[4]!="")
                    {  
                       resultFinaljb=result[4].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1jb=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2jb=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3jb=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4jb=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5jb=false;
                              }
                            }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[4];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],4));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[5]!="")
                    {  
                       resultFinaljb=result[5].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);;
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1jb=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2jb=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3jb=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4jb=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5jb=false;
                              }
                            }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[5];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],5));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[6]!="")
                    {  
                       resultFinaljb=result[6].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1jb=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2jb=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3jb=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4jb=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5jb=false;
                              }
                            }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[6];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],6));
                      }
        flag1jb=false;
        flag2jb=false;
        flag3jb=false;
        flag4jb=false;
        flag5jb=false;
        if(result[7]!="")
                    {  
                       resultFinaljb=result[7].split("\\.");
                       result1=resultFinaljb[resultFinaljb.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       System.out.println("x "+x+" y "+y);
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       System.out.println(" After conversion to int finalx="+finalx+" finaly="+finaly);
                       flag1jb=true;
                       flag2jb=true;
                       flag3jb=true;
                       flag4jb=true;
                       flag5jb=true;
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1jb=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2jb=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3jb=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4jb=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5jb=false;
                              }
                            }
                    }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        //return result[7];
                        resulttemp.add(new Point(finalx,finaly,utility[finalx][finaly],7));
                      } 
        /*for(int pointi=0;pointi<resulttemp.size();pointi++)
            {   
              System.out.println("resulttemp="+result[resulttemp.get(pointi).index]); 
            }  */          
        if(resulttemp.size()!=0)
           {
            int resulttemplen=resulttemp.size();
            Point p=new Point(0,0,Double.MAX_VALUE,-1);
            Point temppoint=new Point(0,0,Double.MAX_VALUE,-1);
            for(int pointi=0;pointi<resulttemplen;pointi++)
            {      temppoint=resulttemp.get(pointi);
                if(p.utility>temppoint.utility)
                   p=temppoint;
            }
            //System.out.println("Result before returning "+result[p.index]);
            return result[p.index];
           }                        
        return "";                                                                                                                         
   } 

   public static allinformation jumpgamewhite(char board[][],int i,int j,int visited[][],String prevresult,ArrayList<String> validmoves)
   { String result[]={"","","","","","","",""};
     int visited1[][]= new int[16][16];
     Boolean flagjb=false,flag1jb,flag2jb,flag3jb,flag4jb,flag5jb;//r0=false,r1=false,r2=false,r3=false,r4=false,r5=false,r6=false,r7=false;
     //System.out.println("In recurrsion");
     String resultFinaljb[];
     int finalx=19,finaly=19;
     String x="",y="";
     String result1="";
     Boolean flagfinal=false;
     ArrayList<Point> resulttemp=new ArrayList<Point>(); // or use array of user define objects thats is Point[] resulttemp=new Point[8];
     allinformation[] resultallinfo=new allinformation[8];
     visited1=visited.clone();
     //System.out.println("In jumpgamewhite with i="+i+" j="+j);
     /*for(int pnnr=0;pnnr<16;pnnr++)
         {for(int pnnc=0;pnnc<16;pnnc++)
              {
                System.out.print(visited1[pnnr][pnnc]);
               }
               System.out.println();
          }   */   
    //pass k=0 and b=0 will call the function in main
     int a=0;
     int m,n; 
     if(i-1>=0  && i-1<16 && j-1>=0 && j-1<16)
        {
         if(board[i-1][j-1]!='.')
            {
            if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
            {   //System.out.println("in side");
                m=i-2;
                n=j-2;
                //System.out.println("i="+(i-2)+" j="+(j-2));
                if(board[i-2][j-2]=='.' &&visited1[i-2][j-2]!=1)
                   {//System.out.println(" Going into Jump 7");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i-2)+".";
                    visited1[i-2][j-2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==15)
                          { 
                            if(n==11 ||n==12||n==13||n==14||n==15){
                            flag1jb=false;
                            }
                          }  
                    if(m==14)
                          {if(n==11 ||n==12||n==13||n==14||n==15){
                            flag2jb=false;
                            }
                          }
                    if(m== 13)
                          {
                            if(n==12||n==13||n==14||n==15)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==12)
                           {if(n==13||n==14||n==15)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==11)
                           {if(n==14||n==15){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.print("Result added="+result1);
                      }
                    resultallinfo[a]=jumpgamewhite(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;
                   }
            }
            }
        }
     a++;  
     if(i>=0  && i<16 && j-1>=0 && j-1<16)
        {
         if(board[i][j-1]!='.')
            {
            if(i>=0  && i<16 && j-2>=0 && j-2<16)
            {   //System.out.println("in left");
                m=i;
                n=j-2;
                //System.out.println("i="+(i)+" j="+(j-2));
                if(board[i][j-2]=='.' &&visited1[i][j-2]!=1)
                   {//System.out.println(" Going into Jump 8");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i)+".";
                    visited1[i][j-2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==15)
                          { 
                            if(n==11 ||n==12||n==13||n==14||n==15){
                            flag1jb=false;
                            }
                          }  
                    if(m==14)
                          {if(n==11 ||n==12||n==13||n==14||n==15){
                            flag2jb=false;
                            }
                          }
                    if(m== 13)
                          {
                            if(n==12||n==13||n==14||n==15)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==12)
                           {if(n==13||n==14||n==15)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==11)
                           {if(n==14||n==15){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result added="+result1);
                      }
                    resultallinfo[a]=jumpgamewhite(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;
                   }
            }
            }
          }
     a++;
     if(i-1>=0  && i-1<16 && j>=0 && j<16)
        {//System.out.println("in upper");
         if(board[i-1][j]!='.')
            {
              m=i-2;
              n=j;
              //System.out.println("i="+(i-2)+" j="+(j));  
            if(i-2>=0  && i-2<16 && j>=0 && j<16)
            {   
                //System.out.println("board"+board[i-2][j]);
                //System.out.println("visited"+visited1[i-2][j]);
                if(board[i-2][j]=='.' &&visited1[i-2][j]!=1)
                   {//System.out.println(" Going into Jump 6");
                    result[a]="J"+" "+j+","+i+" "+j+","+(i-2)+".";
                    visited1[i-2][j]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==15)
                          { 
                            if(n==11 ||n==12||n==13||n==14||n==15){
                            flag1jb=false;
                            }
                          }  
                    if(m==14)
                          {if(n==11 ||n==12||n==13||n==14||n==15){
                            flag2jb=false;
                            }
                          }
                    if(m== 13)
                          {
                            if(n==12||n==13||n==14||n==15)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==12)
                           {if(n==13||n==14||n==15)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==11)
                           {if(n==14||n==15){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result added="+result1);
                      }
                    resultallinfo[a]=jumpgamewhite(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;
                   }
            }
            }
        }     
     a++;     
     if(i-1>=0  && i-1<16 && j+1>=0 && j+1<16)
        {//System.out.println("in north-east");
         if(board[i-1][j+1]!='.')
            {
              m=i-2;
              n=j+2;
              //System.out.println("i="+(i-2)+" j="+(j+2));  
            if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
            {   
                if(board[i-2][j+2]=='.' &&visited1[i-2][j+2]!=1)
                   {//System.out.println(" Going into Jump 1");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i-2)+".";
                    visited1[i-2][j+2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==15)
                          { 
                            if(n==11 ||n==12||n==13||n==14||n==15){
                            flag1jb=false;
                            }
                          }  
                    if(m==14)
                          {if(n==11 ||n==12||n==13||n==14||n==15){
                            flag2jb=false;
                            }
                          }
                    if(m== 13)
                          {
                            if(n==12||n==13||n==14||n==15)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==12)
                           {if(n==13||n==14||n==15)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==11)
                           {if(n==14||n==15){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result added="+result1);
                      }
                    resultallinfo[a]=jumpgamewhite(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;                    
                   }
            }
            }
        }      
      a++; 
      if(i+1>=0  && i+1<16 && j-1>=0 && j-1<16)
        {
         if(board[i+1][j-1]!='.')
            {
            if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
            {   //System.out.println("in south-west");
                m=i+2;
                n=j-2;
                //System.out.println("i="+(i+2)+" j="+(j-2));
                if(board[i+2][j-2]=='.' &&visited1[i+2][j-2]!=1)
                   {//System.out.println(" Going into Jump 5");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i+2)+".";
                    visited1[i+2][j-2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==15)
                          { 
                            if(n==11 ||n==12||n==13||n==14||n==15){
                            flag1jb=false;
                            }
                          }  
                    if(m==14)
                          {if(n==11 ||n==12||n==13||n==14||n==15){
                            flag2jb=false;
                            }
                          }
                    if(m== 13)
                          {
                            if(n==12||n==13||n==14||n==15)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==12)
                           {if(n==13||n==14||n==15)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==11)
                           {if(n==14||n==15){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result added="+result1);
                      }
                    resultallinfo[a]=jumpgamewhite(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;
                   }
            }
            }
          }  
      a++;  
      if(i>=0  && i<16 && j+1>=0 && j+1<16)
        {
         if(board[i][j+1]!='.')
            {
            if(i>=0  && i<16 && j+2>=0 && j+2<16)
            {   //System.out.println("in east");
                m=i;
                n=j+2;
                //System.out.println("i="+(i)+" j="+(j+2));
                if(board[i][j+2]=='.' &&visited1[i][j+2]!=1)
                   {//System.out.println(" Going into Jump 2");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i)+".";
                    visited1[i][j+2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==15)
                          { 
                            if(n==11 ||n==12||n==13||n==14||n==15){
                            flag1jb=false;
                            }
                          }  
                    if(m==14)
                          {if(n==11 ||n==12||n==13||n==14||n==15){
                            flag2jb=false;
                            }
                          }
                    if(m== 13)
                          {
                            if(n==12||n==13||n==14||n==15)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==12)
                           {if(n==13||n==14||n==15)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==11)
                           {if(n==14||n==15){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result added="+result1);
                      }
                    resultallinfo[a]=jumpgamewhite(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;
                   }
            }
            }
        }      
      a++; 
      if(i+1>=0  && i+1<16 && j>=0 && j<16)
        {
         if(board[i+1][j]!='.')
            {
            if(i+2>=0  && i+2<16 && j>=0 && j<16)
            {   //System.out.println("in south");
                m=i+2;
                n=j;
                //System.out.println("i="+(i+2)+" j="+(j));
                if(board[i+2][j]=='.' &&visited1[i+2][j]!=1)
                   {//System.out.println(" Going into Jump 4");
                    result[a]="J"+" "+j+","+i+" "+(j)+","+(i+2)+".";
                    visited1[i+2][j]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==15)
                          { 
                            if(n==11 ||n==12||n==13||n==14||n==15){
                            flag1jb=false;
                            }
                          }  
                    if(m==14)
                          {if(n==11 ||n==12||n==13||n==14||n==15){
                            flag2jb=false;
                            }
                          }
                    if(m== 13)
                          {
                            if(n==12||n==13||n==14||n==15)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==12)
                           {if(n==13||n==14||n==15)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==11)
                           {if(n==14||n==15){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result added="+result1);
                      }
                    resultallinfo[a]=jumpgamewhite(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;
                   }
            }
            }
          }  
      a++; 
      if(i+1>=0  && i+1<16 && j+1>=0 && j+1<16)
        {
         if(board[i+1][j+1]!='.')
            {
            if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
            {   //System.out.println("in south-east");
                m=i+2;
                n=j+2;
                //System.out.println("i="+(i+2)+" j="+(j+2));
                if(board[i+2][j+2]=='.' &&visited1[i+2][j+2]!=1)
                   {//System.out.println(" Going into Jump 8");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i+2)+".";
                    visited1[i+2][j+2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==15)
                          { 
                            if(n==11 ||n==12||n==13||n==14||n==15){
                            flag1jb=false;
                            }
                          }  
                    if(m==14)
                          {if(n==11 ||n==12||n==13||n==14||n==15){
                            flag2jb=false;
                            }
                          }
                    if(m== 13)
                          {
                            if(n==12||n==13||n==14||n==15)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==12)
                           {if(n==13||n==14||n==15)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==11)
                           {if(n==14||n==15){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result added="+result1);
                      }
                    resultallinfo[a]=jumpgamewhite(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;
                   }
            }
            }
          }         
        return new allinformation(visited1,"",validmoves);                                                                                                                         
   }

public static allinformation jumpgamewhitecamp(char board[][],int i,int j,int visited[][],String prevresult,ArrayList<String> validmoves)
   { String result[]={"","","","","","","",""};
     int visited1[][]= new int[16][16];
     Boolean flagjb=false,flag1jb,flag2jb,flag3jb,flag4jb,flag5jb;//r0=false,r1=false,r2=false,r3=false,r4=false,r5=false,r6=false,r7=false;
     //System.out.println("In recurrsion");
     String resultFinaljb[];
     int finalx=19,finaly=19;
     String x="",y="";
     String result1="";
     Boolean flagfinal=false;
     ArrayList<Point> resulttemp=new ArrayList<Point>(); // or use array of user define objects thats is Point[] resulttemp=new Point[8];
     allinformation[] resultallinfo=new allinformation[8];
     visited1=visited;
     //System.out.println("In jumpgamewhitecamp with i="+i+" j="+j);
    //pass k=0 and b=0 will call the function in main
     int a=0;
     int m,n; 
        if(i-1>=0  && i-1<16 && j>=0 && j<16)
        {//System.out.println("in upper");
         if(board[i-1][j]!='.')
            {
              m=i-2;
              n=j;  
            if(i-2>=0  && i-2<16 && j>=0 && j<16)
            {   
                if(board[i-2][j]=='.' &&visited1[i-2][j]!=1)
                   {//System.out.println(" Going into Jump 6");
                    result[a]="J"+" "+j+","+i+" "+j+","+(i-2)+".";
                    visited1[i-2][j]=1;
                    result1=prevresult+result[a];
                    validmoves.add(result1);
                    if(m==15)
                          { 
                            if(n==11 ||n==12||n==13||n==14||n==15){
                            resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }  
                    if(m==14)
                          {if(n==11 ||n==12||n==13||n==14||n==15){
                            resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }
                    if(m== 13)
                          {
                            if(n==12||n==13||n==14||n==15)
                              {
                                resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                          }
                    if(m==12)
                           {if(n==13||n==14||n==15)
                              {
                                resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                            }
                    if(m==11)
                           {if(n==14||n==15){
                              resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                              visited1=resultallinfo[a].visited;
                              validmoves=resultallinfo[a].validmoves;
                           }
                          }
                   }
            }
            }
        }
      a++; 
      if(i-1>=0  && i-1<16 && j-1>=0 && j-1<16)
        {
         if(board[i-1][j-1]!='.')
            {
            if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
            {   //System.out.println("in side");
                m=i-2;
                n=j-2;
                if(board[i-2][j-2]=='.' &&visited1[i-2][j-2]!=1)
                   {//System.out.println(" Going into Jump 7");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i-2)+".";
                    visited1[i-2][j-2]=1;
                    result1=prevresult+result[a];
                    validmoves.add(result1);
                    if(m==15)
                          { 
                            if(n==11 ||n==12||n==13||n==14||n==15){
                            resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }  
                    if(m==14)
                          {if(n==11 ||n==12||n==13||n==14||n==15){
                            resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }
                    if(m== 13)
                          {
                            if(n==12||n==13||n==14||n==15)
                              {
                                resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                          }
                    if(m==12)
                           {if(n==13||n==14||n==15)
                              {
                                resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                            }
                    if(m==11)
                           {if(n==14||n==15){
                              resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                              visited1=resultallinfo[a].visited;
                              validmoves=resultallinfo[a].validmoves;
                           }
                          }
                   }
            }
            }
        }
      a++;  
      if(i>=0  && i<16 && j-1>=0 && j-1<16)
        {
         if(board[i][j-1]!='.')
            {
            if(i>=0  && i<16 && j-2>=0 && j-2<16)
            {   //System.out.println("in left");
                m=i;
                n=j-2;
                if(board[i][j-2]=='.' &&visited1[i][j-2]!=1)
                   {//System.out.println(" Going into Jump 8");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i)+".";
                    visited1[i][j-2]=1;
                    result1=prevresult+result[a];
                    validmoves.add(result1);
                    if(m==15)
                          { 
                            if(n==11 ||n==12||n==13||n==14||n==15){
                            resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }  
                    if(m==14)
                          {if(n==11 ||n==12||n==13||n==14||n==15){
                            resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }
                    if(m== 13)
                          {
                            if(n==12||n==13||n==14||n==15)
                              {
                                resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                          }
                    if(m==12)
                           {if(n==13||n==14||n==15)
                              {
                                resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                            }
                    if(m==11)
                           {if(n==14||n==15){
                              resultallinfo[a]=jumpgamewhitecamp(board,m,n,visited1,result1,validmoves);
                              visited1=resultallinfo[a].visited;
                              validmoves=resultallinfo[a].validmoves;
                           }
                          }
                   }
            }
            }
          }       
        return new allinformation(visited1,"",validmoves);                                                                                                                         
   }

  /* public static ArrayList<String> validmoveswhite(int board[][],int visited[][])
   {
   }*/

   public static allinformation jumpgameblack(char board[][],int i,int j,int visited[][],String prevresult,ArrayList<String> validmoves)
   { String result[]={"","","","","","","",""};
     int visited1[][]= new int[16][16];
     Boolean flagjb=false,flag1jb,flag2jb,flag3jb,flag4jb,flag5jb;//r0=false,r1=false,r2=false,r3=false,r4=false,r5=false,r6=false,r7=false;
     //System.out.println("In recurrsion jumpgameblack");
     //System.out.println("Current i and j"+i+" "+j);
     String resultFinaljb[];
     int finalx=19,finaly=19;
     String x="",y="";
     String result1="";
     Boolean flagfinal=false;
     ArrayList<Point> resulttemp=new ArrayList<Point>(); // or use array of user define objects thats is Point[] resulttemp=new Point[8];
     allinformation[] resultallinfo=new allinformation[8];
     visited1=visited;
    //pass k=0 and b=0 will call the function in main
     /*for(int pnnr=0;pnnr<16;pnnr++)
         {for(int pnnc=0;pnnc<16;pnnc++)
              {
                System.out.print(visited1[pnnr][pnnc]);
               }
               System.out.println();
          } */
     int a=0;
     int m,n;
     if(i+1>=0  && i+1<16 && j+1>=0 && j+1<16)
        {//System.out.println("in south-east");
         if(board[i+1][j+1]!='.')
            {
              m=i+2;
              n=j+2;  
            if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
            {   
                if(board[i+2][j+2]=='.' &&visited1[i+2][j+2]!=1)
                   {//System.out.println(" Going into Jump 1");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i+2)+".";
                    visited1[i+2][j+2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==0)
                          { 
                            if(n==0||n==1||n==2||n==3||n==4){
                            flag1jb=false;
                            }
                          }  
                    if(m==1)
                          {if(n==0 ||n==1||n==2||n==3||n==4){
                            flag2jb=false;
                            }
                          }
                    if(m==2)
                          {
                            if(n==0||n==1||n==2||n==3)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==3)
                           {if(n==0||n==1||n==2)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==4)
                           {if(n==0||n==1){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result1="+result1);
                      }
                    resultallinfo[a]=jumpgameblack(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;                    
                   }
            }
            }
        }
      a++;  
      if(i>=0  && i<16 && j+1>=0 && j+1<16)
        {
         if(board[i][j+1]!='.')
            {
            if(i>=0  && i<16 && j+2>=0 && j+2<16)
            {   //System.out.println("in east");
                m=i;
                n=j+2;
                if(board[i][j+2]=='.' &&visited1[i][j+2]!=1)
                   {//System.out.println(" Going into Jump 2");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i)+".";
                    visited1[i][j+2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==0)
                          { 
                            if(n==0||n==1||n==2||n==3||n==4){
                            flag1jb=false;
                            }
                          }  
                    if(m==1)
                          {if(n==0 ||n==1||n==2||n==3||n==4){
                            flag2jb=false;
                            }
                          }
                    if(m==2)
                          {
                            if(n==0||n==1||n==2||n==3)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==3)
                           {if(n==0||n==1||n==2)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==4)
                           {if(n==0||n==1){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result1="+result1);
                      }
                    resultallinfo[a]=jumpgameblack(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;  
                   }
            }
            }
        }
      a++; 
      if(i+1>=0  && i+1<16 && j>=0 && j<16)
        {
         if(board[i+1][j]!='.')
            {
            if(i+2>=0  && i+2<16 && j>=0 && j<16)
            {   //System.out.println("in south");
                m=i+2;
                n=j;
                if(board[i+2][j]=='.' &&visited1[i+2][j]!=1)
                   {//System.out.println(" Going into Jump 3");
                    result[a]="J"+" "+j+","+i+" "+(j)+","+(i+2)+".";
                    visited1[i+2][j]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==0)
                          { 
                            if(n==0||n==1||n==2||n==3||n==4){
                            flag1jb=false;
                            }
                          }  
                    if(m==1)
                          {if(n==0 ||n==1||n==2||n==3||n==4){
                            flag2jb=false;
                            }
                          }
                    if(m==2)
                          {
                            if(n==0||n==1||n==2||n==3)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==3)
                           {if(n==0||n==1||n==2)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==4)
                           {if(n==0||n==1){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result1="+result1);
                      }
                    resultallinfo[a]=jumpgameblack(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;  
                   }
            }
            }
          }
      a++; 
      if(i-1>=0  && i-1<16 && j+1>=0 && j+1<16)
        {
         if(board[i-1][j+1]!='.')
            {
            if(i-2>=0  && i-2<16 && j+1>=0 && j+1<16)
            {   //System.out.println("in north-east");
                m=i-2;
                n=j+2;
                if(board[i-2][j+2]=='.' &&visited1[i-2][j+2]!=1)
                   {//System.out.println(" Going into Jump 4");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i-2)+".";
                    visited1[i-2][j+2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==0)
                          { 
                            if(n==0||n==1||n==2||n==3||n==4){
                            flag1jb=false;
                            }
                          }  
                    if(m==1)
                          {if(n==0 ||n==1||n==2||n==3||n==4){
                            flag2jb=false;
                            }
                          }
                    if(m==2)
                          {
                            if(n==0||n==1||n==2||n==3)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==3)
                           {if(n==0||n==1||n==2)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==4)
                           {if(n==0||n==1){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result1="+result1);
                      }
                    resultallinfo[a]=jumpgameblack(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;  
                   }
            }
            }
          }
      a++; 
      if(i+1>=0  && i+1<16 && j-1>=0 && j-1<16)
        {
         if(board[i+1][j-1]!='.')
            {
            if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
            {   //System.out.println("in south-west");
                m=i+2;
                n=j-2;
                if(board[i+2][j-2]=='.' &&visited1[i+2][j-2]!=1)
                   {//System.out.println(" Going into Jump 5");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i+2)+".";
                    visited1[i+2][j-2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==0)
                          { 
                            if(n==0||n==1||n==2||n==3||n==4){
                            flag1jb=false;
                            }
                          }  
                    if(m==1)
                          {if(n==0 ||n==1||n==2||n==3||n==4){
                            flag2jb=false;
                            }
                          }
                    if(m==2)
                          {
                            if(n==0||n==1||n==2||n==3)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==3)
                           {if(n==0||n==1||n==2)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==4)
                           {if(n==0||n==1){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result1="+result1);
                      }
                    resultallinfo[a]=jumpgameblack(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;  
                   }
            }
            }
          }    
        a++;
        if(i-1>=0  && i-1<16 && j>=0 && j<16)
        {//System.out.println("in upper");
         if(board[i-1][j]!='.')
            {
              m=i-2;
              n=j;  
            if(i-2>=0  && i-2<16 && j>=0 && j<16)
            {   
                if(board[i-2][j]=='.' &&visited1[i-2][j]!=1)
                   {//System.out.println(" Going into Jump 6");
                    result[a]="J"+" "+j+","+i+" "+j+","+(i-2)+".";
                    visited1[i-2][j]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==0)
                          { 
                            if(n==0||n==1||n==2||n==3||n==4){
                            flag1jb=false;
                            }
                          }  
                    if(m==1)
                          {if(n==0 ||n==1||n==2||n==3||n==4){
                            flag2jb=false;
                            }
                          }
                    if(m==2)
                          {
                            if(n==0||n==1||n==2||n==3)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==3)
                           {if(n==0||n==1||n==2)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==4)
                           {if(n==0||n==1){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result1="+result1);
                      }
                    resultallinfo[a]=jumpgameblack(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;  
                   }
            }
            }
        }
      a++;  
      if(i>=0  && i<16 && j-1>=0 && j-1<16)
        {
         if(board[i][j-1]!='.')
            {
            if(i>=0  && i<16 && j-2>=0 && j-2<16)
            {   //System.out.println("in left");
                m=i;
                n=j-2;
                if(board[i][j-2]=='.' &&visited1[i][j-2]!=1)
                   {//System.out.println(" Going into Jump 7");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i)+".";
                    visited1[i][j-2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==0)
                          { 
                            if(n==0||n==1||n==2||n==3||n==4){
                            flag1jb=false;
                            }
                          }  
                    if(m==1)
                          {if(n==0 ||n==1||n==2||n==3||n==4){
                            flag2jb=false;
                            }
                          }
                    if(m==2)
                          {
                            if(n==0||n==1||n==2||n==3)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==3)
                           {if(n==0||n==1||n==2)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==4)
                           {if(n==0||n==1){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result1="+result1);
                       } 
                    resultallinfo[a]=jumpgameblack(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;  
                   }
            }
            }
          }    
      a++; 
      if(i-1>=0  && i-1<16 && j-1>=0 && j-1<16)
        {
         if(board[i-1][j-1]!='.')
            {
            if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
            {   //System.out.println("in side");
                m=i-2;
                n=j-2;
                if(board[i-2][j-2]=='.' &&visited1[i-2][j-2]!=1)
                   {//System.out.println(" Going into Jump 8");
                    result[a]="J"+" "+j+","+i+" "+(j-2)+","+(i-2)+".";
                    visited1[i-2][j-2]=1;
                    result1=prevresult+result[a];
                    flagfinal=true;
                    flag1jb=true;
                    flag2jb=true;
                    flag3jb=true;
                    flag4jb=true;
                    flag5jb=true;
                    if(m==0)
                          { 
                            if(n==0||n==1||n==2||n==3||n==4){
                            flag1jb=false;
                            }
                          }  
                    if(m==1)
                          {if(n==0 ||n==1||n==2||n==3||n==4){
                            flag2jb=false;
                            }
                          }
                    if(m==2)
                          {
                            if(n==0||n==1||n==2||n==3)
                              {//System.out.println("Going into 2nd move");
                                flag3jb=false;
                              }
                          }
                    if(m==3)
                           {if(n==0||n==1||n==2)
                              {
                                flag4jb=false;
                              }
                            }
                    if(m==4)
                           {if(n==0||n==1){
                                flag5jb=false;
                           }
                          }
                    if(flag1jb&&flag2jb&&flag3jb&&flag4jb&&flag5jb)
                      {
                        validmoves.add(result1);
                        //System.out.println("Result1="+result1);
                      }
                    resultallinfo[a]=jumpgameblack(board,m,n,visited1,result1,validmoves);
                    visited1=resultallinfo[a].visited;
                    validmoves=resultallinfo[a].validmoves;  
                   }
            }
            }
        }     
        return new allinformation(visited1,"",validmoves);                                                                                                                         
   }
  public static allinformation jumpgameblackcamp(char board[][],int i,int j,int visited[][],String prevresult,ArrayList<String> validmoves)
   { String result[]={"","","","","","","",""};
     int visited1[][]= new int[16][16];
     Boolean flagjb=false,flag1jb,flag2jb,flag3jb,flag4jb,flag5jb;//r0=false,r1=false,r2=false,r3=false,r4=false,r5=false,r6=false,r7=false;
     //System.out.println("In recurrsion");
     String resultFinaljb[];
     int finalx=19,finaly=19;
     String x="",y="";
     String result1="";
     Boolean flagfinal=false;
     ArrayList<Point> resulttemp=new ArrayList<Point>(); // or use array of user define objects thats is Point[] resulttemp=new Point[8];
     allinformation[] resultallinfo=new allinformation[8];
     visited1=visited;
     //System.out.println("In jumpgameblackcamp with i="+i+" j="+j);
    //pass k=0 and b=0 will call the function in main
     int a=0;
     int m,n; 
        if(i+1>=0  && i+1<16 && j+1>=0 && j+1<16)
        {//System.out.println("in diagonal");
         if(board[i+1][j+1]!='.')
            {
              m=i+2;
              n=j+2;  
            if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
            {   
                if(board[i+2][j+2]=='.' &&visited1[i+2][j+2]!=1)
                   {//System.out.println(" Going into Jump 1");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i+2)+".";
                    visited1[i+2][j+2]=1;
                    result1=prevresult+result[a];
                    validmoves.add(result1);
                    if(m==0)
                          { 
                            if(n==0||n==1||n==2||n==3||n==4){
                            resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }  
                    if(m==1)
                          {if(n==0||n==1||n==2||n==3||n==4){
                            resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }
                    if(m==2)
                          {
                            if(n==0||n==1||n==2||n==3)
                              {
                                resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                          }
                    if(m==3)
                           {if(n==0||n==1||n==2)
                              {
                                resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                            }
                    if(m==4)
                           {if(n==0||n==1){
                              resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                              visited1=resultallinfo[a].visited;
                              validmoves=resultallinfo[a].validmoves;
                           }
                          }
                   }
            }
            }
        }
      a++; 
      if(i+1>=0  && i+1<16 && j>=0 && j<16)
        {
         if(board[i+1][j]!='.')
            {
            if(i+2>=0  && i+2<16 && j>=0 && j<16)
            {   //System.out.println("in below");
                m=i+2;
                n=j;
                if(board[i+2][j]=='.' &&visited1[i+2][j]!=1)
                   {//System.out.println(" Going into Jump 2");
                    result[a]="J"+" "+j+","+i+" "+(j)+","+(i+2)+".";
                    visited1[i+2][j]=1;
                    result1=prevresult+result[a];
                    validmoves.add(result1);
                    if(m==0)
                          { 
                            if(n==0||n==1||n==2||n==3||n==4){
                            resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }  
                    if(m==1)
                          {if(n==0||n==1||n==2||n==3||n==4){
                            resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }
                    if(m==2)
                          {
                            if(n==0||n==1||n==2||n==3)
                              {
                                resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                          }
                    if(m==3)
                           {if(n==0||n==1||n==2)
                              {
                                resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                            }
                    if(m==4)
                           {if(n==0||n==1){
                              resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                              visited1=resultallinfo[a].visited;
                              validmoves=resultallinfo[a].validmoves;
                           }
                          }
                   }
            }
            }
        }
      a++;  
      if(i>=0  && i<16 && j+1>=0 && j+1<16)
        {
         if(board[i][j+1]!='.')
            {
            if(i>=0  && i<16 && j+2>=0 && j+2<16)
            {   //System.out.println("in left");
                m=i;
                n=j+2;
                if(board[i][j+2]=='.' &&visited1[i][j+2]!=1)
                   {//System.out.println(" Going into Jump 8");
                    result[a]="J"+" "+j+","+i+" "+(j+2)+","+(i)+".";
                    visited1[i][j+2]=1;
                    result1=prevresult+result[a];
                    validmoves.add(result1);
                    if(m==0)
                          { 
                            if(n==0||n==1||n==2||n==3||n==4){
                            resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }  
                    if(m==1)
                          {if(n==0||n==1||n==2||n==3||n==4){
                            resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                            visited1=resultallinfo[a].visited;
                            validmoves=resultallinfo[a].validmoves;
                            }
                          }
                    if(m==2)
                          {
                            if(n==0||n==1||n==2||n==3)
                              {
                                resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                          }
                    if(m==3)
                           {if(n==0||n==1||n==2)
                              {
                                resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                                visited1=resultallinfo[a].visited;
                                validmoves=resultallinfo[a].validmoves;
                              }
                            }
                    if(m==4)
                           {if(n==0||n==1){
                              resultallinfo[a]=jumpgameblackcamp(board,m,n,visited1,result1,validmoves);
                              visited1=resultallinfo[a].visited;
                              validmoves=resultallinfo[a].validmoves;
                           }
                          }
                   }
            }
            }
          }       
        return new allinformation(visited1,"",validmoves);                                                                                                                         
   }

   public static ArrayList<String> validmoveswhite(char board[][])
   {
    Boolean flagwhitereach=true;
    int[][] visited=new int[16][16];
    int[][] visitedinitial=new int[16][16];
    int row,i,m,n;
    String result="",temp="";
    ArrayList<String> validmoves=new ArrayList<String>();
    String whitecamp="14,11 15,11 13,12 14,12 15,12 12,13 13,13 14,13 15,13 11,14 12,14 13,14 14,14 11,15 12,15 13,15 14,15 15,15";
    for(int j=0 ;j<16;j++)
           {
            for(int k=0;k<16;k++)
               { //System.out.println(i+" "+j);
                 if(board[j][k]!='.')
                    visitedinitial[j][k]=1;
               } 
           }
    allinformation knn=new allinformation(visited,"",validmoves);
          /*row=15;
          for(row=15;row>=0;row--)
          {  
           for(int column=15;column>=0;column--)
               { 
                if(board[row][column]=='W')
                  { visited[row][column]=1;
                    knn=jumpgamewhite(board,row,column,visited,utility,"",validmoves);
                    validmoves=knn.validmoves;
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(knn.validmoves.size()==0)
                       {
                           knn=jumpgamewhitecamp(board,row,column,visited,utility,"",validmoves);
                           validmoves=knn.validmoves;
                           for(int pnnr=0;pnnr<16;pnnr++)
                              {
                                for(int pnnc=0;pnnc<16;pnnc++)
                                    {
                                     visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                    }
                              }

                       }

                    if(knn.validmoves.size()!=0)
                       {
                        System.out.println("in if loop "+row+" "+column);
                        if(board[row-1][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row-1);
                             validmoves.add(result);
                          }
                        if(board[row][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row);
                             validmoves.add(result);
                          }
                        if(board[row-1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row-1);
                             validmoves.add(result);
                          }
                      }
                    
                }
              }
            } */ 
            row=15;
            for(int column=15;column>=11;column--)
               { 
                if(board[row][column]=='W')
                  { visited[row][column]=1;
                    knn=jumpgamewhite(board,row,column,visited,"",validmoves);
                    validmoves=knn.validmoves;
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(knn.validmoves.size()==0)
                       {
                           knn=jumpgamewhitecamp(board,row,column,visited,"",validmoves);
                           validmoves=knn.validmoves;
                           for(int pnnr=0;pnnr<16;pnnr++)
                              {
                                for(int pnnc=0;pnnc<16;pnnc++)
                                    {
                                     visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                    }
                              }
                       }
                    if(knn.validmoves.size()==0|| column==11)
                       {
                        //System.out.println("in if loop "+row+" "+column);
                        if(board[row-1][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row-1)+".";
                             validmoves.add(result);
                          }
                        if(board[row][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row)+".";
                             validmoves.add(result);
                          }
                        if(board[row-1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row-1)+".";
                             validmoves.add(result);
                          }
                      }
                    
                }
              } 
            row=14;
            for(int column=15;column>=11;column--)
               { 
                if(board[row][column]=='W')
                  { visited[row][column]=1;
                    knn=jumpgamewhite(board,row,column,visited,"",validmoves);
                    validmoves=knn.validmoves;
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(knn.validmoves.size()==0)
                       {
                           knn=jumpgamewhitecamp(board,row,column,visited,"",validmoves);
                           validmoves=knn.validmoves;
                           for(int pnnr=0;pnnr<16;pnnr++)
                              {
                                for(int pnnc=0;pnnc<16;pnnc++)
                                    {
                                     visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                    }
                              }
                       }
                    if(knn.validmoves.size()==0|| column==11)
                       {
                        //System.out.println("in if loop "+row+" "+column);
                        if(board[row-1][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row-1)+".";
                             validmoves.add(result);
                          }
                        if(board[row][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row)+".";
                             validmoves.add(result);
                          }
                        if(board[row-1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row-1)+".";
                             validmoves.add(result);
                          }
                      }
                    
                }
              }
            row=13;
            for(int column=15;column>=12;column--)
               { 
                if(board[row][column]=='W')
                  { visited[row][column]=1;
                    knn=jumpgamewhite(board,row,column,visited,"",validmoves);
                    validmoves=knn.validmoves;
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(knn.validmoves.size()==0)
                       {
                           knn=jumpgamewhitecamp(board,row,column,visited,"",validmoves);
                           validmoves=knn.validmoves;
                           for(int pnnr=0;pnnr<16;pnnr++)
                              {
                                for(int pnnc=0;pnnc<16;pnnc++)
                                    {
                                     visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                    }
                              }
                       }
                    if(knn.validmoves.size()==0|| column==12)
                       {
                        //System.out.println("in if loop "+row+" "+column);
                        if(board[row-1][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row-1)+".";
                             validmoves.add(result);
                          }
                        if(board[row][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row)+".";
                             validmoves.add(result);
                          }
                        if(board[row-1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row-1)+".";
                             validmoves.add(result);
                          }
                      }
                    
                }
              }
            row=12;
            for(int column=15;column>=13;column--)
               { 
                if(board[row][column]=='W')
                  { visited[row][column]=1;
                    knn=jumpgamewhite(board,row,column,visited,"",validmoves);
                    validmoves=knn.validmoves;
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(knn.validmoves.size()==0)
                       {
                           knn=jumpgamewhitecamp(board,row,column,visited,"",validmoves);
                           validmoves=knn.validmoves;
                           for(int pnnr=0;pnnr<16;pnnr++)
                              {
                                for(int pnnc=0;pnnc<16;pnnc++)
                                    {
                                     visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                    }
                              }
                       }
                    if(knn.validmoves.size()==0|| column==13)
                       {
                        //System.out.println("in if loop "+row+" "+column);
                        if(board[row-1][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row-1)+".";
                             validmoves.add(result);
                          }
                        if(board[row][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row)+".";
                             validmoves.add(result);
                          }
                        if(board[row-1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row-1)+".";
                             validmoves.add(result);
                          }
                      }
                    
                }
              }
            row=11;
            for(int column=15;column>=14;column--)
               { 
                if(board[row][column]=='W')
                  { visited[row][column]=1;
                    knn=jumpgamewhite(board,row,column,visited,"",validmoves);
                    validmoves=knn.validmoves;
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(knn.validmoves.size()==0)
                       {
                           knn=jumpgamewhitecamp(board,row,column,visited,"",validmoves);
                           validmoves=knn.validmoves;
                           for(int pnnr=0;pnnr<16;pnnr++)
                              {
                                for(int pnnc=0;pnnc<16;pnnc++)
                                    {
                                     visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                    }
                              }
                       }
                    if(knn.validmoves.size()==0|| column==14)
                       {
                        //System.out.println("in if loop "+row+" "+column);
                        if(board[row-1][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row-1)+".";
                             validmoves.add(result);
                          }
                        if(board[row][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row)+".";
                             validmoves.add(result);
                          }
                        if(board[row-1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row-1)+".";
                             validmoves.add(result);
                          }
                      }
                    
                }
              } 
            if(validmoves.size()==0)
            {  
            for(i=8;i>=0;i--)
              {
                for(int j=15;j>=0;j--)
                { flagwhitereach=true;
                  if(i<5 &&j<5)
                     {
                      if(i==4)
                          { 
                            if(j==0||j==1){
                            flagwhitereach=false;
                            }
                          }  
                      else if(i==3)
                          {if(j==0||j==1||j==2){
                            flagwhitereach=false;
                            }
                          }
                      else if(i==2)
                          {
                            if(j==0||j==1||j==2||j==3)
                              {//System.out.println("Going into 2nd move");
                                flagwhitereach=false;
                              }
                          }
                      else if(i==1)
                           {if(j==0||j==1||j==2||j==3||j==4)
                              {
                                flagwhitereach=false;
                              }
                            }
                      else if(i==0)
                           {if(j==0||j==1||j==2||j==3||j==4){
                                flagwhitereach=false;
                           }
                          }
                     }
                  if(flagwhitereach==true)
                  {    
                  if(board[i][j]=='W')
                  {   //System.out.println(" Current i and j="+i+" "+j);
                        if(i-1>= 0 && i-1<16 && j-1>=0 && j-1<16)
                          {
                            if(board[i-1][j-1]=='.')
                            {   //System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            { m=i-2;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                          }
                        if(i-1>=0  && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            { //System.out.println(" Going into . 2");
                              result="E"+" "+j+","+i+" "+j+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            { m=i-2;
                              n=j;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i>=0 && i <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i][j-1]=='.')
                            {   //System.out.println(" Going into . 3");
                              result="E"+" "+j+","+i+" "+(j-1)+","+i+".";
                              validmoves.add(result);
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            { m=i;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }   
                        if(i-1>=0 && i-1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {   //System.out.println(" Going into . 4");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            { m=i-2;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i+1][j-1]=='.')
                            {   //System.out.println(" Going into . 5");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            { m=i+2;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }   
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {  //System.out.println(" Going into . 6");
                              result="E"+" "+j+","+i+" "+(j+1)+","+i+".";
                              validmoves.add(result);
                            }
                            else if(i>=0 && i<16 && j+2>=0 && j+2<16)
                            { m=i;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j>=0 && j<16)
                           {
                            if(board[i+1][j]=='.')
                            {   //System.out.println(" Going into . 7");
                              result="E"+" "+j+","+i+" "+j+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j>=0 && j<16)
                            {
                              m=i+2;
                              n=j;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                     {
                                      for(int pnnc=0;pnnc<16;pnnc++)
                                        {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                        }
                                     }
                                 }
                              }
                           }
                        if(i+1>=0 && i+1 <16 && j+1>=0 && j+1<16)
                           {
                            if(board[i+1][j+1]=='.')
                            {   //System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            { m=i+2;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }   
                  }//board is equal to w   
                  }//flagwhitereach
                }
              }
            for(i=15;i>=9;i--)
              {
                for(int j=8;j>=0;j--)
                {
                  if(board[i][j]=='W')
                  {     //System.out.println(" Current i and j="+i+" "+j);
                        if(i-1>= 0 && i-1<16 && j-1>=0 && j-1<16)
                          {
                            if(board[i-1][j-1]=='.')
                            {   //System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            { m=i-2;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                          }
                        if(i-1>=0  && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            { //System.out.println(" Going into . 2");
                              result="E"+" "+j+","+i+" "+j+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            { m=i-2;
                              n=j;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i>=0 && i <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i][j-1]=='.')
                            {   //System.out.println(" Going into . 3");
                              result="E"+" "+j+","+i+" "+(j-1)+","+i+".";
                              validmoves.add(result);
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            { m=i;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }   
                        if(i-1>=0 && i-1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {   //System.out.println(" Going into . 4");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            { m=i-2;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i+1][j-1]=='.')
                            {   //System.out.println(" Going into . 5");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            { m=i+2;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }   
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {  //System.out.println(" Going into . 6");
                              result="E"+" "+j+","+i+" "+(j+1)+","+i+".";
                              validmoves.add(result);
                            }
                            else if(i>=0 && i<16 && j+2>=0 && j+2<16)
                            { m=i;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j>=0 && j<16)
                           {
                            if(board[i+1][j]=='.')
                            {   //System.out.println(" Going into . 7");
                              result="E"+" "+j+","+i+" "+j+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j>=0 && j<16)
                            {
                              m=i+2;
                              n=j;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                     {
                                      for(int pnnc=0;pnnc<16;pnnc++)
                                        {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                        }
                                     }
                                 }
                              }
                           }
                        if(i+1>=0 && i+1 <16 && j+1>=0 && j+1<16)
                           {
                            if(board[i+1][j+1]=='.')
                            {   //System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            { m=i+2;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           } 
                  }
                }
              }
            for(i=9;i<16;i++)
              {
                for(int j=9;j<16;j++)
                {
                  if(board[i][j]=='W')
                  {     //System.out.println(" Current i and j="+i+" "+j);
                        if(i-1>= 0 && i-1<16 && j-1>=0 && j-1<16)
                           {
                            if(board[i-1][j-1]=='.')
                            {   //System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1)+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!whitecamp.contains(temp))
                                 validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            {
                              m=i-2;
                              n=j-2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+n+","+(m);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!whitecamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }   
                              }
                            }
                          }
                        if(i-1>=0  && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            {   //System.out.println(" Going into . 2");
                              result="E"+" "+j+","+i+" "+j+","+(i-1)+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              //System.out.println("temp="+temp);
                              if(!whitecamp.contains(temp))
                                  validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            { m=i-2;
                              n=j;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!whitecamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }    
                              }
                            }
                           }
                        if(i>=0 && i <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i][j-1]=='.')
                            {   //System.out.println(" Going into . 3");
                              result="E"+" "+j+","+i+" "+(j-1)+","+i+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!whitecamp.contains(temp))
                                 validmoves.add(result);
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            {
                              m=i;
                              n=j-2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!whitecamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }   
                              }
                            }
                           }      
                        if(i-1>=0 && i-1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {  //System.out.println(" Going into . 4");
                               result="E"+" "+j+","+i+" "+(j+1)+","+(i-1)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!whitecamp.contains(temp))
                                   validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            { m=i-2;
                              n=j+2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!whitecamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }    
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i+1][j-1]=='.')
                            {   //System.out.println(" Going into . 5");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1)+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!whitecamp.contains(temp))
                                 validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            {
                              m=i+2;
                              n=j-2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!whitecamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }   
                              }
                            }
                           }   
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {   //System.out.println(" Going into . 6");
                                result="E"+" "+j+","+i+" "+(j+1)+","+i+".";
                                temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                                if(!whitecamp.contains(temp))
                                    validmoves.add(result);
                            }
                            else if(i>=0 && i<16 && j+2>=0 && j+2<16)
                            {
                              m=i;
                              n=j+2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!whitecamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }    
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j>=0 && j<16)
                           {
                            if(board[i+1][j]=='.')
                            {   //System.out.println(" Going into . 7");
                              result="E"+" "+j+","+i+" "+j+","+(i+1)+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!whitecamp.contains(temp))
                                 validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j>=0 && j<16)
                            {
                              m=i+2;
                              n=j;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!whitecamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }   
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j+1>=0 && j+1<16)
                           {
                            if(board[i+1][j+1]=='.')
                            {   //System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1)+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!whitecamp.contains(temp))
                                  validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            {
                              m=i+2;
                              n=j+2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!whitecamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  knn=jumpgamewhite(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }    
                              }
                            }
                           }  
                  }
                }
              }//ending of outer for
            }//ending of if(validmoves.size()==0)
            return validmoves;           
   }

   public static ArrayList<String> validmovesblack(char board[][])
  { 
    Boolean flagblackreach=true;
    int[][] visited=new int[16][16];
    int[][] visitedinitial=new int[16][16];
    int row,i,m,n;
    String result="",temp="";
    ArrayList<String> validmoves=new ArrayList<String>();
    String blackcamp="0,0 1,0 2,0 3,0 4,0 0,1 1,1 2,1 3,1 4,1 0,2 1,2 2,2 3,2 0,3 1,3 2,3 0,4 1,4";
    for(int j=0 ;j<16;j++)
           {
            for(int k=0;k<16;k++)
               { //System.out.println(i+" "+j);
                 if(board[j][k]!='.')
                    visitedinitial[j][k]=1;
               } 
           } 
    
    allinformation knn=new allinformation(visited,"",validmoves); 
    row=0;
            for(int column=0;column<5;column++)
               { 
                if(board[row][column]=='B')
                  { visited[row][column]=1;
                    knn=jumpgameblack(board,row,column,visited,"",validmoves);
                    validmoves=knn.validmoves;
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(knn.validmoves.size()==0)
                       {
                           knn=jumpgameblackcamp(board,row,column,visited,"",validmoves);
                           validmoves=knn.validmoves;
                           for(int pnnr=0;pnnr<16;pnnr++)
                              {
                                for(int pnnc=0;pnnc<16;pnnc++)
                                    {
                                     visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                    }
                              }
                       }
                    if(knn.validmoves.size()==0|| column==11)
                       {
                        //System.out.println("in if loop "+row+" "+column);
                        if(board[row+1][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row+1)+".";
                             validmoves.add(result);
                          }
                        if(board[row+1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row+1)+".";
                             validmoves.add(result);
                          }
                        if(board[row][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row)+".";
                             validmoves.add(result);
                          }
                      }
                    
                }
              } 
    row=1;
            for(int column=0;column<5;column++)
               { 
                if(board[row][column]=='B')
                  { visited[row][column]=1;
                    knn=jumpgameblack(board,row,column,visited,"",validmoves);
                    validmoves=knn.validmoves;
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(knn.validmoves.size()==0)
                       {
                           knn=jumpgameblackcamp(board,row,column,visited,"",validmoves);
                           validmoves=knn.validmoves;
                           for(int pnnr=0;pnnr<16;pnnr++)
                              {
                                for(int pnnc=0;pnnc<16;pnnc++)
                                    {
                                     visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                    }
                              }
                       }
                    if(knn.validmoves.size()==0|| column==11)
                       {
                        //System.out.println("in if loop "+row+" "+column);
                        if(board[row+1][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row+1)+".";
                             validmoves.add(result);
                          }
                        if(board[row+1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row+1)+".";
                             validmoves.add(result);
                          }
                        if(board[row][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row)+".";
                             validmoves.add(result);
                          }
                      }
                    
                }
              }
    row=2;
            for(int column=0;column<4;column++)
               { 
                if(board[row][column]=='B')
                  { visited[row][column]=1;
                    knn=jumpgameblack(board,row,column,visited,"",validmoves);
                    validmoves=knn.validmoves;
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(knn.validmoves.size()==0)
                       {
                           knn=jumpgameblackcamp(board,row,column,visited,"",validmoves);
                           validmoves=knn.validmoves;
                           for(int pnnr=0;pnnr<16;pnnr++)
                              {
                                for(int pnnc=0;pnnc<16;pnnc++)
                                    {
                                     visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                    }
                              }
                       }
                    if(knn.validmoves.size()==0|| column==12)
                       {
                        //System.out.println("in if loop "+row+" "+column);
                        if(board[row+1][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row+1)+".";
                             validmoves.add(result);
                          }
                        if(board[row+1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row+1)+".";
                             validmoves.add(result);
                          }
                        if(board[row][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row)+".";
                             validmoves.add(result);
                          }
                      }
                    
                }
              }
    row=3;
            for(int column=0;column<3;column++)
               { 
                if(board[row][column]=='B')
                  { visited[row][column]=1;
                    knn=jumpgameblack(board,row,column,visited,"",validmoves);
                    validmoves=knn.validmoves;
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(knn.validmoves.size()==0)
                       {
                           knn=jumpgameblackcamp(board,row,column,visited,"",validmoves);
                           validmoves=knn.validmoves;
                           for(int pnnr=0;pnnr<16;pnnr++)
                              {
                                for(int pnnc=0;pnnc<16;pnnc++)
                                    {
                                     visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                    }
                              }
                       }
                    if(knn.validmoves.size()==0|| column==13)
                       {
                        //System.out.println("in if loop "+row+" "+column);
                        if(board[row+1][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row+1)+".";
                             validmoves.add(result);
                          }
                        if(board[row+1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row+1)+".";
                             validmoves.add(result);
                          }
                        if(board[row][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row)+".";
                             validmoves.add(result);
                          }
                      }
                    
                }
              }
    row=4;
            for(int column=0;column<2;column++)
               { 
                if(board[row][column]=='B')
                  { visited[row][column]=1;
                    knn=jumpgameblack(board,row,column,visited,"",validmoves);
                    validmoves=knn.validmoves;
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(knn.validmoves.size()==0)
                       {
                           knn=jumpgameblackcamp(board,row,column,visited,"",validmoves);
                           validmoves=knn.validmoves;
                           for(int pnnr=0;pnnr<16;pnnr++)
                              {
                                for(int pnnc=0;pnnc<16;pnnc++)
                                    {
                                     visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                    }
                              }
                       }
                    if(knn.validmoves.size()==0|| column==14)
                       {
                        //System.out.println("in if loop "+row+" "+column);
                        if(board[row+1][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row+1)+".";
                             validmoves.add(result);
                          }
                        if(board[row+1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row+1)+".";
                             validmoves.add(result);
                          }
                        if(board[row][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row)+".";
                             validmoves.add(result);
                          }
                      }
                    
                }
              } 
            if(validmoves.size()==0)
            {  
            for(i=7;i<16;i++)
              {
                for(int j=0;j<16;j++)
                { 
                  if(i==11)
                          { 
                            if(j==14||j==15){
                            flagblackreach=false;
                            }
                          }  
                      else if(i==12)
                          {if(j==13||j==14||j==15){
                            flagblackreach=false;
                            }
                          }
                      else if(i==13)
                          {
                            if(j==12||j==13||j==14||j==15)
                              {//System.out.println("Going into 2nd move");
                                flagblackreach=false;
                              }
                          }
                      else if(i==14)
                           {if(j==11||j==12||j==13||j==14||j==15)
                              {
                                flagblackreach=false;
                              }
                            }
                      else if(i==15)
                           {if(j==11||j==12||j==13||j==14||j==15){
                                flagblackreach=false;
                           }
                          }
                  if(flagblackreach==true)
                  {        
                  if(board[i][j]=='B')
                  {   //System.out.println(" Current i and j="+i+" "+j);
                      if(i+1>=0 && i+1 <16 && j+1>=0 && j+1<16)
                           {
                            if(board[i+1][j+1]=='.')
                            {   //System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            { m=i+2;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j>=0 && j<16)
                           {
                            if(board[i+1][j]=='.')
                            {   //System.out.println(" Going into . 2");
                              result="E"+" "+j+","+i+" "+j+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j>=0 && j<16)
                            {
                              m=i+2;
                              n=j;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                     {
                                      for(int pnnc=0;pnnc<16;pnnc++)
                                        {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                        }
                                     }
                                 }
                              }
                           } 
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {  //System.out.println(" Going into . 3");
                              result="E"+" "+j+","+i+" "+(j+1)+","+i+".";
                              validmoves.add(result);
                            }
                            else if(i>=0 && i<16 && j+2>=0 && j+2<16)
                            { m=i;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i+1][j-1]=='.')
                            {   //System.out.println(" Going into . 4");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            { m=i+2;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }                                   
                        if(i-1>=0 && i-1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {   //System.out.println(" Going into . 5")+".";
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            { m=i-2;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i>=0 && i <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i][j-1]=='.')
                            {   //System.out.println(" Going into . 6")+".";
                              result="E"+" "+j+","+i+" "+(j-1)+","+i+".";
                              validmoves.add(result);
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            { m=i;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }         
                        if(i-1>=0  && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            { //System.out.println(" Going into . 7")+".";
                              result="E"+" "+j+","+i+" "+j+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            { m=i-2;
                              n=j;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }   
                        if(i-1>= 0 && i-1<16 && j-1>=0 && j-1<16)
                          {
                            if(board[i-1][j-1]=='.')
                            {   //System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            { m=i-2;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                          }        
                  }
                 } 
                }
              }
            for(i=0;i<7;i++)
              {
                for(int j=7;j<16;j++)
                {
                  if(board[i][j]=='B')
                  {     //System.out.println(" Current i and j="+i+" "+j);
                        if(i+1>=0 && i+1 <16 && j+1>=0 && j+1<16)
                           {
                            if(board[i+1][j+1]=='.')
                            {   //System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            { m=i+2;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j>=0 && j<16)
                           {
                            if(board[i+1][j]=='.')
                            {   //System.out.println(" Going into . 2");
                              result="E"+" "+j+","+i+" "+j+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j>=0 && j<16)
                            {
                              m=i+2;
                              n=j;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                     {
                                      for(int pnnc=0;pnnc<16;pnnc++)
                                        {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                        }
                                     }
                                 }
                              }
                           } 
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {  //System.out.println(" Going into . 3");
                              result="E"+" "+j+","+i+" "+(j+1)+","+i+".";
                              validmoves.add(result);
                            }
                            else if(i>=0 && i<16 && j+2>=0 && j+2<16)
                            { m=i;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i+1][j-1]=='.')
                            {   //System.out.println(" Going into . 4");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1)+".";
                              validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            { m=i+2;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }                                   
                        if(i-1>=0 && i-1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {   //System.out.println(" Going into . 5");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            { m=i-2;
                              n=j+2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }
                        if(i>=0 && i <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i][j-1]=='.')
                            {   //System.out.println(" Going into . 6");
                              result="E"+" "+j+","+i+" "+(j-1)+","+i+".";
                              validmoves.add(result);
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            { m=i;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }         
                        if(i-1>=0  && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            { //System.out.println(" Going into . 7");
                              result="E"+" "+j+","+i+" "+j+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            { m=i-2;
                              n=j;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                           }   
                        if(i-1>= 0 && i-1<16 && j-1>=0 && j-1<16)
                          {
                            if(board[i-1][j-1]=='.')
                            {   //System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1)+".";
                              validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            { m=i-2;
                              n=j-2;
                              if(board[m][n]=='.')
                              { //System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+(n)+","+(m)+".";
                               validmoves.add(result);
                               visited[m][n]=1;
                               knn=jumpgameblack(board,m,n,visited,result,validmoves);
                               validmoves=knn.validmoves;
                               for(int pnnr=0;pnnr<16;pnnr++)
                                   {
                                    for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                   }
                              }
                            }
                          }        
                  }
                }
              }
            for(i=6;i>=0;i--)
              {
                for(int j=6;j>=0;j--)
                {
                  if(board[i][j]=='B')
                  {     //System.out.println(" Current i and j="+i+" "+j);
                        if(i+1>=0 && i+1 <16 && j+1>=0 && j+1<16)
                           {
                            if(board[i+1][j+1]=='.')
                            {   //System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1)+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                  validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            {
                              m=i+2;
                              n=j+2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!blackcamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  visited[m][n]=1;
                                  knn=jumpgameblack(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }    
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j>=0 && j<16)
                           {
                            if(board[i+1][j]=='.')
                            {   //System.out.println(" Going into . 2");
                              result="E"+" "+j+","+i+" "+j+","+(i+1)+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                 validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j>=0 && j<16)
                            {
                              m=i+2;
                              n=j;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!blackcamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  visited[m][n]=1;
                                  knn=jumpgameblack(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }   
                              }
                            }
                           }
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {   //System.out.println(" Going into . 3");
                                result="E"+" "+j+","+i+" "+(j+1)+","+i+".";
                                temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                                if(!blackcamp.contains(temp))
                                    validmoves.add(result);
                            }
                            else if(i>=0 && i<16 && j+2>=0 && j+2<16)
                            {
                              m=i;
                              n=j+2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!blackcamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  visited[m][n]=1;
                                  knn=jumpgameblack(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }    
                              }
                            }
                           }                                                                                   
                        if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i+1][j-1]=='.')
                            {   //System.out.println(" Going into . 4");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1)+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                 validmoves.add(result);
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            {
                              m=i+2;
                              n=j-2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!blackcamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  visited[m][n]=1;
                                  knn=jumpgameblack(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }   
                              }
                            }
                           }
                        if(i-1>=0 && i-1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {  //System.out.println(" Going into . 5");
                               result="E"+" "+j+","+i+" "+(j+1)+","+(i-1)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!blackcamp.contains(temp))
                                   validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            { m=i-2;
                              n=j+2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!blackcamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  visited[m][n]=1;
                                  knn=jumpgameblack(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }    
                              }
                            }
                           }      
                        if(i>=0 && i <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i][j-1]=='.')
                            {   //System.out.println(" Going into . 6");
                              result="E"+" "+j+","+i+" "+(j-1)+","+i+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                 validmoves.add(result);
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            {
                              m=i;
                              n=j-2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!blackcamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  visited[m][n]=1;
                                  knn=jumpgameblack(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }   
                              }
                            }
                           }       
                        if(i-1>=0  && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            {   //System.out.println(" Going into . 7");
                              result="E"+" "+j+","+i+" "+j+","+(i-1)+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              //System.out.println("temp="+temp);
                              if(!blackcamp.contains(temp))
                                  validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            { m=i-2;
                              n=j;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!blackcamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  visited[m][n]=1;
                                  knn=jumpgameblack(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }    
                              }
                            }
                           }   
                        if(i-1>= 0 && i-1<16 && j-1>=0 && j-1<16)
                           {
                            if(board[i-1][j-1]=='.')
                            {   //System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1)+".";
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                 validmoves.add(result);
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            {
                              m=i-2;
                              n=j-2;
                              if(board[m][n]=='.')
                              {//System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+n+","+(m)+".";
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               //System.out.println("temp="+temp);
                               if(!blackcamp.contains(temp))
                                 {
                                  validmoves.add(result);
                                  visited[m][n]=1;
                                  knn=jumpgameblack(board,m,n,visited,result,validmoves);
                                  validmoves=knn.validmoves;
                                  for(int pnnr=0;pnnr<16;pnnr++)
                                      {
                                       for(int pnnc=0;pnnc<16;pnnc++)
                                       {
                                         visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                                       }
                                      }
                                  }   
                              }
                            }
                          }      
                  }
                }
              }//ending of outer for
            }//ending of if(validmoves.size()==0) 
       return validmoves;             
  }

   public static double evalution(char board[][],String player)
   { //if white our score should be less and black score should be high so if we minus black score from our score,then in this mode we are max player we select the score which is highest
    double score=0;
    if(player.equals("WHITE"))
    {  
      for (int i=0;i<16;i++)
            {
              for(int j=0;j<16;j++)
              {
                if(board[i][j]=='W')
                {
                  score=score-Math.sqrt(i*i+j*j);
                }
                else if(board[i][j]=='B')
                {
                  score=score+Math.sqrt((i-15)*(i-15)+(j-15)*(j-15));
                }  
              }
            }
     }
     else
     {
       for (int i=0;i<16;i++)
            {
              for(int j=0;j<16;j++)
              {
                if(board[i][j]=='W')
                {
                  score=score+Math.sqrt(i*i+j*j);
                }
                else if(board[i][j]=='B')
                {
                  score=score-Math.sqrt((i-15)*(i-15)+(j-15)*(j-15));
                }  
              }
            }
     }
     //System.out.println("Score in evalution"+score);
     return score;       
   }

   public static String minimax(String player,char board[][])
   {//ArrayList<String> validwhite= new ArrayList<String>();
    //ArrayList<String> validblacks= new ArrayList<String>();
    System.out.println("In minimax");
    ArrayList<String> validfinal= new ArrayList<String>();
    int depth=0,finalindex=0;
    double finalscore=Double.MIN_VALUE,score;
    //minimaxpoint mn=new minimaxpoint;
    if(player.equals("WHITE"))
    {
       validfinal=validmoveswhite(board);
       int len=validfinal.size();
       for(int i=0;i<len;i++)
           {
            System.out.println(validfinal.get(i));
           }
       for(int i=0;i<len;i++)
           { System.out.println("move"+validfinal.get(i));
            score=minvalue(board,"BLACK",validfinal.get(i),depth+1,Double.MIN_VALUE,Double.MAX_VALUE);
            System.out.println("Score"+score);
            if(finalscore<score)
            {
              finalscore=score;
              finalindex=i;
            }
            System.out.println("Final Score"+finalscore);
           }

    }
    else
    {
      validfinal=validmovesblack(board);
       int len=validfinal.size();
       for(int i=0;i<len;i++)
           {
            System.out.println(validfinal.get(i));
           }
       for(int i=0;i<len;i++)
           {System.out.println("move"+validfinal.get(i));
            score=minvalue(board,"WHITE",validfinal.get(i),depth+1,Double.MIN_VALUE,Double.MAX_VALUE);
            System.out.println("Score"+score);
            if(finalscore<score)
            {
              finalscore=score;
              finalindex=i;
            }
            System.out.println("Final Score"+finalscore);
           }    
    }
    return validfinal.get(finalindex);  
   }

   public static double minvalue(char board[][], String player, String previousmove,int depth,double alpha,double beta)
   { 
    //System.out.println("In minvalue "+depth+"player "+player);
    String minplayer=player;
    String maxplayer;
    if(player.equals("WHITE"))
       maxplayer="BLACK";
    else maxplayer="WHITE"; 
    if(depth>=5)
      {
            return evalution(board,maxplayer);
      }
    if(board[0][0]=='W'&&board[0][1]=='W'&&board[0][2]=='W'&&board[0][3]=='W'&&board[0][4]=='W')
       if(board[1][0]=='W'&&board[1][1]=='W'&&board[1][2]=='W'&&board[1][3]=='W'&&board[1][4]=='W')
          if(board[2][0]=='W'&&board[2][1]=='W'&&board[2][2]=='W'&&board[2][3]=='W')
             if(board[3][0]=='W'&&board[3][1]=='W'&&board[3][2]=='W')
                if(board[4][0]=='W'&&board[4][1]=='W')
                   return evalution(board,maxplayer);
    if(board[15][15]=='B'&&board[15][14]=='B'&&board[15][13]=='B'&&board[15][12]=='B'&&board[15][11]=='B')
       if(board[14][15]=='B'&&board[14][14]=='B'&&board[14][13]=='B'&&board[14][12]=='B'&&board[14][11]=='B')
          if(board[13][15]=='B'&&board[13][14]=='B'&&board[13][13]=='B'&&board[13][12]=='B')
             if(board[12][15]=='B'&&board[12][14]=='B'&&board[12][13]=='B')
                if(board[11][15]=='B'&&board[11][14]=='B')
                    return evalution(board,maxplayer);
                     
      char minboard[][]=new char[16][16];
      String temp="";
      String result1=previousmove;
      int fromx,fromy,tox,toy,comma;
      ArrayList<String> minvalid=new ArrayList<String>();
      double score,finalscore=Double.MAX_VALUE;
      for(int i=0;i<16;i++)
      {
        for(int j=0;j<16;j++)
        {
          minboard[i][j]=board[i][j];
        }
      }
      //temp=result.substring(result.lastIndexOf(" ")+1,result.length());
      //System.out.println("result1="+result1);
      comma=result1.indexOf(",");
      fromx=Integer.parseInt(result1.substring(result1.indexOf(" ")+1,comma));
      fromy=Integer.parseInt(result1.substring(result1.indexOf(",")+1,result1.indexOf(" ",comma)));
      tox=Integer.parseInt(result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(",")));
      toy=Integer.parseInt(result1.substring(result1.lastIndexOf(",")+1,result1.length()-1));
      if(player.equals("BLACK"))
      {
       //System.out.println("In min black player");  
       minboard[tox][toy]='W';
       minboard[fromx][fromy]='.';
       minvalid=validmovesblack(minboard);
       int len=minvalid.size();
       //System.out.println("Min valid moves length black"+len);
         for(int i=0;i<len;i++)
                {     
                      score=maxvalue(minboard,"WHITE",minvalid.get(i),depth+1,alpha,beta);
                      if(finalscore>score)
                         {
                          finalscore=score;
                         } 
                      if(beta>finalscore)
                        {
                          beta=finalscore;
                        }
                      if (alpha >= beta) break;         
                }
      }             
      else
      {
        minboard[tox][toy]='B';
        minboard[fromx][fromy]='.';
        minvalid=validmoveswhite(minboard);
        int len=minvalid.size();
        //System.out.println("Min valid moves length white"+len);
        for(int i=0;i<len;i++)
                {      score=maxvalue(minboard,"BLACK",minvalid.get(i),depth+1,alpha,beta);
                      if(finalscore>score)
                         {
                          finalscore=score;
                         }
                      if(beta>finalscore)
                        {
                          beta=finalscore;
                        }
                      if (alpha >= beta) break;     
                }
        }            
     return finalscore; 

   }

   public static double maxvalue(char board[][], String player, String previousmove,int depth,double alpha,double beta)
   { 
    //System.out.println("In maxvalue "+depth+"player "+player);
    if(depth>=5)
      {
            return evalution(board,player);
      }
    if(board[0][0]=='W'&&board[0][1]=='W'&&board[0][2]=='W'&&board[0][3]=='W'&&board[0][4]=='W')
       if(board[1][0]=='W'&&board[1][1]=='W'&&board[1][2]=='W'&&board[1][3]=='W'&&board[1][4]=='W')
          if(board[2][0]=='W'&&board[2][1]=='W'&&board[2][2]=='W'&&board[2][3]=='W')
             if(board[3][0]=='W'&&board[3][1]=='W'&&board[3][2]=='W')
                if(board[4][0]=='W'&&board[4][1]=='W')
                   return evalution(board,player);
    if(board[15][15]=='B'&&board[15][14]=='B'&&board[15][13]=='B'&&board[15][12]=='B'&&board[15][11]=='B')
       if(board[14][15]=='B'&&board[14][14]=='B'&&board[14][13]=='B'&&board[14][12]=='B'&&board[14][11]=='B')
          if(board[13][15]=='B'&&board[13][14]=='B'&&board[13][13]=='B'&&board[13][12]=='B')
             if(board[12][15]=='B'&&board[12][14]=='B'&&board[12][13]=='B')
                if(board[11][15]=='B'&&board[11][14]=='B')
                    return evalution(board,player);
                     
      char maxboard[][]=new char[16][16];
      String temp="";
      String result1=previousmove;
      int fromx,fromy,tox,toy,comma;
      ArrayList<String> maxvalid=new ArrayList<String>();
      double score,finalscore=Double.MIN_VALUE;
      for(int i=0;i<16;i++)
      {
        for(int j=0;j<16;j++)
        {
          maxboard[i][j]=board[i][j];
        }
      }
      //temp=result.substring(result.lastIndexOf(" ")+1,result.length());
      //System.out.println("result1="+result1);
      comma=result1.indexOf(",");
      fromx=Integer.parseInt(result1.substring(result1.indexOf(" ")+1,comma));
      fromy=Integer.parseInt(result1.substring(result1.indexOf(",")+1,result1.indexOf(" ",comma)));
      tox=Integer.parseInt(result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(",")));
      toy=Integer.parseInt(result1.substring(result1.lastIndexOf(",")+1,result1.length()-1));
      if(player.equals("BLACK"))
      {  
       maxboard[tox][toy]='W';
       maxboard[fromx][fromy]='.';
       maxvalid=validmovesblack(maxboard);
       int len=maxvalid.size();
       //System.out.println("Max valid moves length black"+len);
         for(int i=0;i<len;i++)
                {
                   score=minvalue(maxboard,"WHITE",maxvalid.get(i),depth+1,alpha,beta);
                   if(finalscore<score)
                     {
                       finalscore=score;
                       //index=i;
                     }
                   if(alpha<finalscore)
                         {
                          alpha=finalscore;
                         }
                   if (alpha >= beta) break;    
                }
      }             
      else
      {
        maxboard[tox][toy]='B';
        maxboard[fromx][fromy]='.';
        maxvalid=validmoveswhite(maxboard);
        int len=maxvalid.size();
        //System.out.println("Max valid moves length white"+len);
        for(int i=0;i<len;i++)
                {
                      /*comma=result1.indexof(",");
                      fromx=Integer.ParseIntresult1.substring(result1.indexof(" ")+1,comma);
                      fromy=Integer.ParseIntresult1.substring(result1.indexof(",")+1,result1.indexof(" ",comma));
                      tox=Integer.ParseInt(result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(",")));
                      toy=Integer.ParseInt(result1.substring(result1.lastIndexOf(",")+1,result1.length()));
                      maxboard[fromx][fromy]='.';
                      maxboard[tox][toy]='W';
                      score=evalution(maxboard,"BLACK");
                      maxboard[fromx][fromy]='W';
                      maxboard[tox][toy]='.';*/
                      score=minvalue(maxboard,"BLACK",maxvalid.get(i),depth+1,alpha,beta);
                      if(finalscore<score)
                        {
                         finalscore=score;
                         //index=i;
                        }
                      if(alpha<finalscore)
                         {
                          alpha=finalscore;
                         }
                      if (alpha >= beta) break;  
                }
        }            
     return finalscore;

   }

   
   public static void main(String[] args) 
   {    
        long startTime= System.nanoTime();
        File myObj = new File("input1.txt");
        String s[]=new String[19];
        int i=0,finalx,finaly,row,m,n;
        boolean flag=false,flag1,flag2,flag3,flag4,flag5,whitefinal=false,blackfinal=false,flagwhitereach=true,flagblackreach=true,flagwhitereachsingle=true,flagblackreachsingle=true;
        char board[][]=new char[16][16];
        String x="",y="";
        String result="";
        String result1="",temp="";
        String resultwithbackjump="";
        int visited[][]=new int[16][16];
        int visitedinitial[][]=new int[16][16];
        double utility[][]=new double[16][16];
        double utilityb[][]=new double[16][16];
        String[] resultFinal=new String[200];// see if dynamic allocation is possible check arraylist data structure for that
        //ArrayList<String> resultFinal=new ArrayList<String>();
        ArrayList<String> validmoves=new ArrayList<String>();
        String whitecamp="14,11 15,11 13,12 14,12 15,12 12,13 13,13 14,13 15,13 11,14 12,14 13,14 14,14 11,15 12,15 13,15 14,15 15,15";
        String blackcamp="0,0 1,0 2,0 3,0 4,0 0,1 1,1 2,1 3,1 4,1 0,2 1,2 2,2 3,2 0,3 1,3 2,3 0,4 1,4";

     try 
     {   Scanner myReader = new Scanner(myObj);
        // Creating an object of the file for reading the data
        while (myReader.hasNextLine()) 
        {
            String data = myReader.nextLine();
            System.out.println(data);
            s[i]=data;
            i++;
        }
        for(i=0;i<19;i++)
        {
          System.out.println(s[i]);
        }
        myReader.close();
     } catch (FileNotFoundException e) {
       System.out.println("An error occurred.");
       e.printStackTrace();
      }
       String myColour= new String();
       myColour=s[1];
       if(myColour.equals("WHITE"))
       {
        System.out.println("Colour="+myColour);
       }
       else
       {
        
        System.out.println("Not Colour="+myColour);
       }
       System.out.println(s[0]);
       for(int k=3;k<19;k++)
            {
              board[k-3]=s[k].toCharArray();
            }
        System.out.println("printing the board");                
       for(int j=0 ;j<16;j++)
           {
            for(int k=0;k<16;k++)
               { //System.out.println(i+" "+j);
                 System.out.print(board[j][k]);
               }
            System.out.println();   
           }
       for (i=0;i<16;i++)
            {
              for(int j=0;j<16;j++)
              {
                utility[i][j]=Math.sqrt(i*i+j*j);
                //if(j>=6 && j<=10)
              }
            }
       for (i=0;i<16;i++)
            {
              for(int j=0;j<16;j++)
              {
                utilityb[i][j]=Math.sqrt((i-15)*(i-15)+(j-15)*(j-15));
                //if(j>=6 && j<=10)
              }
            }
       for(int j=0 ;j<16;j++)
           {
            for(int k=0;k<16;k++)
               { //System.out.println(i+" "+j);
                 if(board[j][k]!='.')
                    visitedinitial[j][k]=1;
               } 
           }     
       /*DecimalFormat df2 = new DecimalFormat("#.##");      
       for (i=0;i<16;i++)
            {
              for(int j=0;j<16;j++)
              {
                System.out.print(df2.format(utilityb[i][j])+" ");
                //if(j>=6 && j<=10)
              }
              System.out.println();
            } */         
       if(s[0].equals("SINGLE"))
       {
        System.out.println("SINGLE MOVE GAME");
        if(myColour.equals("WHITE"))
        { 
          row=15;
          for(int column=15;column>=11&&flag==false;column--)
               {
                if(board[row][column]=='W')
                  { visited[row][column]=1;
                    result=jumpWHITE(board,row,column,visited,utility);
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(result.equals(""))
                    {
                      result=jumpbackWHITE(board,row,column,visited,utility);
                      for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    }
                    System.out.println("At "+row+" "+column+"  result is "+result);
                    if(result.equals(""))
                      { System.out.println("in if loop "+row+" "+column);
                        if(board[row-1][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row-1);
                          }
                        else if(board[row][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row);
                          }
                        else if(board[row-1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row-1);
                          }
                      }
                    flag1=false;
                    flag2=false;
                    flag3=false;
                    flag4=false;
                    flag5=false;
                    if(result!="")
                    {  flag1=true;
                       flag2=true;
                       flag3=true;
                       flag4=true;
                       flag5=true;
                       resultFinal=result.split("\\.");
                       result1=resultFinal[resultFinal.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5=false;
                           }
                          }
                      }

                      if(flag1&&flag2&&flag3&&flag4&&flag5)
                      {
                        flag=true;
                      } 
                }
              }
          row=14;
          for(int column=15;column>=11&&flag==false;column--)
               {
                if(board[row][column]=='W')
                  { visited[row][column]=1;
                    result=jumpWHITE(board,row,column,visited,utility);
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(result.equals(""))
                    {
                      result=jumpbackWHITE(board,row,column,visited,utility);
                      for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    }
                    System.out.println("At "+row+" "+column+"  result is "+result);
                    if(result.equals(""))
                      { System.out.println("in if loop "+row+" "+column);
                        if(board[row-1][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row-1);
                          }
                        else if(board[row][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row);
                          }
                        else if(board[row-1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row-1);
                          }
                      }
                    flag1=false;
                    flag2=false;
                    flag3=false;
                    flag4=false;
                    flag5=false;
                    if(result!="")
                    {  flag1=true;
                       flag2=true;
                       flag3=true;
                       flag4=true;
                       flag5=true;
                       resultFinal=result.split("\\.");
                       result1=resultFinal[resultFinal.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5=false;
                           }
                          }
                      }

                      if(flag1&&flag2&&flag3&&flag4&&flag5)
                      {
                        flag=true;
                      }  
                   }
               }               
          row=13;
          for(int column=15;column>=12&&flag==false;column--)
               {
                if(board[row][column]=='W')
                  { visited[row][column]=1;
                    result=jumpWHITE(board,row,column,visited,utility);
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(result.equals(""))
                    {
                      result=jumpbackWHITE(board,row,column,visited,utility);
                      for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    }
                    System.out.println("At "+row+" "+column+"  result is "+result);
                    if(result.equals(""))
                      { System.out.println("in if loop "+row+" "+column);
                        if(board[row-1][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row-1);
                          }
                        else if(board[row][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row);
                          }
                        else if(board[row-1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row-1);
                          }
                      }
                    flag1=false;
                    flag2=false;
                    flag3=false;
                    flag4=false;
                    flag5=false;
                    if(result!="")
                    {  flag1=true;
                       flag2=true;
                       flag3=true;
                       flag4=true;
                       flag5=true;
                       resultFinal=result.split("\\.");
                       result1=resultFinal[resultFinal.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5=false;
                           }
                          }
                      }

                      if(flag1&&flag2&&flag3&&flag4&&flag5)
                      {
                        flag=true;
                      }    
                   }
               }
          row=12;
          for(int column=15;column>=13&&flag==false;column--)
               {
                if(board[row][column]=='W')
                  { visited[row][column]=1;
                    result=jumpWHITE(board,row,column,visited,utility);
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(result.equals(""))
                    {
                      result=jumpbackWHITE(board,row,column,visited,utility);
                      for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    }
                    System.out.println("At "+row+" "+column+"  result is "+result);
                    if(result.equals(""))
                      { System.out.println("in if loop "+row+" "+column);
                        if(board[row-1][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row-1);
                          }
                        else if(board[row][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row);
                          }
                        else if(board[row-1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row-1);
                          }
                      }
                    flag1=false;
                    flag2=false;
                    flag3=false;
                    flag4=false;
                    flag5=false;
                    if(result!="")
                    {  flag1=true;
                       flag2=true;
                       flag3=true;
                       flag4=true;
                       flag5=true;
                       resultFinal=result.split("\\.");
                       result1=resultFinal[resultFinal.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5=false;
                           }
                          }
                      }

                      if(flag1&&flag2&&flag3&&flag4&&flag5)
                      {
                        flag=true;
                      }    
                   }
               }
          row=11;
          for(int column=15;column>=14&&flag==false;column--)
               {
                if(board[row][column]=='W')
                  { visited[row][column]=1;
                    result=jumpWHITE(board,row,column,visited,utility);
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(result.equals(""))
                    {
                      result=jumpbackWHITE(board,row,column,visited,utility);
                      for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    }
                    System.out.println("At "+row+" "+column+"  result is "+result);
                    if(result.equals(""))
                      { System.out.println("in if loop "+row+" "+column);
                        if(board[row-1][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row-1);
                          }
                        else if(board[row][column-1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column-1)+","+(row);
                          }
                        else if(board[row-1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row-1);
                          }
                      }
                    flag1=false;
                    flag2=false;
                    flag3=false;
                    flag4=false;
                    flag5=false;
                    if(result!="")
                    {  flag1=true;
                       flag2=true;
                       flag3=true;
                       flag4=true;
                       flag5=true;
                       resultFinal=result.split("\\.");
                       result1=resultFinal[resultFinal.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       if(finalx==15)
                          { 
                            if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag1=false;
                            }
                          }  
                       if(finalx==14)
                          {if(finaly==11 ||finaly==12||finaly==13||finaly==14||finaly==15){
                            flag2=false;
                            }
                          }
                       if(finalx== 13)
                          {
                            if(finaly==12||finaly==13||finaly==14||finaly==15)
                              {System.out.println("Going into 2nd move");
                                flag3=false;
                              }
                          }
                       if(finalx==12)
                           {if(finaly==13||finaly==14||finaly==15)
                              {
                                flag4=false;
                              }
                            }
                       if(finalx==11)
                           {if(finaly==14||finaly==15){
                                flag5=false;
                           }
                          }
                      }

                      if(flag1&&flag2&&flag3&&flag4&&flag5)
                      {
                        flag=true;
                      }  
                   }
               }
          if(result.equals(""))
          {
            outerloop:
            for(i=8;i>=0&&whitefinal==false;i--)
              {
                for(int j=15;j>=0;j--)
                { 
                  flagwhitereachsingle=true;
                  if(i<5 &&j<5)
                     {
                      if(i==4)
                          { 
                            if(j==0||j==1){
                            flagwhitereachsingle=false;
                            }
                          }  
                      else if(i==3)
                          {if(j==0||j==1||j==2){
                            flagwhitereachsingle=false;
                            }
                          }
                      else if(i==2)
                          {
                            if(j==0||j==1||j==2||j==3)
                              {//System.out.println("Going into 2nd move");
                                flagwhitereachsingle=false;
                              }
                          }
                      else if(i==1)
                           {if(j==0||j==1||j==2||j==3||j==4)
                              {
                                flagwhitereachsingle=false;
                              }
                            }
                      else if(i==0)
                           {if(j==0||j==1||j==2||j==3||j==4){
                                flagwhitereachsingle=false;
                           }
                          }
                     }
                  if(flagwhitereachsingle==true)   
                  {
                  if(board[i][j]=='W')
                  {   System.out.println(" Current i and j="+i+" "+j);
                    if(i-1>=0  && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            {   System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+j+","+(i-1);
                              whitefinal=true;
                              break outerloop;
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            {
                              if(board[i-2][j]=='.')
                              {System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+j+","+(i-2);
                               whitefinal=true;
                               break outerloop;
                              }
                            }
                           }
                        if(i-1>=0 && i-1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {   System.out.println(" Going into . 2");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i-1);
                              whitefinal=true;
                              break outerloop;
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i-2][j+2]=='.')
                              {System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i-2);
                               whitefinal=true;
                               break outerloop;
                              }
                            }
                           }
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {  System.out.println(" Going into . 3");
                              result="E"+" "+j+","+i+" "+(j+1)+","+i;
                              whitefinal=true;
                              break outerloop;
                            }
                            else if(i>=0 && i<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i][j+2]=='.')
                              {System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+(j+2)+","+i;
                               whitefinal=true;
                               break outerloop;
                              }
                            }
                           }
                  if(i+1>=0 && i+1 <16 && j+1>=0 && j+1<16)
                      {
                            if(board[i+1][j+1]=='.')
                            {   System.out.println(" Going into . 4");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1);
                              whitefinal=true;
                              break outerloop;
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i+2][j+2]=='.')
                              {System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i+2);
                               whitefinal=true;
                               break outerloop;
                              }
                            }
                           }
                  if(i+1>=0 && i+1 <16 && j>=0 && j<16)
                      {
                            if(board[i+1][j]=='.')
                            {   System.out.println(" Going into . 5");
                              result="E"+" "+j+","+i+" "+j+","+(i+1);
                              whitefinal=true;
                              break outerloop;
                            }
                            else if(i+2>=0  && i+2<16 && j>=0 && j<16)
                            {
                              if(board[i+2][j]=='.')
                              {System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+j+","+(i+2);
                               whitefinal=true;
                               break outerloop;
                              }
                            }
                           }
                  if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                      {
                            if(board[i+1][j-1]=='.')
                            {   System.out.println(" Going into . 6");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1);
                              whitefinal=true;
                              break outerloop;
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i+2][j-2]=='.')
                              {System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i+2);
                               whitefinal=true;
                               break outerloop;
                              }
                            }
                           }
                  if(i>=0 && i <16 && j-1>=0 && j-1<16)
                      {
                            if(board[i][j-1]=='.')
                            {   System.out.println(" Going into . 7");
                              result="E"+" "+j+","+i+" "+(j-1)+","+i;
                              whitefinal=true;
                              break outerloop;
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i][j-2]=='.')
                              {System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+(j-2)+","+i;
                               whitefinal=true;
                               break outerloop;
                              }
                            }
                           }
                  if(i-1>= 0 && i-1<16 && j-1>=0 && j-1<16)
                      {
                            if(board[i-1][j-1]=='.')
                            {   System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1);
                              whitefinal=true;
                              break outerloop;
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i-2][j-2]=='.')
                              { System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i-2);
                               whitefinal=true;
                               break outerloop;
                              }
                            }
                      }
                  }
                 } 
                }
              }
            outerloop1:
            for(i=15;i>=9&&whitefinal==false;i--)
              {
                for(int j=8;j>=0;j--)
                {
                  if(board[i][j]=='W')
                  {   System.out.println(" Current i and j="+i+" "+j);
                    if(i-1>=0  && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            {   System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+j+","+(i-1);
                              whitefinal=true;
                              break outerloop1;
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            {
                              if(board[i-2][j]=='.')
                              {System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+j+","+(i-2);
                               whitefinal=true;
                               break outerloop1;
                              }
                            }
                           }
                        if(i-1>=0 && i-1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {   System.out.println(" Going into . 2");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i-1);
                              whitefinal=true;
                              break outerloop1;
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i-2][j+2]=='.')
                              {System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i-2);
                               whitefinal=true;
                               break outerloop1;
                              }
                            }
                           }
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {   System.out.println(" Going into . 3");
                              result="E"+" "+j+","+i+" "+(j+1)+","+i;
                              whitefinal=true;
                              break outerloop1;
                            }
                            else if(i>=0 && i<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i][j+2]=='.')
                              {System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+(j+2)+","+i;
                               whitefinal=true;
                               break outerloop1;
                              }
                            }
                           }
                  if(i+1>=0 && i+1 <16 && j+1>=0 && j+1<16)
                      {
                            if(board[i+1][j+1]=='.')
                            {   System.out.println(" Going into . 4");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1);
                              whitefinal=true;
                              break outerloop1;
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i+2][j+2]=='.')
                              {System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i+2);
                               whitefinal=true;
                               break outerloop1;
                              }
                            }
                           }
                  if(i+1>=0 && i+1 <16 && j>=0 && j<16)
                      {
                            if(board[i+1][j]=='.')
                            {   System.out.println(" Going into . 5");
                              result="E"+" "+j+","+i+" "+j+","+(i+1);
                              whitefinal=true;
                              break outerloop1;
                            }
                            else if(i+2>=0  && i+2<16 && j>=0 && j<16)
                            {
                              if(board[i+2][j]=='.')
                              {System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+j+","+(i+2);
                               whitefinal=true;
                               break outerloop1;
                              }
                            }
                           }
                  if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                      {
                            if(board[i+1][j-1]=='.')
                            {   System.out.println(" Going into . 6");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1);
                              whitefinal=true;
                              break outerloop1;
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i+2][j-2]=='.')
                              {System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i+2);
                               whitefinal=true;
                               break outerloop1;
                              }
                            }
                           }
                  if(i>=0 && i <16 && j-1>=0 && j-1<16)
                      {
                            if(board[i][j-1]=='.')
                            {   System.out.println(" Going into . 7");
                              result="E"+" "+j+","+i+" "+(j-1)+","+i;
                              whitefinal=true;
                              break outerloop1;
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i][j-2]=='.')
                              {System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+(j-2)+","+i;
                               whitefinal=true;
                               break outerloop1;
                              }
                            }
                           }
                  if(i-1>= 0 && i-1<16 && j-1>=0 && j-1<16)
                      {
                            if(board[i-1][j-1]=='.')
                            {   System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1);
                              whitefinal=true;
                              break outerloop1;
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i-2][j-2]=='.')
                              { System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i-2);
                               whitefinal=true;
                               break outerloop1;
                              }
                            }
                      }
                  }
                }
              }
            outerloop2:
            for(i=9;i<16&whitefinal==false;i++)
              {
                for(int j=9;j<16;j++)
                {
                  if(board[i][j]=='W')
                  {   System.out.println(" Current i and j="+i+" "+j);
                    if(i-1>=0  && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            {   System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+j+","+(i-1);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              System.out.println("temp="+temp);
                              if(!whitecamp.contains(temp))
                                  break outerloop2;
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            {
                              if(board[i-2][j]=='.')
                              {System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+j+","+(i-2);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               System.out.println("temp="+temp);
                               if(!whitecamp.contains(temp))
                                  break outerloop2;
                              }
                            }
                           }
                        if(i-1>=0 && i-1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {  System.out.println(" Going into . 2");
                               result="E"+" "+j+","+i+" "+(j+1)+","+(i-1);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               System.out.println("temp="+temp);
                               if(!whitecamp.contains(temp))
                                  break outerloop2;
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i-2][j+2]=='.')
                              {System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i-2);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!whitecamp.contains(temp))
                                   break outerloop2;
                              }
                            }
                           }
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {   System.out.println(" Going into . 3");
                                result="E"+" "+j+","+i+" "+(j+1)+","+i;
                                temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                                if(!whitecamp.contains(temp))
                                   break outerloop2;
                            }
                            else if(i>=0 && i<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i][j+2]=='.')
                              {System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+(j+2)+","+i;
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!whitecamp.contains(temp))
                                   break outerloop2;
                              }
                            }
                           }
                  if(i+1>=0 && i+1 <16 && j+1>=0 && j+1<16)
                      {
                            if(board[i+1][j+1]=='.')
                            {   System.out.println(" Going into . 4");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!whitecamp.contains(temp))
                                 break outerloop2;
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i+2][j+2]=='.')
                              {System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i+2);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!whitecamp.contains(temp))
                                   break outerloop2;
                              }
                            }
                           }
                  if(i+1>=0 && i+1 <16 && j>=0 && j<16)
                      {
                            if(board[i+1][j]=='.')
                            {   System.out.println(" Going into . 5");
                              result="E"+" "+j+","+i+" "+j+","+(i+1);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!whitecamp.contains(temp))
                                 break outerloop2;
                            }
                            else if(i+2>=0  && i+2<16 && j>=0 && j<16)
                            {
                              if(board[i+2][j]=='.')
                              {System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+j+","+(i+2);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!whitecamp.contains(temp))
                                   break outerloop2;
                              }
                            }
                           }
                  if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                      {
                            if(board[i+1][j-1]=='.')
                            {   System.out.println(" Going into . 6");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!whitecamp.contains(temp))
                                 break outerloop2;
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i+2][j-2]=='.')
                              {System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i+2);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!whitecamp.contains(temp))
                                  break outerloop2;
                              }
                            }
                           }
                  if(i>=0 && i <16 && j-1>=0 && j-1<16)
                      {
                            if(board[i][j-1]=='.')
                            {   System.out.println(" Going into . 7");
                              result="E"+" "+j+","+i+" "+(j-1)+","+i;
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!whitecamp.contains(temp))
                                 break outerloop2;
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i][j-2]=='.')
                              {System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+(j-2)+","+i;
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!whitecamp.contains(temp))
                                  break outerloop2;
                              }
                            }
                           }
                  if(i-1>= 0 && i-1<16 && j-1>=0 && j-1<16)
                      {
                            if(board[i-1][j-1]=='.')
                            {   System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!whitecamp.contains(temp))
                                 break outerloop2;
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i-2][j-2]=='.')
                              { System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i-2);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!whitecamp.contains(temp))
                                   break outerloop2;
                              }
                            }
                      }
                  }
                }
              }
          }
        }
        else
        {
          row=0;
          for(int column=0;column<=4&&flag==false;column++)
               {
                if(board[row][column]=='B')
                  { visited[row][column]=1;
                    result=jumpBLACK(board,row,column,visited,utilityb);
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(result.equals(""))
                    {
                      result=jumpbackBLACK(board,row,column,visited,utilityb);
                      for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    }
                    System.out.println("At "+row+" "+column+"  result is "+result);
                    if(result.equals(""))
                      { System.out.println("in if loop "+row+" "+column);
                        if(board[row+1][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row+1);
                          }
                        else if(board[row][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row);
                          }
                        else if(board[row+1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row+1);
                          }
                      }
                    flag1=false;
                    flag2=false;
                    flag3=false;
                    flag4=false;
                    flag5=false;
                    if(result!="")
                    {  flag1=true;
                       flag2=true;
                       flag3=true;
                       flag4=true;
                       flag5=true;
                       resultFinal=result.split("\\.");
                       result1=resultFinal[resultFinal.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5=false;
                              }
                            }
                      }

                      if(flag1&&flag2&&flag3&&flag4&&flag5)
                      {
                        flag=true;
                      } 
                }
              }
          row=1;
          for(int column=0;column<5&&flag==false;column++)
               {
                if(board[row][column]=='B')
                  { visited[row][column]=1;
                    result=jumpBLACK(board,row,column,visited,utilityb);
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(result.equals(""))
                    {
                      result=jumpbackBLACK(board,row,column,visited,utilityb);
                      for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    }
                    System.out.println("At "+row+" "+column+"  result is "+result);
                    if(result.equals(""))
                      { System.out.println("in if loop "+row+" "+column);
                        if(board[row+1][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row+1);
                          }
                        else if(board[row][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row);
                          }
                        else if(board[row+1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row+1);
                          }
                      }
                    flag1=false;
                    flag2=false;
                    flag3=false;
                    flag4=false;
                    flag5=false;
                    if(result!="")
                    {  flag1=true;
                       flag2=true;
                       flag3=true;
                       flag4=true;
                       flag5=true;
                       resultFinal=result.split("\\.");
                       result1=resultFinal[resultFinal.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5=false;
                              }
                            }
                      }

                      if(flag1&&flag2&&flag3&&flag4&&flag5)
                      {
                        flag=true;
                      }  
                  }
               }               
          row=2;
          for(int column=0;column<=3&&flag==false;column++)
               {
                if(board[row][column]=='B')
                  { visited[row][column]=1;
                    result=jumpBLACK(board,row,column,visited,utilityb);
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(result.equals(""))
                    {
                      result=jumpbackBLACK(board,row,column,visited,utilityb);
                      for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    }
                    System.out.println("At "+row+" "+column+"  result is "+result);
                    if(result.equals(""))
                      { System.out.println("in if loop "+row+" "+column);
                        if(board[row+1][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row+1);
                          }
                        else if(board[row][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row);
                          }
                        else if(board[row+1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row+1);
                          }
                      }
                    flag1=false;
                    flag2=false;
                    flag3=false;
                    flag4=false;
                    flag5=false;
                    if(result!="")
                    {  flag1=true;
                       flag2=true;
                       flag3=true;
                       flag4=true;
                       flag5=true;
                       resultFinal=result.split("\\.");
                       result1=resultFinal[resultFinal.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5=false;
                              }
                            }
                      }

                      if(flag1&&flag2&&flag3&&flag4&&flag5)
                      {
                        flag=true;
                      }    
                  }
               }
          row=3;
          for(int column=0;column<=2&&flag==false;column++)
               {
                if(board[row][column]=='B')
                  { visited[row][column]=1;
                    result=jumpBLACK(board,row,column,visited,utilityb);
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(result.equals(""))
                    {
                      result=jumpbackBLACK(board,row,column,visited,utilityb);
                      for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    }
                    System.out.println("At "+row+" "+column+"  result is "+result);
                    if(result.equals(""))
                      { System.out.println("in if loop "+row+" "+column);
                        if(board[row+1][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row+1);
                          }
                        else if(board[row][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row);
                          }
                        else if(board[row+1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row+1);
                          }
                      }
                    flag1=false;
                    flag2=false;
                    flag3=false;
                    flag4=false;
                    flag5=false;
                    if(result!="")
                    {  flag1=true;
                       flag2=true;
                       flag3=true;
                       flag4=true;
                       flag5=true;
                       resultFinal=result.split("\\.");
                       result1=resultFinal[resultFinal.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5=false;
                              }
                            }
                      }

                      if(flag1&&flag2&&flag3&&flag4&&flag5)
                      {
                        flag=true;
                      }    
                  }
               }
          row=4;
          for(int column=0;column<=1&&flag==false;column++)
               {
                if(board[row][column]=='B')
                  { visited[row][column]=1;
                    result=jumpBLACK(board,row,column,visited,utilityb);
                    for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    if(result.equals(""))
                    {
                      result=jumpbackBLACK(board,row,column,visited,utilityb);
                      for(int pnnr=0;pnnr<16;pnnr++)
                        {
                          for(int pnnc=0;pnnc<16;pnnc++)
                          {
                            visited[pnnr][pnnc]=visitedinitial[pnnr][pnnc];
                          }
                        }
                    }
                    System.out.println("At "+row+" "+column+"  result is "+result);
                    if(result.equals(""))
                      { System.out.println("in if loop "+row+" "+column);
                        if(board[row+1][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row+1);
                          }
                        else if(board[row][column+1]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column+1)+","+(row);
                          }
                        else if(board[row+1][column]=='.')
                          {
                             result="E"+" "+column+","+row+" "+(column)+","+(row+1);
                          }
                      }
                    flag1=false;
                    flag2=false;
                    flag3=false;
                    flag4=false;
                    flag5=false;
                    if(result!="")
                    {  flag1=true;
                       flag2=true;
                       flag3=true;
                       flag4=true;
                       flag5=true;
                       resultFinal=result.split("\\.");
                       result1=resultFinal[resultFinal.length-1];
                       x=result1.substring(result1.lastIndexOf(" ")+1,result1.lastIndexOf(","));
                       y=result1.substring(result1.lastIndexOf(",")+1,result1.length());
                       finalx=Integer.parseInt(x);
                       finaly=Integer.parseInt(y);
                       if(finalx==0)
                         {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                             flag1=false;
                          }
                         }   
                       else if(finalx==1)
                          {if(finaly==0 ||finaly==1||finaly==2||finaly==3||finaly==4){
                              flag2=false;
                          }
                         }
                       else if(finalx==2)
                           {
                            if(finaly==0||finaly==1||finaly==2||finaly==3)
                              {System.out.println("Going into 2nd move");
                               flag3=false;
                              }
                           }
                       else if(finalx==3)
                           {if(finaly==0||finaly==1||finaly==2)
                             {
                               flag4=false;
                             }
                           }
                       else if(finalx==4)
                            {if(finaly==0||finaly==1)
                              {
                               flag5=false;
                              }
                            }
                      }

                      if(flag1&&flag2&&flag3&&flag4&&flag5)
                      {
                        flag=true;
                      }  
                  }
               }
          if(result.equals(""))
          {
            outerloop3:
            for(i=7;i<16&&blackfinal==false;i++)
              {
                for(int j=0;j<16;j++)
                {
                  if(i==11)
                          { 
                            if(j==14||j==15){
                            flagblackreachsingle=false;
                            }
                          }  
                      else if(i==12)
                          {if(j==13||j==14||j==15){
                            flagblackreachsingle=false;
                            }
                          }
                      else if(i==13)
                          {
                            if(j==12||j==13||j==14||j==15)
                              {//System.out.println("Going into 2nd move");
                                flagblackreachsingle=false;
                              }
                          }
                      else if(i==14)
                           {if(j==11||j==12||j==13||j==14||j==15)
                              {
                                flagblackreachsingle=false;
                              }
                            }
                      else if(i==15)
                           {if(j==11||j==12||j==13||j==14||j==15){
                                flagblackreachsingle=false;
                           }
                          }
                  if(flagblackreachsingle==true)
                  {        
                  if(board[i][j]=='B')
                  {     System.out.println(" Current i and j="+i+" "+j);
                        if(i+1>=0  && i+1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i+1][j+1]=='.')
                            {   System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1);
                              blackfinal=true;
                              break outerloop3;
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i+2][j+2]=='.')
                              {System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i+2);
                               blackfinal=true;
                               break outerloop3;
                              }
                            }
                           }
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {   System.out.println(" Going into . 2");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i);
                              blackfinal=true;
                              break outerloop3;
                            }
                            else if(i>=0  && i<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i][j+2]=='.')
                              {System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i);
                               blackfinal=true;
                               break outerloop3;
                              }
                            }
                           }
                        if(i+1>=0 && i+1<16 && j>=0 && j<16)
                           {
                            if(board[i+1][j]=='.')
                            {  System.out.println(" Going into . 3");
                              result="E"+" "+j+","+i+" "+(j)+","+(i+1);
                              blackfinal=true;
                              break outerloop3;
                            }
                            else if(i+2>=0 && i+2<16 && j>=0 && j<16)
                            {
                              if(board[i+2][j]=='.')
                              {System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+(j)+","+(i+2);
                               blackfinal=true;
                               break outerloop3;
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i+1][j-1]=='.')
                            {   System.out.println(" Going into . 4");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1);
                              blackfinal=true;
                              break outerloop3;
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i+2][j-2]=='.')
                              {System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i+2);
                               blackfinal=true;
                               break outerloop3;
                              }
                            }
                           }
                        if(i-1>=0 && i-1 <16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {   System.out.println(" Going into . 5");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i-1);
                              blackfinal=true;
                              break outerloop3;
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i-2][j+2]=='.')
                              {System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i-2);
                               blackfinal=true;
                               break outerloop3;
                              }
                            }
                           }
                        if(i-1>=0 && i-1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i-1][j-1]=='.')
                            {   System.out.println(" Going into . 6");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1);
                              blackfinal=true;
                              break outerloop3;
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i-2][j-2]=='.')
                              {System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i-2);
                               blackfinal=true;
                               break outerloop3;
                              }
                            }
                           }
                        if(i-1>=0 && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            {   System.out.println(" Going into . 7");
                              result="E"+" "+j+","+i+" "+(j)+","+(i-1);
                              blackfinal=true;
                              break outerloop3;
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            {
                              if(board[i-2][j]=='.')
                              {System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+(j)+","+(i-2);
                               blackfinal=true;
                               break outerloop3;
                              }
                            }
                           }
                        if(i>= 0 && i<16 && j-1>=0 && j-1<16)
                           {
                            if(board[i][j-1]=='.')
                            {   System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i);
                              blackfinal=true;
                              break outerloop3;
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i][j-2]=='.')
                              { System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i);
                               blackfinal=true;
                               break outerloop3;
                              }
                            }
                           }
                  }
                 } 
                }
              }
            outerloop5:
            for(i=0;i<=6&&blackfinal==false;i++)
              {
                for(int j=7;j<16;j++)
                {
                  if(board[i][j]=='B')
                  {     System.out.println(" Current i and j="+i+" "+j);
                        if(i+1>=0  && i+1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i+1][j+1]=='.')
                            {   System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1);
                              blackfinal=true;
                              break outerloop5;
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i+2][j+2]=='.')
                              {System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i+2);
                               blackfinal=true;
                               break outerloop5;
                              }
                            }
                           }
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {   System.out.println(" Going into . 2");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i);
                              blackfinal=true;
                              break outerloop5;
                            }
                            else if(i>=0  && i<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i][j+2]=='.')
                              {System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i);
                               blackfinal=true;
                               break outerloop5;
                              }
                            }
                           }
                        if(i+1>=0 && i+1<16 && j>=0 && j<16)
                           {
                            if(board[i+1][j]=='.')
                            {  System.out.println(" Going into . 3");
                              result="E"+" "+j+","+i+" "+(j)+","+(i+1);
                              blackfinal=true;
                              break outerloop5;
                            }
                            else if(i+2>=0 && i+2<16 && j>=0 && j<16)
                            {
                              if(board[i+2][j]=='.')
                              {System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+(j)+","+(i+2);
                               blackfinal=true;
                               break outerloop5;
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i+1][j-1]=='.')
                            {   System.out.println(" Going into . 4");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1);
                              blackfinal=true;
                              break outerloop5;
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i+2][j-2]=='.')
                              {System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i+2);
                               blackfinal=true;
                               break outerloop5;
                              }
                            }
                           }
                        if(i-1>=0 && i-1 <16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {   System.out.println(" Going into . 5");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i-1);
                              blackfinal=true;
                              break outerloop5;
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i-2][j+2]=='.')
                              {System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i-2);
                               blackfinal=true;
                               break outerloop5;
                              }
                            }
                           }
                        if(i-1>=0 && i-1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i-1][j-1]=='.')
                            {   System.out.println(" Going into . 6");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1);
                              blackfinal=true;
                              break outerloop5;
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i-2][j-2]=='.')
                              {System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i-2);
                               blackfinal=true;
                               break outerloop5;
                              }
                            }
                           }
                        if(i-1>=0 && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            {   System.out.println(" Going into . 7");
                              result="E"+" "+j+","+i+" "+(j)+","+(i-1);
                              blackfinal=true;
                              break outerloop5;
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            {
                              if(board[i-2][j]=='.')
                              {System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+(j)+","+(i-2);
                               blackfinal=true;
                               break outerloop5;
                              }
                            }
                           }
                        if(i>= 0 && i<16 && j-1>=0 && j-1<16)
                           {
                            if(board[i][j-1]=='.')
                            {   System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i);
                              blackfinal=true;
                              break outerloop5;
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i][j-2]=='.')
                              { System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i);
                               blackfinal=true;
                               break outerloop5;
                              }
                            }
                           }
                  }
                }
              }
            outerloop6:
            for(i=6;i>=0&blackfinal==false;i--)
              {
                for(int j=6;j>=0;j--)
                {
                  if(board[i][j]=='B')
                  {     System.out.println(" Current i and j="+i+" "+j);
                        if(i+1>=0  && i+1<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i+1][j+1]=='.')
                            {   System.out.println(" Going into . 1");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i+1);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                  break outerloop6;
                            }
                            else if(i+2>=0  && i+2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i+2][j+2]=='.')
                              {System.out.println(" Going into Jump 1");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i+2);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!blackcamp.contains(temp))
                                  break outerloop6;
                              }
                            }
                           }
                        if(i>=0 && i<16 && j+1>=0 && j+1<16)
                           {
                            if(board[i][j+1]=='.')
                            {   System.out.println(" Going into . 2");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                  break outerloop6;
                            }
                            else if(i>=0  && i<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i][j+2]=='.')
                              {System.out.println(" Going into Jump 2");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!blackcamp.contains(temp))
                                  break outerloop6;
                              }
                            }
                           }
                        if(i+1>=0 && i+1<16 && j>=0 && j<16)
                           {
                            if(board[i+1][j]=='.')
                            {  System.out.println(" Going into . 3");
                              result="E"+" "+j+","+i+" "+(j)+","+(i+1);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                  break outerloop6;
                            }
                            else if(i+2>=0 && i+2<16 && j>=0 && j<16)
                            {
                              if(board[i+2][j]=='.')
                              {System.out.println(" Going into Jump 3");
                               result="J"+" "+j+","+i+" "+(j)+","+(i+2);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                  break outerloop6;
                              }
                            }
                           }
                        if(i+1>=0 && i+1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i+1][j-1]=='.')
                            {   System.out.println(" Going into . 4");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i+1);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                  break outerloop6;
                            }
                            else if(i+2>=0  && i+2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i+2][j-2]=='.')
                              {System.out.println(" Going into Jump 4");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i+2);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!blackcamp.contains(temp))
                                  break outerloop6;
                              }
                            }
                           }
                        if(i-1>=0 && i-1 <16 && j+1>=0 && j+1<16)
                           {
                            if(board[i-1][j+1]=='.')
                            {   System.out.println(" Going into . 5");
                              result="E"+" "+j+","+i+" "+(j+1)+","+(i-1);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                  break outerloop6;
                            }
                            else if(i-2>=0  && i-2<16 && j+2>=0 && j+2<16)
                            {
                              if(board[i-2][j+2]=='.')
                              {System.out.println(" Going into Jump 5");
                               result="J"+" "+j+","+i+" "+(j+2)+","+(i-2);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!blackcamp.contains(temp))
                                  break outerloop6;
                              }
                            }
                           }
                        if(i-1>=0 && i-1 <16 && j-1>=0 && j-1<16)
                           {
                            if(board[i-1][j-1]=='.')
                            {   System.out.println(" Going into . 6");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i-1);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                  break outerloop6;
                            }
                            else if(i-2>=0  && i-2<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i-2][j-2]=='.')
                              {System.out.println(" Going into Jump 6");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i-2);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!blackcamp.contains(temp))
                                  break outerloop6;
                              }
                            }
                           }
                        if(i-1>=0 && i-1<16 && j>=0 && j<16)
                           {
                            if(board[i-1][j]=='.')
                            {   System.out.println(" Going into . 7");
                              result="E"+" "+j+","+i+" "+(j)+","+(i-1);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                  break outerloop6;
                            }
                            else if(i-2>=0  && i-2<16 && j>=0 && j<16)
                            {
                              if(board[i-2][j]=='.')
                              {System.out.println(" Going into Jump 7");
                               result="J"+" "+j+","+i+" "+(j)+","+(i-2);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!blackcamp.contains(temp))
                                  break outerloop6;
                              }
                            }
                           }
                        if(i>= 0 && i<16 && j-1>=0 && j-1<16)
                           {
                            if(board[i][j-1]=='.')
                            {   System.out.println(" Going into . 8");
                              result="E"+" "+j+","+i+" "+(j-1)+","+(i);
                              temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                              if(!blackcamp.contains(temp))
                                  break outerloop6;
                            }
                            else if(i>=0  && i<16 && j-2>=0 && j-2<16)
                            {
                              if(board[i][j-2]=='.')
                              { System.out.println(" Going into Jump 8");
                               result="J"+" "+j+","+i+" "+(j-2)+","+(i);
                               temp=result.substring(result.lastIndexOf(" ")+1,result.length());
                               if(!blackcamp.contains(temp))
                                  break outerloop6;
                              }
                            }
                           }
                  }
                }
              }
          }
       }
     }

     else
       {
         System.out.println("NOT SINGLE");

          if(myColour.equals("WHITE"))
            { 
             result=minimax("WHITE",board);
             //validmoves=validmoveswhite(board);      
            }
          else
            {
             result=minimax("BLACK",board);
             //validmoves=validmovesblack(board);    
            }
       } 
       endcode:
       System.out.println("RESULT= "+result);
       //System.out.println("Resultfinal =");
       /*for(int kn=0;kn<resultFinal.length;kn++)
           System.out.println(resultFinal[kn]);*/
       int lenwhite=validmoves.size();  
       System.out.println("Valid moves list for white");
       for(int kn=0;kn<lenwhite;kn++)
           System.out.println(validmoves.get(kn));  
       try{ //modify the write loop to store multiple jumps
           FileWriter fw=new FileWriter("output.txt");
           resultFinal=result.split("\\.");
           int resultfinallen=resultFinal.length;
           int resulti;
           for(resulti=0;resulti<resultfinallen-1;resulti++)
               {
                 fw.write(resultFinal[resulti]);
                 fw.write("\n");
               }
           fw.write(resultFinal[resulti]);   
           fw.close();
           }
        catch(IOException e)
        {}
        /*for(int pnnr=0;pnnr<16;pnnr++)
            {
              for(int pnnc=0;pnnc<16;pnnc++)
                  {
                    System.out.print(visited[pnnr][pnnc]);
                  }
                  System.out.println();
            }*/
        long timeElapsed= System.nanoTime()-startTime;
        System.out.println("Total time in nanoseconds= "+timeElapsed);  
        System.out.println("Total time in milliseconds= "+timeElapsed/1000000);
       /*System.out.println("length"+s[0].length());
       for(int j=0;j<s[0].length();j++)
           System.out.println(s[0].charAt(j));*/
     }
   
}

/*public class Point {
    protected int dimension;
    protected ArrayList<Integer> coordinates;

    public Point(int[] coordinates){
        this.coordinates = convertArray(coordinates);
        dimension = coordinates.length;
    }

    private ArrayList<Integer> convertArray(int[] array){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++){
            newArray.add(array[i]);
        }
        return newArray;
    }

    @Override
    public int hashCode(){
        // Some arbitrary quick hash
        return coordinates.get(0);
    }

    @Override
    public boolean equals(Object o){
        Point p = (Point)o;
        if(dimension != p.coordinates.size())
            return false;
        for(int i = 0; i < p.coordinates.size(); i++){
            if(coordinates.get(i) != p.coordinates.get(i)){
                return false;
            }
        }
        return true;
    }
} */
class minimaxpoint
{
  public String result;
  public double score;
  minimaxpoint()
  {

  }
  minimaxpoint(String result,double score)
  {
    this.result=result;
    this.score=score;
  }
}
