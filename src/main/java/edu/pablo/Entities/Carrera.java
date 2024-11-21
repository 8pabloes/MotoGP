package edu.pablo.Entities;

import edu.pablo.Enumerated.Posicion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrera")

public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long idPiloto;
    @Column(nullable = false)
    private Long idCircuito;
    @Column(nullable = false, length = 8)
    private String temporada;
    @Column(nullable = false)
    private Posicion posicion;


}
