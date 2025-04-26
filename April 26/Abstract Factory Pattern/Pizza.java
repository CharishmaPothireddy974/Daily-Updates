public abstract class Pizza{
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies veggies[];
    Pepperoni pepperoni;
    Clams clams;
    
    abstract void prepare();
    
    void bake(){
        System.out.println("Baking "+name);
    }
    
    void cut(){
        System.out.println("Cutting "+name);
    }
    
    void box(){
        System.out.println("Boxing "+name);
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String toString(){
        return "Name: "+name+
            "\nDough: "+dough+
            "\nSauce: "+sauce+
            "\nCheese: "+cheese+
            "\nVeggies: "+veggies+
            "\nPepperoni: "+pepperoni+
            "\nClams: "+clams;
    }
}
