package com.IliaDuhov.PastebinLike.service;

import com.IliaDuhov.PastebinLike.payload.FileResponse;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {
    FileResponse addFile(MultipartFile file);
    void deleteFile(String fileName);
    FileResponse getFile(String fileName);
    FileResponse getFileDetails(String fileName);
}
