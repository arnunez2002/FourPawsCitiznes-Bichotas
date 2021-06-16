package co.edu.unbosque.FourPawsCitizens_Bichotas.services;

import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.Owner;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.entities.UserApp;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories.OwnerRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories.UserAppRepository;
import co.edu.unbosque.FourPawsCitizens_Bichotas.jpa.repositories.UserAppRepositoryImpl;
import co.edu.unbosque.FourPawsCitizens_Bichotas.resources.pojos.OwnerPOJO;
import co.edu.unbosque.FourPawsCitizens_Bichotas.resources.pojos.User;
import co.edu.unbosque.FourPawsCitizens_Bichotas.resources.pojos.UserPojo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

@Stateless
public class UserAppService {

    UserAppRepository userAppRepository;

    public Optional<String> validateUser( String username, String password ) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tutorial");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Getting credentials from the database
        userAppRepository = new UserAppRepositoryImpl(entityManager);
        Optional<UserApp> user = userAppRepository.findByUsername(username);

        entityManager.close();
        entityManagerFactory.close();

        // Validating if credentials provided by the user are valid
        // If success, return the user role
        if (user.isPresent()) {
            if (user.get().getUsername().equals(username) && user.get().getPassword().equals(password)) {
                return Optional.of(user.get().getRole());
            }
        }
        return Optional.empty();

    }
    public Optional<User> createUser(User user) {
        return null;
    }
}
