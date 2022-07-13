import java.util.*;

public class prob_b{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int tempn=n;
        int count=0;
        int finalCount=0;
        while(tempn!=1){
            temp=tempn;
            while(temp>0){
                if(isPrime(temp)){
                    count++;
                    //System.out.println(temp);
                }
                temp--;
            }
            //System.out.println("--");
            finalCount++;
            tempn=tempn-count;
            count=0;
        }
        System.out.print(finalCount+1);
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            return false;
        }else{
            return true;
        }
    }
}