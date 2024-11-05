package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsCreativeAssetsItemsPostFilter;
import org.openapitools.model.CatalogsHotelItemsPostFilter;
import org.openapitools.model.CatalogsRetailItemsPostFilter;
import org.openapitools.model.CatalogsType;

@Canonical
class CatalogsItemsPostFilters {
    
    CatalogsType catalogType
    
    List<String> itemIds = new ArrayList<>()
    /* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
    String catalogId
    
    List<String> hotelIds = new ArrayList<>()
    
    List<String> creativeAssetsIds = new ArrayList<>()
}
