public class Experimental {
	private int id;
	private String exp;
	private Long uid;

	public Experimental(int id, String exp) {
		this.id = id;
		this.exp = exp;
	}

	public int getId() {
		return id;
	}

	public String getEXp() {
		return exp;
	}
	
	

	@Override
	public String toString() {
		return "Experimental (" + 
			"id: " + id + 
			"exp: " + exp +
			"UID: " + uid +
			")";
	}
}
