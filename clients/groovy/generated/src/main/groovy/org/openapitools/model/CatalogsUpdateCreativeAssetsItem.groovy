package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsUpdatableCreativeAssetsAttributes;

@Canonical
class CatalogsUpdateCreativeAssetsItem {
    /* The catalog creative assets item id in the merchant namespace */
    String creativeAssetsId

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
    
    CatalogsUpdatableCreativeAssetsAttributes attributes
}
