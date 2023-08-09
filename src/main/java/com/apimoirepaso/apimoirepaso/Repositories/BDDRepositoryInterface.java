package com.apimoirepaso.apimoirepaso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apimoirepaso.apimoirepaso.Entities.Persona;

public interface BDDRepositoryInterface extends JpaRepository<Persona,Long>{}
