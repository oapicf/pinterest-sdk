package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdPreviewCreateFromImage;
import org.openapitools.model.AdPreviewCreateFromPin;

@Canonical
class AdPreviewRequest {
    /* Image URL. */
    String imageUrl
    /* Title displayed below ad. */
    String title
    /* Pin ID. */
    String pinId
}
