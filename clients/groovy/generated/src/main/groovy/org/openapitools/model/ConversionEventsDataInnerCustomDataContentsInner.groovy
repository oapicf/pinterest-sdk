package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ConversionEventsDataInnerCustomDataContentsInner {
    /* The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
    String id
    /* The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
    String itemPrice
    /* The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
    Long quantity
    /* The name of a product. */
    String itemName
    /* The category of a product. */
    String itemCategory
    /* The brand of a product. */
    String itemBrand
}
