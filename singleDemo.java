class Student{
    private int age;
    private Student(){};
    private static Student s = new Student();
    public static Student getInstance(){
        return s;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}