/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.aula.professor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 *
 * @author 07772501951
 */
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class ProfessorDto {
    
    private Long id;
    private String nome;
}
