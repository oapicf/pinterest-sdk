package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class TargetingTemplateUpdateRequest {

    enum OperationTypeEnum {
    
        REMOVE("REMOVE")
    
        private final String value
    
        OperationTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    OperationTypeEnum operationType
    /* Targeting template ID */
    String id
}
