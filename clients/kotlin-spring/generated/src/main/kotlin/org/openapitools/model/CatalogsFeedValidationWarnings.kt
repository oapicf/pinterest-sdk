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
 * @param titleLengthTooLong 
 * @param descriptionLengthTooLong 
 * @param genderInvalid 
 * @param ageGroupInvalid 
 * @param sizeTypeInvalid 
 * @param linkFormatWarning 
 * @param duplicateProducts 
 * @param duplicateLinks 
 * @param salesPriceInvalid 
 * @param productCategoryDepthWarning 
 * @param adwordsSameAsLink 
 * @param duplicateHeaders 
 * @param fetchSameSignature 
 * @param adwordsFormatWarning 
 * @param additionalImageLinkWarning 
 * @param imageLinkWarning 
 * @param shippingInvalid 
 * @param taxInvalid 
 * @param shippingWeightInvalid 
 * @param expirationDateInvalid 
 * @param availabilityDateInvalid 
 * @param saleDateInvalid 
 * @param weightUnitInvalid 
 * @param isBundleInvalid 
 * @param updatedTimeInvalid 
 * @param customLabelLengthTooLong 
 * @param productTypeLengthTooLong 
 * @param tooManyAdditionalImageLinks 
 * @param multipackInvalid 
 * @param indexedProductCountLargeDelta 
 * @param itemAdditionalImageDownloadFailure 
 * @param optionalProductCategoryMissing 
 * @param optionalProductCategoryInvalid 
 * @param optionalConditionMissing 
 * @param optionalConditionInvalid 
 * @param iosDeepLinkInvalid 
 * @param androidDeepLinkInvalid 
 * @param availabilityNormalized 
 * @param conditionNormalized 
 * @param genderNormalized 
 * @param sizeTypeNormalized 
 * @param ageGroupNormalized 
 * @param utmSourceAutoCorrected 
 * @param countryDoesNotMapToCurrency 
 * @param minAdPriceInvalid 
 */
data class CatalogsFeedValidationWarnings(

    @field:JsonProperty("title_length_too_long") val titleLengthTooLong: kotlin.Int? = null,

    @field:JsonProperty("description_length_too_long") val descriptionLengthTooLong: kotlin.Int? = null,

    @field:JsonProperty("gender_invalid") val genderInvalid: kotlin.Int? = null,

    @field:JsonProperty("age_group_invalid") val ageGroupInvalid: kotlin.Int? = null,

    @field:JsonProperty("size_type_invalid") val sizeTypeInvalid: kotlin.Int? = null,

    @field:JsonProperty("link_format_warning") val linkFormatWarning: kotlin.Int? = null,

    @field:JsonProperty("duplicate_products") val duplicateProducts: kotlin.Int? = null,

    @field:JsonProperty("duplicate_links") val duplicateLinks: kotlin.Int? = null,

    @field:JsonProperty("sales_price_invalid") val salesPriceInvalid: kotlin.Int? = null,

    @field:JsonProperty("product_category_depth_warning") val productCategoryDepthWarning: kotlin.Int? = null,

    @field:JsonProperty("adwords_same_as_link") val adwordsSameAsLink: kotlin.Int? = null,

    @field:JsonProperty("duplicate_headers") val duplicateHeaders: kotlin.Int? = null,

    @field:JsonProperty("fetch_same_signature") val fetchSameSignature: kotlin.Int? = null,

    @field:JsonProperty("adwords_format_warning") val adwordsFormatWarning: kotlin.Int? = null,

    @field:JsonProperty("additional_image_link_warning") val additionalImageLinkWarning: kotlin.Int? = null,

    @field:JsonProperty("image_link_warning") val imageLinkWarning: kotlin.Int? = null,

    @field:JsonProperty("shipping_invalid") val shippingInvalid: kotlin.Int? = null,

    @field:JsonProperty("tax_invalid") val taxInvalid: kotlin.Int? = null,

    @field:JsonProperty("shipping_weight_invalid") val shippingWeightInvalid: kotlin.Int? = null,

    @field:JsonProperty("expiration_date_invalid") val expirationDateInvalid: kotlin.Int? = null,

    @field:JsonProperty("availability_date_invalid") val availabilityDateInvalid: kotlin.Int? = null,

    @field:JsonProperty("sale_date_invalid") val saleDateInvalid: kotlin.Int? = null,

    @field:JsonProperty("weight_unit_invalid") val weightUnitInvalid: kotlin.Int? = null,

    @field:JsonProperty("is_bundle_invalid") val isBundleInvalid: kotlin.Int? = null,

    @field:JsonProperty("updated_time_invalid") val updatedTimeInvalid: kotlin.Int? = null,

    @field:JsonProperty("custom_label_length_too_long") val customLabelLengthTooLong: kotlin.Int? = null,

    @field:JsonProperty("product_type_length_too_long") val productTypeLengthTooLong: kotlin.Int? = null,

    @field:JsonProperty("too_many_additional_image_links") val tooManyAdditionalImageLinks: kotlin.Int? = null,

    @field:JsonProperty("multipack_invalid") val multipackInvalid: kotlin.Int? = null,

    @field:JsonProperty("indexed_product_count_large_delta") val indexedProductCountLargeDelta: kotlin.Int? = null,

    @field:JsonProperty("item_additional_image_download_failure") val itemAdditionalImageDownloadFailure: kotlin.Int? = null,

    @field:JsonProperty("optional_product_category_missing") val optionalProductCategoryMissing: kotlin.Int? = null,

    @field:JsonProperty("optional_product_category_invalid") val optionalProductCategoryInvalid: kotlin.Int? = null,

    @field:JsonProperty("optional_condition_missing") val optionalConditionMissing: kotlin.Int? = null,

    @field:JsonProperty("optional_condition_invalid") val optionalConditionInvalid: kotlin.Int? = null,

    @field:JsonProperty("ios_deep_link_invalid") val iosDeepLinkInvalid: kotlin.Int? = null,

    @field:JsonProperty("android_deep_link_invalid") val androidDeepLinkInvalid: kotlin.Int? = null,

    @field:JsonProperty("availability_normalized") val availabilityNormalized: kotlin.Int? = null,

    @field:JsonProperty("condition_normalized") val conditionNormalized: kotlin.Int? = null,

    @field:JsonProperty("gender_normalized") val genderNormalized: kotlin.Int? = null,

    @field:JsonProperty("size_type_normalized") val sizeTypeNormalized: kotlin.Int? = null,

    @field:JsonProperty("age_group_normalized") val ageGroupNormalized: kotlin.Int? = null,

    @field:JsonProperty("utm_source_auto_corrected") val utmSourceAutoCorrected: kotlin.Int? = null,

    @field:JsonProperty("country_does_not_map_to_currency") val countryDoesNotMapToCurrency: kotlin.Int? = null,

    @field:JsonProperty("min_ad_price_invalid") val minAdPriceInvalid: kotlin.Int? = null
) {

}

