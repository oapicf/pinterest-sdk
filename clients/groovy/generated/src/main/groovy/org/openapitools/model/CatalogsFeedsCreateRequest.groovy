package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFeedsCreateRequestDefaultLocale;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;

@Canonical
class CatalogsFeedsCreateRequest {
    
    CatalogsFeedCredentials credentials
    
    ProductAvailabilityType defaultAvailability
    
    Country defaultCountry
    
    NullableCurrency defaultCurrency
    
    CatalogsFeedsCreateRequestDefaultLocale defaultLocale
    
    CatalogsFormat format
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    String location
    /* A human-friendly name associated to a given feed. */
    String name
    
    CatalogsFeedProcessingSchedule preferredProcessingSchedule
    
    CatalogsStatus status = "ACTIVE"
}
