package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopPinsAnalyticsResponsePinsItems;
import org.openapitools.model.TopPinsSortBy;

@Canonical
class TopPinsAnalyticsResponse {
    
    TopPinsAnalyticsResponseDateAvailability dateAvailability
    
    List<TopPinsAnalyticsResponsePinsItems> pins = new ArrayList<>()
    
    TopPinsSortBy sortBy
}
