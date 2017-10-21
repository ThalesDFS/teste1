import java.util.Random;
import java.util.Scanner; 
public class Radar2 {
	public static void main(String[] args) {
		int x = 0;
		int mol, mol2;
		char iniciar;
		boolean continuar = true;
		Radar teste = new Radar();
		Random random = new Random();
		Random random2 = new Random();
		Random random3 = new Random();
		Random random4 = new Random();
		teste.velocidade = random.nextInt(1000);
		teste.DistanciaAeronave = random2.nextInt(500000);
		mol = random3.nextInt(5);
		if (mol == 0){
			teste.modeloAeronave = "VC-1A";
			teste.tamanhoAeronave = "Médio Porte (Comercial)";
		}else{
			if (mol == 1){
				teste.modeloAeronave = "Embraer 190";
				teste.tamanhoAeronave = "Médio Porte (Comercial)";
			}else{
				if (mol == 2){
					teste.modeloAeronave = "Boeing 777";
					teste.tamanhoAeronave = "Grande Porte (Comercial)";
				}else{
					if (mol == 3){
						teste.modeloAeronave = "F-18 Super Hornet";
						teste.tamanhoAeronave = "Jato (Militar)/Pequeno Porte";
					}else{
						if (mol == 4){
							teste.modeloAeronave = "C-130 Hercules";
							teste.tamanhoAeronave = "Cargueiro (Militar)/Grande Porte";
						}
					}
				}
			}
		}		
		Scanner in = new Scanner(System.in);
		System.out.print("Digite 'x' para iniciar o radar"); 
		while(continuar){ 
            iniciar = in.next().charAt(0); //assinatura do método, 0 pode ser posição 
            if(iniciar=='x'){ 
                continuar=false; 
                System.out.println("Radar sendo iniciado....\n Detectando aeronave mais proxima...."); 
            }else{ 
                System.out.print("Digite 'x' para iniciar o radar"); 
            }
		}
			while (x < 100000){
				x = x + 1;
				System.out.print ("Progresso (0 - 100000): "+x+"%");
				System.out.print ("\nCalculando rotas/" );
			}
			System.out.print ("Scaneamento Concluido \n \nDetalhes da aeronave mais proxima:\nDistancia: "+teste.DistanciaAeronave+" Metros\nVelocidade: "+teste.velocidade+" KM/H\nModelo: "+teste.modeloAeronave+" \nTamanho/Tipo: "+teste.tamanhoAeronave);
			
	}
}

		
	
