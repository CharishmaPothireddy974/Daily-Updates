class MyClass{
    private static class Singleton{
        static{
            System.out.println("Called...");
            System.out.println("Created by "+Thread.currentThread().getName());
        }
        private static final MyClass myInstance=new MyClass();
    }
    public static MyClass getInstance(){
        return Singleton.myInstance;
    }
}
