package MethodTask;

public class ArrAvarageElementDelete {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7,8};
        int[] myArr=averageElementDeleteArr(intArr,3);
        for (int i=0;i<myArr.length;i++){
            System.out.println(myArr[i]);
        }
        System.out.println();


    }


public static int[] averageElementDeleteArr(int[] arr,int element){
    int[] newArr=new int[arr.length-1];
    for (int i=0,k=0;i<arr.length;i++){
        if(element!=arr[i] ){
            newArr[k]=arr[i];
            k++;
        }


    }
    return newArr;
}


}

