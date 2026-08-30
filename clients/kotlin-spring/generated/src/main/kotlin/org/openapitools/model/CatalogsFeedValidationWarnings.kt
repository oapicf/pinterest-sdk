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
 * @param AD_IMAGE_0_LINK_DUPLICATED ad_image_0_link is duplicated with another ad image link.
 * @param AD_IMAGE_0_LINK_LENGTH_TOO_LONG Ad image link 0 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_0_LINK_REQUIRED Ad image link 0 is required because an image tag was provided.
 * @param AD_IMAGE_0_LINK_WARNING Ad image link 0 format is unsupported.
 * @param AD_IMAGE_0_TAG_DUPLICATED ad_image_0_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_0_TAG_LENGTH_TOO_LONG Ad image tag 0 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_0_TAG_REQUIRED Ad image tag 0 is required because an image link was provided.
 * @param AD_IMAGE_10_LINK_DUPLICATED ad_image_10_link is duplicated with another ad image link.
 * @param AD_IMAGE_10_LINK_LENGTH_TOO_LONG Ad image link 10 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_10_LINK_REQUIRED Ad image link 10 is required because an image tag was provided.
 * @param AD_IMAGE_10_LINK_WARNING Ad image link 10 format is unsupported.
 * @param AD_IMAGE_10_TAG_DUPLICATED ad_image_10_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_10_TAG_LENGTH_TOO_LONG Ad image tag 10 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_10_TAG_REQUIRED Ad image tag 10 is required because an image link was provided.
 * @param AD_IMAGE_11_LINK_DUPLICATED ad_image_11_link is duplicated with another ad image link.
 * @param AD_IMAGE_11_LINK_LENGTH_TOO_LONG Ad image link 11 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_11_LINK_REQUIRED Ad image link 11 is required because an image tag was provided.
 * @param AD_IMAGE_11_LINK_WARNING Ad image link 11 format is unsupported.
 * @param AD_IMAGE_11_TAG_DUPLICATED ad_image_11_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_11_TAG_LENGTH_TOO_LONG Ad image tag 11 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_11_TAG_REQUIRED Ad image tag 11 is required because an image link was provided.
 * @param AD_IMAGE_12_LINK_DUPLICATED ad_image_12_link is duplicated with another ad image link.
 * @param AD_IMAGE_12_LINK_LENGTH_TOO_LONG Ad image link 12 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_12_LINK_REQUIRED Ad image link 12 is required because an image tag was provided.
 * @param AD_IMAGE_12_LINK_WARNING Ad image link 12 format is unsupported.
 * @param AD_IMAGE_12_TAG_DUPLICATED ad_image_12_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_12_TAG_LENGTH_TOO_LONG Ad image tag 12 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_12_TAG_REQUIRED Ad image tag 12 is required because an image link was provided.
 * @param AD_IMAGE_13_LINK_DUPLICATED ad_image_13_link is duplicated with another ad image link.
 * @param AD_IMAGE_13_LINK_LENGTH_TOO_LONG Ad image link 13 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_13_LINK_REQUIRED Ad image link 13 is required because an image tag was provided.
 * @param AD_IMAGE_13_LINK_WARNING Ad image link 13 format is unsupported.
 * @param AD_IMAGE_13_TAG_DUPLICATED ad_image_13_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_13_TAG_LENGTH_TOO_LONG Ad image tag 13 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_13_TAG_REQUIRED Ad image tag 13 is required because an image link was provided.
 * @param AD_IMAGE_14_LINK_DUPLICATED ad_image_14_link is duplicated with another ad image link.
 * @param AD_IMAGE_14_LINK_LENGTH_TOO_LONG Ad image link 14 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_14_LINK_REQUIRED Ad image link 14 is required because an image tag was provided.
 * @param AD_IMAGE_14_LINK_WARNING Ad image link 14 format is unsupported.
 * @param AD_IMAGE_14_TAG_DUPLICATED ad_image_14_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_14_TAG_LENGTH_TOO_LONG Ad image tag 14 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_14_TAG_REQUIRED Ad image tag 14 is required because an image link was provided.
 * @param AD_IMAGE_15_LINK_DUPLICATED ad_image_15_link is duplicated with another ad image link.
 * @param AD_IMAGE_15_LINK_LENGTH_TOO_LONG Ad image link 15 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_15_LINK_REQUIRED Ad image link 15 is required because an image tag was provided.
 * @param AD_IMAGE_15_LINK_WARNING Ad image link 15 format is unsupported.
 * @param AD_IMAGE_15_TAG_DUPLICATED ad_image_15_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_15_TAG_LENGTH_TOO_LONG Ad image tag 15 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_15_TAG_REQUIRED Ad image tag 15 is required because an image link was provided.
 * @param AD_IMAGE_16_LINK_DUPLICATED ad_image_16_link is duplicated with another ad image link.
 * @param AD_IMAGE_16_LINK_LENGTH_TOO_LONG Ad image link 16 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_16_LINK_REQUIRED Ad image link 16 is required because an image tag was provided.
 * @param AD_IMAGE_16_LINK_WARNING Ad image link 16 format is unsupported.
 * @param AD_IMAGE_16_TAG_DUPLICATED ad_image_16_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_16_TAG_LENGTH_TOO_LONG Ad image tag 16 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_16_TAG_REQUIRED Ad image tag 16 is required because an image link was provided.
 * @param AD_IMAGE_17_LINK_DUPLICATED ad_image_17_link is duplicated with another ad image link.
 * @param AD_IMAGE_17_LINK_LENGTH_TOO_LONG Ad image link 17 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_17_LINK_REQUIRED Ad image link 17 is required because an image tag was provided.
 * @param AD_IMAGE_17_LINK_WARNING Ad image link 17 format is unsupported.
 * @param AD_IMAGE_17_TAG_DUPLICATED ad_image_17_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_17_TAG_LENGTH_TOO_LONG Ad image tag 17 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_17_TAG_REQUIRED Ad image tag 17 is required because an image link was provided.
 * @param AD_IMAGE_18_LINK_DUPLICATED ad_image_18_link is duplicated with another ad image link.
 * @param AD_IMAGE_18_LINK_LENGTH_TOO_LONG Ad image link 18 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_18_LINK_REQUIRED Ad image link 18 is required because an image tag was provided.
 * @param AD_IMAGE_18_LINK_WARNING Ad image link 18 format is unsupported.
 * @param AD_IMAGE_18_TAG_DUPLICATED ad_image_18_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_18_TAG_LENGTH_TOO_LONG Ad image tag 18 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_18_TAG_REQUIRED Ad image tag 18 is required because an image link was provided.
 * @param AD_IMAGE_19_LINK_DUPLICATED ad_image_19_link is duplicated with another ad image link.
 * @param AD_IMAGE_19_LINK_LENGTH_TOO_LONG Ad image link 19 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_19_LINK_REQUIRED Ad image link 19 is required because an image tag was provided.
 * @param AD_IMAGE_19_LINK_WARNING Ad image link 19 format is unsupported.
 * @param AD_IMAGE_19_TAG_DUPLICATED ad_image_19_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_19_TAG_LENGTH_TOO_LONG Ad image tag 19 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_19_TAG_REQUIRED Ad image tag 19 is required because an image link was provided.
 * @param AD_IMAGE_1_LINK_DUPLICATED ad_image_1_link is duplicated with another ad image link.
 * @param AD_IMAGE_1_LINK_LENGTH_TOO_LONG Ad image link 1 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_1_LINK_REQUIRED Ad image link 1 is required because an image tag was provided.
 * @param AD_IMAGE_1_LINK_WARNING Ad image link 1 format is unsupported.
 * @param AD_IMAGE_1_TAG_DUPLICATED ad_image_1_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_1_TAG_LENGTH_TOO_LONG Ad image tag 1 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_1_TAG_REQUIRED Ad image tag 1 is required because an image link was provided.
 * @param AD_IMAGE_2_LINK_DUPLICATED ad_image_2_link is duplicated with another ad image link.
 * @param AD_IMAGE_2_LINK_LENGTH_TOO_LONG Ad image link 2 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_2_LINK_REQUIRED Ad image link 2 is required because an image tag was provided.
 * @param AD_IMAGE_2_LINK_WARNING Ad image link 2 format is unsupported.
 * @param AD_IMAGE_2_TAG_DUPLICATED ad_image_2_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_2_TAG_LENGTH_TOO_LONG Ad image tag 2 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_2_TAG_REQUIRED Ad image tag 2 is required because an image link was provided.
 * @param AD_IMAGE_3_LINK_DUPLICATED ad_image_3_link is duplicated with another ad image link.
 * @param AD_IMAGE_3_LINK_LENGTH_TOO_LONG Ad image link 3 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_3_LINK_REQUIRED Ad image link 3 is required because an image tag was provided.
 * @param AD_IMAGE_3_LINK_WARNING Ad image link 3 format is unsupported.
 * @param AD_IMAGE_3_TAG_DUPLICATED ad_image_3_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_3_TAG_LENGTH_TOO_LONG Ad image tag 3 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_3_TAG_REQUIRED Ad image tag 3 is required because an image link was provided.
 * @param AD_IMAGE_4_LINK_DUPLICATED ad_image_4_link is duplicated with another ad image link.
 * @param AD_IMAGE_4_LINK_LENGTH_TOO_LONG Ad image link 4 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_4_LINK_REQUIRED Ad image link 4 is required because an image tag was provided.
 * @param AD_IMAGE_4_LINK_WARNING Ad image link 4 format is unsupported.
 * @param AD_IMAGE_4_TAG_DUPLICATED ad_image_4_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_4_TAG_LENGTH_TOO_LONG Ad image tag 4 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_4_TAG_REQUIRED Ad image tag 4 is required because an image link was provided.
 * @param AD_IMAGE_5_LINK_DUPLICATED ad_image_5_link is duplicated with another ad image link.
 * @param AD_IMAGE_5_LINK_LENGTH_TOO_LONG Ad image link 5 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_5_LINK_REQUIRED Ad image link 5 is required because an image tag was provided.
 * @param AD_IMAGE_5_LINK_WARNING Ad image link 5 format is unsupported.
 * @param AD_IMAGE_5_TAG_DUPLICATED ad_image_5_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_5_TAG_LENGTH_TOO_LONG Ad image tag 5 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_5_TAG_REQUIRED Ad image tag 5 is required because an image link was provided.
 * @param AD_IMAGE_6_LINK_DUPLICATED ad_image_6_link is duplicated with another ad image link.
 * @param AD_IMAGE_6_LINK_LENGTH_TOO_LONG Ad image link 6 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_6_LINK_REQUIRED Ad image link 6 is required because an image tag was provided.
 * @param AD_IMAGE_6_LINK_WARNING Ad image link 6 format is unsupported.
 * @param AD_IMAGE_6_TAG_DUPLICATED ad_image_6_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_6_TAG_LENGTH_TOO_LONG Ad image tag 6 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_6_TAG_REQUIRED Ad image tag 6 is required because an image link was provided.
 * @param AD_IMAGE_7_LINK_DUPLICATED ad_image_7_link is duplicated with another ad image link.
 * @param AD_IMAGE_7_LINK_LENGTH_TOO_LONG Ad image link 7 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_7_LINK_REQUIRED Ad image link 7 is required because an image tag was provided.
 * @param AD_IMAGE_7_LINK_WARNING Ad image link 7 format is unsupported.
 * @param AD_IMAGE_7_TAG_DUPLICATED ad_image_7_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_7_TAG_LENGTH_TOO_LONG Ad image tag 7 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_7_TAG_REQUIRED Ad image tag 7 is required because an image link was provided.
 * @param AD_IMAGE_8_LINK_DUPLICATED ad_image_8_link is duplicated with another ad image link.
 * @param AD_IMAGE_8_LINK_LENGTH_TOO_LONG Ad image link 8 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_8_LINK_REQUIRED Ad image link 8 is required because an image tag was provided.
 * @param AD_IMAGE_8_LINK_WARNING Ad image link 8 format is unsupported.
 * @param AD_IMAGE_8_TAG_DUPLICATED ad_image_8_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_8_TAG_LENGTH_TOO_LONG Ad image tag 8 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_8_TAG_REQUIRED Ad image tag 8 is required because an image link was provided.
 * @param AD_IMAGE_9_LINK_DUPLICATED ad_image_9_link is duplicated with another ad image link.
 * @param AD_IMAGE_9_LINK_LENGTH_TOO_LONG Ad image link 9 length is too long. The maximum length is 2047 characters.
 * @param AD_IMAGE_9_LINK_REQUIRED Ad image link 9 is required because an image tag was provided.
 * @param AD_IMAGE_9_LINK_WARNING Ad image link 9 format is unsupported.
 * @param AD_IMAGE_9_TAG_DUPLICATED ad_image_9_tag is duplicated with another ad image tag.
 * @param AD_IMAGE_9_TAG_LENGTH_TOO_LONG Ad image tag 9 length is too long. The maximum length is 511 characters.
 * @param AD_IMAGE_9_TAG_REQUIRED Ad image tag 9 is required because an image link was provided.
 * @param AD_LINK_FORMAT_WARNING Some items have ad links that are formatted incorrectly.
 * @param AD_LINK_SAME_AS_LINK Some items have ad link URLs that are duplicates of the link URLs for those items.
 * @param AD_VIDEO_0_LINK_DUPLICATED ad_video_0_link is duplicated with another ad video link.
 * @param AD_VIDEO_0_LINK_LENGTH_TOO_LONG ad_video_0_link length is too long. The maximum length is 511 characters.
 * @param AD_VIDEO_0_LINK_REQUIRED ad_video_0_link is required for this item because ad_video_0_tag was provided.
 * @param AD_VIDEO_0_LINK_WARNING ad_video_0_link is formatted incorrectly and will not be published with your items.
 * @param AD_VIDEO_0_TAG_DUPLICATED ad_video_0_tag is duplicated with another ad video tag.
 * @param AD_VIDEO_0_TAG_LENGTH_TOO_LONG ad_video_0_tag length is too long. The maximum length is 511 characters.
 * @param AD_VIDEO_0_TAG_REQUIRED ad_video_0_tag is required because ad_video_0_link was provided.
 * @param AD_VIDEO_1_LINK_DUPLICATED ad_video_1_link is duplicated with another ad video link.
 * @param AD_VIDEO_1_LINK_LENGTH_TOO_LONG ad_video_1_link length is too long. The maximum length is 511 characters.
 * @param AD_VIDEO_1_LINK_REQUIRED ad_video_1_link is required for this item because ad_video_1_tag was provided.
 * @param AD_VIDEO_1_LINK_WARNING ad_video_1_link is formatted incorrectly and will not be published with your items.
 * @param AD_VIDEO_1_TAG_DUPLICATED ad_video_1_tag is duplicated with another ad video tag.
 * @param AD_VIDEO_1_TAG_LENGTH_TOO_LONG ad_video_1_tag length is too long. The maximum length is 511 characters.
 * @param AD_VIDEO_1_TAG_REQUIRED ad_video_1_tag is required because ad_video_1_link was provided.
 * @param AD_VIDEO_2_LINK_DUPLICATED ad_video_2_link is duplicated with another ad video link.
 * @param AD_VIDEO_2_LINK_LENGTH_TOO_LONG ad_video_2_link length is too long. The maximum length is 511 characters.
 * @param AD_VIDEO_2_LINK_REQUIRED ad_video_2_link is required for this item because ad_video_2_tag was provided.
 * @param AD_VIDEO_2_LINK_WARNING ad_video_2_link is formatted incorrectly and will not be published with your items.
 * @param AD_VIDEO_2_TAG_DUPLICATED ad_video_2_tag is duplicated with another ad video tag.
 * @param AD_VIDEO_2_TAG_LENGTH_TOO_LONG ad_video_2_tag length is too long. The maximum length is 511 characters.
 * @param AD_VIDEO_2_TAG_REQUIRED ad_video_2_tag is required because ad_video_2_link was provided.
 * @param ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
 * @param ADDITIONAL_IMAGE_LINK_WARNING Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
 * @param ADWORDS_FORMAT_WARNING Some items have adwords_redirect links that are formatted incorrectly.
 * @param ADWORDS_SAME_AS_LINK Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
 * @param AGE_GROUP_INVALID Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param ANDROID_DEEP_LINK_INVALID Some items include invalid android_deep_link.
 * @param AVAILABILITY_DATE_INVALID Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
 * @param COUNTRY_DOES_NOT_MAP_TO_CURRENCY Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
 * @param CUSTOM_LABEL_LENGTH_TOO_LONG Some items have custom_label values that are too long, those items will be published without that custom label.
 * @param DESCRIPTION_LENGTH_TOO_LONG The description for some items were truncated because they contain too many characters.
 * @param DUPLICATE_HEADERS Your feed contains duplicate headers.
 * @param EXPIRATION_DATE_INVALID Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
 * @param FETCH_SAME_SIGNATURE Ingestion completed early because there are no changes to your feed since the last successful update.
 * @param GENDER_INVALID Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param GTIN_INVALID Some items include incorrectly formatted GTINs.
 * @param IMAGE_LINK_WARNING Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
 * @param INCONSISTENT_CURRENCY_VALUES Some items include inconsistent currencies in price fields.
 * @param INDEXED_PRODUCT_COUNT_LARGE_DELTA The product count has increased or decreased significantly compared to the last successful ingestion.
 * @param IOS_DEEP_LINK_INVALID Some items include invalid ios_deep_link values.
 * @param IS_BUNDLE_INVALID Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
 * @param ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE Some items include additional_image_links that can't be found.
 * @param LINK_FORMAT_WARNING Some items have an invalid product link which contains invalid UTM tracking paramaters.
 * @param MIN_AD_PRICE_INVALID Some items include min_ad_price values that are formatted incorrectly.
 * @param MPN_INVALID Some items include incorrectly formatted MPNs.
 * @param MULTIPACK_INVALID Some items have invalid multipack values.
 * @param OPTIONAL_CONDITION_INVALID Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param OPTIONAL_CONDITION_MISSING Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
 * @param OPTIONAL_PRODUCT_CATEGORY_INVALID Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
 * @param OPTIONAL_PRODUCT_CATEGORY_MISSING Some items are missing a google_product_category.
 * @param PRODUCT_CATEGORY_DEPTH_WARNING Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
 * @param PRODUCT_TYPE_LENGTH_TOO_LONG Some items have product_type values that are too long, those items will be published without that product type.
 * @param SALE_DATE_INVALID Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
 * @param SALES_PRICE_INVALID Some items have sale price values that are higher than the original price of the item.
 * @param SALES_PRICE_TOO_HIGH Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
 * @param SALES_PRICE_TOO_LOW Some items include sales price that is much lower than the list price.
 * @param SHIPPING_HEIGHT_INVALID Some items include incorrectly formatted shipping_height.
 * @param SHIPPING_INVALID Some items have shipping values that are formatted incorrectly.
 * @param SHIPPING_WEIGHT_INVALID Some items have invalid shipping_weight values.
 * @param SHIPPING_WIDTH_INVALID Some items include incorrectly formatted shipping_width.
 * @param SIZE_SYSTEM_INVALID Some items have size system values which are not one of the supported size systems.
 * @param SIZE_TYPE_INVALID Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param TAX_INVALID Some items have tax values that are formatted incorrectly.
 * @param TITLE_LENGTH_TOO_LONG The title for some items were truncated because they contain too many characters.
 * @param TOO_MANY_ADDITIONAL_IMAGE_LINKS Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
 * @param UPDATED_TIME_INVALID Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
 * @param UTM_SOURCE_AUTO_CORRECTED Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
 * @param VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED A video is required in the item when ad_video fields are provided.
 * @param WEIGHT_UNIT_INVALID Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
 */
