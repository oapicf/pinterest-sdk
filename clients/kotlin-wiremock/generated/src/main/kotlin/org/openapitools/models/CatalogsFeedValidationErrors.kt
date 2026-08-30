@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedValidationErrors(
    @field:JsonProperty("ADULT_INVALID")
    val ADULT_INVALID: kotlin.Int? = null,

    @field:JsonProperty("ADWORDS_FORMAT_INVALID")
    val ADWORDS_FORMAT_INVALID: kotlin.Int? = null,

    @field:JsonProperty("AVAILABILITY_INVALID")
    val AVAILABILITY_INVALID: kotlin.Int? = null,

    @field:JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE")
    val BLOCKLISTED_IMAGE_SIGNATURE: kotlin.Int? = null,

    @field:JsonProperty("DELIMITER_ERROR")
    val DELIMITER_ERROR: kotlin.Int? = null,

    @field:JsonProperty("DESCRIPTION_MISSING")
    val DESCRIPTION_MISSING: kotlin.Int? = null,

    @field:JsonProperty("DUPLICATE_PRODUCTS")
    val DUPLICATE_PRODUCTS: kotlin.Int? = null,

    @field:JsonProperty("ENCODING_ERROR")
    val ENCODING_ERROR: kotlin.Int? = null,

    @field:JsonProperty("FEED_LENGTH_TOO_LONG")
    val FEED_LENGTH_TOO_LONG: kotlin.Int? = null,

    @field:JsonProperty("FEED_TOO_SMALL")
    val FEED_TOO_SMALL: kotlin.Int? = null,

    @field:JsonProperty("FETCH_ERROR")
    val FETCH_ERROR: kotlin.Int? = null,

    @field:JsonProperty("FETCH_INACTIVE_FEED_ERROR")
    val FETCH_INACTIVE_FEED_ERROR: kotlin.Int? = null,

    @field:JsonProperty("IMAGE_LINK_INVALID")
    val IMAGE_LINK_INVALID: kotlin.Int? = null,

    @field:JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG")
    val IMAGE_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @field:JsonProperty("IMAGE_LINK_MISSING")
    val IMAGE_LINK_MISSING: kotlin.Int? = null,

    @field:JsonProperty("INTERNAL_SERVICE_ERROR")
    val INTERNAL_SERVICE_ERROR: kotlin.Int? = null,

    @field:JsonProperty("INVALID_DOMAIN")
    val INVALID_DOMAIN: kotlin.Int? = null,

    @field:JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
    val ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: kotlin.Int? = null,

    @field:JsonProperty("ITEMID_MISSING")
    val ITEMID_MISSING: kotlin.Int? = null,

    @field:JsonProperty("LINK_FORMAT_INVALID")
    val LINK_FORMAT_INVALID: kotlin.Int? = null,

    @field:JsonProperty("LINK_LENGTH_TOO_LONG")
    val LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @field:JsonProperty("LIST_PRICE_INVALID")
    val LIST_PRICE_INVALID: kotlin.Int? = null,

    @field:JsonProperty("MALFORMED_XML")
    val MALFORMED_XML: kotlin.Int? = null,

    @field:JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
    val MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: kotlin.Int? = null,

    @field:JsonProperty("NO_VERIFIED_DOMAIN")
    val NO_VERIFIED_DOMAIN: kotlin.Int? = null,

    @field:JsonProperty("PARSE_LINE_ERROR")
    val PARSE_LINE_ERROR: kotlin.Int? = null,

    @field:JsonProperty("PINJOIN_CONTENT_UNSAFE")
    val PINJOIN_CONTENT_UNSAFE: kotlin.Int? = null,

    @field:JsonProperty("PRICE_CANNOT_BE_DETERMINED")
    val PRICE_CANNOT_BE_DETERMINED: kotlin.Int? = null,

    @field:JsonProperty("PRICE_MISSING")
    val PRICE_MISSING: kotlin.Int? = null,

    @field:JsonProperty("PRODUCT_LINK_MISSING")
    val PRODUCT_LINK_MISSING: kotlin.Int? = null,

    @field:JsonProperty("PRODUCT_PRICE_INVALID")
    val PRODUCT_PRICE_INVALID: kotlin.Int? = null,

    @field:JsonProperty("REQUIRED_COLUMNS_MISSING")
    val REQUIRED_COLUMNS_MISSING: kotlin.Int? = null,

    @field:JsonProperty("TITLE_MISSING")
    val TITLE_MISSING: kotlin.Int? = null,

)
