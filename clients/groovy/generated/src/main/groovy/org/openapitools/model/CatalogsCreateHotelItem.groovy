package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsHotelAttributes;

@Canonical
class CatalogsCreateHotelItem {
    /* The catalog hotel id in the merchant namespace */
    String hotelId

    enum OperationEnum {
    
        CREATE("CREATE")
    
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
