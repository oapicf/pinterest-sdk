package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PinMediaSourceImagesBase64ItemsInner {
    
    String title
    
    String description
    /* Destination link for the image. */
    String link

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
    /* Image to upload as base64 string. */
    String data
}
