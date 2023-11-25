package herencia;

public class Person
{
	protected String nombre;
	protected char genero;
	protected int edad;
	protected String dirección;

	public Person()
	{
	}

	public Person(String nombre)
	{
		this.nombre = nombre;
	}

	public Person(String nombre, char genero, int edad, String dirección)
	{
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.dirección = dirección;
	}

	public String getNombre()
	{
		return nombre;
	}

	public char getGenero()
	{
		return genero;
	}

	public int getEdad()
	{
		return edad;
	}

	public String getDirección()
	{
		return dirección;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setGenero(char genero)
	{
		this.genero = genero;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public void setDirección(String dirección)
	{
		this.dirección = dirección;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Person{");
		sb.append("nombre=").append(nombre);
		sb.append(", genero=").append(genero);
		sb.append(", edad=").append(edad);
		sb.append(", direcci\u00f3n=").append(dirección);
		sb.append('}');
		return sb.toString();
	}
	
	
}

