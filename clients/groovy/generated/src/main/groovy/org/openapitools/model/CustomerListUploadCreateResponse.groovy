package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CustomerListUpload;
import org.openapitools.model.S3MultipartUploadData;

@Canonical
class CustomerListUploadCreateResponse {
    /* The Customer List Upload created. */
    CustomerListUpload customerListUpload
    /* Pre-signed upload URLs corresponding to each part of the upload. */
    S3MultipartUploadData s3MultipartUploadData
}
