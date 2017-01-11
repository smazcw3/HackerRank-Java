class FoodFactory {
	public Food getFood(String order) {
		Object food;
		if(order.equals("cake")){
			food = new Cake();	
		}
		else{
			food = new Pizza();	
		}
		return (Food) food;		
		}
}
