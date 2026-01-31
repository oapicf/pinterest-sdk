package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class S3FilePart {
    /* Part number for upload. */
    Integer partNumber
    /* Pre-signed URL. */
    String presignedUrl
}
