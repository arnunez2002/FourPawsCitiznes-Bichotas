package co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories;

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Owner;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class OwnerRepositoryImpl implements OwnerRepository {

    private EntityManager entityManager;

    public OwnerRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<Owner> findByNeighborhood(String neighborhood) {
        Owner owner  = entityManager.createNamedQuery("Owner.findByNeighborhood", Owner.class)
.setParameter("neighborhood", neighborhood)
        .getSingleResult();
        return owner!=null ? Optional.of(owner): Optional.empty();
    }

    @Override
    public Optional<Owner> save(Owner owner) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(owner);
            entityManager.getTransaction().commit();
            return Optional.of(owner);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
<<<<<<< HEAD
    public List<Owner> findAll() {
          return entityManager.createQuery("from owners ").getResultList();
    }


    public void refresh(Long id, String name, String address, String neighborhood){
        Owner owner = entityManager.find(Owner.class, id);

        if(owner!=null){
            try{
                entityManager.getTransaction().begin();

                owner.setPersonId(id);
                owner.setName(name);
                owner.setAddress(address);
                owner.setNeighborhood(neighborhood);
                entityManager.getTransaction().commit();

            }catch (Exception e){
                e.printStackTrace();
            }
        }


=======
    public List<Owner> findByNeighborhood(String neighborhood) {
        List<Owner> owners = entityManager.createQuery("SELECT b FROM Owner b WHERE b.neighborhood = :neighborhood", Owner.class)
                .setParameter("neighborhood", neighborhood).getResultList();
        return owners != null ? owners: null;
>>>>>>> origin/master
    }


}
