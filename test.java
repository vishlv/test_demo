class test{
    public static void main(String[] args) {
        System.out.println("Hello welcome to finding maximum of an given array");
        int[] A = {5,7,12,34,67,87,1};
        int max=A[0];
        for (int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        int min=A[0];
        for (int i=0;i<A.length;i++){
            if(A[i]<min){
                min=A[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}

    
