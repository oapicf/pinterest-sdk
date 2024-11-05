package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemAttributesRequest;

@Canonical
class CatalogsUpsertRetailItem {
    /* The catalog item id in the merchant namespace */
    String itemId

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
    
    ItemAttributesRequest attributes
}
