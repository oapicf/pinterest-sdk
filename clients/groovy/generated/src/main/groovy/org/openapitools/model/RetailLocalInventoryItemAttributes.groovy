package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemAvailability;

@Canonical
class RetailLocalInventoryItemAttributes {
    /* Ad link for the item */
    String adLink
    /* Availability status of the item */
    ItemAvailability availability
    /* The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. */
    String price
    /* The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. */
    String salePrice
}
