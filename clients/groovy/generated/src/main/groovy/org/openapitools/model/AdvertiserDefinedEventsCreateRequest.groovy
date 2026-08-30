package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdvertiserDefinedEventInput;

@Canonical
class AdvertiserDefinedEventsCreateRequest {
    /* List of advertiser defined events to create or update */
    List<AdvertiserDefinedEventInput> items = new ArrayList<>()
}
