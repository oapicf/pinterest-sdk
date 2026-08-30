package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RetailLocalInventoryItemAttributesOptional;

@Canonical
class LocalInventoryUpdateOperation {
    
    RetailLocalInventoryItemAttributesOptional attributes
    /* Catalog item id in the merchant namespace */
    String itemId

    enum OperationEnum {
    
        UPDATE("UPDATE")
    
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
    /* Store code for the local inventory item */
    String storeCode
}
