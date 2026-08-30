package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BrandAccountProfileImageUpdate {

    enum ContentTypeEnum {
    
        IMAGE_JPEG("image/jpeg"),
        
        IMAGE_PNG("image/png")
    
        private final String value
    
        ContentTypeEnum(String value) {
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

    
    ContentTypeEnum contentType
    
    String data
}
