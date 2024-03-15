package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsHotelItemsFilter;
import org.openapitools.model.CatalogsRetailItemsFilter;
import org.openapitools.model.CatalogsType;

@Canonical
class CatalogsItemsFilters {
    
    CatalogsType catalogType
    
    List<String> itemIds = new ArrayList<>()
    /* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
    String catalogId
    
    List<String> hotelIds = new ArrayList<>()
}
