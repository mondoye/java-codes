public class JeuDe{
	public static void main (String args[]){
		int lanceur1=0, lanceur2 =0;
		Score sco = new Score ();
		Score joueur1 = new Score ("Sidi");
		//sco.scoMax = 30;
		Score joueur2 = new Score ("Rama");
		De jeu = new De();
		
		for (int m = 0; m < 5; m++){
			System.out.println ("Lancer : "+(m+1));
			
			lanceur1 = jeu.tirage();
			joueur1.ajoute(lanceur1);
			System.out.println(joueur1.nom+" a "+lanceur1);		
			lanceur2 = jeu.tirage();
			System.out.println(joueur2.nom+" a "+lanceur2);	
			joueur2.ajoute(lanceur2);
			
			System.out.println("");
			sco.scoMax = 21;
			if (joueur1.getScore()>=sco.scoMax){
				System.out.println(joueur1.nom+" a gagne");break;
			}
			else if (joueur2.getScore()>=sco.scoMax){
				System.out.println(joueur2.nom+" a gagne");break;
			}
		}
		System.out.print("Le score total de "+joueur1.nom+" est de "+joueur1.getScore()+"\n");
		System.out.print("Le score total de "+joueur2.nom+" est de "+joueur2.getScore()+"\n");
		System.out.println("");
		
		if (joueur1.getScore()>joueur2.getScore()){
			System.out.println(joueur1.nom+" a gagne");
		}
		
		else if (joueur1.getScore()==joueur2.getScore()){
			System.out.println("Egalite");
		}
		
		else {
			System.out.println(joueur2.nom+" a gagne");
		}
		
	 }
}