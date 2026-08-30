
package org.openapitools.client.model


case class CatalogsItemValidationErrors (
    /* Item has an invalid adult value. */
    _ADULT_INVALID: Option[CatalogsItemValidationDetails],
    /* Adword link contains too many characters. */
    _ADWORDS_FORMAT_INVALID: Option[CatalogsItemValidationDetails],
    /* Item is missing availability value in its product metadata, this item will not be published. */
    _AVAILABILITY_INVALID: Option[CatalogsItemValidationDetails],
    /* Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. */
    _BLOCKLISTED_IMAGE_SIGNATURE: Option[CatalogsItemValidationDetails],
    /* Item is missing description in its product metadata, this item will not be published. */
    _DESCRIPTION_MISSING: Option[CatalogsItemValidationDetails],
    /* This product is duplicated. The duplicate entry will not be published. */
    _DUPLICATE_PRODUCTS: Option[CatalogsItemValidationDetails],
    /* Image link is invalid. */
    _IMAGE_LINK_INVALID: Option[CatalogsItemValidationDetails],
    /* Item has image_link URL that contains too many characters, so the item will not be published. */
    _IMAGE_LINK_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails],
    /* Item is missing an image link URL in its product metadata, this item will not be published. */
    _IMAGE_LINK_MISSING: Option[CatalogsItemValidationDetails],
    /* Product link value doesn't match the verified domain associated with this account. */
    _INVALID_DOMAIN: Option[CatalogsItemValidationDetails],
    /* Main image can't be found. */
    _ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[CatalogsItemValidationDetails],
    /* Item is missing item id in its product metadata, this item will not be published. */
    _ITEMID_MISSING: Option[CatalogsItemValidationDetails],
    /* Link is invalid. */
    _LINK_FORMAT_INVALID: Option[CatalogsItemValidationDetails],
    /* Product link contains too many characters, this item will not be published. */
    _LINK_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails],
    /* Item has a list price formatting error, this item will not be published. */
    _LIST_PRICE_INVALID: Option[CatalogsItemValidationDetails],
    /* Item exceed the maximum number of items per item group, this item will not be published. */
    _MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Option[CatalogsItemValidationDetails],
    /* Item contains formating errors. */
    _PARSE_LINE_ERROR: Option[CatalogsItemValidationDetails],
    /* Item will not be published because it doesn't meet Pinterest's Merchant Guidelines. */
    _PINJOIN_CONTENT_UNSAFE: Option[CatalogsItemValidationDetails],
    /* Item price cannot be determined because the price, list price, and sale price are all different. */
    _PRICE_CANNOT_BE_DETERMINED: Option[CatalogsItemValidationDetails],
    /* Product is missing a price, this item will not be published. */
    _PRICE_MISSING: Option[CatalogsItemValidationDetails],
    /* Item is missing a link URL in its product metadata, this item will not be published. */
    _PRODUCT_LINK_MISSING: Option[CatalogsItemValidationDetails],
    /* Item has a price formatting error in its product metadata, this item will not be published. */
    _PRODUCT_PRICE_INVALID: Option[CatalogsItemValidationDetails],
    /* Item is missing title in its product metadata, this item will not be published. */
    _TITLE_MISSING: Option[CatalogsItemValidationDetails]
)
object CatalogsItemValidationErrors {
    def toStringBody(var_ADULT_INVALID: Object, var_ADWORDS_FORMAT_INVALID: Object, var_AVAILABILITY_INVALID: Object, var_BLOCKLISTED_IMAGE_SIGNATURE: Object, var_DESCRIPTION_MISSING: Object, var_DUPLICATE_PRODUCTS: Object, var_IMAGE_LINK_INVALID: Object, var_IMAGE_LINK_LENGTH_TOO_LONG: Object, var_IMAGE_LINK_MISSING: Object, var_INVALID_DOMAIN: Object, var_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Object, var_ITEMID_MISSING: Object, var_LINK_FORMAT_INVALID: Object, var_LINK_LENGTH_TOO_LONG: Object, var_LIST_PRICE_INVALID: Object, var_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Object, var_PARSE_LINE_ERROR: Object, var_PINJOIN_CONTENT_UNSAFE: Object, var_PRICE_CANNOT_BE_DETERMINED: Object, var_PRICE_MISSING: Object, var_PRODUCT_LINK_MISSING: Object, var_PRODUCT_PRICE_INVALID: Object, var_TITLE_MISSING: Object) =
        s"""
        | {
        | "ADULT_INVALID":$var_ADULT_INVALID,"ADWORDS_FORMAT_INVALID":$var_ADWORDS_FORMAT_INVALID,"AVAILABILITY_INVALID":$var_AVAILABILITY_INVALID,"BLOCKLISTED_IMAGE_SIGNATURE":$var_BLOCKLISTED_IMAGE_SIGNATURE,"DESCRIPTION_MISSING":$var_DESCRIPTION_MISSING,"DUPLICATE_PRODUCTS":$var_DUPLICATE_PRODUCTS,"IMAGE_LINK_INVALID":$var_IMAGE_LINK_INVALID,"IMAGE_LINK_LENGTH_TOO_LONG":$var_IMAGE_LINK_LENGTH_TOO_LONG,"IMAGE_LINK_MISSING":$var_IMAGE_LINK_MISSING,"INVALID_DOMAIN":$var_INVALID_DOMAIN,"ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE":$var_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE,"ITEMID_MISSING":$var_ITEMID_MISSING,"LINK_FORMAT_INVALID":$var_LINK_FORMAT_INVALID,"LINK_LENGTH_TOO_LONG":$var_LINK_LENGTH_TOO_LONG,"LIST_PRICE_INVALID":$var_LIST_PRICE_INVALID,"MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED":$var_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED,"PARSE_LINE_ERROR":$var_PARSE_LINE_ERROR,"PINJOIN_CONTENT_UNSAFE":$var_PINJOIN_CONTENT_UNSAFE,"PRICE_CANNOT_BE_DETERMINED":$var_PRICE_CANNOT_BE_DETERMINED,"PRICE_MISSING":$var_PRICE_MISSING,"PRODUCT_LINK_MISSING":$var_PRODUCT_LINK_MISSING,"PRODUCT_PRICE_INVALID":$var_PRODUCT_PRICE_INVALID,"TITLE_MISSING":$var_TITLE_MISSING
        | }
        """.stripMargin
}
