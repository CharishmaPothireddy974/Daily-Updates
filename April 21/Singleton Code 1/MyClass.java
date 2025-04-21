class MyClass{
    private static MyClass myInstance;
    private MyClass(){
        System.out.println("Singleton Object created...");
    }
    
    public static MyClass getInstance(){
        if (myInstance==null) myInstance=new MyClass();
        return myInstance;
    }
}
