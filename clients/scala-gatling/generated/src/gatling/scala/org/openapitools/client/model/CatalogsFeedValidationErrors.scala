
package org.openapitools.client.model


case class CatalogsFeedValidationErrors (
    /* Pinterest couldn't download your feed. */
    _FETCH_ERROR: Option[Integer],
    /* Your feed wasn't ingested because it hasn’t changed in the previous 90 days. */
    _FETCH_INACTIVE_FEED_ERROR: Option[Integer],
    /* Your feed includes data with an unsupported encoding format. */
    _ENCODING_ERROR: Option[Integer],
    /* Your feed includes data with formatting errors. */
    _DELIMITER_ERROR: Option[Integer],
    /* Your feed is missing some required column headers. */
    _REQUIRED_COLUMNS_MISSING: Option[Integer],
    /* Some products are duplicated. */
    _DUPLICATE_PRODUCTS: Option[Integer],
    /* Some image links are formatted incorrectly. */
    _IMAGE_LINK_INVALID: Option[Integer],
    /* Some items are missing an item id in their product metadata, those items will not be published. */
    _ITEMID_MISSING: Option[Integer],
    /* Some items are missing a title in their product metadata, those items will not be published. */
    _TITLE_MISSING: Option[Integer],
    /* Some items are missing a description in their product metadata, those items will not be published. */
    _DESCRIPTION_MISSING: Option[Integer],
    /* Some items are missing a link URL in their product metadata, those items will not be published. */
    _PRODUCT_LINK_MISSING: Option[Integer],
    /* Some items are missing an image link URL in their product metadata, those items will not be published. */
    _IMAGE_LINK_MISSING: Option[Integer],
    /* Some items are missing an availability value in their product metadata, those items will not be published. */
    _AVAILABILITY_INVALID: Option[Integer],
    /* Some items have price formatting errors in their product metadata, those items will not be published. */
    _PRODUCT_PRICE_INVALID: Option[Integer],
    /* Some link values are formatted incorrectly. */
    _LINK_FORMAT_INVALID: Option[Integer],
    /* Your feed contains formatting errors for some items. */
    _PARSE_LINE_ERROR: Option[Integer],
    /* Some adwords links contain too many characters. */
    _ADWORDS_FORMAT_INVALID: Option[Integer],
    /* We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. */
    _INTERNAL_SERVICE_ERROR: Option[Integer],
    /* Your merchant domain needs to be claimed. */
    _NO_VERIFIED_DOMAIN: Option[Integer],
    /* Some items have invalid adult values. */
    _ADULT_INVALID: Option[Integer],
    /* Some items have image_link URLs that contain too many characters, so those items will not be published. */
    _IMAGE_LINK_LENGTH_TOO_LONG: Option[Integer],
    /* Some of your product link values don't match the verified domain associated with this account. */
    _INVALID_DOMAIN: Option[Integer],
    /* Your feed contains too many items, some items will not be published. */
    _FEED_LENGTH_TOO_LONG: Option[Integer],
    /* Some product links contain too many characters, those items will not be published. */
    _LINK_LENGTH_TOO_LONG: Option[Integer],
    /* Your feed couldn't be validated because the xml file is formatted incorrectly. */
    _MALFORMED_XML: Option[Integer],
    /* Some products are missing a price, those items will not be published. */
    _PRICE_MISSING: Option[Integer],
    /* Your feed couldn't be validated because the file doesn't contain the minimum number of lines required. */
    _FEED_TOO_SMALL: Option[Integer],
    /* Some items exceed the maximum number of items per item group, those items will not be published. */
    _MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Option[Integer],
    /* Some items' main images can't be found. */
    _ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[Integer],
    /* Some items were not published because they don't meet Pinterest's Merchant Guidelines. */
    _PINJOIN_CONTENT_UNSAFE: Option[Integer],
    /* Some items were not published because they don't meet Pinterest's Merchant Guidelines. */
    _BLOCKLISTED_IMAGE_SIGNATURE: Option[Integer],
    /* Some items have list price formatting errors in their product metadata, those items will not be published. */
    _LIST_PRICE_INVALID: Option[Integer],
    /* Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. */
    _PRICE_CANNOT_BE_DETERMINED: Option[Integer]
)
object CatalogsFeedValidationErrors {
    def toStringBody(var_FETCH_ERROR: Object, var_FETCH_INACTIVE_FEED_ERROR: Object, var_ENCODING_ERROR: Object, var_DELIMITER_ERROR: Object, var_REQUIRED_COLUMNS_MISSING: Object, var_DUPLICATE_PRODUCTS: Object, var_IMAGE_LINK_INVALID: Object, var_ITEMID_MISSING: Object, var_TITLE_MISSING: Object, var_DESCRIPTION_MISSING: Object, var_PRODUCT_LINK_MISSING: Object, var_IMAGE_LINK_MISSING: Object, var_AVAILABILITY_INVALID: Object, var_PRODUCT_PRICE_INVALID: Object, var_LINK_FORMAT_INVALID: Object, var_PARSE_LINE_ERROR: Object, var_ADWORDS_FORMAT_INVALID: Object, var_INTERNAL_SERVICE_ERROR: Object, var_NO_VERIFIED_DOMAIN: Object, var_ADULT_INVALID: Object, var_IMAGE_LINK_LENGTH_TOO_LONG: Object, var_INVALID_DOMAIN: Object, var_FEED_LENGTH_TOO_LONG: Object, var_LINK_LENGTH_TOO_LONG: Object, var_MALFORMED_XML: Object, var_PRICE_MISSING: Object, var_FEED_TOO_SMALL: Object, var_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Object, var_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Object, var_PINJOIN_CONTENT_UNSAFE: Object, var_BLOCKLISTED_IMAGE_SIGNATURE: Object, var_LIST_PRICE_INVALID: Object, var_PRICE_CANNOT_BE_DETERMINED: Object) =
        s"""
        | {
        | "FETCH_ERROR":$var_FETCH_ERROR,"FETCH_INACTIVE_FEED_ERROR":$var_FETCH_INACTIVE_FEED_ERROR,"ENCODING_ERROR":$var_ENCODING_ERROR,"DELIMITER_ERROR":$var_DELIMITER_ERROR,"REQUIRED_COLUMNS_MISSING":$var_REQUIRED_COLUMNS_MISSING,"DUPLICATE_PRODUCTS":$var_DUPLICATE_PRODUCTS,"IMAGE_LINK_INVALID":$var_IMAGE_LINK_INVALID,"ITEMID_MISSING":$var_ITEMID_MISSING,"TITLE_MISSING":$var_TITLE_MISSING,"DESCRIPTION_MISSING":$var_DESCRIPTION_MISSING,"PRODUCT_LINK_MISSING":$var_PRODUCT_LINK_MISSING,"IMAGE_LINK_MISSING":$var_IMAGE_LINK_MISSING,"AVAILABILITY_INVALID":$var_AVAILABILITY_INVALID,"PRODUCT_PRICE_INVALID":$var_PRODUCT_PRICE_INVALID,"LINK_FORMAT_INVALID":$var_LINK_FORMAT_INVALID,"PARSE_LINE_ERROR":$var_PARSE_LINE_ERROR,"ADWORDS_FORMAT_INVALID":$var_ADWORDS_FORMAT_INVALID,"INTERNAL_SERVICE_ERROR":$var_INTERNAL_SERVICE_ERROR,"NO_VERIFIED_DOMAIN":$var_NO_VERIFIED_DOMAIN,"ADULT_INVALID":$var_ADULT_INVALID,"IMAGE_LINK_LENGTH_TOO_LONG":$var_IMAGE_LINK_LENGTH_TOO_LONG,"INVALID_DOMAIN":$var_INVALID_DOMAIN,"FEED_LENGTH_TOO_LONG":$var_FEED_LENGTH_TOO_LONG,"LINK_LENGTH_TOO_LONG":$var_LINK_LENGTH_TOO_LONG,"MALFORMED_XML":$var_MALFORMED_XML,"PRICE_MISSING":$var_PRICE_MISSING,"FEED_TOO_SMALL":$var_FEED_TOO_SMALL,"MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED":$var_MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED,"ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE":$var_ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE,"PINJOIN_CONTENT_UNSAFE":$var_PINJOIN_CONTENT_UNSAFE,"BLOCKLISTED_IMAGE_SIGNATURE":$var_BLOCKLISTED_IMAGE_SIGNATURE,"LIST_PRICE_INVALID":$var_LIST_PRICE_INVALID,"PRICE_CANNOT_BE_DETERMINED":$var_PRICE_CANNOT_BE_DETERMINED
        | }
        """.stripMargin
}
