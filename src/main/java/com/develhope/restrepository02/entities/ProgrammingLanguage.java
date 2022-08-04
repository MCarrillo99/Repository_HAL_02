package com.develhope.restrepository02.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Year;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private Year firstApparence;

    @Column(nullable = false)
    private String inventor;

}
