package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DynamicTitlesUploadURL {
    /* If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists. */
    String existingFilename
    /* Unique identifier for this upload session. Must be passed to the process endpoint. */
    String requestId
    /* Pre-signed S3 PUT URL to upload the reviewed CSV file. */
    String uploadUrl
}
