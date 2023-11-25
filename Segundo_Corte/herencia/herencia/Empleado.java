package herencia;

public class Empleado extends Person
{
		private int idEmpleado;
		private double Sueldo;
		private static int contadorEmpleado;

	public Empleado(String nombre, double Sueldo)
	{
		super(nombre);
		this.idEmpleado = ++Empleado.contadorEmpleado;
		this.Sueldo = Sueldo;
	}

	public int getIdEmpleado()
	{
		return idEmpleado;
	}

	public double getSueldo()
	{
		return Sueldo;
	}

	
	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado = idEmpleado;
	}

	public void setSueldo(double Sueldo)
	{
		this.Sueldo = Sueldo;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Empleado{idEmpleado=").append(idEmpleado);
		sb.append(", Sueldo=").append(this.Sueldo);
		sb.append(",").append(super.toString());
		sb.append('}');
		return sb.toString();
	}

}
