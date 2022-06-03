
public class ContaPoupanca extends Conta 
{	private double taxacp;
	private double limitecp;
	//sem e com parametros passados
	public ContaPoupanca() 
	{
		this.limitecp = 0;
		this.setSaldo(0);
	}
	public ContaPoupanca(double saldo, double limitecp) 
	{
		this.limitecp = limitecp;
		this.setSaldo(saldo);
	}
	//gets e sets
	public double getLimitecp() 
	{
		return limitecp;
	}
	public void setLimitecp(double limitecp) 
	{
		this.limitecp = limitecp;
	}
	//atualizar com taxa
	public void atualizarContaPoupanca() 
	{
		double auxCP = this.getSaldo();
		System.out.println("Reajuste de: " + (this.taxacp*auxCP*3) + "R$");
		auxCP += auxCP * this.taxacp * 3;
		this.setSaldo(auxCP);
		System.out.println("Saldo atual:" + auxCP + "R$");
	}
}
