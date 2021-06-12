package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Owner;

import java.util.Optional;

public interface OwnerRepository {

    Optional<Owner> save(Owner owner);
}
