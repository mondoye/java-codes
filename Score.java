public class Score {
	
	public String nom;
	int scoMax;
	private int leScore;
	
	public Score(){
		nom = "inconnu";
		//this.leScore = 0;
		//scoMax = 200;
		
	}	
	
	public Score(String nom){
		this.nom = nom;
		this.leScore = 0;
		scoMax = 200;
	}
	
	public int getScore(){
		return this.leScore;
	}
	
	public void setScore(int sco){
		this.leScore = sco;
	}
	
	public void ajoute (int points){
		if (this.leScore < scoMax){
			this.leScore += points;
		}
		else {
			System.out.print("Ajout impossible \n");
		}
	}
	
	public void affiche (){
		System.out.print("Le score vaut "+getScore());
	}
}