package br.edu.infnet.repository;

import br.edu.infnet.modelo.Funcionario;
import java.util.List;
import java.util.ArrayList;


public class FuncionarioRepository {
    
    private static List<Funcionario> funcionarios = new ArrayList();
    
    private static Integer proximoID = 0;
    
    public void salvar (String nome, String empresa, String profissão, String salario) {
        
        Funcionario funcionario = new Funcionario(proximoID, nome, empresa, profissão, salario);
        proximoID++;
        funcionarios.add(funcionario);
    }
    
    public ArrayList<Funcionario> buscarFuncionario (String nome) {
        
        ArrayList<Funcionario> resultadoBusca = new ArrayList();
        for (Funcionario funcionario : funcionarios ) {
            if (funcionario != null) {
                if (funcionario.getNome() != null && funcionario.getNome().contains(nome)) {
                    resultadoBusca.add(funcionario);
                }
            }
        }
        
        return resultadoBusca;
     }
    
    public  void remover (Integer id) {
        Funcionario funcionario = buscar(id);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
        }
    }
    
    public Funcionario buscar (Integer id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null && funcionario.getId() != null && funcionario.getId().equals(id)) {
                return funcionario;
            }
        }
        return null;
    }
    
    public void editarFuncionario (Integer id, String nome, String empresa, String profissão, String salario) {
        
        Funcionario funcionario = buscar(id);
        if (funcionario != null) {
            funcionario.setEmpresa(empresa);
            funcionario.setNome(nome);
            funcionario.setProfissão(profissão);
            funcionario.setSalario(salario);
        }        
    }
}

    

    

