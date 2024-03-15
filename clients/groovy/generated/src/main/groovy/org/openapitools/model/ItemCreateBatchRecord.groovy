package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemAttributes;

@Canonical
class ItemCreateBatchRecord {
    /* The catalog item id in the merchant namespace */
    String itemId
    
    ItemAttributes attributes
}
