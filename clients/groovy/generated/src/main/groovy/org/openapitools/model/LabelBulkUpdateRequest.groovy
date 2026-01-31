package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class LabelBulkUpdateRequest {
    /* Label ID. */
    String id

    enum StatusEnum {
    
        ARCHIVED("ARCHIVED")
    
        private final String value
    
        StatusEnum(String value) {
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

    /* Set status to `ARCHIVED` to remove the label from the parent entity. */
    StatusEnum status
    /* </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit. */
    String value
}
