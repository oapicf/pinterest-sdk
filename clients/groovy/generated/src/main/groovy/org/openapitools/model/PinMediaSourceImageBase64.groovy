package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PinMediaSourceImageBase64 {

    enum SourceTypeEnum {
    
        IMAGE_BASE64("image_base64")
    
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

    enum ContentTypeEnum {
    
        JPEG("image/jpeg"),
        
        PNG("image/png")
    
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
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    Boolean isStandard = true
}
