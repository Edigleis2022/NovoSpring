/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aula.aula.professor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author 07772501951
 */

@Entity // Cria uma tabela no SBG com o mesmo nome da classe
@Data //implemeta os métodos GET e SET para cada atributo
@EqualsAndHashCode// Cria os métodos equals e hashCode que é utilizadopara comparação
@AllArgsConstructor// Cria contruturoes com todos os atributos
@NoArgsConstructor// Cria construtor sem parâmetros
@Builder // padrão de projeto para construção de objetos
public class Professor {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    
}
