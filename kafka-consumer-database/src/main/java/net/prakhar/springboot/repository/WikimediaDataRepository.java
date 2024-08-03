package net.prakhar.springboot.repository;

import net.prakhar.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {

}
