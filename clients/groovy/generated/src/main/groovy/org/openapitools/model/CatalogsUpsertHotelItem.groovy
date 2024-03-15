package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsHotelAttributes;

@Canonical
class CatalogsUpsertHotelItem {
    /* The catalog hotel id in the merchant namespace */
    String hotelId

    enum OperationEnum {
    
        UPSERT("UPSERT")
    
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
    
    CatalogsHotelAttributes attributes
}
