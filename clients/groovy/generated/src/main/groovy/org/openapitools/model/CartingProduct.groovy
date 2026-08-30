package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CartingRetailer;

@Canonical
class CartingProduct {
    /* the internal Pinterest carting product id (different from industry product id) */
    String cartingProductId
    /* Whether to display only the preferred retailers for the carting product */
    Boolean displayPreferredRetailersOnly
    /* Whether to display the price for the carting product */
    Boolean displayProductPrice
    /* A sorted array of preferred retailers for the carting product */
    List<CartingRetailer> preferredRetailers = new ArrayList<>()
    /* Whether to randomize preferred retailers for the carting product */
    Boolean randomizePreferredRetailers
}
