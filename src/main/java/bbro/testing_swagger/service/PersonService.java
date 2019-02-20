package bbro.testing_swagger.service;

import bbro.testing_swagger.model.Person;
import bbro.testing_swagger.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepo repo;

    public ResponseEntity<String> save(Person person){
        repo.save(person);
        return ResponseEntity.ok("done");
    }
}
