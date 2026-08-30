package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ScheduleBidOptionsPlacementMultipliers {
    /* Browse (home-feed and related surfaces) */
    Double browse
    /* Related-Pins placement */
    Double relatedPins
    /* Search placement */
    Double search
}
