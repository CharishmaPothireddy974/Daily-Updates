public class Main{
    public static void main(String[] args){
        PizzaStore nyStore=new NYPizzaStore();
        nyStore.orderPizza("cheese");
        System.out.println("------");
        
        PizzaStore chicagoStore=new ChicagoPizzaStore();
        chicagoStore.orderPizza("veggie");
    }
}
