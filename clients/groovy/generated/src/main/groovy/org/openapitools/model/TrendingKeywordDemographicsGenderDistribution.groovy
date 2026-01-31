package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

@Canonical
class TrendingKeywordDemographicsGenderDistribution {

    enum GenderDistributionEnum {
    
        MALE("male"),
        
        FEMALE("female"),
        
        UNSPECIFIED("unspecified")
    
        private final String value
    
        GenderDistributionEnum(String value) {
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

    
    GenderDistributionEnum genderDistribution
}
