package com.gestion_user.gst_user;

import org.springframework.data.repository.CrudRepository;
import com.gestion_user.gst_user.User;

// Interface du repository pour l'entité User
public interface UserRepository extends CrudRepository<User, Long> {
    // Méthode personnalisée pour rechercher un utilisateur par email
    User findByEmail(String email);
}
