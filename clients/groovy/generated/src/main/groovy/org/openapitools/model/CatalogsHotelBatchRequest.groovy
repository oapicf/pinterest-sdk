package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsHotelBatchItem;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.Language;

@Canonical
class CatalogsHotelBatchRequest {
    
    CatalogsType catalogType
    
    Country country
    
    Language language
    /* Array with catalogs item operations */
    List<CatalogsHotelBatchItem> items = new ArrayList<>()
    /* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
    String catalogId
}
