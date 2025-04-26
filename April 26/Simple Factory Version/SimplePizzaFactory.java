public class SimplePizzaFactory{
    public Pizza createPizza(String type){
        if (type.equals("cheese")){
            pizza=new CheesePizza();
        }
        else if (type.equals("veggie")){
            pizza=new VeggiePizza();
        }
        else{
            return null;
        }
    }
}
