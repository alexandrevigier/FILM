public class Film{
	private String titre;
	private double moyenneCritiques;
	private double moyenneInternautes;

	public Film (String titre, double moyenneCritiques, double moyenneInternautes)
	{
		this.titre = titre;
		this.moyenneCritiques = moyenneCritiques;
		this.moyenneInternautes = moyenneInternautes;
	}
	public String gettitre(){
		return this.titre;
	}
	public double getmoyenneCritiques(){
		return this.moyenneCritiques;
	}
	public double getmoyenneInternautes(){
		return this.moyenneInternautes;
	}
	private double moyenneGlobale(){
		return ((this.moyenneCritiques*2)+(this.moyenneInternautes*3))/5;
	}
	Film.best(){
		if (f1.best(f2)){
		System.out.println(f1+" est un meilleur film que "+f2);
	}else{
		System.out.println(f2+" est un meilleur film que "+f1);
	}
	}
	public String toString(){
		String resultat = this.titre+" "+moyenneGlobale()+"/20";
		return resultat;
	}


	
}