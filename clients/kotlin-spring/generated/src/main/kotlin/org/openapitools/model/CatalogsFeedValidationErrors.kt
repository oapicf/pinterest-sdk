package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param FETCH_ERROR Pinterest couldn't download your feed.
 * @param FETCH_INACTIVE_FEED_ERROR Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
 * @param ENCODING_ERROR Your feed includes data with an unsupported encoding format.
 * @param DELIMITER_ERROR Your feed includes data with formatting errors.
 * @param REQUIRED_COLUMNS_MISSING Your feed is missing some required column headers.
 * @param DUPLICATE_PRODUCTS Some products are duplicated.
 * @param IMAGE_LINK_INVALID Some image links are formatted incorrectly.
 * @param ITEMID_MISSING Some items are missing an item id in their product metadata, those items will not be published.
 * @param TITLE_MISSING Some items are missing a title in their product metadata, those items will not be published.
 * @param DESCRIPTION_MISSING Some items are missing a description in their product metadata, those items will not be published.
 * @param PRODUCT_LINK_MISSING Some items are missing a link URL in their product metadata, those items will not be published.
 * @param IMAGE_LINK_MISSING Some items are missing an image link URL in their product metadata, those items will not be published.
 * @param AVAILABILITY_INVALID Some items are missing an availability value in their product metadata, those items will not be published.
 * @param PRODUCT_PRICE_INVALID Some items have price formatting errors in their product metadata, those items will not be published.
 * @param LINK_FORMAT_INVALID Some link values are formatted incorrectly.
 * @param PARSE_LINE_ERROR Your feed contains formatting errors for some items.
 * @param ADWORDS_FORMAT_INVALID Some adwords links contain too many characters.
 * @param INTERNAL_SERVICE_ERROR We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
 * @param NO_VERIFIED_DOMAIN Your merchant domain needs to be claimed.
 * @param ADULT_INVALID Some items have invalid adult values.
 * @param IMAGE_LINK_LENGTH_TOO_LONG Some items have image_link URLs that contain too many characters, so those items will not be published.
 * @param INVALID_DOMAIN Some of your product link values don't match the verified domain associated with this account.
 * @param FEED_LENGTH_TOO_LONG Your feed contains too many items, some items will not be published.
 * @param LINK_LENGTH_TOO_LONG Some product links contain too many characters, those items will not be published.
 * @param MALFORMED_XML Your feed couldn't be validated because the xml file is formatted incorrectly.
 * @param PRICE_MISSING Some products are missing a price, those items will not be published.
 * @param FEED_TOO_SMALL Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
 * @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Some items exceed the maximum number of items per item group, those items will not be published.
 * @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Some items' main images can't be found.
 * @param PINJOIN_CONTENT_UNSAFE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
 * @param BLOCKLISTED_IMAGE_SIGNATURE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
 * @param LIST_PRICE_INVALID Some items have list price formatting errors in their product metadata, those items will not be published.
 * @param PRICE_CANNOT_BE_DETERMINED Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
 */
