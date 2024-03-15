package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogsFeedIngestionInfo {
    /* The number of ingested products that are in stock. */
    Integer IN_STOCK
    /* The number of ingested products that are in out of stock. */
    Integer OUT_OF_STOCK
    /* The number of ingested products that are in preorder. */
    Integer PREORDER
}
