/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author prof.software
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private int idpost;
    private String titulo;
    private String descripcion;
    private boolean estado;
}
