package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository {
    Optional<Owner> findByNeighborhood(String neighborhood);
    Optional<Owner> save(Owner owner);
<<<<<<< HEAD
    List<Owner> findAll();
    void refresh(Long id, String name, String address, String neighborhood);
=======

    List<Owner> findByNeighborhood(String neighborhood);

>>>>>>> origin/master
}
