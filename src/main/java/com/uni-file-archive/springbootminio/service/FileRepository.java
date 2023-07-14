package com.nrkt.springbootminio.service;

import com.nrkt.springbootminio.entity.FileEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FileRepository extends MongoRepository<FileEntity, String> {
}