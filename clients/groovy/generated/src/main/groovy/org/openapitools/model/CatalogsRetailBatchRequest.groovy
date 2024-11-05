package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsItemsRequestLanguage;
import org.openapitools.model.CatalogsRetailBatchRequestItemsInner;
import org.openapitools.model.Country;

@Canonical
class CatalogsRetailBatchRequest {

    enum CatalogTypeEnum {
    
        RETAIL("RETAIL")
    
        private final String value
    
        CatalogTypeEnum(String value) {
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

    
    CatalogTypeEnum catalogType
    
    Country country
    
    CatalogsItemsRequestLanguage language
    /* Array with catalogs item operations */
    List<CatalogsRetailBatchRequestItemsInner> items = new ArrayList<>()
}
