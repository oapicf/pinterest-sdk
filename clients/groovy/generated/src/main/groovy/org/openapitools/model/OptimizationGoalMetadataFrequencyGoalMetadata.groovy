package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OptimizationGoalMetadataFrequencyGoalMetadata {
    
    Integer frequency

    enum TimerangeEnum {
    
        THIRTY_DAY("THIRTY_DAY"),
        
        DAY("DAY"),
        
        SEVEN_DAY("SEVEN_DAY"),
        
        TWENTY_MINUTE("TWENTY_MINUTE"),
        
        TEN_MINUTE("TEN_MINUTE"),
        
        TWENTY_FOUR_HOUR("TWENTY_FOUR_HOUR")
    
        private final String value
    
        TimerangeEnum(String value) {
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

    /* User entity counts time range */
    TimerangeEnum timerange
}
