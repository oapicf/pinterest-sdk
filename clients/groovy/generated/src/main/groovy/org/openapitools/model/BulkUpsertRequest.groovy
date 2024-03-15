package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BulkUpsertRequestCreate;
import org.openapitools.model.BulkUpsertRequestUpdate;

@Canonical
class BulkUpsertRequest {
    
    BulkUpsertRequestCreate create
    
    BulkUpsertRequestUpdate update
}
