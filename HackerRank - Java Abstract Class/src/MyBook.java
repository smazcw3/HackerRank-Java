class MyBook extends Book {
	
	private String titleName; 
	
	public MyBook(){
		this.titleName = "";
	}

	public void setTitle(String title) {
		this.titleName = title;
	}

	public String getTitle() {
		return this.titleName;
	}
}
