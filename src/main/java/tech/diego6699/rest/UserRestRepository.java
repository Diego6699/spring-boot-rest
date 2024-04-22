package tech.diego6699.rest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tech.diego6699.rest.entities.User;

import java.util.UUID;

@RepositoryRestResource(
        path = "users",
        collectionResourceRel = "users"
)
public interface UserRestRepository extends CrudRepository<User, UUID> {
}
