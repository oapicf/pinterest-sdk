package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LocalInventoryCreateOperation;
import org.openapitools.model.LocalInventoryDeleteOperation;
import org.openapitools.model.LocalInventoryUpdateOperation;
import org.openapitools.model.LocalInventoryUpsertOperation;
import org.openapitools.model.RetailLocalInventoryItemAttributes;

@Canonical
class LocalInventoryOperation {
    
    RetailLocalInventoryItemAttributes attributes
    /* Catalog item id in the merchant namespace */
    String itemId

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
    /* Store code for the local inventory item */
    String storeCode
}
