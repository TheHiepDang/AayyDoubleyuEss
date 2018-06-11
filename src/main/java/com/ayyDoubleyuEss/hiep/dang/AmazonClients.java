package com.ayyDoubleyuEss.hiep.dang;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.stereotype.Service;

@Service
public class AmazonClients {
    public AmazonS3 S3Client() {
        return AmazonS3ClientBuilder.standard().withRegion(Regions.DEFAULT_REGION).build();
    }
}
