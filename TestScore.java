public class TestScore {
	public static void main (String args[]){
		Score monScore1 = new Score();
		Score monScore = new Score ("Pierre");
		//monScore.setScore(10);
		monScore.ajoute(20);
		monScore.scoMax=200;
		monScore.affiche();
		
		System.out.print ("\nLe score max vaut : "+monScore.scoMax);
	}
}