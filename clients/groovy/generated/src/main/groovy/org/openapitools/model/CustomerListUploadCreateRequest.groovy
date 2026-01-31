package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserListOperationType;

@Canonical
class CustomerListUploadCreateRequest {
    
    UserListOperationType operation
    /* Number of parts to upload the file in. */
    Integer totalParts
}
