package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities;

import javax.persistence.*;

@Entity
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY.)
    @Column(name = "create_at")
    private String create_at;

    @Column
    private String type;

    @Column
    private String description;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "vet_id")
    private Vet vet_id;

    @ManyToOne
    @JoinColumn(name = "pe_id")
    private Pet pet_id;






}
