package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PinMediaSourceImageURL {

    enum SourceTypeEnum {
    
        IMAGE_URL("image_url")
    
        private final String value
    
        SourceTypeEnum(String value) {
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

    
    SourceTypeEnum sourceType
    
    String url
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    Boolean isStandard = true
}
