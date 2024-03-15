package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class LineItem {
    /* Product brand. For example, \"Parker\". */
    String productBrand
    /* Product category. For example, \"Shoes\". */
    String productCategory
    /* Product ID. For example, 1414. */
    Integer productId
    /* Product name. For example, \"Parker Boots\". */
    String productName
    /* Product price. For example, \"99.99\". */
    String productPrice
    /* Product quantity. For example, 2. */
    Integer productQuantity
    /* Product variant. For example, \"Red\". */
    String productVariant
    /* Product variant ID. For example, \"1414-34832\". */
    String productVariantId
}
