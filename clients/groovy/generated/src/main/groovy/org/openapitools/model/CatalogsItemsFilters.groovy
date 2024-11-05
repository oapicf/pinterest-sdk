package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsCreativeAssetsItemsFilter;
import org.openapitools.model.CatalogsHotelItemsFilter;
import org.openapitools.model.CatalogsRetailItemsFilter;
import org.openapitools.model.CatalogsType;

@Canonical
class CatalogsItemsFilters {
    
    CatalogsType catalogType
    
    List<String> itemIds = new ArrayList<>()
    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    String catalogId
    
    List<String> hotelIds = new ArrayList<>()
    
    List<String> creativeAssetsIds = new ArrayList<>()
}
