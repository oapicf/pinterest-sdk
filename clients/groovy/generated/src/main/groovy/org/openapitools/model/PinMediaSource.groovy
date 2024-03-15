package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PinMediaSourceImageBase64;
import org.openapitools.model.PinMediaSourceImageURL;
import org.openapitools.model.PinMediaSourceImagesBase64;
import org.openapitools.model.PinMediaSourceImagesURL;
import org.openapitools.model.PinMediaSourceImagesURLItemsInner;
import org.openapitools.model.PinMediaSourcePinURL;
import org.openapitools.model.PinMediaSourceVideoID;

@Canonical
class PinMediaSource {

    enum SourceTypeEnum {
    
        PIN_URL("pin_url")
    
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
    
    String url
    /* Cover image url. */
    String coverImageUrl

    enum CoverImageContentTypeEnum {
    
        JPEG("image/jpeg"),
        
        PNG("image/png")
    
        private final String value
    
        CoverImageContentTypeEnum(String value) {
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

    /* Content type for cover image Base64. */
    CoverImageContentTypeEnum coverImageContentType
    /* Cover image Base64. */
    String coverImageData
    
    String mediaId
    /* Array with image objects. */
    List<PinMediaSourceImagesURLItemsInner> items = new ArrayList<>()
    
    Integer index
    /* This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
    Boolean isAffiliateLink = false
}
