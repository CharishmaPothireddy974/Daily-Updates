public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough(){
        return new ThinCrustDough();
    }
    
    public Sauce createSauce(){
        return new MarinaraSauce();
    }
    
    public Cheese createCheese(){
        return new ReggianoCheese();
    }
    
    public Veggies[] createVeggies(){
        Veggies veggies[]={
            new Garlic()
        };
        return veggies;
    }
    
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }
    
    public Clams createClams(){
        return new FreshClams();
    }
}
