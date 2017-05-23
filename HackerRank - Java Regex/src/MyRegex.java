class MyRegex {
	String delimiter = ".";
	String zer_To_255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])"; 
	public String pattern = zer_To_255 + delimiter + zer_To_255 + delimiter + zer_To_255 + delimiter + zer_To_255;
}
