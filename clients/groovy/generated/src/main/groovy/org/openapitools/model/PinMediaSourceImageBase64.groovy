package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ContentType;

@Canonical
class PinMediaSourceImageBase64 {
    
    ContentType contentType
    
    String data
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    Boolean isStandard = true

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

    /* The source type of the media. */
    SourceTypeEnum sourceType
}
