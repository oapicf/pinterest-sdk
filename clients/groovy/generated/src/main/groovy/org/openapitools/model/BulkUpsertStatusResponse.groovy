package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BulkUpsertStatus;

@Canonical
class BulkUpsertStatusResponse {
    
    BulkUpsertStatus status
    
    String resultUrl
}
