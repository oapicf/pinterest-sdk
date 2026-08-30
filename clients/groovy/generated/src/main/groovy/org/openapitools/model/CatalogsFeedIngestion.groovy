package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsFeedProcessingStatus;

@Canonical
class CatalogsFeedIngestion {
    /* Timestamp of the feed ingestion. */
    Date createdAt
    /* Catalog Feed id pertaining to the feed ingestion. */
    String feedId
    /* Unique identifier of a feed ingestion. */
    String id
    /* Status of the feed ingestion. */
    CatalogsFeedProcessingStatus status
}
