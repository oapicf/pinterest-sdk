package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsCreateCreativeAssetsItem;
import org.openapitools.model.CatalogsDeleteCreativeAssetsItem;
import org.openapitools.model.CatalogsUpdatableCreativeAssetsAttributes;
import org.openapitools.model.CatalogsUpdateCreativeAssetsItem;
import org.openapitools.model.CatalogsUpsertCreativeAssetsItem;

@Canonical
class CatalogsCreativeAssetsBatchItem {
    /* The catalog creative assets id in the merchant namespace */
    String creativeAssetsId

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
    
    CatalogsUpdatableCreativeAssetsAttributes attributes
}
