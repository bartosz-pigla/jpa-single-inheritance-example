package com.example.demo2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingsRepository<T extends SettingsEntry> extends JpaRepository<T, Long> {

}
