package org.example.model;

import javax.persistence.*;

@Entity
@Table (name = "inscricoes")
public class Inscricao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Evento evento;

    @ManyToOne
    private Participante participante;

}
