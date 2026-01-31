package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ImageMetadata;

@Canonical
class PinMediaWithImages {
    
    List<ImageMetadata> items = new ArrayList<>()

    enum MediaTypeEnum {
    
        MULTIPLE_IMAGES("multiple_images")
    
        private final String value
    
        MediaTypeEnum(String value) {
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

    
    MediaTypeEnum mediaType
}