data class CatalogsFeedValidationErrors(

    @Schema(example = "null", description = "Pinterest couldn't download your feed.")
    @get:JsonProperty("FETCH_ERROR") val FETCH_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Your feed wasn't ingested because it hasn’t changed in the previous 90 days.")
    @get:JsonProperty("FETCH_INACTIVE_FEED_ERROR") val FETCH_INACTIVE_FEED_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Your feed includes data with an unsupported encoding format.")
    @get:JsonProperty("ENCODING_ERROR") val ENCODING_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Your feed includes data with formatting errors.")
    @get:JsonProperty("DELIMITER_ERROR") val DELIMITER_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Your feed is missing some required column headers.")
    @get:JsonProperty("REQUIRED_COLUMNS_MISSING") val REQUIRED_COLUMNS_MISSING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some products are duplicated.")
    @get:JsonProperty("DUPLICATE_PRODUCTS") val DUPLICATE_PRODUCTS: kotlin.Int? = null,

    @Schema(example = "null", description = "Some image links are formatted incorrectly.")
    @get:JsonProperty("IMAGE_LINK_INVALID") val IMAGE_LINK_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items are missing an item id in their product metadata, those items will not be published.")
    @get:JsonProperty("ITEMID_MISSING") val ITEMID_MISSING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items are missing a title in their product metadata, those items will not be published.")
    @get:JsonProperty("TITLE_MISSING") val TITLE_MISSING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items are missing a description in their product metadata, those items will not be published.")
    @get:JsonProperty("DESCRIPTION_MISSING") val DESCRIPTION_MISSING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items are missing a link URL in their product metadata, those items will not be published.")
    @get:JsonProperty("PRODUCT_LINK_MISSING") val PRODUCT_LINK_MISSING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items are missing an image link URL in their product metadata, those items will not be published.")
    @get:JsonProperty("IMAGE_LINK_MISSING") val IMAGE_LINK_MISSING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items are missing an availability value in their product metadata, those items will not be published.")
    @get:JsonProperty("AVAILABILITY_INVALID") val AVAILABILITY_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have price formatting errors in their product metadata, those items will not be published.")
    @get:JsonProperty("PRODUCT_PRICE_INVALID") val PRODUCT_PRICE_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some link values are formatted incorrectly.")
    @get:JsonProperty("LINK_FORMAT_INVALID") val LINK_FORMAT_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Your feed contains formatting errors for some items.")
    @get:JsonProperty("PARSE_LINE_ERROR") val PARSE_LINE_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Some adwords links contain too many characters.")
    @get:JsonProperty("ADWORDS_FORMAT_INVALID") val ADWORDS_FORMAT_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.")
    @get:JsonProperty("INTERNAL_SERVICE_ERROR") val INTERNAL_SERVICE_ERROR: kotlin.Int? = null,

    @Schema(example = "null", description = "Your merchant domain needs to be claimed.")
    @get:JsonProperty("NO_VERIFIED_DOMAIN") val NO_VERIFIED_DOMAIN: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have invalid adult values.")
    @get:JsonProperty("ADULT_INVALID") val ADULT_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have image_link URLs that contain too many characters, so those items will not be published.")
    @get:JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG") val IMAGE_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(example = "null", description = "Some of your product link values don't match the verified domain associated with this account.")
    @get:JsonProperty("INVALID_DOMAIN") val INVALID_DOMAIN: kotlin.Int? = null,

    @Schema(example = "null", description = "Your feed contains too many items, some items will not be published.")
    @get:JsonProperty("FEED_LENGTH_TOO_LONG") val FEED_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(example = "null", description = "Some product links contain too many characters, those items will not be published.")
    @get:JsonProperty("LINK_LENGTH_TOO_LONG") val LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(example = "null", description = "Your feed couldn't be validated because the xml file is formatted incorrectly.")
    @get:JsonProperty("MALFORMED_XML") val MALFORMED_XML: kotlin.Int? = null,

    @Schema(example = "null", description = "Some products are missing a price, those items will not be published.")
    @get:JsonProperty("PRICE_MISSING") val PRICE_MISSING: kotlin.Int? = null,

    @Schema(example = "null", description = "Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.")
    @get:JsonProperty("FEED_TOO_SMALL") val FEED_TOO_SMALL: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items exceed the maximum number of items per item group, those items will not be published.")
    @get:JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED") val MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items' main images can't be found.")
    @get:JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE") val ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items were not published because they don't meet Pinterest's Merchant Guidelines.")
    @get:JsonProperty("PINJOIN_CONTENT_UNSAFE") val PINJOIN_CONTENT_UNSAFE: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items were not published because they don't meet Pinterest's Merchant Guidelines.")
    @get:JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE") val BLOCKLISTED_IMAGE_SIGNATURE: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have list price formatting errors in their product metadata, those items will not be published.")
    @get:JsonProperty("LIST_PRICE_INVALID") val LIST_PRICE_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.")
    @get:JsonProperty("PRICE_CANNOT_BE_DETERMINED") val PRICE_CANNOT_BE_DETERMINED: kotlin.Int? = null
    ) {

}

