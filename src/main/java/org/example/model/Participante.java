package org.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "participantes")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;


    @OneToMany(mappedBy = "participante")
    private List<Inscricao> inscricaoList;

}
