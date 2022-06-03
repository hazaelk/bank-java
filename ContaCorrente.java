
public class ContaCorrente extends Conta 
{
	private double limitecc;
	//CC sem e com parametros
	public ContaCorrente() 
	{
		this.limitecc = 0;
		this.setSaldo(0);
	}
	public ContaCorrente(double saldo, double limitecc) 
	{
		this.limitecc = limitecc;
		this.setSaldo(saldo);
	}
	//gets e sets
	public double getLimitecc() 
	{
		return limitecc;
	}
	public void setLimitecc(double limitecc) 
	{
		this.limitecc = limitecc;
	}
	//atualizar com taxa
	public void atualizarContaCorrente(double taxacc) 
	{
		double auxCC = this.getSaldo();
		System.out.println("Reajuste de: " + (taxacc*auxCC*2) + "R$");
		auxCC += auxCC * taxacc * 2;
		this.setSaldo(auxCC);
		System.out.println("Saldo atual:" + auxCC + "R$");
	}
}
