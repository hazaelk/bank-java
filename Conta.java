
public class Conta 
{
	//criar variavel saldo
	private double saldo;
	//conta aberta SEM parametro passado
	public Conta() 
	{
		this.saldo = 0;
	}
	//COM parametro passado
	public Conta(double saldo)
	{
		this.saldo = saldo;
	}
	//gets e sets
	public double getSaldo() 
	{
		return saldo;
	}

	public void setSaldo(double saldo) 
	{
		this.saldo = saldo;
	}
	//m�todo depositar
	public void depositar(double valordeposito) 
	{
		System.out.println("Seu dep�sito foi de: " + valordeposito + "R$");
		this.saldo = saldo + valordeposito;
		
	}
	//m�todo sacar
	public void sacar(double valorsacado) 
	{
		System.out.println("Seu saque foi de: "+ valorsacado + "R$");
		this.saldo = saldo - valorsacado;
		
	}
	//reajuste do saldo com a taxa
	public void atualizarSaldo (double taxa) 
	{
		double aux = this.saldo;
		System.out.println("Saldo anterior:" + aux +"R$");
		System.out.println("Reajuste de: "+ (aux * taxa) +"R$");
		aux += aux * taxa;
		this.saldo = aux;
		System.out.println("Saldo atual:" + aux + "R$");
	}
}
