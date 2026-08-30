package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TopVideoPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopVideoPinsAnalyticsResponsePinsItems;
import org.openapitools.model.TopVideoPinsSortBy;

@Canonical
class TopVideoPinsAnalyticsResponse {
    
    TopVideoPinsAnalyticsResponseDateAvailability dateAvailability
    
    List<TopVideoPinsAnalyticsResponsePinsItems> pins = new ArrayList<>()
    
    TopVideoPinsSortBy sortBy
}
