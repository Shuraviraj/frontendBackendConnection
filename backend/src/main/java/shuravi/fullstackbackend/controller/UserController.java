package shuravi.fullstackbackend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import shuravi.fullstackbackend.model.ProfileEntity;
import shuravi.fullstackbackend.repository.ProfileRepository;

import java.util.Iterator;
import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    @Autowired
    private ProfileRepository profileRepository;

    @PostMapping("/profile")
    public ProfileEntity createProfile(@RequestBody ProfileEntity profile) {
        return profileRepository.save(profile);
    }

    @GetMapping("/profile")
    public Iterable<ProfileEntity> getAllProfiles() {
        return profileRepository.findAll();
    }
}
