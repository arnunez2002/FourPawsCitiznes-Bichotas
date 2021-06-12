package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Pet")
@NamedQueries({
        @NamedQuery(name = "Pet.findById", query = "SELECT b FROM Pet b WHERE b.id=: id"),
        @NamedQuery(name = "Book.findAll",
                query= "SELECT b FROM Pet b")
})

public class Pet {

    @Id
    @GeneratedValue
    @Column(name = "pet_microchip")
    private String microchip;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(name = "pet_species")
    private String species;

    @Column(name = "race")
    private String race;

    @Column(name = "size")
    private String size;

    @Column(name = "sex")
    private String sex;

    @Column(name = "picture")
    private String picture;

    @Column(name = "pet_id")
    private Long id;


    @ManyToOne
    @JoinColumn(name   = "owner_id")
    private Owner owner_id;

    @OneToMany(mappedBy = "visit")
    private List<Visit> visitList = new ArrayList<>();




    public Pet() {
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getMicrochip() {
        return microchip;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getRace() {
        return race;
    }

    public String getSize() {
        return size;
    }

    public String getSex() {
        return sex;
    }

    public String getPicture() {
        return picture;
    }



    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Owner getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Owner owner_id) {
        this.owner_id = owner_id;
    }

    public List<Pet> getEdition() {
        return edition;
    }

    public void setEdition(List<Pet> edition) {
        this.edition = edition;
    }
}
