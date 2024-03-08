package tareacd4;

public class CC {
    public String nombre;
    public String cuenta;
    public double saldo;
    public double interes;

    public CC()
    {
    }
    public CC(String nombre, String cuenta, double saldo, double interes)
    {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.interes = interes;
    }
    public double estado()
    {
        return saldo;
    }
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}