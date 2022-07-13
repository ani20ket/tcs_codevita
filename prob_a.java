import java.util.*;
import java.lang.*;

public class prob_a {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int pos=1;
        int snakes[]=new int[20];
        int count=0;
        String arr[]=new String[100];
        for(int i=0;i<100;i++){
            arr[i]=in.next();
        }
        while(true){
            int temp=in.nextInt();
            pos=pos+temp;
            if(arr[pos].charAt(1)=='('){
                snakes[count]=pos;
                if(arr[pos].charAt(2)=='S'){
                    pos=1;
                }else{
                    if(arr[pos].charAt(3)!=')'){
                        String tempPos=arr[pos].charAt(2)+""+arr[pos].charAt(3);
                        pos=Integer.parseInt(tempPos);
                    }
                    else{
                        String tempPos=arr[pos].charAt(2)+"";
                        pos=Integer.parseInt(tempPos);
                    }
                }
            }
            if(temp=='\n'){
                break;
            }
        }
        if(pos==100){
            System.out.print("Possible ");
        }else{
            System.out.print("Not Possible ");
        }
        for(int i=0;i<count;i++){
            System.out.print(" "+snakes[i]);
        }
    }
}