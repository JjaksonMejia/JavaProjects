package herencia;

import java.util.Date;
public class Cliente extends Person
{
	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorCliente;

	public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String dirección)
	{
		super(nombre, genero, edad, dirección);
		this.idCliente = ++Cliente.contadorCliente;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}

	public int getIdCliente()
	{
		return idCliente;
	}

	public Date getFechaRegistro()
	{
		return fechaRegistro;
	}
	public boolean isVip(){
		return vip;
	}
	public void setVip(boolean vip){
		this.vip = vip;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Cliente{idCliente=").append(this.idCliente);
		sb.append(", fechaRegistro=").append(this.fechaRegistro);
		sb.append(", vip=").append(vip);
		sb.append(",").append(super.toString());
		sb.append('}');
		return sb.toString();
	}
	
	
}
