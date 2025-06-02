import java.util.Date;
public class ColaboradorBuilder {
    private Colaborador colaborador;

    public ColaboradorBuilder() {
        colaborador = new Colaborador();
    }

    public Colaborador build() {
        if (colaborador.getMatricula() == 0) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (colaborador.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return colaborador;
    }

    public ColaboradorBuilder setMatricula(int matricula) {
        colaborador.setMatricula(matricula);
        return this;
    }

    public ColaboradorBuilder setNome(String nome) {
        colaborador.setNome(nome);
        return this;
    }

    public ColaboradorBuilder setDataInicioTrabalho(Date dataInicioTrabalho) {
        colaborador.setDataInicioTrabalho(dataInicioTrabalho);
        return this;
    }

    public ColaboradorBuilder setCargo(String cargo) {
        colaborador.setCargo(cargo);
        return this;
    }

    public ColaboradorBuilder setEmail(String email){
        colaborador.setEmail(email);
        return this;
    }

}
