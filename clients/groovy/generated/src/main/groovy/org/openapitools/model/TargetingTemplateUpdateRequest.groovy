package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.TargetingSpec;

@Canonical
class TargetingTemplateUpdateRequest {
    /* Targeting template ID */
    String id

    enum OperationTypeEnum {
    
        REMOVE("REMOVE"),
        
        UPDATE("UPDATE")
    
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
    
    TargetingSpec targetingAttributes
}
