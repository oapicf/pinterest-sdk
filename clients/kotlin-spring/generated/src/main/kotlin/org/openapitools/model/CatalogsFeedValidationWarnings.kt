package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param AD_LINK_FORMAT_WARNING Some items have ad links that are formatted incorrectly.
 * @param AD_LINK_SAME_AS_LINK Some items have ad link URLs that are duplicates of the link URLs for those items.
 * @param TITLE_LENGTH_TOO_LONG The title for some items were truncated because they contain too many characters.
 * @param DESCRIPTION_LENGTH_TOO_LONG The description for some items were truncated because they contain too many characters.
 * @param GENDER_INVALID Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param AGE_GROUP_INVALID Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param SIZE_TYPE_INVALID Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param SIZE_SYSTEM_INVALID Some items have size system values which are not one of the supported size systems.
 * @param LINK_FORMAT_WARNING Some items have an invalid product link which contains invalid UTM tracking paramaters.
 * @param SALES_PRICE_INVALID Some items have sale price values that are higher than the original price of the item.
 * @param PRODUCT_CATEGORY_DEPTH_WARNING Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
 * @param ADWORDS_FORMAT_WARNING Some items have adwords_redirect links that are formatted incorrectly.
 * @param ADWORDS_SAME_AS_LINK Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
 * @param DUPLICATE_HEADERS Your feed contains duplicate headers.
 * @param FETCH_SAME_SIGNATURE Ingestion completed early because there are no changes to your feed since the last successful update.
 * @param ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
 * @param ADDITIONAL_IMAGE_LINK_WARNING Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
 * @param IMAGE_LINK_WARNING Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
 * @param SHIPPING_INVALID Some items have shipping values that are formatted incorrectly.
 * @param TAX_INVALID Some items have tax values that are formatted incorrectly.
 * @param SHIPPING_WEIGHT_INVALID Some items have invalid shipping_weight values.
 * @param EXPIRATION_DATE_INVALID Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
 * @param AVAILABILITY_DATE_INVALID Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
 * @param SALE_DATE_INVALID Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
 * @param WEIGHT_UNIT_INVALID Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
 * @param IS_BUNDLE_INVALID Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
 * @param UPDATED_TIME_INVALID Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
 * @param CUSTOM_LABEL_LENGTH_TOO_LONG Some items have custom_label values that are too long, those items will be published without that custom label.
 * @param PRODUCT_TYPE_LENGTH_TOO_LONG Some items have product_type values that are too long, those items will be published without that product type.
 * @param TOO_MANY_ADDITIONAL_IMAGE_LINKS Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
 * @param MULTIPACK_INVALID Some items have invalid multipack values.
 * @param INDEXED_PRODUCT_COUNT_LARGE_DELTA The product count has increased or decreased significantly compared to the last successful ingestion.
 * @param ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE Some items include additional_image_links that can't be found.
 * @param OPTIONAL_PRODUCT_CATEGORY_MISSING Some items are missing a google_product_category.
 * @param OPTIONAL_PRODUCT_CATEGORY_INVALID Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
 * @param OPTIONAL_CONDITION_MISSING Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
 * @param OPTIONAL_CONDITION_INVALID Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param IOS_DEEP_LINK_INVALID Some items include invalid ios_deep_link values.
 * @param ANDROID_DEEP_LINK_INVALID Some items include invalid android_deep_link.
 * @param UTM_SOURCE_AUTO_CORRECTED Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
 * @param COUNTRY_DOES_NOT_MAP_TO_CURRENCY Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
 * @param MIN_AD_PRICE_INVALID Some items include min_ad_price values that are formatted incorrectly.
 * @param GTIN_INVALID Some items include incorrectly formatted GTINs.
 * @param INCONSISTENT_CURRENCY_VALUES Some items include inconsistent currencies in price fields.
 * @param SALES_PRICE_TOO_LOW Some items include sales price that is much lower than the list price.
 * @param SHIPPING_WIDTH_INVALID Some items include incorrectly formatted shipping_width.
 * @param SHIPPING_HEIGHT_INVALID Some items include incorrectly formatted shipping_height.
 * @param SALES_PRICE_TOO_HIGH Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
 * @param MPN_INVALID Some items include incorrectly formatted MPNs.
 */
