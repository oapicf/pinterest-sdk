package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class StoreMetadata {
    /* Geohash of the store location */
    String geohash
    /* Geographic latitude coordinate of the store */
    Double latitude
    /* Geographic longitude coordinate of the store */
    Double longitude
    /* Merchant provided store code */
    String storeCode
    /* Internal store code */
    String storeId
    /* Store name */
    String storeName
}
