/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifms.aula.aula.professor;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


/**
 *
 * @author 07772501951
 */
@Mapper
public interface ProfessorMapper {
    
    public static final ProfessorMapper INSTANCE = Mappers.getMapper(ProfessorMapper.class);
    
    public ProfessorDto toDto(Professor entity);
    
    public Professor toEntity(ProfessorForm dto);
    
    public List<ProfessorDto> map(List<Professor> items);

    public void update(ProfessorForm dto, Professor entity);
}
