package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories;

<<<<<<< HEAD
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Pet;
=======
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Pet;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Vet;
>>>>>>> origin/master

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

<<<<<<< HEAD
public class PetRepositoryImpl implements PetRepository {

=======
public class PetRepositoryImpl implements PetRepository{
>>>>>>> origin/master

    private EntityManager entityManager;

    public PetRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
<<<<<<< HEAD
    public Optional<Pet> findById(Integer id) {
        Pet pet = entityManager.find(Pet.class, id);
        return Optional.empty();
    }

    @Override
    public Optional<Pet> findBySpecies(String species) {
        Pet pet = entityManager.find(Pet.class, species);
        return Optional.empty();
    }

    @Override
    public Optional<Pet> findByRace(String race) {
        Pet pet = entityManager.find(Pet.class, race);
        return Optional.empty();
    }

    @Override
    public Optional<Pet> findBySize(String size) {
        Pet pet = entityManager.find(Pet.class, size);
        return Optional.empty();
    }

    @Override
    public Optional<Pet> findBySex(String sex) {
        Pet pet = entityManager.find(Pet.class, sex);
        return Optional.empty();
    }

    @Override
    public List<Pet> findAll() {
        return entityManager.createQuery("from Pet").getResultList();
    }

    @Override
=======
>>>>>>> origin/master
    public Optional<Pet> save(Pet pet) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pet);
            entityManager.getTransaction().commit();
            return Optional.of(pet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

<<<<<<< HEAD
    @Override
    public void refresh(String microchip, String name, String race, String size, String sex, String picture, Long id) {
        Pet pet = entityManager.find(Pet.class, microchip);
        if (pet != null) {
            try {

                entityManager.getTransaction().begin();
                pet.setId(id);
                pet.setName(name);
                pet.setRace(race);
                pet.setSize(size);
                pet.setSex(sex);
                pet.setPicture(picture);
                pet.setMicrochip(microchip);
                entityManager.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
=======

    @Override
    public List<Pet> findById(String id) {
        List<Pet> pets = entityManager.createQuery("SELECT b FROM Pet b WHERE b.id = :id", Pet.class)
                .setParameter("id", Integer.parseInt(id)).getResultList();
        return pets != null ? pets: null;
    }



>>>>>>> origin/master
}
