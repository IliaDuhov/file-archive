package com.nrkt.springbootminio.mapper;

import com.nrkt.springbootminio.payload.FileResponse;
import io.minio.ObjectStat;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-14T20:48:35+0400",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
@Component
@Qualifier("delegate")
public class FileResponseMapperImpl_ implements FileResponseMapper {

    @Override
    public FileResponse fileAddResponse(ObjectStat objectStat) {
        if ( objectStat == null ) {
            return null;
        }

        FileResponse fileResponse = new FileResponse();

        return fileResponse;
    }

    @Override
    public FileResponse fileGetResponse(ObjectStat objectStat) {
        if ( objectStat == null ) {
            return null;
        }

        FileResponse fileResponse = new FileResponse();

        return fileResponse;
    }
}
