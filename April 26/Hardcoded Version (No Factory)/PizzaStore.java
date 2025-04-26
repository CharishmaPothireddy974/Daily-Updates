public class PizzaStore{
    public Pizza orderPizza(String type){
        Pizza pizza;
        
        if (type.equals("cheese")){
            pizza=new CheesePizza();
        }
        else if (type.equals("veggie")){
            pizza=new VeggiePizza();
        }
        else{
            return null;
        }
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
}
