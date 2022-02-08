package activities;

public class Activity2 {
    public static void main(String[] args){
        int sum=0;
        int total=30;
        int data[]={10,77,10,54,-11,10};
        for(int i =0;i<data.length;i++){
            if(data[i]==10){
                sum =sum+data[i];
            }

        }
        sum(sum,total);
        System.out.println("Sum is equal to:"+ sum);
    }
    public static boolean sum(int sum, int total){
        if (sum==total){
            return true;
        }
        else{
            return false;
        }

    }
}
