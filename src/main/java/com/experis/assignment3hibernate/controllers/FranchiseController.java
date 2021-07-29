package com.experis.assignment3hibernate.controllers;


import com.experis.assignment3hibernate.models.Franchise;
import com.experis.assignment3hibernate.repositories.FranchiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/franchises")
public class FranchiseController {

    @Autowired
    private FranchiseRepository franchiseRepository;

    @GetMapping
    public ResponseEntity<List<Franchise>> getAllFranchise() {
        List<Franchise> data = franchiseRepository.findAll();
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(data, status);
    }

    @PostMapping
    public ResponseEntity<Franchise> addFranchise(@RequestBody Franchise franchise) {
        Franchise add = franchiseRepository.save(franchise);
        HttpStatus status;
        status = HttpStatus.CREATED;
        // Return a location -> url to get the new resource
        return new ResponseEntity<>(add, status);
    }


//    @GetMapping("/{id}")
//    public ResponseEntity<Franchise> getSpecificFranchise(@PathVariable Long id) {
//        HttpStatus status;
//        Franchise add = new Franchise();
//        if (!franchiseRepository.existsById(id)) {
//            status = HttpStatus.NOT_FOUND;
//            return new ResponseEntity<>(add, status);
//        }
//        add = franchiseRepository.findById(id).get();
//        status = HttpStatus.OK;
//        return new ResponseEntity<>(add, status);
//    }


//    @PutMapping("/{id}")
//    public ResponseEntity<Franchise> updateFranchise(@PathVariable("id") Long id, @RequestBody Franchise franchise) {
//        Optional<Franchise> franchiseData = franchiseRepository.findById(id);
//
//        if (franchiseData.isPresent()) {
//            Franchise _franchise = franchiseData.get();
//            _franchise.setName(franchise.getName());
//            _franchise.setDescription(franchise.getDescription());
//
//
//            return new ResponseEntity<>(franchiseRepository.save(_franchise), HttpStatus.OK);
//        } else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//
//    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteFranchise(@PathVariable("id") long id) {
        try {
            franchiseRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
