package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CatalogsHotelItemsBatch;
import org.openapitools.model.CatalogsRetailItemsBatch;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.HotelProcessingRecord;

@Canonical
class CatalogsItemsBatch {
    
    CatalogsType catalogType
    /* Id of the catalogs items batch */
    String batchId
    /* Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD */
    Date createdTime
    /* Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD */
    Date completedTime
    
    BatchOperationStatus status
    /* Array with the catalogs items processing records part of the catalogs items batch */
    List<HotelProcessingRecord> items
}
