package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchOperationStatus;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.HotelProcessingRecord;

@Canonical
class CatalogsHotelItemsBatch {
    /* Id of the catalogs items batch */
    String batchId
    
    CatalogsType catalogType
    /* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
    Date completedTime
    /* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */
    Date createdTime
    /* Array with the catalogs items processing records part of the catalogs items batch */
    List<HotelProcessingRecord> items = new ArrayList<>()
    
    BatchOperationStatus status
}
