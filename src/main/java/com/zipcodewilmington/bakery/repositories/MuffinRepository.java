package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Muffin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository//Not required since the interface is extending CrudRepository
public interface MuffinRepository extends CrudRepository<Muffin, Long> {
}
