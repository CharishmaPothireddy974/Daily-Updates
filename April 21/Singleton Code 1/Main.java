class Main{
    public static void main(String[] args){
        System.out.println("Inside Main");
        MyClass obj1=MyClass.getInstance();
        MyClass obj2=MyClass.getInstance();
        
        System.out.println(obj1==obj2);
    }
}
