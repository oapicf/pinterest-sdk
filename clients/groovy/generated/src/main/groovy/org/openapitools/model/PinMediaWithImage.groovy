package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import org.openapitools.model.ImageDetails;
import org.openapitools.model.PinMedia;
import org.openapitools.model.PinMediaWithImageAllOf;

@Canonical
class PinMediaWithImage {
    
    Map<String, ImageDetails> images = new HashMap<String, ImageDetails>()
}
