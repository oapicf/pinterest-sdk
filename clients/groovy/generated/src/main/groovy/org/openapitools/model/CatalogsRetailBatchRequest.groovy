package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CatalogsRetailBatchRequestItemsInner;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.Language;

@Canonical
class CatalogsRetailBatchRequest {
    
    CatalogsType catalogType
    
    Country country
    
    Language language
    /* Array with catalogs item operations */
    List<CatalogsRetailBatchRequestItemsInner> items = new ArrayList<>()
}
