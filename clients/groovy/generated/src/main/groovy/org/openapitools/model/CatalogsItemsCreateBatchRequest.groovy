package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BatchOperation;
import org.openapitools.model.Country;
import org.openapitools.model.ItemCreateBatchRecord;
import org.openapitools.model.Language;

@Canonical
class CatalogsItemsCreateBatchRequest {
    
    Country country
    
    Language language
    
    BatchOperation operation
    /* Array with catalogs items */
    List<ItemCreateBatchRecord> items = new ArrayList<>()
}
