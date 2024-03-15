package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsCreateHotelItem;
import org.openapitools.model.CatalogsDeleteHotelItem;
import org.openapitools.model.CatalogsUpdatableHotelAttributes;
import org.openapitools.model.CatalogsUpdateHotelItem;
import org.openapitools.model.CatalogsUpsertHotelItem;

@Canonical
class CatalogsHotelBatchItem {
    /* The catalog hotel id in the merchant namespace */
    String hotelId

    enum OperationEnum {
    
        DELETE("DELETE")
    
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
    
    CatalogsUpdatableHotelAttributes attributes
}
