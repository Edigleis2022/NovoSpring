/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.aula.professor;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 07772501951
 */
@Service
public class ProfessorService {
    
    @Autowired
    private ProfessorRepository repository;
    
    public List<Professor> listar(){
        return repository.findAll();
    }
    
    public Professor salvar(Professor entity){
        Professor p = repository.save(entity);
        return p;
    }
    
    public Professor atualizar(long id,ProfessorForm dto) {
        
        Professor entity = optional.get();
        ProfessorMapper.INSTANCE.update(dto, entity);
        return entity;
    }
    
    public Professor buscarPorId(Long id) throws ProfessorNotFoundException{
        Optional<Professor> optional = repository.findById(id);
        if (optional.isEmpty()) {
            String msg = "Não existe Professor para o código [%d] informado";
            throw new ProfessorNotFoundException(String.format(msg, id));
        }
        return optional.get();
    }
    
    public void excluir(Long id){
        Professor entity = buscarPorId(id);
        repository.delete(entity);
    }
}
