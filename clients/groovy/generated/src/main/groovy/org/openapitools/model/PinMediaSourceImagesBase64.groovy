package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PinMediaSourceImagesBase64Item;

@Canonical
class PinMediaSourceImagesBase64 {
    
    Integer index
    /* Array with image objects. */
    List<PinMediaSourceImagesBase64Item> items = new ArrayList<>()

    enum SourceTypeEnum {
    
        MULTIPLE_IMAGE_BASE64("multiple_image_base64")
    
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
