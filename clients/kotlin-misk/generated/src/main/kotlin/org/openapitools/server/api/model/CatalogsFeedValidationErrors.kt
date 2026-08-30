package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedValidationErrors(
    /** Some items have invalid adult values. */
    val ADULT_INVALID: kotlin.Int? = null,
    /** Some adwords links contain too many characters. */
    val ADWORDS_FORMAT_INVALID: kotlin.Int? = null,
    /** Some items are missing an availability value in their product metadata, those items will not be published. */
    val AVAILABILITY_INVALID: kotlin.Int? = null,
    /** Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. */
    val BLOCKLISTED_IMAGE_SIGNATURE: kotlin.Int? = null,
    /** Your feed includes data with formatting errors. */
    val DELIMITER_ERROR: kotlin.Int? = null,
    /** Some items are missing a description in their product metadata, those items will not be published. */
    val DESCRIPTION_MISSING: kotlin.Int? = null,
    /** Some products are duplicated. */
    val DUPLICATE_PRODUCTS: kotlin.Int? = null,
    /** Your feed includes data with an unsupported encoding format. */
    val ENCODING_ERROR: kotlin.Int? = null,
    /** Your feed contains too many items, some items will not be published. */
    val FEED_LENGTH_TOO_LONG: kotlin.Int? = null,
    /** Your feed couldn&#39;t be validated because the file doesn&#39;t contain the minimum number of lines required. */
    val FEED_TOO_SMALL: kotlin.Int? = null,
    /** Pinterest couldn&#39;t download your feed. */
    val FETCH_ERROR: kotlin.Int? = null,
    /** Your feed wasn&#39;t ingested because it hasn&#39;t changed in the previous 90 days. */
    val FETCH_INACTIVE_FEED_ERROR: kotlin.Int? = null,
    /** Some image links are formatted incorrectly. */
    val IMAGE_LINK_INVALID: kotlin.Int? = null,
    /** Some items have image_link URLs that contain too many characters, so those items will not be published. */
    val IMAGE_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,
    /** Some items are missing an image link URL in their product metadata, those items will not be published. */
    val IMAGE_LINK_MISSING: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. */
    val INTERNAL_SERVICE_ERROR: kotlin.Int? = null,
    /** Some of your product link values don&#39;t match the verified domain associated with this account. */
    val INVALID_DOMAIN: kotlin.Int? = null,
    /** Some items&#39; main images can&#39;t be found. */
    val ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: kotlin.Int? = null,
    /** Some items are missing an item id in their product metadata, those items will not be published. */
    val ITEMID_MISSING: kotlin.Int? = null,
    /** Some link values are formatted incorrectly. */
    val LINK_FORMAT_INVALID: kotlin.Int? = null,
    /** Some product links contain too many characters, those items will not be published. */
    val LINK_LENGTH_TOO_LONG: kotlin.Int? = null,
    /** Some items have list price formatting errors in their product metadata, those items will not be published. */
    val LIST_PRICE_INVALID: kotlin.Int? = null,
    /** Your feed couldn&#39;t be validated because the xml file is formatted incorrectly. */
    val MALFORMED_XML: kotlin.Int? = null,
    /** Some items exceed the maximum number of items per item group, those items will not be published. */
    val MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: kotlin.Int? = null,
    /** Your merchant domain needs to be claimed. */
    val NO_VERIFIED_DOMAIN: kotlin.Int? = null,
    /** Your feed contains formatting errors for some items. */
    val PARSE_LINE_ERROR: kotlin.Int? = null,
    /** Some items were not published because they don&#39;t meet Pinterest&#39;s Merchant Guidelines. */
    val PINJOIN_CONTENT_UNSAFE: kotlin.Int? = null,
    /** Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. */
    val PRICE_CANNOT_BE_DETERMINED: kotlin.Int? = null,
    /** Some products are missing a price, those items will not be published. */
    val PRICE_MISSING: kotlin.Int? = null,
    /** Some items are missing a link URL in their product metadata, those items will not be published. */
    val PRODUCT_LINK_MISSING: kotlin.Int? = null,
    /** Some items have price formatting errors in their product metadata, those items will not be published. */
    val PRODUCT_PRICE_INVALID: kotlin.Int? = null,
    /** Your feed is missing some required column headers. */
    val REQUIRED_COLUMNS_MISSING: kotlin.Int? = null,
    /** Some items are missing a title in their product metadata, those items will not be published. */
    val TITLE_MISSING: kotlin.Int? = null
)
