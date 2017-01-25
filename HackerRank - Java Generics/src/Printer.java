class Printer{
	public <E> void printArray(E[] iArray) {
		for(E element : iArray){
			System.out.println(element);
		}
	}
}
