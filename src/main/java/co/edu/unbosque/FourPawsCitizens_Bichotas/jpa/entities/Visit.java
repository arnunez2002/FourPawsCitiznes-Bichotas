package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities;

import javax.persistence.*;

@Entity
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vet getVet_id() {
        return vet_id;
    }

    public void setVet_id(Vet vet_id) {
        this.vet_id = vet_id;
    }

    public Pet getPet_id() {
        return pet_id;
    }

    public void setPet_id(Pet pet_id) {
        this.pet_id = pet_id;
    }
}
