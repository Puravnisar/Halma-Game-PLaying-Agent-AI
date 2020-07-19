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