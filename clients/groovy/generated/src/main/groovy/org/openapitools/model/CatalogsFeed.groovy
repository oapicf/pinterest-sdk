package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsDbItem;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.Country;
import org.openapitools.model.FeedFields;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;

@Canonical
class CatalogsFeed {
    
    Date createdAt
    
    String id
    
    Date updatedAt
    
    Country defaultCountry
    
    ProductAvailabilityType defaultAvailability
    
    NullableCurrency defaultCurrency
    /* A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. */
    String name
    
    CatalogsFormat format
    /* The locale used within a feed for product descriptions. */
    String defaultLocale
    
    CatalogsFeedCredentials credentials
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    String location
    
    CatalogsFeedProcessingSchedule preferredProcessingSchedule
    
    CatalogsStatus status
}
