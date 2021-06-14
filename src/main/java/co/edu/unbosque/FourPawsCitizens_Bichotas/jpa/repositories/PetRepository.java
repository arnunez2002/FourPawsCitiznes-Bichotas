package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories;
<<<<<<< HEAD

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Pet;

import java.util.List;
import java.util.Optional;

public interface PetRepository {

    Optional<Pet> findById(Integer id);

    Optional<Pet> findBySpecies(String species);

    Optional<Pet> findByRace(String race);

    Optional<Pet> findBySize(String size);

    Optional<Pet> findBySex(String sex);

    List<Pet> findAll();

    Optional<Pet> save(Pet pet);

    void refresh(String microchip,String name,String race,String size,String sex,String picture,Long id);
=======
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Pet;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Vet;

import java.util.List;
import java.util.Optional;
public interface PetRepository {

    Optional <Pet> save(Pet pet);
    List<Pet> findById(String id);
>>>>>>> origin/master

}
