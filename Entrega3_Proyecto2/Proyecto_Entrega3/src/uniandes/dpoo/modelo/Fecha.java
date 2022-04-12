package uniandes.dpoo.modelo;

public class Fecha 

{
	private int dia;
	
	private int mes;
	
	private int a�o;
	
	public Fecha(int pdia,int pmes,int pa�o)
	{
		this.dia = pdia;
		this.mes = pmes;
		this.a�o = pa�o;
	}
	
	public int getdia()
	{
		return dia;
	}
	
	public int getmes()
	{
		return mes;
	}
	
	public int geta�o()
	{
		return a�o;
	}
	
	public String toString()
	{
		return dia + "/" + mes + "/" + a�o;
	}
}
