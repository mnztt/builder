import java.util.Date;
public class Colaborador {
    private int matricula;
    private String nome;
    private Date dataInicioTrabalho;
    private String cargo;

    private String email;

    public Colaborador() {
        this.matricula = 0;
        this.nome = "";
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicioTrabalho() {
        return dataInicioTrabalho;
    }

    public void setDataInicioTrabalho(Date dataInicioTrabalho) {
        this.dataInicioTrabalho = dataInicioTrabalho;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
}
