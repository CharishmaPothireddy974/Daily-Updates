public class Main{
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        
        Pizza pizza1=nyStore.orderPizza("cheese");
        System.out.println("Ordered: "+pizza1);
        
        Pizza pizza2=nyStore.orderPizza("veggie");
        System.out.println("Ordered: "+pizza2);
    }
}
