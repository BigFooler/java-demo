class VarDemo {
    /**
     * @param  byte/short/int/long  
     * @param args
     */
    public static void main(String[] args) {
       int z = getResult(2, 4);
        System.out.print(z);
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
}