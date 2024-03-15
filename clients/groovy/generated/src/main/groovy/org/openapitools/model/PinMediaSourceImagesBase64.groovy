package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PinMediaSourceImagesBase64ItemsInner;

@Canonical
class PinMediaSourceImagesBase64 {

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

    
    SourceTypeEnum sourceType
    /* Array with image objects. */
    List<PinMediaSourceImagesBase64ItemsInner> items = new ArrayList<>()
    
    Integer index
}
