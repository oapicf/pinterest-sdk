package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CatalogBinding {
    /* Catalog type */
    String catalogType
    /* Catalog ID. */
    String id
    /* Catalog name */
    String name
}
