package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param fetchError 
 * @param fetchInactiveFeedError 
 * @param encodingError 
 * @param delimiterError 
 * @param requiredColumnsMissing 
 * @param imageLinkInvalid 
 * @param itemidMissing 
 * @param titleMissing 
 * @param descriptionMissing 
 * @param productCategoryInvalid 
 * @param productLinkMissing 
 * @param imageLinkMissing 
 * @param availabilityInvalid 
 * @param productPriceInvalid 
 * @param linkFormatInvalid 
 * @param parseLineError 
 * @param adwordsFormatInvalid 
 * @param productCategoryMissing 
 * @param internalServiceError 
 * @param noVerifiedDomain 
 * @param adultInvalid 
 * @param invalidDomain 
 * @param feedLengthTooLong 
 * @param linkLengthTooLong 
 * @param malformedXml 
 * @param redirectInvalid 
 * @param priceMissing 
 * @param feedTooSmall 
 * @param conditionInvalid 
 * @param shopifyNoProducts 
 * @param maxItemsPerItemGroupExceeded 
 * @param itemMainImageDownloadFailure 
 * @param pinjoinContentUnsafe 
 * @param blocklistedImageSignature 
 */
data class CatalogsFeedValidationErrors(

    @field:JsonProperty("fetch_error") val fetchError: kotlin.Int? = null,

    @field:JsonProperty("fetch_inactive_feed_error") val fetchInactiveFeedError: kotlin.Int? = null,

    @field:JsonProperty("encoding_error") val encodingError: kotlin.Int? = null,

    @field:JsonProperty("delimiter_error") val delimiterError: kotlin.Int? = null,

    @field:JsonProperty("required_columns_missing") val requiredColumnsMissing: kotlin.Int? = null,

    @field:JsonProperty("image_link_invalid") val imageLinkInvalid: kotlin.Int? = null,

    @field:JsonProperty("itemid_missing") val itemidMissing: kotlin.Int? = null,

    @field:JsonProperty("title_missing") val titleMissing: kotlin.Int? = null,

    @field:JsonProperty("description_missing") val descriptionMissing: kotlin.Int? = null,

    @field:JsonProperty("product_category_invalid") val productCategoryInvalid: kotlin.Int? = null,

    @field:JsonProperty("product_link_missing") val productLinkMissing: kotlin.Int? = null,

    @field:JsonProperty("image_link_missing") val imageLinkMissing: kotlin.Int? = null,

    @field:JsonProperty("availability_invalid") val availabilityInvalid: kotlin.Int? = null,

    @field:JsonProperty("product_price_invalid") val productPriceInvalid: kotlin.Int? = null,

    @field:JsonProperty("link_format_invalid") val linkFormatInvalid: kotlin.Int? = null,

    @field:JsonProperty("parse_line_error") val parseLineError: kotlin.Int? = null,

    @field:JsonProperty("adwords_format_invalid") val adwordsFormatInvalid: kotlin.Int? = null,

    @field:JsonProperty("product_category_missing") val productCategoryMissing: kotlin.Int? = null,

    @field:JsonProperty("internal_service_error") val internalServiceError: kotlin.Int? = null,

    @field:JsonProperty("no_verified_domain") val noVerifiedDomain: kotlin.Int? = null,

    @field:JsonProperty("adult_invalid") val adultInvalid: kotlin.Int? = null,

    @field:JsonProperty("invalid_domain") val invalidDomain: kotlin.Int? = null,

    @field:JsonProperty("feed_length_too_long") val feedLengthTooLong: kotlin.Int? = null,

    @field:JsonProperty("link_length_too_long") val linkLengthTooLong: kotlin.Int? = null,

    @field:JsonProperty("malformed_xml") val malformedXml: kotlin.Int? = null,

    @field:JsonProperty("redirect_invalid") val redirectInvalid: kotlin.Int? = null,

    @field:JsonProperty("price_missing") val priceMissing: kotlin.Int? = null,

    @field:JsonProperty("feed_too_small") val feedTooSmall: kotlin.Int? = null,

    @field:JsonProperty("condition_invalid") val conditionInvalid: kotlin.Int? = null,

    @field:JsonProperty("shopify_no_products") val shopifyNoProducts: kotlin.Int? = null,

    @field:JsonProperty("max_items_per_item_group_exceeded") val maxItemsPerItemGroupExceeded: kotlin.Int? = null,

    @field:JsonProperty("item_main_image_download_failure") val itemMainImageDownloadFailure: kotlin.Int? = null,

    @field:JsonProperty("pinjoin_content_unsafe") val pinjoinContentUnsafe: kotlin.Int? = null,

    @field:JsonProperty("blocklisted_image_signature") val blocklistedImageSignature: kotlin.Int? = null
) {

}

