package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class BidFloor {
    /* A list of bid floors in micro currency. For example, [100000, 200000] */
    List<Integer> bidFloors
    /* Always the string 'bidfloor' */
    String type = "bidfloor"
}
