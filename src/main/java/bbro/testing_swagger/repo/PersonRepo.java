package bbro.testing_swagger.repo;

import bbro.testing_swagger.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
