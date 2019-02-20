package bbro.testing_swagger.controller;

import bbro.testing_swagger.model.Person;
import bbro.testing_swagger.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("main")
public class MainController {
    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public Person hw(){return new Person();}

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> hww(@RequestBody Person person){return personService.save(person);}
}
