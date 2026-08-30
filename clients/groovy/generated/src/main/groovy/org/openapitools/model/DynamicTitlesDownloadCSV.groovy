package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DynamicTitlesDownloadCSV {
    /* Pre-signed S3 URL to download the CSV file. */
    String downloadUrl
}
