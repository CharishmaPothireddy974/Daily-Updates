public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        System.out.println("Creating Chicago Style Cheese Pizza");
    }
    
    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
