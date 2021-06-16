package co.edu.unbosque.FourPawsCitizens_Bichotas.services;

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Vet;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories.VetRepository;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories.VetRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Bichotas.resources.pojos.OwnerPOJO;
import co.edu.unbosque.FourPawsCitizens_Bichotas.resources.pojos.VetPOJO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

@Stateless
public class VetServices {

    VetRepository vetRepository;

    public Optional<VetPOJO> creatVet(VetPOJO vetPOJO) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("creatVet");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        vetRepository = new VetRepositoryImpl(entityManager);

        Vet vet = new Vet(vetPOJO.getUsername(), vetPOJO.getPassword(), vetPOJO.getEmail(), vetPOJO.getName(), vetPOJO.getAddress(), vetPOJO.getNeighborhood());
        Optional<Vet> persistedVet = vetRepository.save(vet);

        entityManager.close();
        entityManagerFactory.close();

        if (persistedVet.isPresent()) {
            return Optional.of(new VetPOJO(persistedVet.get().getUsername(),
                    persistedVet.get().getPassword(),
                    persistedVet.get().getEmail(),
                    persistedVet.get().getName(),
                    persistedVet.get().getAddress(),
                    persistedVet.get().getNeighborhood()));
        } else {
            return Optional.empty();
        }

    }

}