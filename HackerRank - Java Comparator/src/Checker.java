import java.util.Comparator;

class Checker implements Comparator<Player> {
	@Override
	public int compare(Player o1, Player o2) {
		if(o1.score == o2.score){
			return o1.name.compareTo(o2.name);
		}
		else if(o1.score > o2.score){
			return -1;
		}
		else{
			return 1;
		}
	}
}
