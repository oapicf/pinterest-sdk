package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsItemValidationDetails;

@Canonical
class CatalogsItemValidationErrors {
    /* Item has an invalid adult value. */
    CatalogsItemValidationDetails ADULT_INVALID
    /* Adword link contains too many characters. */
    CatalogsItemValidationDetails ADWORDS_FORMAT_INVALID
    /* Item is missing availability value in its product metadata, this item will not be published. */
    CatalogsItemValidationDetails AVAILABILITY_INVALID
    /* Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. */
    CatalogsItemValidationDetails BLOCKLISTED_IMAGE_SIGNATURE
    /* Item is missing description in its product metadata, this item will not be published. */
    CatalogsItemValidationDetails DESCRIPTION_MISSING
    /* This product is duplicated. The duplicate entry will not be published. */
    CatalogsItemValidationDetails DUPLICATE_PRODUCTS
    /* Image link is invalid. */
    CatalogsItemValidationDetails IMAGE_LINK_INVALID
    /* Item has image_link URL that contains too many characters, so the item will not be published. */
    CatalogsItemValidationDetails IMAGE_LINK_LENGTH_TOO_LONG
    /* Item is missing an image link URL in its product metadata, this item will not be published. */
    CatalogsItemValidationDetails IMAGE_LINK_MISSING
    /* Product link value doesn't match the verified domain associated with this account. */
    CatalogsItemValidationDetails INVALID_DOMAIN
    /* Main image can't be found. */
    CatalogsItemValidationDetails ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE
    /* Item is missing item id in its product metadata, this item will not be published. */
    CatalogsItemValidationDetails ITEMID_MISSING
    /* Link is invalid. */
    CatalogsItemValidationDetails LINK_FORMAT_INVALID
    /* Product link contains too many characters, this item will not be published. */
    CatalogsItemValidationDetails LINK_LENGTH_TOO_LONG
    /* Item has a list price formatting error, this item will not be published. */
    CatalogsItemValidationDetails LIST_PRICE_INVALID
    /* Item exceed the maximum number of items per item group, this item will not be published. */
    CatalogsItemValidationDetails MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED
    /* Item contains formating errors. */
    CatalogsItemValidationDetails PARSE_LINE_ERROR
    /* Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. */
    CatalogsItemValidationDetails PINJOIN_CONTENT_UNSAFE
    /* Item price cannot be determined because the price, list price, and sale price are all different. */
    CatalogsItemValidationDetails PRICE_CANNOT_BE_DETERMINED
    /* Product is missing a price, this item will not be published. */
    CatalogsItemValidationDetails PRICE_MISSING
    /* Item is missing a link URL in its product metadata, this item will not be published. */
    CatalogsItemValidationDetails PRODUCT_LINK_MISSING
    /* Item has a price formatting error in its product metadata, this item will not be published. */
    CatalogsItemValidationDetails PRODUCT_PRICE_INVALID
    /* Item is missing title in its product metadata, this item will not be published. */
    CatalogsItemValidationDetails TITLE_MISSING
}
