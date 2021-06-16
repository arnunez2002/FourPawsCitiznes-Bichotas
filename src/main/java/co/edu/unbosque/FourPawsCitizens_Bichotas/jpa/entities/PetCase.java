package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities;


import javax.persistence.*;

@Entity(name = "PetCases")
public class PetCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "created_ad")
    private String created_ad;

    @Column(name = "case_type")
    private String type;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet_id;

    public PetCase(String created_ad, String type, Pet pet_id) {
        this.created_ad = created_ad;
        this.type = type;
        this.pet_id = pet_id;
    }

    public PetCase(Pet pet_id) {
        this.pet_id = pet_id;
    }

    public String getCreated_ad() {
        return created_ad;
    }

    public void setCreated_ad(String created_ad) {
        this.created_ad = created_ad;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pet getPet_id() {
        return pet_id;
    }

    public void setPet_id(Pet pet_id) {
        this.pet_id = pet_id;
    }
}
