package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class TrendingPin {
    /* Dominant color of the pin image in hex format */
    String color
    /* Height of the pin image in pixels */
    Integer height
    /* Unique identifier for the pin */
    String id
    /* URL of the pin image */
    String src
    /* The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom. */
    Double verticalOffset
    /* Width of the pin image in pixels */
    Integer width
}
