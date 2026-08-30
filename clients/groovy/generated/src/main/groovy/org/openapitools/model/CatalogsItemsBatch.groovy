package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CatalogsCreativeAssetsItemsBatch;
import org.openapitools.model.CatalogsHotelItemsBatch;
import org.openapitools.model.CatalogsRetailItemsBatch;
import org.openapitools.model.CreativeAssetsProcessingRecord;

@Canonical
class CatalogsItemsBatch {
    /* Id of the catalogs items batch */
    String batchId

    enum CatalogTypeEnum {
    
        CREATIVE_ASSETS("CREATIVE_ASSETS")
    
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
    /* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
    Date completedTime
    /* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */
    Date createdTime
    /* Array with the catalogs items processing records part of the catalogs items batch */
    List<CreativeAssetsProcessingRecord> items = new ArrayList<>()
    
    BatchOperationStatus status
}
