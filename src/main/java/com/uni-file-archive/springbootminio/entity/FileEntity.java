package com.nrkt.springbootminio.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class FileEntity {
    @Id
    private String id;
    private String category;
    private String type;
    private String source;
    private String inn;
    private String kpp;
    private String ogrn;
    private String creationDate;
    private String startDate;
    private String endDate;

    public FileEntity(String category, String type, String source, String inn, String kpp, String ogrn, String creationDate, String startDate, String endDate) {
        this.category = category;
        this.type = type;
        this.source = source;
        this.inn = inn;
        this.kpp = kpp;
        this.ogrn = ogrn;
        this.creationDate = creationDate;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}