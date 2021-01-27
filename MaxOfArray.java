import java.io.*;
import java.util.*;
public class MaxOfArray {
    public static void main(String[]args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        int max=maxofarr(a,0);
        System.out.println(max);
    }
    public static int maxofarr(int []a,int index){
        if(index==a.length-1){
            return a[index];
        }
        int misa=maxofarr(a,index+1);
        if(misa>a[index]){
            return misa;
        }else{
            return a[index];
        }
    }
}
