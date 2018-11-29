class Test extends Thread{
    public void run(){
        for(int x = 0; x < 100; x ++) {
            System.out.println(1);
        }
    }
}
class ThreadDemo {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.start();
        t2.start();
        for(int x = 0; x < 60; x ++) {
            System.out.println(2);
        }
    }
}