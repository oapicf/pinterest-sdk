package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param ADULT_INVALID Some items have invalid adult values.
 * @param ADWORDS_FORMAT_INVALID Some adwords links contain too many characters.
 * @param AVAILABILITY_INVALID Some items are missing an availability value in their product metadata, those items will not be published.
 * @param BLOCKLISTED_IMAGE_SIGNATURE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
 * @param DELIMITER_ERROR Your feed includes data with formatting errors.
 * @param DESCRIPTION_MISSING Some items are missing a description in their product metadata, those items will not be published.
 * @param DUPLICATE_PRODUCTS Some products are duplicated.
 * @param ENCODING_ERROR Your feed includes data with an unsupported encoding format.
 * @param FEED_LENGTH_TOO_LONG Your feed contains too many items, some items will not be published.
 * @param FEED_TOO_SMALL Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
 * @param FETCH_ERROR Pinterest couldn't download your feed.
 * @param FETCH_INACTIVE_FEED_ERROR Your feed wasn't ingested because it hasn't changed in the previous 90 days.
 * @param IMAGE_LINK_INVALID Some image links are formatted incorrectly.
 * @param IMAGE_LINK_LENGTH_TOO_LONG Some items have image_link URLs that contain too many characters, so those items will not be published.
 * @param IMAGE_LINK_MISSING Some items are missing an image link URL in their product metadata, those items will not be published.
 * @param INTERNAL_SERVICE_ERROR We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
 * @param INVALID_DOMAIN Some of your product link values don't match the verified domain associated with this account.
 * @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Some items' main images can't be found.
 * @param ITEMID_MISSING Some items are missing an item id in their product metadata, those items will not be published.
 * @param LINK_FORMAT_INVALID Some link values are formatted incorrectly.
 * @param LINK_LENGTH_TOO_LONG Some product links contain too many characters, those items will not be published.
 * @param LIST_PRICE_INVALID Some items have list price formatting errors in their product metadata, those items will not be published.
 * @param MALFORMED_XML Your feed couldn't be validated because the xml file is formatted incorrectly.
 * @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Some items exceed the maximum number of items per item group, those items will not be published.
 * @param NO_VERIFIED_DOMAIN Your merchant domain needs to be claimed.
 * @param PARSE_LINE_ERROR Your feed contains formatting errors for some items.
 * @param PINJOIN_CONTENT_UNSAFE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
 * @param PRICE_CANNOT_BE_DETERMINED Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
 * @param PRICE_MISSING Some products are missing a price, those items will not be published.
 * @param PRODUCT_LINK_MISSING Some items are missing a link URL in their product metadata, those items will not be published.
 * @param PRODUCT_PRICE_INVALID Some items have price formatting errors in their product metadata, those items will not be published.
 * @param REQUIRED_COLUMNS_MISSING Your feed is missing some required column headers.
 * @param TITLE_MISSING Some items are missing a title in their product metadata, those items will not be published.
 */
