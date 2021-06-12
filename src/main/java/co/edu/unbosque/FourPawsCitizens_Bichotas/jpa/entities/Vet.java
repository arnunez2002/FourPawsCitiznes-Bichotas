package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities;


import net.bytebuddy.agent.builder.AgentBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Vet")
@PrimaryKeyJoinColumn
public class Vet extends UserApp{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "neighborhood", nullable = false)
    private String neighborhood;


    @OneToMany(mappedBy = "Vet")
    List<Visit> visitList;

    @ManyToOne
    @JoinColumn(name = "userApp")
    private UserApp userApp;

    public Vet(){
    }

    public Vet(String username, String password, String email, String name, String address, String neighborhood){
        super(username, password, email, "Vet");
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}
