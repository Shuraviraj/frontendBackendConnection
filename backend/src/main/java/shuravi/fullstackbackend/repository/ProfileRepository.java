package shuravi.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shuravi.fullstackbackend.model.ProfileEntity;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {

}
