package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Exception;
import org.openapitools.model.UserListOperationType;

@Canonical
class CustomerListUpdateRequest {
    /* Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
    String records
    
    UserListOperationType operationType
    
    Exception exceptions
}
