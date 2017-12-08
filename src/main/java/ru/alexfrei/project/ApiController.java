package ru.alexfrei.project;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")
public class ApiController {

    private final VisitRepository visitRepository;

    public ApiController(VisitRepository visitRepository){
        this.visitRepository = visitRepository;
    }

    public Iterable<Visit> getVisit(){
        return visitRepository.findAll();
    }
}