data class CatalogsFeedValidationErrors(

    @Schema(description = "Some items have invalid adult values.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ADULT_INVALID")
    @get:JsonProperty("ADULT_INVALID") val ADULT_INVALID: kotlin.Int? = null,

    @Schema(description = "Some adwords links contain too many characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ADWORDS_FORMAT_INVALID")
    @get:JsonProperty("ADWORDS_FORMAT_INVALID") val ADWORDS_FORMAT_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items are missing an availability value in their product metadata, those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AVAILABILITY_INVALID")
    @get:JsonProperty("AVAILABILITY_INVALID") val AVAILABILITY_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items were not published because they don't meet Pinterest's Merchant Guidelines.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE")
    @get:JsonProperty("BLOCKLISTED_IMAGE_SIGNATURE") val BLOCKLISTED_IMAGE_SIGNATURE: kotlin.Int? = null,

    @Schema(description = "Your feed includes data with formatting errors.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("DELIMITER_ERROR")
    @get:JsonProperty("DELIMITER_ERROR") val DELIMITER_ERROR: kotlin.Int? = null,

    @Schema(description = "Some items are missing a description in their product metadata, those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("DESCRIPTION_MISSING")
    @get:JsonProperty("DESCRIPTION_MISSING") val DESCRIPTION_MISSING: kotlin.Int? = null,

    @Schema(description = "Some products are duplicated.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("DUPLICATE_PRODUCTS")
    @get:JsonProperty("DUPLICATE_PRODUCTS") val DUPLICATE_PRODUCTS: kotlin.Int? = null,

    @Schema(description = "Your feed includes data with an unsupported encoding format.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ENCODING_ERROR")
    @get:JsonProperty("ENCODING_ERROR") val ENCODING_ERROR: kotlin.Int? = null,

    @Schema(description = "Your feed contains too many items, some items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("FEED_LENGTH_TOO_LONG")
    @get:JsonProperty("FEED_LENGTH_TOO_LONG") val FEED_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("FEED_TOO_SMALL")
    @get:JsonProperty("FEED_TOO_SMALL") val FEED_TOO_SMALL: kotlin.Int? = null,

    @Schema(description = "Pinterest couldn't download your feed.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("FETCH_ERROR")
    @get:JsonProperty("FETCH_ERROR") val FETCH_ERROR: kotlin.Int? = null,

    @Schema(description = "Your feed wasn't ingested because it hasn't changed in the previous 90 days.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("FETCH_INACTIVE_FEED_ERROR")
    @get:JsonProperty("FETCH_INACTIVE_FEED_ERROR") val FETCH_INACTIVE_FEED_ERROR: kotlin.Int? = null,

    @Schema(description = "Some image links are formatted incorrectly.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("IMAGE_LINK_INVALID")
    @get:JsonProperty("IMAGE_LINK_INVALID") val IMAGE_LINK_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items have image_link URLs that contain too many characters, so those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("IMAGE_LINK_LENGTH_TOO_LONG") val IMAGE_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Some items are missing an image link URL in their product metadata, those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("IMAGE_LINK_MISSING")
    @get:JsonProperty("IMAGE_LINK_MISSING") val IMAGE_LINK_MISSING: kotlin.Int? = null,

    @Schema(description = "We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("INTERNAL_SERVICE_ERROR")
    @get:JsonProperty("INTERNAL_SERVICE_ERROR") val INTERNAL_SERVICE_ERROR: kotlin.Int? = null,

    @Schema(description = "Some of your product link values don't match the verified domain associated with this account.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("INVALID_DOMAIN")
    @get:JsonProperty("INVALID_DOMAIN") val INVALID_DOMAIN: kotlin.Int? = null,

    @Schema(description = "Some items' main images can't be found.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
    @get:JsonProperty("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE") val ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: kotlin.Int? = null,

    @Schema(description = "Some items are missing an item id in their product metadata, those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ITEMID_MISSING")
    @get:JsonProperty("ITEMID_MISSING") val ITEMID_MISSING: kotlin.Int? = null,

    @Schema(description = "Some link values are formatted incorrectly.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("LINK_FORMAT_INVALID")
    @get:JsonProperty("LINK_FORMAT_INVALID") val LINK_FORMAT_INVALID: kotlin.Int? = null,

    @Schema(description = "Some product links contain too many characters, those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("LINK_LENGTH_TOO_LONG") val LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Some items have list price formatting errors in their product metadata, those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("LIST_PRICE_INVALID")
    @get:JsonProperty("LIST_PRICE_INVALID") val LIST_PRICE_INVALID: kotlin.Int? = null,

    @Schema(description = "Your feed couldn't be validated because the xml file is formatted incorrectly.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("MALFORMED_XML")
    @get:JsonProperty("MALFORMED_XML") val MALFORMED_XML: kotlin.Int? = null,

    @Schema(description = "Some items exceed the maximum number of items per item group, those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
    @get:JsonProperty("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED") val MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: kotlin.Int? = null,

    @Schema(description = "Your merchant domain needs to be claimed.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("NO_VERIFIED_DOMAIN")
    @get:JsonProperty("NO_VERIFIED_DOMAIN") val NO_VERIFIED_DOMAIN: kotlin.Int? = null,

    @Schema(description = "Your feed contains formatting errors for some items.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PARSE_LINE_ERROR")
    @get:JsonProperty("PARSE_LINE_ERROR") val PARSE_LINE_ERROR: kotlin.Int? = null,

    @Schema(description = "Some items were not published because they don't meet Pinterest's Merchant Guidelines.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PINJOIN_CONTENT_UNSAFE")
    @get:JsonProperty("PINJOIN_CONTENT_UNSAFE") val PINJOIN_CONTENT_UNSAFE: kotlin.Int? = null,

    @Schema(description = "Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PRICE_CANNOT_BE_DETERMINED")
    @get:JsonProperty("PRICE_CANNOT_BE_DETERMINED") val PRICE_CANNOT_BE_DETERMINED: kotlin.Int? = null,

    @Schema(description = "Some products are missing a price, those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PRICE_MISSING")
    @get:JsonProperty("PRICE_MISSING") val PRICE_MISSING: kotlin.Int? = null,

    @Schema(description = "Some items are missing a link URL in their product metadata, those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PRODUCT_LINK_MISSING")
    @get:JsonProperty("PRODUCT_LINK_MISSING") val PRODUCT_LINK_MISSING: kotlin.Int? = null,

    @Schema(description = "Some items have price formatting errors in their product metadata, those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PRODUCT_PRICE_INVALID")
    @get:JsonProperty("PRODUCT_PRICE_INVALID") val PRODUCT_PRICE_INVALID: kotlin.Int? = null,

    @Schema(description = "Your feed is missing some required column headers.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("REQUIRED_COLUMNS_MISSING")
    @get:JsonProperty("REQUIRED_COLUMNS_MISSING") val REQUIRED_COLUMNS_MISSING: kotlin.Int? = null,

    @Schema(description = "Some items are missing a title in their product metadata, those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("TITLE_MISSING")
    @get:JsonProperty("TITLE_MISSING") val TITLE_MISSING: kotlin.Int? = null
) {

}

