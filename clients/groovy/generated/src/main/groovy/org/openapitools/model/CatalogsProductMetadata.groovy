package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NonNullableProductAvailabilityType;

@Canonical
class CatalogsProductMetadata {
    /* The user-created unique ID that represents the product. */
    String itemId
    /* The parent ID of the product. */
    String itemGroupId
    
    NonNullableProductAvailabilityType availability
    /* The price of the product. */
    BigDecimal price
    /* The discounted price of the product. */
    BigDecimal salePrice
    
    NonNullableCatalogsCurrency currency
}
