package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Board;
import org.openapitools.model.EntityStatus;

@Canonical
class CatalogProductGroup {
    /* ID of the catalog product group. */
    String id
    /* Merchant ID pertaining to the owner of the catalog product group. */
    String merchantId
    /* Name of catalog product group */
    String name
    /* Object holding a list of filters */
    Object filters
    /* Object holding a list of filters */
    Object filterV2
    
    Board type
    
    EntityStatus status
    /* id of the feed profile belonging to this catalog product group */
    String feedProfileId
    /* Unix timestamp in seconds of when catalog product group was created. */
    Integer createdAt
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    Integer lastUpdate
    /* Amount of products in the catalog product group */
    Integer productCount
    /* index of the featured position of the catalog product group */
    Integer featuredPosition
}
