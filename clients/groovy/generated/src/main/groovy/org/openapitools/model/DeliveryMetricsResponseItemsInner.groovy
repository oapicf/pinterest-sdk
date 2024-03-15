package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class DeliveryMetricsResponseItemsInner {
    /* Metric's name. */
    String name

    enum CategoryEnum {
    
        ADS("ADS"),
        
        ORGANIC("ORGANIC")
    
        private final String value
    
        CategoryEnum(String value) {
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

    /* Category name */
    CategoryEnum category
    /* How the metric is defined. */
    String definition
    /* Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. */
    String displayName
}
