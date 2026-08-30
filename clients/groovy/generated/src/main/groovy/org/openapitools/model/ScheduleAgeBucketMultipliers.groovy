package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class ScheduleAgeBucketMultipliers {

    enum AGEBUCKETEnum {
    
        _18_24("18-24"),
        
        _25_34("25-34"),
        
        _35_44("35-44"),
        
        _45_49("45-49"),
        
        _50_54("50-54"),
        
        _55_64("55-64"),
        
        _65_("65+")
    
        private final String value
    
        AGEBUCKETEnum(String value) {
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

    
    AGEBUCKETEnum AGE_BUCKET
}
