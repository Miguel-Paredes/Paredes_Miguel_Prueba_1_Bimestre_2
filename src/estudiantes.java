import java.io.Serializable;

public class estudiantes implements Serializable {
    int codigo;
    int cedula;
    String nombres;
    String apellido;
    String signo;
    String anio;
    String mes;
    String dia;
    String color;
    String casado;
    private static final long serialVersionUID=1L;
    public estudiantes(int codigo, int cedula, String nombres, String apellido, String signo, String anio, String mes, String dia, String color, String casado) {
        this.nombres = nombres;
        this.codigo = codigo;
        this.cedula = cedula;
        this.apellido = apellido;
        this.signo = signo;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.color = color;
        this.casado = casado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        apellido = apellido;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        signo = signo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCasado() {
        return casado;
    }

    public void setCasado(String casado) {
        this.casado = casado;
    }
    @Override
    public String toString(){
        return "Codigo:"+codigo+"\nCedula:"+cedula+"\nNombre: "+nombres+"\nApellido: "+apellido+"\nAño: "+anio+"\nMes: "+mes+"\nDía: "+dia+"\nColor: "+color+"\nCasado: "+casado;
    }
}