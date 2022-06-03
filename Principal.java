import java.util.Scanner;
public class Principal

{
	public static void main(String[] args) 
	
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual tipo de conta deseja abrir?");
		System.out.println("1--Conta Poupan�a(CP)\n2--Conta Corrente(CC)");
		int tipoconta = scan.nextInt();
		
		if (tipoconta == 1) 
		{
			System.out.println("Informe o saldo.");
			double saldo = scan.nextDouble();
			System.out.println("Informe o limite da conta poupan�a.");
			double limitecp = scan.nextDouble();
			System.out.println("Informe a taxa de rendimento da CP.");
			double taxacp = scan.nextDouble();
			
			ContaPoupanca ContaPoup = new ContaPoupanca();
			ContaPoup.setSaldo(saldo);
			ContaPoup.setLimitecp(limitecp);
			ContaPoup.atualizarContaPoupanca();
			
			System.out.println("Seu limite atual �: "+ContaPoup.getLimitecp()+"R$");
			System.out.println("1--Sacar\n2--Depositar\n3--Sair\n");
			int op = scan.nextInt();
			while (op == 1 || op == 2) 
			{
				
			switch (op) 
			{
				case 1:
					System.out.println("Qual valor do saque?");
					double saque = scan.nextDouble();
					ContaPoup.sacar(saque);
					System.out.println("Seu saldo atual �: "+ContaPoup.getSaldo()+"R$");
					
					System.out.println("1--Sacar\n2--Depositar\n3--Sair\n");
					int aux = scan.nextInt();
					op = aux;
					break;
				case 2:
					System.out.println("Qual valor do dep�sito?");
					double deposi = scan.nextDouble();
					ContaPoup.depositar(deposi);
					System.out.println("Seu saldo atual �: "+ContaPoup.getSaldo()+"R$");
					
					System.out.println("1--Sacar\n2--Depositar\n3--Sair\n");
					int aux1 = scan.nextInt();
					op = aux1;
					break;
				case 3: 
					System.out.println("1--Sacar\n2--Depositar\n3--Sair\n");
					int aux2 = scan.nextInt();
					op = aux2;
					System.out.println("Voc� saiu!\n");
					break;
					
			}
			}
			
			
		}else if (tipoconta == 2) 
		{
			System.out.println("Informe o saldo.");
			double saldo = scan.nextDouble();
			System.out.println("Informe o limite da conta corrente.");
			double limitecc = scan.nextDouble();
			System.out.println("Informe a taxa de rendimento da CC.");
			double taxacc = scan.nextDouble();
			
			ContaCorrente ContaCorren = new ContaCorrente();
			ContaCorren.setSaldo(saldo);
			ContaCorren.setLimitecc(limitecc);
			ContaCorren.atualizarContaCorrente(taxacc);
			
			System.out.println("Seu limite atual �: "+ContaCorren.getLimitecc()+"R$");
			System.out.println("1--Sacar\n2--Depositar\n3--Sair\n");
			int op = scan.nextInt();
			while ( op == 1 || op == 2 ) 
			{
				
			switch (op) 
			{
				case 1:
					System.out.println("Qual valor do saque?");
					double saque = scan.nextDouble();
					ContaCorren.sacar(saque);
					System.out.println("Seu saldo atual �: "+ContaCorren.getSaldo()+"R$");
					
					System.out.println("1--Sacar\n2--Depositar\n3--Sair\n");
					int aux = scan.nextInt();
					op = aux;
					break;
				case 2:
					System.out.println("Qual valor do dep�sito?");
					double valordeposito = scan.nextDouble();
					ContaCorren.depositar(valordeposito);
					System.out.println("Seu saldo atual �: "+ContaCorren.getSaldo()+"R$");
					
					System.out.println("1--Sacar\n2--Depositar\n3--Sair\n");
					int aux1 = scan.nextInt();
					op = aux1;
					break;
				case 3: 
					System.out.println("1--Sacar\n2--Depositar\n3--Sair\n");
					int aux2 = scan.nextInt();
					op = aux2;
					System.out.println("Voc� saiu!\n");
					break;
			}		
			}
		}else 
		{
			System.out.println("Conta inv�lida.");
		}
		
		scan.close();
		
	}

}
