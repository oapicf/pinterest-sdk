package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class TemplateResponseDateRangeDynamicDateRange {

    enum RangeEnum {
    
        YEAR_TO_DATE("YEAR_TO_DATE"),
        
        QUARTER_TO_DATE("QUARTER_TO_DATE"),
        
        MONTH_TO_DATE("MONTH_TO_DATE"),
        
        LAST_MONTH("LAST_MONTH"),
        
        LAST_QUARTER("LAST_QUARTER")
    
        private final String value
    
        RangeEnum(String value) {
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

    /* The dynamic range type */
    RangeEnum range
    /* The date range type */
    String type
}
