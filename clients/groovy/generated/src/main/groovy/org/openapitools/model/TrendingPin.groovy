package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class TrendingPin {
    /* Height of the pin image in pixels */
    Integer height
    /* Unique identifier for the pin */
    String id
    /* URL of the pin image */
    String src
    /* Width of the pin image in pixels */
    Integer width
}
