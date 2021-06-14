package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories;

<<<<<<< HEAD

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Vet;

import java.util.List;
import java.util.Optional;

public interface VetRepository {

    Optional<Vet> findById(String name);

    List<Vet> findAll();

    Optional<Vet> save(Vet vet);

    void refresh(String username, String password, String email, String name, String address, String neighborhood);
=======
public interface VetRepository {



>>>>>>> origin/master
}
