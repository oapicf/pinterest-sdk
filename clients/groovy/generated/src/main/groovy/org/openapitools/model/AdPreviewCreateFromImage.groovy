package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AdPreviewCreateFromImage {
    /* Image URL. */
    String imageUrl
    /* Title displayed below ad. */
    String title
}
