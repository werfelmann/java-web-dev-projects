package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.EventCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EventCategoryRepository extends CrudRepository<EventCategory, Integer> {

    Optional<EventCategory> findByName(String name);

}
