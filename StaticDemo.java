class StaticDemo {
    public static void main(String[] args) {
       int[] arr = {3,2,4,1};
       int max = 0;
       for(int x = 1; x < arr.length; x++) {
           if (arr[x] > arr[max]){
               max = x;
           }
       }
    }
}

class Person {
    String name;
    static String country = "CN";
    public static void show() {
        System.out.println(country);
    }
}