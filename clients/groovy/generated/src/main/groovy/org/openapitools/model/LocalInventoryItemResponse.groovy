package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemAvailability;
import org.openapitools.model.StoreMetadata;

@Canonical
class LocalInventoryItemResponse {
    /* Ad link for the item */
    String adLink
    /* Availability status of the item */
    ItemAvailability availability
    /* The millisecond timestamp when the local inventory item was created */
    Long createdAt
    /* The catalog item id in the merchant namespace */
    String itemId
    /* The millisecond timestamp when the local inventory item was lastly modified by the merchant. */
    Long lastUpdatedTime
    /* The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. */
    String price
    /* The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. */
    String salePrice
    /* Store metadata for this local inventory item */
    StoreMetadata storeMetadata
}
