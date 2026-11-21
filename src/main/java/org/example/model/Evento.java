package org.example.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String data;
    private String local;

    @OneToMany(mappedBy = "evento")
    private List<Inscricao> inscricaoList;

}
