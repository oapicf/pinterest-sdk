package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ContentType;
import org.openapitools.model.PinMediaSourceImageBase64;
import org.openapitools.model.PinMediaSourceImageURL;
import org.openapitools.model.PinMediaSourceImagesBase64;
import org.openapitools.model.PinMediaSourceImagesURL;
import org.openapitools.model.PinMediaSourceImagesURLItem;
import org.openapitools.model.PinMediaSourcePinURL;
import org.openapitools.model.PinMediaSourceVideoID;

@Canonical
class PinMediaSource {
    
    ContentType contentType
    
    String data
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    Boolean isStandard = true

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
    
    String url
    /* Content type for cover image Base64. */
    ContentType coverImageContentType
    /* Cover image Base64. */
    String coverImageData
    /* Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. */
    Integer coverImageKeyFrameTime
    /* Cover image URL. */
    String coverImageUrl
    
    String mediaId
    
    Integer index
    /* Array with image objects. */
    List<PinMediaSourceImagesURLItem> items = new ArrayList<>()
    /* This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
    Boolean isAffiliateLink = false
}
