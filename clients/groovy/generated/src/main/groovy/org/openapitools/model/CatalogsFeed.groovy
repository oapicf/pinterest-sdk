package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsFeed;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsHotelFeed;
import org.openapitools.model.CatalogsRetailFeed;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.Country;
import org.openapitools.model.NullableCurrency;
import org.openapitools.model.ProductAvailabilityType;

@Canonical
class CatalogsFeed {

    enum CatalogTypeEnum {
    
        CREATIVE_ASSETS("CREATIVE_ASSETS")
    
        private final String value
    
        CatalogTypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    CatalogTypeEnum catalogType
    
    Date createdAt
    
    CatalogsFeedCredentials credentials
    
    ProductAvailabilityType defaultAvailability
    
    Country defaultCountry
    
    NullableCurrency defaultCurrency
    /* The locale used within a feed for product descriptions. */
    String defaultLocale
    
    CatalogsFormat format
    /* ID of the feed entity. */
    String id
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    String location
    /* A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. */
    String name
    
    CatalogsFeedProcessingSchedule preferredProcessingSchedule
    
    CatalogsStatus status
    
    Date updatedAt
    /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. */
    String catalogId
}
