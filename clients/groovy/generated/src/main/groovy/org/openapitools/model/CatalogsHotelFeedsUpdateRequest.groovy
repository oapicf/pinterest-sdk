package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsFeedCredentials;
import org.openapitools.model.CatalogsFeedProcessingSchedule;
import org.openapitools.model.CatalogsFormat;
import org.openapitools.model.CatalogsStatus;
import org.openapitools.model.NullableCurrency;

@Canonical
class CatalogsHotelFeedsUpdateRequest {

    enum CatalogTypeEnum {
    
        HOTEL("HOTEL")
    
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
    
    CatalogsFeedCredentials credentials
    
    NullableCurrency defaultCurrency
    
    CatalogsFormat format
    /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
    String location
    /* A human-friendly name associated to a given feed. */
    String name
    
    CatalogsFeedProcessingSchedule preferredProcessingSchedule
    
    CatalogsStatus status
}
