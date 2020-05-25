package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.Meeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingDao extends CrudRepository<Meeting, Long> {
}
