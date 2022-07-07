package com.example.hibernateexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="product")
public class Product {

    @Id
    @GeneratedValue
    private int id ;
    private String name ;
    private int qty ;
    private double price ;

}
