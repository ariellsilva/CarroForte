public class CarroGuerra {
    
	public String nome;
	public Boolean acelerar;
	public Boolean desacelerar;
	public Boolean analisar;
	public Boolean mirar;
	public Boolean atirar;
	
	 public CarroGuerra( String nome ) {
		 this.nome = nome;
		 this.acelerar = true;
		 this.desacelerar = true;
		 this.analisar = true;
		 this.mirar = true;
		 this.atirar = true;
	 }
	 
	 public String getNome() {
		 return nome;
	 }
	 public Boolean getAcelerar() {
		 return acelerar;
	 }
	 public Boolean getDesacelerar() {
		 return desacelerar;
	 }
	 public Boolean getAnalisar() {
		 return analisar;
	 }
	 public Boolean getMirar() {
		 return mirar;
	 }
	 public Boolean getAtirar() {
		 return atirar;
	 }
	 
	 public void info() {
		 System.out.println("ATENÇÃO SOLDADOS!!");
		 System.out.println("INIMIGO À VISTA");
		 System.out.println("--------------------");
		 
		 System.out.printf("Nome:%s%n", this.nome);
		 System.out.printf("Acelear:.......%s%n", this.acelerar ? "Sim" : "Nao");
		 System.out.printf("Desacelerar:......%s%n", this.desacelerar ? "Sim" : "Nao");
		 System.out.printf("Analisar:......%s%n", this.analisar ? "Sim" : "Nao");
		 System.out.printf("Mirar:.......%s%n", this.mirar ? "Sim" : "Nao");
		 System.out.printf("Atirar:....%s%n", this.atirar ? "Sim" : "Nao");
		 
		 System.out.println("----------------------");
		 System.out.println("Alvo iliminado!");
	 }

}
