public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza(){
        System.out.println("Creating Chicago Style Veggie Pizza");
    }
    
    @Override
    public void cut(){
        System.out.println("Cutting the pizza into square Slices");
    }
}