data class CatalogsFeedValidationWarnings(

    @Schema(description = "ad_image_0_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_0_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_0_LINK_DUPLICATED") val AD_IMAGE_0_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 0 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_0_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_0_LINK_LENGTH_TOO_LONG") val AD_IMAGE_0_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 0 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_0_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_0_LINK_REQUIRED") val AD_IMAGE_0_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 0 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_0_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_0_LINK_WARNING") val AD_IMAGE_0_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_0_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_0_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_0_TAG_DUPLICATED") val AD_IMAGE_0_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 0 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_0_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_0_TAG_LENGTH_TOO_LONG") val AD_IMAGE_0_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 0 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_0_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_0_TAG_REQUIRED") val AD_IMAGE_0_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_10_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_10_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_10_LINK_DUPLICATED") val AD_IMAGE_10_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 10 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_10_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_10_LINK_LENGTH_TOO_LONG") val AD_IMAGE_10_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 10 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_10_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_10_LINK_REQUIRED") val AD_IMAGE_10_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 10 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_10_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_10_LINK_WARNING") val AD_IMAGE_10_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_10_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_10_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_10_TAG_DUPLICATED") val AD_IMAGE_10_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 10 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_10_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_10_TAG_LENGTH_TOO_LONG") val AD_IMAGE_10_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 10 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_10_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_10_TAG_REQUIRED") val AD_IMAGE_10_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_11_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_11_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_11_LINK_DUPLICATED") val AD_IMAGE_11_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 11 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_11_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_11_LINK_LENGTH_TOO_LONG") val AD_IMAGE_11_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 11 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_11_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_11_LINK_REQUIRED") val AD_IMAGE_11_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 11 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_11_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_11_LINK_WARNING") val AD_IMAGE_11_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_11_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_11_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_11_TAG_DUPLICATED") val AD_IMAGE_11_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 11 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_11_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_11_TAG_LENGTH_TOO_LONG") val AD_IMAGE_11_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 11 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_11_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_11_TAG_REQUIRED") val AD_IMAGE_11_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_12_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_12_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_12_LINK_DUPLICATED") val AD_IMAGE_12_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 12 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_12_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_12_LINK_LENGTH_TOO_LONG") val AD_IMAGE_12_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 12 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_12_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_12_LINK_REQUIRED") val AD_IMAGE_12_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 12 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_12_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_12_LINK_WARNING") val AD_IMAGE_12_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_12_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_12_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_12_TAG_DUPLICATED") val AD_IMAGE_12_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 12 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_12_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_12_TAG_LENGTH_TOO_LONG") val AD_IMAGE_12_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 12 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_12_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_12_TAG_REQUIRED") val AD_IMAGE_12_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_13_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_13_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_13_LINK_DUPLICATED") val AD_IMAGE_13_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 13 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_13_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_13_LINK_LENGTH_TOO_LONG") val AD_IMAGE_13_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 13 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_13_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_13_LINK_REQUIRED") val AD_IMAGE_13_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 13 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_13_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_13_LINK_WARNING") val AD_IMAGE_13_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_13_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_13_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_13_TAG_DUPLICATED") val AD_IMAGE_13_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 13 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_13_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_13_TAG_LENGTH_TOO_LONG") val AD_IMAGE_13_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 13 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_13_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_13_TAG_REQUIRED") val AD_IMAGE_13_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_14_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_14_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_14_LINK_DUPLICATED") val AD_IMAGE_14_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 14 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_14_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_14_LINK_LENGTH_TOO_LONG") val AD_IMAGE_14_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 14 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_14_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_14_LINK_REQUIRED") val AD_IMAGE_14_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 14 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_14_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_14_LINK_WARNING") val AD_IMAGE_14_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_14_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_14_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_14_TAG_DUPLICATED") val AD_IMAGE_14_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 14 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_14_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_14_TAG_LENGTH_TOO_LONG") val AD_IMAGE_14_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 14 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_14_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_14_TAG_REQUIRED") val AD_IMAGE_14_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_15_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_15_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_15_LINK_DUPLICATED") val AD_IMAGE_15_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 15 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_15_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_15_LINK_LENGTH_TOO_LONG") val AD_IMAGE_15_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 15 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_15_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_15_LINK_REQUIRED") val AD_IMAGE_15_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 15 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_15_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_15_LINK_WARNING") val AD_IMAGE_15_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_15_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_15_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_15_TAG_DUPLICATED") val AD_IMAGE_15_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 15 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_15_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_15_TAG_LENGTH_TOO_LONG") val AD_IMAGE_15_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 15 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_15_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_15_TAG_REQUIRED") val AD_IMAGE_15_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_16_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_16_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_16_LINK_DUPLICATED") val AD_IMAGE_16_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 16 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_16_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_16_LINK_LENGTH_TOO_LONG") val AD_IMAGE_16_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 16 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_16_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_16_LINK_REQUIRED") val AD_IMAGE_16_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 16 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_16_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_16_LINK_WARNING") val AD_IMAGE_16_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_16_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_16_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_16_TAG_DUPLICATED") val AD_IMAGE_16_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 16 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_16_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_16_TAG_LENGTH_TOO_LONG") val AD_IMAGE_16_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 16 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_16_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_16_TAG_REQUIRED") val AD_IMAGE_16_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_17_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_17_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_17_LINK_DUPLICATED") val AD_IMAGE_17_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 17 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_17_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_17_LINK_LENGTH_TOO_LONG") val AD_IMAGE_17_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 17 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_17_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_17_LINK_REQUIRED") val AD_IMAGE_17_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 17 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_17_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_17_LINK_WARNING") val AD_IMAGE_17_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_17_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_17_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_17_TAG_DUPLICATED") val AD_IMAGE_17_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 17 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_17_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_17_TAG_LENGTH_TOO_LONG") val AD_IMAGE_17_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 17 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_17_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_17_TAG_REQUIRED") val AD_IMAGE_17_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_18_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_18_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_18_LINK_DUPLICATED") val AD_IMAGE_18_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 18 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_18_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_18_LINK_LENGTH_TOO_LONG") val AD_IMAGE_18_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 18 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_18_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_18_LINK_REQUIRED") val AD_IMAGE_18_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 18 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_18_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_18_LINK_WARNING") val AD_IMAGE_18_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_18_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_18_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_18_TAG_DUPLICATED") val AD_IMAGE_18_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 18 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_18_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_18_TAG_LENGTH_TOO_LONG") val AD_IMAGE_18_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 18 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_18_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_18_TAG_REQUIRED") val AD_IMAGE_18_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_19_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_19_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_19_LINK_DUPLICATED") val AD_IMAGE_19_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 19 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_19_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_19_LINK_LENGTH_TOO_LONG") val AD_IMAGE_19_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 19 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_19_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_19_LINK_REQUIRED") val AD_IMAGE_19_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 19 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_19_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_19_LINK_WARNING") val AD_IMAGE_19_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_19_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_19_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_19_TAG_DUPLICATED") val AD_IMAGE_19_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 19 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_19_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_19_TAG_LENGTH_TOO_LONG") val AD_IMAGE_19_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 19 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_19_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_19_TAG_REQUIRED") val AD_IMAGE_19_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_1_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_1_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_1_LINK_DUPLICATED") val AD_IMAGE_1_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 1 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_1_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_1_LINK_LENGTH_TOO_LONG") val AD_IMAGE_1_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 1 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_1_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_1_LINK_REQUIRED") val AD_IMAGE_1_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 1 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_1_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_1_LINK_WARNING") val AD_IMAGE_1_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_1_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_1_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_1_TAG_DUPLICATED") val AD_IMAGE_1_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 1 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_1_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_1_TAG_LENGTH_TOO_LONG") val AD_IMAGE_1_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 1 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_1_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_1_TAG_REQUIRED") val AD_IMAGE_1_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_2_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_2_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_2_LINK_DUPLICATED") val AD_IMAGE_2_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 2 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_2_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_2_LINK_LENGTH_TOO_LONG") val AD_IMAGE_2_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 2 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_2_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_2_LINK_REQUIRED") val AD_IMAGE_2_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 2 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_2_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_2_LINK_WARNING") val AD_IMAGE_2_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_2_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_2_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_2_TAG_DUPLICATED") val AD_IMAGE_2_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 2 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_2_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_2_TAG_LENGTH_TOO_LONG") val AD_IMAGE_2_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 2 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_2_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_2_TAG_REQUIRED") val AD_IMAGE_2_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_3_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_3_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_3_LINK_DUPLICATED") val AD_IMAGE_3_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 3 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_3_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_3_LINK_LENGTH_TOO_LONG") val AD_IMAGE_3_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 3 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_3_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_3_LINK_REQUIRED") val AD_IMAGE_3_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 3 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_3_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_3_LINK_WARNING") val AD_IMAGE_3_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_3_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_3_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_3_TAG_DUPLICATED") val AD_IMAGE_3_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 3 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_3_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_3_TAG_LENGTH_TOO_LONG") val AD_IMAGE_3_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 3 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_3_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_3_TAG_REQUIRED") val AD_IMAGE_3_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_4_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_4_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_4_LINK_DUPLICATED") val AD_IMAGE_4_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 4 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_4_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_4_LINK_LENGTH_TOO_LONG") val AD_IMAGE_4_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 4 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_4_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_4_LINK_REQUIRED") val AD_IMAGE_4_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 4 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_4_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_4_LINK_WARNING") val AD_IMAGE_4_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_4_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_4_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_4_TAG_DUPLICATED") val AD_IMAGE_4_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 4 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_4_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_4_TAG_LENGTH_TOO_LONG") val AD_IMAGE_4_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 4 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_4_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_4_TAG_REQUIRED") val AD_IMAGE_4_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_5_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_5_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_5_LINK_DUPLICATED") val AD_IMAGE_5_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 5 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_5_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_5_LINK_LENGTH_TOO_LONG") val AD_IMAGE_5_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 5 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_5_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_5_LINK_REQUIRED") val AD_IMAGE_5_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 5 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_5_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_5_LINK_WARNING") val AD_IMAGE_5_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_5_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_5_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_5_TAG_DUPLICATED") val AD_IMAGE_5_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 5 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_5_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_5_TAG_LENGTH_TOO_LONG") val AD_IMAGE_5_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 5 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_5_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_5_TAG_REQUIRED") val AD_IMAGE_5_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_6_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_6_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_6_LINK_DUPLICATED") val AD_IMAGE_6_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 6 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_6_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_6_LINK_LENGTH_TOO_LONG") val AD_IMAGE_6_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 6 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_6_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_6_LINK_REQUIRED") val AD_IMAGE_6_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 6 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_6_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_6_LINK_WARNING") val AD_IMAGE_6_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_6_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_6_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_6_TAG_DUPLICATED") val AD_IMAGE_6_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 6 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_6_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_6_TAG_LENGTH_TOO_LONG") val AD_IMAGE_6_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 6 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_6_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_6_TAG_REQUIRED") val AD_IMAGE_6_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_7_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_7_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_7_LINK_DUPLICATED") val AD_IMAGE_7_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 7 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_7_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_7_LINK_LENGTH_TOO_LONG") val AD_IMAGE_7_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 7 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_7_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_7_LINK_REQUIRED") val AD_IMAGE_7_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 7 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_7_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_7_LINK_WARNING") val AD_IMAGE_7_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_7_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_7_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_7_TAG_DUPLICATED") val AD_IMAGE_7_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 7 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_7_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_7_TAG_LENGTH_TOO_LONG") val AD_IMAGE_7_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 7 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_7_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_7_TAG_REQUIRED") val AD_IMAGE_7_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_8_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_8_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_8_LINK_DUPLICATED") val AD_IMAGE_8_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 8 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_8_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_8_LINK_LENGTH_TOO_LONG") val AD_IMAGE_8_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 8 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_8_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_8_LINK_REQUIRED") val AD_IMAGE_8_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 8 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_8_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_8_LINK_WARNING") val AD_IMAGE_8_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_8_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_8_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_8_TAG_DUPLICATED") val AD_IMAGE_8_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 8 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_8_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_8_TAG_LENGTH_TOO_LONG") val AD_IMAGE_8_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 8 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_8_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_8_TAG_REQUIRED") val AD_IMAGE_8_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_image_9_link is duplicated with another ad image link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_9_LINK_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_9_LINK_DUPLICATED") val AD_IMAGE_9_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image link 9 length is too long. The maximum length is 2047 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_9_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_9_LINK_LENGTH_TOO_LONG") val AD_IMAGE_9_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image link 9 is required because an image tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_9_LINK_REQUIRED")
    @get:JsonProperty("AD_IMAGE_9_LINK_REQUIRED") val AD_IMAGE_9_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Ad image link 9 format is unsupported.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_9_LINK_WARNING")
    @get:JsonProperty("AD_IMAGE_9_LINK_WARNING") val AD_IMAGE_9_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_image_9_tag is duplicated with another ad image tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_9_TAG_DUPLICATED")
    @get:JsonProperty("AD_IMAGE_9_TAG_DUPLICATED") val AD_IMAGE_9_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "Ad image tag 9 length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_9_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_IMAGE_9_TAG_LENGTH_TOO_LONG") val AD_IMAGE_9_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Ad image tag 9 is required because an image link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_IMAGE_9_TAG_REQUIRED")
    @get:JsonProperty("AD_IMAGE_9_TAG_REQUIRED") val AD_IMAGE_9_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Some items have ad links that are formatted incorrectly.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_LINK_FORMAT_WARNING")
    @get:JsonProperty("AD_LINK_FORMAT_WARNING") val AD_LINK_FORMAT_WARNING: kotlin.Int? = null,

    @Schema(description = "Some items have ad link URLs that are duplicates of the link URLs for those items.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_LINK_SAME_AS_LINK")
    @get:JsonProperty("AD_LINK_SAME_AS_LINK") val AD_LINK_SAME_AS_LINK: kotlin.Int? = null,

    @Schema(description = "ad_video_0_link is duplicated with another ad video link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_0_LINK_DUPLICATED")
    @get:JsonProperty("AD_VIDEO_0_LINK_DUPLICATED") val AD_VIDEO_0_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "ad_video_0_link length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_0_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_VIDEO_0_LINK_LENGTH_TOO_LONG") val AD_VIDEO_0_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "ad_video_0_link is required for this item because ad_video_0_tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_0_LINK_REQUIRED")
    @get:JsonProperty("AD_VIDEO_0_LINK_REQUIRED") val AD_VIDEO_0_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_video_0_link is formatted incorrectly and will not be published with your items.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_0_LINK_WARNING")
    @get:JsonProperty("AD_VIDEO_0_LINK_WARNING") val AD_VIDEO_0_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_video_0_tag is duplicated with another ad video tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_0_TAG_DUPLICATED")
    @get:JsonProperty("AD_VIDEO_0_TAG_DUPLICATED") val AD_VIDEO_0_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "ad_video_0_tag length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_0_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_VIDEO_0_TAG_LENGTH_TOO_LONG") val AD_VIDEO_0_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "ad_video_0_tag is required because ad_video_0_link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_0_TAG_REQUIRED")
    @get:JsonProperty("AD_VIDEO_0_TAG_REQUIRED") val AD_VIDEO_0_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_video_1_link is duplicated with another ad video link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_1_LINK_DUPLICATED")
    @get:JsonProperty("AD_VIDEO_1_LINK_DUPLICATED") val AD_VIDEO_1_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "ad_video_1_link length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_1_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_VIDEO_1_LINK_LENGTH_TOO_LONG") val AD_VIDEO_1_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "ad_video_1_link is required for this item because ad_video_1_tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_1_LINK_REQUIRED")
    @get:JsonProperty("AD_VIDEO_1_LINK_REQUIRED") val AD_VIDEO_1_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_video_1_link is formatted incorrectly and will not be published with your items.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_1_LINK_WARNING")
    @get:JsonProperty("AD_VIDEO_1_LINK_WARNING") val AD_VIDEO_1_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_video_1_tag is duplicated with another ad video tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_1_TAG_DUPLICATED")
    @get:JsonProperty("AD_VIDEO_1_TAG_DUPLICATED") val AD_VIDEO_1_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "ad_video_1_tag length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_1_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_VIDEO_1_TAG_LENGTH_TOO_LONG") val AD_VIDEO_1_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "ad_video_1_tag is required because ad_video_1_link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_1_TAG_REQUIRED")
    @get:JsonProperty("AD_VIDEO_1_TAG_REQUIRED") val AD_VIDEO_1_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_video_2_link is duplicated with another ad video link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_2_LINK_DUPLICATED")
    @get:JsonProperty("AD_VIDEO_2_LINK_DUPLICATED") val AD_VIDEO_2_LINK_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "ad_video_2_link length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_2_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_VIDEO_2_LINK_LENGTH_TOO_LONG") val AD_VIDEO_2_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "ad_video_2_link is required for this item because ad_video_2_tag was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_2_LINK_REQUIRED")
    @get:JsonProperty("AD_VIDEO_2_LINK_REQUIRED") val AD_VIDEO_2_LINK_REQUIRED: kotlin.Int? = null,

    @Schema(description = "ad_video_2_link is formatted incorrectly and will not be published with your items.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_2_LINK_WARNING")
    @get:JsonProperty("AD_VIDEO_2_LINK_WARNING") val AD_VIDEO_2_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "ad_video_2_tag is duplicated with another ad video tag.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_2_TAG_DUPLICATED")
    @get:JsonProperty("AD_VIDEO_2_TAG_DUPLICATED") val AD_VIDEO_2_TAG_DUPLICATED: kotlin.Int? = null,

    @Schema(description = "ad_video_2_tag length is too long. The maximum length is 511 characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_2_TAG_LENGTH_TOO_LONG")
    @get:JsonProperty("AD_VIDEO_2_TAG_LENGTH_TOO_LONG") val AD_VIDEO_2_TAG_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "ad_video_2_tag is required because ad_video_2_link was provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AD_VIDEO_2_TAG_REQUIRED")
    @get:JsonProperty("AD_VIDEO_2_TAG_REQUIRED") val AD_VIDEO_2_TAG_REQUIRED: kotlin.Int? = null,

    @Schema(description = "Some items have additional_image_link URLs that contain too many characters, so those items will not be published.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")
    @get:JsonProperty("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG") val ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ADDITIONAL_IMAGE_LINK_WARNING")
    @get:JsonProperty("ADDITIONAL_IMAGE_LINK_WARNING") val ADDITIONAL_IMAGE_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "Some items have adwords_redirect links that are formatted incorrectly.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ADWORDS_FORMAT_WARNING")
    @get:JsonProperty("ADWORDS_FORMAT_WARNING") val ADWORDS_FORMAT_WARNING: kotlin.Int? = null,

    @Schema(description = "Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ADWORDS_SAME_AS_LINK")
    @get:JsonProperty("ADWORDS_SAME_AS_LINK") val ADWORDS_SAME_AS_LINK: kotlin.Int? = null,

    @Schema(description = "Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AGE_GROUP_INVALID")
    @get:JsonProperty("AGE_GROUP_INVALID") val AGE_GROUP_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items include invalid android_deep_link.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ANDROID_DEEP_LINK_INVALID")
    @get:JsonProperty("ANDROID_DEEP_LINK_INVALID") val ANDROID_DEEP_LINK_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("AVAILABILITY_DATE_INVALID")
    @get:JsonProperty("AVAILABILITY_DATE_INVALID") val AVAILABILITY_DATE_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("COUNTRY_DOES_NOT_MAP_TO_CURRENCY")
    @get:JsonProperty("COUNTRY_DOES_NOT_MAP_TO_CURRENCY") val COUNTRY_DOES_NOT_MAP_TO_CURRENCY: kotlin.Int? = null,

    @Schema(description = "Some items have custom_label values that are too long, those items will be published without that custom label.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("CUSTOM_LABEL_LENGTH_TOO_LONG")
    @get:JsonProperty("CUSTOM_LABEL_LENGTH_TOO_LONG") val CUSTOM_LABEL_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "The description for some items were truncated because they contain too many characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("DESCRIPTION_LENGTH_TOO_LONG")
    @get:JsonProperty("DESCRIPTION_LENGTH_TOO_LONG") val DESCRIPTION_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Your feed contains duplicate headers.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("DUPLICATE_HEADERS")
    @get:JsonProperty("DUPLICATE_HEADERS") val DUPLICATE_HEADERS: kotlin.Int? = null,

    @Schema(description = "Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("EXPIRATION_DATE_INVALID")
    @get:JsonProperty("EXPIRATION_DATE_INVALID") val EXPIRATION_DATE_INVALID: kotlin.Int? = null,

    @Schema(description = "Ingestion completed early because there are no changes to your feed since the last successful update.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("FETCH_SAME_SIGNATURE")
    @get:JsonProperty("FETCH_SAME_SIGNATURE") val FETCH_SAME_SIGNATURE: kotlin.Int? = null,

    @Schema(description = "Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("GENDER_INVALID")
    @get:JsonProperty("GENDER_INVALID") val GENDER_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items include incorrectly formatted GTINs.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("GTIN_INVALID")
    @get:JsonProperty("GTIN_INVALID") val GTIN_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items have image_link URLs that are formatted incorrectly and will not be published with those items.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("IMAGE_LINK_WARNING")
    @get:JsonProperty("IMAGE_LINK_WARNING") val IMAGE_LINK_WARNING: kotlin.Int? = null,

    @Schema(description = "Some items include inconsistent currencies in price fields.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("INCONSISTENT_CURRENCY_VALUES")
    @get:JsonProperty("INCONSISTENT_CURRENCY_VALUES") val INCONSISTENT_CURRENCY_VALUES: kotlin.Int? = null,

    @Schema(description = "The product count has increased or decreased significantly compared to the last successful ingestion.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("INDEXED_PRODUCT_COUNT_LARGE_DELTA")
    @get:JsonProperty("INDEXED_PRODUCT_COUNT_LARGE_DELTA") val INDEXED_PRODUCT_COUNT_LARGE_DELTA: kotlin.Int? = null,

    @Schema(description = "Some items include invalid ios_deep_link values.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("IOS_DEEP_LINK_INVALID")
    @get:JsonProperty("IOS_DEEP_LINK_INVALID") val IOS_DEEP_LINK_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("IS_BUNDLE_INVALID")
    @get:JsonProperty("IS_BUNDLE_INVALID") val IS_BUNDLE_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items include additional_image_links that can't be found.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")
    @get:JsonProperty("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE") val ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: kotlin.Int? = null,

    @Schema(description = "Some items have an invalid product link which contains invalid UTM tracking paramaters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("LINK_FORMAT_WARNING")
    @get:JsonProperty("LINK_FORMAT_WARNING") val LINK_FORMAT_WARNING: kotlin.Int? = null,

    @Schema(description = "Some items include min_ad_price values that are formatted incorrectly.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("MIN_AD_PRICE_INVALID")
    @get:JsonProperty("MIN_AD_PRICE_INVALID") val MIN_AD_PRICE_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items include incorrectly formatted MPNs.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("MPN_INVALID")
    @get:JsonProperty("MPN_INVALID") val MPN_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items have invalid multipack values.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("MULTIPACK_INVALID")
    @get:JsonProperty("MULTIPACK_INVALID") val MULTIPACK_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("OPTIONAL_CONDITION_INVALID")
    @get:JsonProperty("OPTIONAL_CONDITION_INVALID") val OPTIONAL_CONDITION_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("OPTIONAL_CONDITION_MISSING")
    @get:JsonProperty("OPTIONAL_CONDITION_MISSING") val OPTIONAL_CONDITION_MISSING: kotlin.Int? = null,

    @Schema(description = "Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("OPTIONAL_PRODUCT_CATEGORY_INVALID")
    @get:JsonProperty("OPTIONAL_PRODUCT_CATEGORY_INVALID") val OPTIONAL_PRODUCT_CATEGORY_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items are missing a google_product_category.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("OPTIONAL_PRODUCT_CATEGORY_MISSING")
    @get:JsonProperty("OPTIONAL_PRODUCT_CATEGORY_MISSING") val OPTIONAL_PRODUCT_CATEGORY_MISSING: kotlin.Int? = null,

    @Schema(description = "Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PRODUCT_CATEGORY_DEPTH_WARNING")
    @get:JsonProperty("PRODUCT_CATEGORY_DEPTH_WARNING") val PRODUCT_CATEGORY_DEPTH_WARNING: kotlin.Int? = null,

    @Schema(description = "Some items have product_type values that are too long, those items will be published without that product type.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("PRODUCT_TYPE_LENGTH_TOO_LONG")
    @get:JsonProperty("PRODUCT_TYPE_LENGTH_TOO_LONG") val PRODUCT_TYPE_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("SALE_DATE_INVALID")
    @get:JsonProperty("SALE_DATE_INVALID") val SALE_DATE_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items have sale price values that are higher than the original price of the item.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("SALES_PRICE_INVALID")
    @get:JsonProperty("SALES_PRICE_INVALID") val SALES_PRICE_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("SALES_PRICE_TOO_HIGH")
    @get:JsonProperty("SALES_PRICE_TOO_HIGH") val SALES_PRICE_TOO_HIGH: kotlin.Int? = null,

    @Schema(description = "Some items include sales price that is much lower than the list price.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("SALES_PRICE_TOO_LOW")
    @get:JsonProperty("SALES_PRICE_TOO_LOW") val SALES_PRICE_TOO_LOW: kotlin.Int? = null,

    @Schema(description = "Some items include incorrectly formatted shipping_height.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("SHIPPING_HEIGHT_INVALID")
    @get:JsonProperty("SHIPPING_HEIGHT_INVALID") val SHIPPING_HEIGHT_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items have shipping values that are formatted incorrectly.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("SHIPPING_INVALID")
    @get:JsonProperty("SHIPPING_INVALID") val SHIPPING_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items have invalid shipping_weight values.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("SHIPPING_WEIGHT_INVALID")
    @get:JsonProperty("SHIPPING_WEIGHT_INVALID") val SHIPPING_WEIGHT_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items include incorrectly formatted shipping_width.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("SHIPPING_WIDTH_INVALID")
    @get:JsonProperty("SHIPPING_WIDTH_INVALID") val SHIPPING_WIDTH_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items have size system values which are not one of the supported size systems.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("SIZE_SYSTEM_INVALID")
    @get:JsonProperty("SIZE_SYSTEM_INVALID") val SIZE_SYSTEM_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("SIZE_TYPE_INVALID")
    @get:JsonProperty("SIZE_TYPE_INVALID") val SIZE_TYPE_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items have tax values that are formatted incorrectly.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("TAX_INVALID")
    @get:JsonProperty("TAX_INVALID") val TAX_INVALID: kotlin.Int? = null,

    @Schema(description = "The title for some items were truncated because they contain too many characters.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("TITLE_LENGTH_TOO_LONG")
    @get:JsonProperty("TITLE_LENGTH_TOO_LONG") val TITLE_LENGTH_TOO_LONG: kotlin.Int? = null,

    @Schema(description = "Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("TOO_MANY_ADDITIONAL_IMAGE_LINKS")
    @get:JsonProperty("TOO_MANY_ADDITIONAL_IMAGE_LINKS") val TOO_MANY_ADDITIONAL_IMAGE_LINKS: kotlin.Int? = null,

    @Schema(description = "Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("UPDATED_TIME_INVALID")
    @get:JsonProperty("UPDATED_TIME_INVALID") val UPDATED_TIME_INVALID: kotlin.Int? = null,

    @Schema(description = "Some items include utm_source values that are formatted incorrectly and have been automatically corrected.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("UTM_SOURCE_AUTO_CORRECTED")
    @get:JsonProperty("UTM_SOURCE_AUTO_CORRECTED") val UTM_SOURCE_AUTO_CORRECTED: kotlin.Int? = null,

    @Schema(description = "A video is required in the item when ad_video fields are provided.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED")
    @get:JsonProperty("VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED") val VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED: kotlin.Int? = null,

    @Schema(description = "Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("WEIGHT_UNIT_INVALID")
    @get:JsonProperty("WEIGHT_UNIT_INVALID") val WEIGHT_UNIT_INVALID: kotlin.Int? = null
) {

}

