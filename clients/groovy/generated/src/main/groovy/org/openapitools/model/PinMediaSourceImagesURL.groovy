package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PinMediaSourceImagesURLItem;

@Canonical
class PinMediaSourceImagesURL {
    
    Integer index
    /* Array with image objects. */
    List<PinMediaSourceImagesURLItem> items = new ArrayList<>()

    enum SourceTypeEnum {
    
        MULTIPLE_IMAGE_URLS("multiple_image_urls")
    
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
