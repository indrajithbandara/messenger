package com.adem.messenger.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adem.messenger.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, String> {

}
