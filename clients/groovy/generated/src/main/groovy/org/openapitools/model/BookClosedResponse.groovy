package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BookClosedResponse {
    /* Are conversion metrics ready? */
    Boolean conversionMetricsReady
    /* Are non-conversion metrics ready? */
    Boolean nonConversionMetricsReady
}
