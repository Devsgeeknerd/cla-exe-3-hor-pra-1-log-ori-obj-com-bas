package br.com.devsgeeknerd.consultorio;

public class Paciente {
    private int codigo;
    private String nome;
    private String sobrenome;
    private int idade;
    private String sexo;
    private String telefone;
    private String enderenco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public Paciente(int codigo, String nome, String sobrenome, int idade, String sexo, String telefone,
            String enderenco) {
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
        this.enderenco = enderenco;
    }

    public void marcarConsulta() {
        System.out.println("Consulta marcada para o paciente " + nome + " " + sobrenome + ".");
    }

    public void remarcarConsulta() {
        System.out.println("Consulta remarcada para o paciente " + nome + " " + sobrenome + ".");
    }

    public void cancelarConsulta() {
        System.out.println("Consulta cancelada para o paciente " + nome + " " + sobrenome + ".");
    }

    public void consultarConsulta() {
        System.out.println("Consulta consultada para o paciente " + nome + " " + sobrenome + ".");
    }
}