data class CatalogsFeedValidationWarnings(

    @Schema(example = "null", description = "Some items have ad links that are formatted incorrectly.")
    @get:JsonProperty("AD_LINK_FORMAT_WARNING") val AD_LINK_FORMAT_WARNING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have ad link URLs that are duplicates of the link URLs for those items.")
    @get:JsonProperty("AD_LINK_SAME_AS_LINK") val AD_LINK_SAME_AS_LINK: kotlin.Int? = null,

    @Schema(example = "null", description = "The title for some items were truncated because they contain too many characters.")
    @get:JsonProperty("TITLE_LENGTH_TOO_LONG") val TITLE_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(example = "null", description = "The description for some items were truncated because they contain too many characters.")
    @get:JsonProperty("DESCRIPTION_LENGTH_TOO_LONG") val DESCRIPTION_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
    @get:JsonProperty("GENDER_INVALID") val GENDER_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
    @get:JsonProperty("AGE_GROUP_INVALID") val AGE_GROUP_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
    @get:JsonProperty("SIZE_TYPE_INVALID") val SIZE_TYPE_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have size system values which are not one of the supported size systems.")
    @get:JsonProperty("SIZE_SYSTEM_INVALID") val SIZE_SYSTEM_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have an invalid product link which contains invalid UTM tracking paramaters.")
    @get:JsonProperty("LINK_FORMAT_WARNING") val LINK_FORMAT_WARNING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have sale price values that are higher than the original price of the item.")
    @get:JsonProperty("SALES_PRICE_INVALID") val SALES_PRICE_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.")
    @get:JsonProperty("PRODUCT_CATEGORY_DEPTH_WARNING") val PRODUCT_CATEGORY_DEPTH_WARNING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have adwords_redirect links that are formatted incorrectly.")
    @get:JsonProperty("ADWORDS_FORMAT_WARNING") val ADWORDS_FORMAT_WARNING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.")
    @get:JsonProperty("ADWORDS_SAME_AS_LINK") val ADWORDS_SAME_AS_LINK: kotlin.Int? = null,

    @Schema(example = "null", description = "Your feed contains duplicate headers.")
    @get:JsonProperty("DUPLICATE_HEADERS") val DUPLICATE_HEADERS: kotlin.Int? = null,

    @Schema(example = "null", description = "Ingestion completed early because there are no changes to your feed since the last successful update.")
    @get:JsonProperty("FETCH_SAME_SIGNATURE") val FETCH_SAME_SIGNATURE: CatalogsFeedValidationWarnings.FETCHSAMESIGNATURE? = null,

    @Schema(example = "null", description = "Some items have additional_image_link URLs that contain too many characters, so those items will not be published.")
    @get:JsonProperty("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG") val ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.")
    @get:JsonProperty("ADDITIONAL_IMAGE_LINK_WARNING") val ADDITIONAL_IMAGE_LINK_WARNING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have image_link URLs that are formatted incorrectly and will not be published with those items.")
    @get:JsonProperty("IMAGE_LINK_WARNING") val IMAGE_LINK_WARNING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have shipping values that are formatted incorrectly.")
    @get:JsonProperty("SHIPPING_INVALID") val SHIPPING_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have tax values that are formatted incorrectly.")
    @get:JsonProperty("TAX_INVALID") val TAX_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have invalid shipping_weight values.")
    @get:JsonProperty("SHIPPING_WEIGHT_INVALID") val SHIPPING_WEIGHT_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.")
    @get:JsonProperty("EXPIRATION_DATE_INVALID") val EXPIRATION_DATE_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.")
    @get:JsonProperty("AVAILABILITY_DATE_INVALID") val AVAILABILITY_DATE_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.")
    @get:JsonProperty("SALE_DATE_INVALID") val SALE_DATE_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.")
    @get:JsonProperty("WEIGHT_UNIT_INVALID") val WEIGHT_UNIT_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.")
    @get:JsonProperty("IS_BUNDLE_INVALID") val IS_BUNDLE_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.")
    @get:JsonProperty("UPDATED_TIME_INVALID") val UPDATED_TIME_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have custom_label values that are too long, those items will be published without that custom label.")
    @get:JsonProperty("CUSTOM_LABEL_LENGTH_TOO_LONG") val CUSTOM_LABEL_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have product_type values that are too long, those items will be published without that product type.")
    @get:JsonProperty("PRODUCT_TYPE_LENGTH_TOO_LONG") val PRODUCT_TYPE_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.")
    @get:JsonProperty("TOO_MANY_ADDITIONAL_IMAGE_LINKS") val TOO_MANY_ADDITIONAL_IMAGE_LINKS: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items have invalid multipack values.")
    @get:JsonProperty("MULTIPACK_INVALID") val MULTIPACK_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "The product count has increased or decreased significantly compared to the last successful ingestion.")
    @get:JsonProperty("INDEXED_PRODUCT_COUNT_LARGE_DELTA") val INDEXED_PRODUCT_COUNT_LARGE_DELTA: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include additional_image_links that can't be found.")
    @get:JsonProperty("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE") val ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items are missing a google_product_category.")
    @get:JsonProperty("OPTIONAL_PRODUCT_CATEGORY_MISSING") val OPTIONAL_PRODUCT_CATEGORY_MISSING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.")
    @get:JsonProperty("OPTIONAL_PRODUCT_CATEGORY_INVALID") val OPTIONAL_PRODUCT_CATEGORY_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.")
    @get:JsonProperty("OPTIONAL_CONDITION_MISSING") val OPTIONAL_CONDITION_MISSING: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
    @get:JsonProperty("OPTIONAL_CONDITION_INVALID") val OPTIONAL_CONDITION_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include invalid ios_deep_link values.")
    @get:JsonProperty("IOS_DEEP_LINK_INVALID") val IOS_DEEP_LINK_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include invalid android_deep_link.")
    @get:JsonProperty("ANDROID_DEEP_LINK_INVALID") val ANDROID_DEEP_LINK_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include utm_source values that are formatted incorrectly and have been automatically corrected.")
    @get:JsonProperty("UTM_SOURCE_AUTO_CORRECTED") val UTM_SOURCE_AUTO_CORRECTED: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.")
    @get:JsonProperty("COUNTRY_DOES_NOT_MAP_TO_CURRENCY") val COUNTRY_DOES_NOT_MAP_TO_CURRENCY: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include min_ad_price values that are formatted incorrectly.")
    @get:JsonProperty("MIN_AD_PRICE_INVALID") val MIN_AD_PRICE_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include incorrectly formatted GTINs.")
    @get:JsonProperty("GTIN_INVALID") val GTIN_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include inconsistent currencies in price fields.")
    @get:JsonProperty("INCONSISTENT_CURRENCY_VALUES") val INCONSISTENT_CURRENCY_VALUES: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include sales price that is much lower than the list price.")
    @get:JsonProperty("SALES_PRICE_TOO_LOW") val SALES_PRICE_TOO_LOW: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include incorrectly formatted shipping_width.")
    @get:JsonProperty("SHIPPING_WIDTH_INVALID") val SHIPPING_WIDTH_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include incorrectly formatted shipping_height.")
    @get:JsonProperty("SHIPPING_HEIGHT_INVALID") val SHIPPING_HEIGHT_INVALID: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.")
    @get:JsonProperty("SALES_PRICE_TOO_HIGH") val SALES_PRICE_TOO_HIGH: kotlin.Int? = null,

    @Schema(example = "null", description = "Some items include incorrectly formatted MPNs.")
    @get:JsonProperty("MPN_INVALID") val MPN_INVALID: kotlin.Int? = null
) {

    /**
    * Ingestion completed early because there are no changes to your feed since the last successful update.
    * Values: _1
    */
    enum class FETCHSAMESIGNATURE(val value: kotlin.Int) {

        @JsonProperty(1) _1(1)
    }

}

