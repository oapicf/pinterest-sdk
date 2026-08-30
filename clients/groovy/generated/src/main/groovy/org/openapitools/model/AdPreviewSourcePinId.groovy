package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdPinPreviewCreativeType;

@Canonical
class AdPreviewSourcePinId {
    /* Creative type of the ad preview. */
    AdPinPreviewCreativeType creativeType
    /* Pin ID. */
    String pinId
}
