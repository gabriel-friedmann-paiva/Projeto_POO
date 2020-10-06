/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_v1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class CentroUniversitario {

    private String nome;
    private ArrayList<Estudante> estudantes;
    private ArrayList<Disciplina> disciplinas;

    public CentroUniversitario(String nome) {

        this.nome = nome;
        this.estudantes = new ArrayList<Estudante>();
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public void carregarDados(String arqDisciplinas, String arqEstudantes, String arqMatriculas) {
        
        File fileDisciplinas;
        
        try {
            
            fileDisciplinas = new File(arqDisciplinas);
            Scanner scDisciplinas = new Scanner(fileDisciplinas);
            
            while(scDisciplinas.hasNextLine()){
                
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Ocorreu um erro na abertura do arquivo de disciplinas.");
            e.printStackTrace();
        }
    }
}
