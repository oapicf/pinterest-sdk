package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AdPreviewSourceImage {
    /* Image URL. */
    String imageUrl
    /* Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. */
    String promotionId
    /* Title displayed below ad. */
    String title
}
