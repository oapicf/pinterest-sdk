package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopVideoPinsAnalyticsResponsePinsInner;

@Canonical
class TopVideoPinsAnalyticsResponse {
    
    TopPinsAnalyticsResponseDateAvailability dateAvailability
    
    List<TopVideoPinsAnalyticsResponsePinsInner> pins

    enum SortByEnum {
    
        SAVE("SAVE"),
        
        IMPRESSION("IMPRESSION"),
        
        OUTBOUND_CLICK("OUTBOUND_CLICK"),
        
        VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
        
        VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
        
        VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
        
        QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
        
        VIDEO_10S_VIEW("VIDEO_10S_VIEW"),
        
        VIDEO_START("VIDEO_START")
    
        private final String value
    
        SortByEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    SortByEnum sortBy
}
