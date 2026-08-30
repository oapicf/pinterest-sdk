package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.ProductAvailability;

@Canonical
class CatalogsRetailProductMetadata {
    
    ProductAvailability availability
    
    NonNullableCatalogsCurrency currency
    /* The parent ID of the product. */
    String itemGroupId
    /* The user-created unique ID that represents the product. */
    String itemId
    /* The price of the product. */
    BigDecimal price
    /* The discounted price of the product. */
    BigDecimal salePrice
}
