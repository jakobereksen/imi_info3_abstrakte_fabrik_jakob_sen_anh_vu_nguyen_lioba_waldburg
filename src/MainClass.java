
public class MainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			IAbstrakteFabrik fabrik1 = new KonkreteFabrik1();
			IAbstrakteFabrik fabrik2 = new KonkreteFabrik2();
			
			Client client = new Client();
			Client client2 = new Client();
			
			client.setFabrik(fabrik1);
			client2.setFabrik(fabrik2);
			
			client.fabrik.erzeugeProduktA();
			client.fabrik.erzeugeProduktB();
			
			client2.fabrik.erzeugeProduktA();
			client2.fabrik.erzeugeProduktB();
			
		
		}
}
