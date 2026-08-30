
package org.openapitools.client.model


case class CatalogsFeedValidationErrors (
    /* Some items have invalid adult values. */
    _ADULT_INVALID: Option[Integer],
    /* Some adwords links contain too many characters. */
    _ADWORDS_FORMAT_INVALID: Option[Integer],
    /* Some items are missing an availability value in their product metadata, those items will not be published. */
    _AVAILABILITY_INVALID: Option[Integer],
    /* Some items were not published because they don't meet Pinterest's Merchant Guidelines. */
    _BLOCKLISTED_IMAGE_SIGNATURE: Option[Integer],
    /* Your feed includes data with formatting errors. */
    _DELIMITER_ERROR: Option[Integer],
    /* Some items are missing a description in their product metadata, those items will not be published. */
    _DESCRIPTION_MISSING: Option[Integer],
    /* Some products are duplicated. */
    _DUPLICATE_PRODUCTS: Option[Integer],
    /* Your feed includes data with an unsupported encoding format. */
    _ENCODING_ERROR: Option[Integer],
    /* Your feed contains too many items, some items will not be published. */
    _FEED_LENGTH_TOO_LONG: Option[Integer],
    /* Your feed couldn't be validated because the file doesn't contain the minimum number of lines required. */
    _FEED_TOO_SMALL: Option[Integer],
    /* Pinterest couldn't download your feed. */
    _FETCH_ERROR: Option[Integer],
    /* Your feed wasn't ingested because it hasn't changed in the previous 90 days. */
    _FETCH_INACTIVE_FEED_ERROR: Option[Integer],
    /* Some image links are formatted incorrectly. */
    _IMAGE_LINK_INVALID: Option[Integer],
    /* Some items have image_link URLs that contain too many characters, so those items will not be published. */
    _IMAGE_LINK_LENGTH_TOO_LONG: Option[Integer],
    /* Some items are missing an image link URL in their product metadata, those items will not be published. */
    _IMAGE_LINK_MISSING: Option[Integer],
    /* We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. */
    _INTERNAL_SERVICE_ERROR: Option[Integer],
    /* Some of your product link values don't match the verified domain associated with this account. */
    _INVALID_DOMAIN: Option[Integer],
    /* Some items' main images can't be found. */
    _ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[Integer],
    /* Some items are missing an item id in their product metadata, those items will not be published. */
    _ITEMID_MISSING: Option[Integer],
    /* Some link values are formatted incorrectly. */
    _LINK_FORMAT_INVALID: Option[Integer],
    /* Some product links contain too many characters, those items will not be published. */
    _LINK_LENGTH_TOO_LONG: Option[Integer],
    /* Some items have list price formatting errors in their product metadata, those items will not be published. */
    _LIST_PRICE_INVALID: Option[Integer],
    /* Your feed couldn't be validated because the xml file is formatted incorrectly. */
    _MALFORMED_XML: Option[Integer],
    /* Some items exceed the maximum number of items per item group, those items will not be published. */
    _MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Option[Integer],
    /* Your merchant domain needs to be claimed. */
    _NO_VERIFIED_DOMAIN: Option[Integer],
    /* Your feed contains formatting errors for some items. */
    _PARSE_LINE_ERROR: Option[Integer],
    /* Some items were not published because they don't meet Pinterest's Merchant Guidelines. */
    _PINJOIN_CONTENT_UNSAFE: Option[Integer],
    /* Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. */
    _PRICE_CANNOT_BE_DETERMINED: Option[Integer],
    /* Some products are missing a price, those items will not be published. */
    _PRICE_MISSING: Option[Integer],
    /* Some items are missing a link URL in their product metadata, those items will not be published. */
    _PRODUCT_LINK_MISSING: Option[Integer],
    /* Some items have price formatting errors in their product metadata, those items will not be published. */
    _PRODUCT_PRICE_INVALID: Option[Integer],
    /* Your feed is missing some required column headers. */
    _REQUIRED_COLUMNS_MISSING: Option[Integer],
    /* Some items are missing a title in their product metadata, those items will not be published. */
    _TITLE_MISSING: Option[Integer]
)
object CatalogsFeedValidationErrors {
    def toStringBody(var_ADULT_INVALID: Object, var_ADWORDS_FORMAT_INVALID: Object, var_AVAILABILITY_INVALID: Object, var_BLOCKLISTED_IMAGE_SIGNATURE: Object, var_DELIMITER_ERROR: Object, var_DESCRIPTION_MISSING: Object, var_DUPLICATE_PRODUCTS: Object, var_ENCODING_ERROR: Object, var_FEED_LENGTH_TOO_LONG: Object, var_FEED_TOO_SMALL: Object, var_FETCH_ERROR: Object, var_FETCH_INACTIVE_FEED_ERROR: Object, var_IMAGE_LINK_INVALID: Object, var_IMAGE_LINK_LENGTH_TOO_LONG: Object, var_IMAGE_LINK_MISSING: Object, var_INTERNAL_SERVICE_ERROR: Object, var_INVALID_DOMAIN: Object, var_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Object, var_ITEMID_MISSING: Object, var_LINK_FORMAT_INVALID: Object, var_LINK_LENGTH_TOO_LONG: Object, var_LIST_PRICE_INVALID: Object, var_MALFORMED_XML: Object, var_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Object, var_NO_VERIFIED_DOMAIN: Object, var_PARSE_LINE_ERROR: Object, var_PINJOIN_CONTENT_UNSAFE: Object, var_PRICE_CANNOT_BE_DETERMINED: Object, var_PRICE_MISSING: Object, var_PRODUCT_LINK_MISSING: Object, var_PRODUCT_PRICE_INVALID: Object, var_REQUIRED_COLUMNS_MISSING: Object, var_TITLE_MISSING: Object) =
        s"""
        | {
        | "ADULT_INVALID":$var_ADULT_INVALID,"ADWORDS_FORMAT_INVALID":$var_ADWORDS_FORMAT_INVALID,"AVAILABILITY_INVALID":$var_AVAILABILITY_INVALID,"BLOCKLISTED_IMAGE_SIGNATURE":$var_BLOCKLISTED_IMAGE_SIGNATURE,"DELIMITER_ERROR":$var_DELIMITER_ERROR,"DESCRIPTION_MISSING":$var_DESCRIPTION_MISSING,"DUPLICATE_PRODUCTS":$var_DUPLICATE_PRODUCTS,"ENCODING_ERROR":$var_ENCODING_ERROR,"FEED_LENGTH_TOO_LONG":$var_FEED_LENGTH_TOO_LONG,"FEED_TOO_SMALL":$var_FEED_TOO_SMALL,"FETCH_ERROR":$var_FETCH_ERROR,"FETCH_INACTIVE_FEED_ERROR":$var_FETCH_INACTIVE_FEED_ERROR,"IMAGE_LINK_INVALID":$var_IMAGE_LINK_INVALID,"IMAGE_LINK_LENGTH_TOO_LONG":$var_IMAGE_LINK_LENGTH_TOO_LONG,"IMAGE_LINK_MISSING":$var_IMAGE_LINK_MISSING,"INTERNAL_SERVICE_ERROR":$var_INTERNAL_SERVICE_ERROR,"INVALID_DOMAIN":$var_INVALID_DOMAIN,"ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE":$var_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE,"ITEMID_MISSING":$var_ITEMID_MISSING,"LINK_FORMAT_INVALID":$var_LINK_FORMAT_INVALID,"LINK_LENGTH_TOO_LONG":$var_LINK_LENGTH_TOO_LONG,"LIST_PRICE_INVALID":$var_LIST_PRICE_INVALID,"MALFORMED_XML":$var_MALFORMED_XML,"MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED":$var_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED,"NO_VERIFIED_DOMAIN":$var_NO_VERIFIED_DOMAIN,"PARSE_LINE_ERROR":$var_PARSE_LINE_ERROR,"PINJOIN_CONTENT_UNSAFE":$var_PINJOIN_CONTENT_UNSAFE,"PRICE_CANNOT_BE_DETERMINED":$var_PRICE_CANNOT_BE_DETERMINED,"PRICE_MISSING":$var_PRICE_MISSING,"PRODUCT_LINK_MISSING":$var_PRODUCT_LINK_MISSING,"PRODUCT_PRICE_INVALID":$var_PRODUCT_PRICE_INVALID,"REQUIRED_COLUMNS_MISSING":$var_REQUIRED_COLUMNS_MISSING,"TITLE_MISSING":$var_TITLE_MISSING
        | }
        """.stripMargin
}
