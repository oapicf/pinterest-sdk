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
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;

@Canonical
class CatalogsRetailFeedsCreateRequest {
    
    NullableCurrency defaultCurrency
    /* A human-friendly name associated to a given feed. */
    String name
    
    CatalogsFormat format
    
    CatalogsFeedsCreateRequestDefaultLocale defaultLocale
    
    CatalogsFeedCredentials credentials
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    String location
    
    CatalogsFeedProcessingSchedule preferredProcessingSchedule
    
    CatalogsType catalogType
    
    Country defaultCountry
    
    ProductAvailabilityType defaultAvailability
    
    CatalogsStatus status
}
