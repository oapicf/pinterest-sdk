package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ItemIdStoreCodePair {
    /* Catalog item id in the merchant namespace */
    String itemId
    /* Store code for the local inventory item */
    String storeCode
}
