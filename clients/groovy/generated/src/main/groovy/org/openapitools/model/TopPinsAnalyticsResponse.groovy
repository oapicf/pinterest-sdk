package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.model.TopPinsAnalyticsResponsePinsInner;

@Canonical
class TopPinsAnalyticsResponse {
    
    TopPinsAnalyticsResponseDateAvailability dateAvailability
    
    List<TopPinsAnalyticsResponsePinsInner> pins

    enum SortByEnum {
    
        ENGAGEMENT("ENGAGEMENT"),
        
        SAVE("SAVE"),
        
        IMPRESSION("IMPRESSION"),
        
        OUTBOUND_CLICK("OUTBOUND_CLICK"),
        
        PIN_CLICK("PIN_CLICK")
    
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
