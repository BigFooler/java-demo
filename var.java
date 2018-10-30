class VarDemo {
    /**
     * @param  byte/short/int/long  
     * @param args
     */
    public static void main(String[] args) {
    //    int z = getResult(2, 4);
    //     System.out.print(z);
        int[] arr = {1,11,36,4,11};
        printArr(arr); 
        getSort(arr);
        printArr(arr);
    }

    /**
     * 
     * @param x
     * @param y
     * @return  
     */
    public static int getResult(int x, int y) {
        return x*y;
    }

    public static void printArr(int[] arr) {
        for(int x = 0; x < arr.length; x ++) {
            System.out.println(arr[x]);
        }
    }
    public static void getSort(int[] arr) {
        for (int x = 0; x < arr.length-1; x ++) {
            for (int y = x+1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    arr[y] = arr[x] + arr[y];
                    arr[x] = arr[y] - arr[x];
                    arr[y] = arr[y] - arr[x];
                }
            }
        }
        
    }
}