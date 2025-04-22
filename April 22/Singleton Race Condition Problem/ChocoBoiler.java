class ChocoBoiler {
    private static volatile ChocoBoiler myInstance = null;

    private ChocoBoiler() {
        System.out.println("Instance created by " + Thread.currentThread().getName());
    }

    public static ChocoBoiler getInstance() {
        if (myInstance == null) {
            synchronized (ChocoBoiler.class) {
                if (myInstance == null) {
                    myInstance = new ChocoBoiler();
                }
            }
        }
        return myInstance;
    }
}
