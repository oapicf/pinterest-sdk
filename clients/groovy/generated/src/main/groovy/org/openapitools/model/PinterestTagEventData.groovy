package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Currency;
import org.openapitools.model.LineItem;

@Canonical
class PinterestTagEventData {
    
    Currency currency
    /* Promotion code. For example, \"Newsletter\". */
    String leadType
    
    LineItem lineItems
    /* Order ID. For example, \"X-151481\". */
    String orderId
    /* Order quantity. For example, 1. */
    Integer orderQuantity
    /* Page name. For example, \"Our Favorite Pins on Pinterest\". */
    String pageName
    /* Promotion code. For example, \"WINTER10\". */
    String promoCode
    /* Property. For example, \"Athleta\". */
    String property
    /* Search query string. For example, \"boots\". */
    String searchQuery
    /* Product value. For example, \"199.98\" */
    String value
    /* Video title. For example, \"How to style your Parker Boots\". */
    String videoTitle
}
