package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LabelStatus;
import org.openapitools.model.LabelType;

@Canonical
class Label {
    /* Label ID. */
    String id
    
    LabelType labelType
    /* Label parent entity ID. */
    String parentId

    enum ParentTypeEnum {
    
        CAMPAIGN("CAMPAIGN")
    
        private final String value
    
        ParentTypeEnum(String value) {
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

    /* Label parent entity type. */
    ParentTypeEnum parentType
    
    LabelStatus status
    /* Label name. */
    String value
}
