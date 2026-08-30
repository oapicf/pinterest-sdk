package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TargetingSpecOperationAgeBucket;
import org.openapitools.model.TargetingSpecOperationAppType;
import org.openapitools.model.TargetingSpecOperationAudienceExclude;
import org.openapitools.model.TargetingSpecOperationAudienceInclude;
import org.openapitools.model.TargetingSpecOperationGender;
import org.openapitools.model.TargetingSpecOperationGeo;
import org.openapitools.model.TargetingSpecOperationGeoExclude;
import org.openapitools.model.TargetingSpecOperationInterest;
import org.openapitools.model.TargetingSpecOperationLocale;
import org.openapitools.model.TargetingSpecOperationLocation;
import org.openapitools.model.TargetingSpecOperationLocationExclude;
import org.openapitools.model.TargetingSpecOperationMaximumAge;
import org.openapitools.model.TargetingSpecOperationMinimumAge;
import org.openapitools.model.TargetingSpecOperationShoppingRetargeting;
import org.openapitools.model.TargetingSpecShoppingRetargeting;

@Canonical
class TargetingSpecOperations {

    enum FieldEnum {
    
        MINIMUM_AGE("MINIMUM_AGE")
    
        private final String value
    
        FieldEnum(String value) {
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

    
    FieldEnum field

    enum OperationEnum {
    
        SET("SET")
    
        private final String value
    
        OperationEnum(String value) {
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

    
    OperationEnum operation
    
    List<TargetingSpecShoppingRetargeting> values = new ArrayList<>()
    
    String value
}
