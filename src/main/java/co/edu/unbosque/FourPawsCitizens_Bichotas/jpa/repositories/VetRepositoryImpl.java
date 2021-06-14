package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Vet;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class VetRepositoryImpl implements VetRepository {


    private EntityManager entityManager;

    public VetRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public Optional<Vet> findById(String name) {

        Vet vet= entityManager.find(Vet.class, name);
        return vet != null ? Optional.of(vet) : Optional.empty();
    }

    @Override
    public List<Vet> findAll() {
        return entityManager.createQuery("from Vet").getResultList();
    }

    @Override
    public Optional<Vet> save(Vet vet) {
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(vet);
            entityManager.getTransaction().commit();
            return Optional.of(vet);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public void refresh(String username, String password, String email, String name, String address, String neighborhood) {
        Vet vet = entityManager.find(Vet.class, name);
    if(vet!=null){
        try{
            entityManager.getTransaction().begin();
            vet.setUsername(username);
            vet.setPassword(password);
            vet.setEmail(email);
            vet.setName(name);
            vet.setAddress(address);
            vet.setNeighborhood(neighborhood);
            entityManager.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
}
