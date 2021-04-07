package br.edu.infnet.modelo;

public class Funcionario {
    
    private String nome;
    private String empresa;
    private String profissao;
    private String salario;
    private Integer id;
    
    public Funcionario () {
        
    }

    public Funcionario(Integer id, String nome, String empresa, String profissão, String salario) {
        this.nome = nome;
        this.empresa = empresa;
        this.profissao = profissão;
        this.salario = salario;
        this.id = id;
    }  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getProfissão() {
        return profissao;
    }

    public void setProfissão(String profissão) {
        this.profissao = profissão;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: "+ nome + " | Profissão:" + profissao + " | Empresa: " + empresa + " | Salário: " + salario;
    }
    
}
