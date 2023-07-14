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
    String rojo;
    String verde;
    String ninguno;
    String si;
    String no;

    public estudiantes(int codigo, int cedula, String nombres, String apellido, String signo, String anio, String mes, String dia, String rojo, String verde, String ninguno, String si, String no) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellido = apellido;
        this.signo = signo;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.rojo = rojo;
        this.verde = verde;
        this.ninguno = ninguno;
        this.si = si;
        this.no = no;
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
        this.apellido = apellido;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
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

    public String getRojo() {
        return rojo;
    }

    public void setRojo(String rojo) {
        this.rojo = rojo;
    }

    public String getVerde() {
        return verde;
    }

    public void setVerde(String verde) {
        this.verde = verde;
    }

    public String getNinguno() {
        return ninguno;
    }

    public void setNinguno(String ninguno) {
        this.ninguno = ninguno;
    }

    public String getSi() {
        return si;
    }

    public void setSi(String si) {
        this.si = si;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString(){
        return "Codigo:"+codigo+"\nCedula:"+cedula+"\nNombre: "+nombres+"\nApellido: "+apellido+"\nAño: "+anio+"\nMes: "+mes+"\nDía: "+dia+"\nColor: "+rojo+verde+ninguno+"\nCasado: "+si+no;
    }
}