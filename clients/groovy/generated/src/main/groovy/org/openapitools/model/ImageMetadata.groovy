package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageSize;

@Canonical
class ImageMetadata {
    
    String description
    
    ImageSize images

    enum ItemTypeEnum {
    
        IMAGE("image")
    
        private final String value
    
        ItemTypeEnum(String value) {
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

    /* Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload. */
    ItemTypeEnum itemType
    
    String link
    
    String title
}
