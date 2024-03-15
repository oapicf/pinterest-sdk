
package org.openapitools.client.model


case class CatalogsItemValidationErrors (
    _ADULT_INVALID: Option[CatalogsItemValidationDetails],
    _ADWORDS_FORMAT_INVALID: Option[CatalogsItemValidationDetails],
    _AVAILABILITY_INVALID: Option[CatalogsItemValidationDetails],
    _BLOCKLISTED_IMAGE_SIGNATURE: Option[CatalogsItemValidationDetails],
    _DESCRIPTION_MISSING: Option[CatalogsItemValidationDetails],
    _DUPLICATE_PRODUCTS: Option[CatalogsItemValidationDetails],
    _IMAGE_LINK_INVALID: Option[CatalogsItemValidationDetails],
    _IMAGE_LINK_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails],
    _IMAGE_LINK_MISSING: Option[CatalogsItemValidationDetails],
    _INVALID_DOMAIN: Option[CatalogsItemValidationDetails],
    _ITEMID_MISSING: Option[CatalogsItemValidationDetails],
    _ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[CatalogsItemValidationDetails],
    _LINK_FORMAT_INVALID: Option[CatalogsItemValidationDetails],
    _LINK_LENGTH_TOO_LONG: Option[CatalogsItemValidationDetails],
    _LIST_PRICE_INVALID: Option[CatalogsItemValidationDetails],
    _MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Option[CatalogsItemValidationDetails],
    _PARSE_LINE_ERROR: Option[CatalogsItemValidationDetails],
    _PINJOIN_CONTENT_UNSAFE: Option[CatalogsItemValidationDetails],
    _PRICE_CANNOT_BE_DETERMINED: Option[CatalogsItemValidationDetails],
    _PRICE_MISSING: Option[CatalogsItemValidationDetails],
    _PRODUCT_LINK_MISSING: Option[CatalogsItemValidationDetails],
    _PRODUCT_PRICE_INVALID: Option[CatalogsItemValidationDetails],
    _TITLE_MISSING: Option[CatalogsItemValidationDetails]
)
object CatalogsItemValidationErrors {
    def toStringBody(var_ADULT_INVALID: Object, var_ADWORDS_FORMAT_INVALID: Object, var_AVAILABILITY_INVALID: Object, var_BLOCKLISTED_IMAGE_SIGNATURE: Object, var_DESCRIPTION_MISSING: Object, var_DUPLICATE_PRODUCTS: Object, var_IMAGE_LINK_INVALID: Object, var_IMAGE_LINK_LENGTH_TOO_LONG: Object, var_IMAGE_LINK_MISSING: Object, var_INVALID_DOMAIN: Object, var_ITEMID_MISSING: Object, var_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Object, var_LINK_FORMAT_INVALID: Object, var_LINK_LENGTH_TOO_LONG: Object, var_LIST_PRICE_INVALID: Object, var_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Object, var_PARSE_LINE_ERROR: Object, var_PINJOIN_CONTENT_UNSAFE: Object, var_PRICE_CANNOT_BE_DETERMINED: Object, var_PRICE_MISSING: Object, var_PRODUCT_LINK_MISSING: Object, var_PRODUCT_PRICE_INVALID: Object, var_TITLE_MISSING: Object) =
        s"""
        | {
        | "ADULT_INVALID":$var_ADULT_INVALID,"ADWORDS_FORMAT_INVALID":$var_ADWORDS_FORMAT_INVALID,"AVAILABILITY_INVALID":$var_AVAILABILITY_INVALID,"BLOCKLISTED_IMAGE_SIGNATURE":$var_BLOCKLISTED_IMAGE_SIGNATURE,"DESCRIPTION_MISSING":$var_DESCRIPTION_MISSING,"DUPLICATE_PRODUCTS":$var_DUPLICATE_PRODUCTS,"IMAGE_LINK_INVALID":$var_IMAGE_LINK_INVALID,"IMAGE_LINK_LENGTH_TOO_LONG":$var_IMAGE_LINK_LENGTH_TOO_LONG,"IMAGE_LINK_MISSING":$var_IMAGE_LINK_MISSING,"INVALID_DOMAIN":$var_INVALID_DOMAIN,"ITEMID_MISSING":$var_ITEMID_MISSING,"ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE":$var_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE,"LINK_FORMAT_INVALID":$var_LINK_FORMAT_INVALID,"LINK_LENGTH_TOO_LONG":$var_LINK_LENGTH_TOO_LONG,"LIST_PRICE_INVALID":$var_LIST_PRICE_INVALID,"MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED":$var_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED,"PARSE_LINE_ERROR":$var_PARSE_LINE_ERROR,"PINJOIN_CONTENT_UNSAFE":$var_PINJOIN_CONTENT_UNSAFE,"PRICE_CANNOT_BE_DETERMINED":$var_PRICE_CANNOT_BE_DETERMINED,"PRICE_MISSING":$var_PRICE_MISSING,"PRODUCT_LINK_MISSING":$var_PRODUCT_LINK_MISSING,"PRODUCT_PRICE_INVALID":$var_PRODUCT_PRICE_INVALID,"TITLE_MISSING":$var_TITLE_MISSING
        | }
        """.stripMargin
}
