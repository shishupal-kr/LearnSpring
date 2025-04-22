package com.shishupal.FirstProject.repository;

import com.shishupal.FirstProject.entity.JournalEntry;
import com.shishupal.FirstProject.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {

}