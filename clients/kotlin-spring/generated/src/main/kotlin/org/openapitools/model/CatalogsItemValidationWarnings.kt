package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsItemValidationDetails
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
 * @param AD_IMAGE_0_LINK_DUPLICATED 
 * @param AD_IMAGE_0_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_0_LINK_REQUIRED 
 * @param AD_IMAGE_0_LINK_WARNING 
 * @param AD_IMAGE_0_TAG_DUPLICATED 
 * @param AD_IMAGE_0_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_0_TAG_REQUIRED 
 * @param AD_IMAGE_10_LINK_DUPLICATED 
 * @param AD_IMAGE_10_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_10_LINK_REQUIRED 
 * @param AD_IMAGE_10_LINK_WARNING 
 * @param AD_IMAGE_10_TAG_DUPLICATED 
 * @param AD_IMAGE_10_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_10_TAG_REQUIRED 
 * @param AD_IMAGE_11_LINK_DUPLICATED 
 * @param AD_IMAGE_11_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_11_LINK_REQUIRED 
 * @param AD_IMAGE_11_LINK_WARNING 
 * @param AD_IMAGE_11_TAG_DUPLICATED 
 * @param AD_IMAGE_11_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_11_TAG_REQUIRED 
 * @param AD_IMAGE_12_LINK_DUPLICATED 
 * @param AD_IMAGE_12_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_12_LINK_REQUIRED 
 * @param AD_IMAGE_12_LINK_WARNING 
 * @param AD_IMAGE_12_TAG_DUPLICATED 
 * @param AD_IMAGE_12_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_12_TAG_REQUIRED 
 * @param AD_IMAGE_13_LINK_DUPLICATED 
 * @param AD_IMAGE_13_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_13_LINK_REQUIRED 
 * @param AD_IMAGE_13_LINK_WARNING 
 * @param AD_IMAGE_13_TAG_DUPLICATED 
 * @param AD_IMAGE_13_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_13_TAG_REQUIRED 
 * @param AD_IMAGE_14_LINK_DUPLICATED 
 * @param AD_IMAGE_14_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_14_LINK_REQUIRED 
 * @param AD_IMAGE_14_LINK_WARNING 
 * @param AD_IMAGE_14_TAG_DUPLICATED 
 * @param AD_IMAGE_14_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_14_TAG_REQUIRED 
 * @param AD_IMAGE_15_LINK_DUPLICATED 
 * @param AD_IMAGE_15_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_15_LINK_REQUIRED 
 * @param AD_IMAGE_15_LINK_WARNING 
 * @param AD_IMAGE_15_TAG_DUPLICATED 
 * @param AD_IMAGE_15_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_15_TAG_REQUIRED 
 * @param AD_IMAGE_16_LINK_DUPLICATED 
 * @param AD_IMAGE_16_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_16_LINK_REQUIRED 
 * @param AD_IMAGE_16_LINK_WARNING 
 * @param AD_IMAGE_16_TAG_DUPLICATED 
 * @param AD_IMAGE_16_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_16_TAG_REQUIRED 
 * @param AD_IMAGE_17_LINK_DUPLICATED 
 * @param AD_IMAGE_17_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_17_LINK_REQUIRED 
 * @param AD_IMAGE_17_LINK_WARNING 
 * @param AD_IMAGE_17_TAG_DUPLICATED 
 * @param AD_IMAGE_17_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_17_TAG_REQUIRED 
 * @param AD_IMAGE_18_LINK_DUPLICATED 
 * @param AD_IMAGE_18_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_18_LINK_REQUIRED 
 * @param AD_IMAGE_18_LINK_WARNING 
 * @param AD_IMAGE_18_TAG_DUPLICATED 
 * @param AD_IMAGE_18_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_18_TAG_REQUIRED 
 * @param AD_IMAGE_19_LINK_DUPLICATED 
 * @param AD_IMAGE_19_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_19_LINK_REQUIRED 
 * @param AD_IMAGE_19_LINK_WARNING 
 * @param AD_IMAGE_19_TAG_DUPLICATED 
 * @param AD_IMAGE_19_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_19_TAG_REQUIRED 
 * @param AD_IMAGE_1_LINK_DUPLICATED 
 * @param AD_IMAGE_1_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_1_LINK_REQUIRED 
 * @param AD_IMAGE_1_LINK_WARNING 
 * @param AD_IMAGE_1_TAG_DUPLICATED 
 * @param AD_IMAGE_1_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_1_TAG_REQUIRED 
 * @param AD_IMAGE_2_LINK_DUPLICATED 
 * @param AD_IMAGE_2_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_2_LINK_REQUIRED 
 * @param AD_IMAGE_2_LINK_WARNING 
 * @param AD_IMAGE_2_TAG_DUPLICATED 
 * @param AD_IMAGE_2_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_2_TAG_REQUIRED 
 * @param AD_IMAGE_3_LINK_DUPLICATED 
 * @param AD_IMAGE_3_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_3_LINK_REQUIRED 
 * @param AD_IMAGE_3_LINK_WARNING 
 * @param AD_IMAGE_3_TAG_DUPLICATED 
 * @param AD_IMAGE_3_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_3_TAG_REQUIRED 
 * @param AD_IMAGE_4_LINK_DUPLICATED 
 * @param AD_IMAGE_4_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_4_LINK_REQUIRED 
 * @param AD_IMAGE_4_LINK_WARNING 
 * @param AD_IMAGE_4_TAG_DUPLICATED 
 * @param AD_IMAGE_4_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_4_TAG_REQUIRED 
 * @param AD_IMAGE_5_LINK_DUPLICATED 
 * @param AD_IMAGE_5_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_5_LINK_REQUIRED 
 * @param AD_IMAGE_5_LINK_WARNING 
 * @param AD_IMAGE_5_TAG_DUPLICATED 
 * @param AD_IMAGE_5_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_5_TAG_REQUIRED 
 * @param AD_IMAGE_6_LINK_DUPLICATED 
 * @param AD_IMAGE_6_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_6_LINK_REQUIRED 
 * @param AD_IMAGE_6_LINK_WARNING 
 * @param AD_IMAGE_6_TAG_DUPLICATED 
 * @param AD_IMAGE_6_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_6_TAG_REQUIRED 
 * @param AD_IMAGE_7_LINK_DUPLICATED 
 * @param AD_IMAGE_7_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_7_LINK_REQUIRED 
 * @param AD_IMAGE_7_LINK_WARNING 
 * @param AD_IMAGE_7_TAG_DUPLICATED 
 * @param AD_IMAGE_7_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_7_TAG_REQUIRED 
 * @param AD_IMAGE_8_LINK_DUPLICATED 
 * @param AD_IMAGE_8_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_8_LINK_REQUIRED 
 * @param AD_IMAGE_8_LINK_WARNING 
 * @param AD_IMAGE_8_TAG_DUPLICATED 
 * @param AD_IMAGE_8_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_8_TAG_REQUIRED 
 * @param AD_IMAGE_9_LINK_DUPLICATED 
 * @param AD_IMAGE_9_LINK_LENGTH_TOO_LONG 
 * @param AD_IMAGE_9_LINK_REQUIRED 
 * @param AD_IMAGE_9_LINK_WARNING 
 * @param AD_IMAGE_9_TAG_DUPLICATED 
 * @param AD_IMAGE_9_TAG_LENGTH_TOO_LONG 
 * @param AD_IMAGE_9_TAG_REQUIRED 
 * @param AD_LINK_FORMAT_WARNING 
 * @param AD_LINK_SAME_AS_LINK 
 * @param AD_VIDEO_0_LINK_DUPLICATED 
 * @param AD_VIDEO_0_LINK_LENGTH_TOO_LONG 
 * @param AD_VIDEO_0_LINK_REQUIRED 
 * @param AD_VIDEO_0_LINK_WARNING 
 * @param AD_VIDEO_0_TAG_DUPLICATED 
 * @param AD_VIDEO_0_TAG_LENGTH_TOO_LONG 
 * @param AD_VIDEO_0_TAG_REQUIRED 
 * @param AD_VIDEO_1_LINK_DUPLICATED 
 * @param AD_VIDEO_1_LINK_LENGTH_TOO_LONG 
 * @param AD_VIDEO_1_LINK_REQUIRED 
 * @param AD_VIDEO_1_LINK_WARNING 
 * @param AD_VIDEO_1_TAG_DUPLICATED 
 * @param AD_VIDEO_1_TAG_LENGTH_TOO_LONG 
 * @param AD_VIDEO_1_TAG_REQUIRED 
 * @param AD_VIDEO_2_LINK_DUPLICATED 
 * @param AD_VIDEO_2_LINK_LENGTH_TOO_LONG 
 * @param AD_VIDEO_2_LINK_REQUIRED 
 * @param AD_VIDEO_2_LINK_WARNING 
 * @param AD_VIDEO_2_TAG_DUPLICATED 
 * @param AD_VIDEO_2_TAG_LENGTH_TOO_LONG 
 * @param AD_VIDEO_2_TAG_REQUIRED 
 * @param ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG 
 * @param ADDITIONAL_IMAGE_LINK_WARNING 
 * @param ADWORDS_FORMAT_WARNING 
 * @param ADWORDS_SAME_AS_LINK 
 * @param AGE_GROUP_INVALID 
 * @param ANDROID_DEEP_LINK_INVALID 
 * @param AVAILABILITY_DATE_INVALID 
 * @param COUNTRY_DOES_NOT_MAP_TO_CURRENCY 
 * @param CUSTOM_LABEL_LENGTH_TOO_LONG 
 * @param DESCRIPTION_LENGTH_TOO_LONG 
 * @param EXPIRATION_DATE_INVALID 
 * @param GENDER_INVALID 
 * @param GTIN_INVALID 
 * @param IMAGE_LINK_WARNING 
 * @param IOS_DEEP_LINK_INVALID 
 * @param IS_BUNDLE_INVALID 
 * @param ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE 
 * @param LINK_FORMAT_WARNING 
 * @param MIN_AD_PRICE_INVALID 
 * @param MPN_INVALID 
 * @param MULTIPACK_INVALID 
 * @param OPTIONAL_CONDITION_INVALID 
 * @param OPTIONAL_CONDITION_MISSING 
 * @param OPTIONAL_PRODUCT_CATEGORY_INVALID 
 * @param OPTIONAL_PRODUCT_CATEGORY_MISSING 
 * @param PRODUCT_CATEGORY_DEPTH_WARNING 
 * @param PRODUCT_TYPE_LENGTH_TOO_LONG 
 * @param SALE_DATE_INVALID 
 * @param SALES_PRICE_INVALID 
 * @param SALES_PRICE_TOO_HIGH 
 * @param SALES_PRICE_TOO_LOW 
 * @param SHIPPING_HEIGHT_INVALID 
 * @param SHIPPING_INVALID 
 * @param SHIPPING_WEIGHT_INVALID 
 * @param SHIPPING_WIDTH_INVALID 
 * @param SIZE_SYSTEM_INVALID 
 * @param SIZE_TYPE_INVALID 
 * @param TAX_INVALID 
 * @param TITLE_LENGTH_TOO_LONG 
 * @param TOO_MANY_ADDITIONAL_IMAGE_LINKS 
 * @param UTM_SOURCE_AUTO_CORRECTED 
 * @param VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED 
 * @param WEIGHT_UNIT_INVALID 
 */
data class CatalogsItemValidationWarnings(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_0_LINK_DUPLICATED") val AD_IMAGE_0_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_0_LINK_LENGTH_TOO_LONG") val AD_IMAGE_0_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_0_LINK_REQUIRED") val AD_IMAGE_0_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_0_LINK_WARNING") val AD_IMAGE_0_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_0_TAG_DUPLICATED") val AD_IMAGE_0_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_0_TAG_LENGTH_TOO_LONG") val AD_IMAGE_0_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_0_TAG_REQUIRED") val AD_IMAGE_0_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_10_LINK_DUPLICATED") val AD_IMAGE_10_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_10_LINK_LENGTH_TOO_LONG") val AD_IMAGE_10_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_10_LINK_REQUIRED") val AD_IMAGE_10_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_10_LINK_WARNING") val AD_IMAGE_10_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_10_TAG_DUPLICATED") val AD_IMAGE_10_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_10_TAG_LENGTH_TOO_LONG") val AD_IMAGE_10_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_10_TAG_REQUIRED") val AD_IMAGE_10_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_11_LINK_DUPLICATED") val AD_IMAGE_11_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_11_LINK_LENGTH_TOO_LONG") val AD_IMAGE_11_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_11_LINK_REQUIRED") val AD_IMAGE_11_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_11_LINK_WARNING") val AD_IMAGE_11_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_11_TAG_DUPLICATED") val AD_IMAGE_11_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_11_TAG_LENGTH_TOO_LONG") val AD_IMAGE_11_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_11_TAG_REQUIRED") val AD_IMAGE_11_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_12_LINK_DUPLICATED") val AD_IMAGE_12_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_12_LINK_LENGTH_TOO_LONG") val AD_IMAGE_12_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_12_LINK_REQUIRED") val AD_IMAGE_12_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_12_LINK_WARNING") val AD_IMAGE_12_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_12_TAG_DUPLICATED") val AD_IMAGE_12_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_12_TAG_LENGTH_TOO_LONG") val AD_IMAGE_12_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_12_TAG_REQUIRED") val AD_IMAGE_12_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_13_LINK_DUPLICATED") val AD_IMAGE_13_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_13_LINK_LENGTH_TOO_LONG") val AD_IMAGE_13_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_13_LINK_REQUIRED") val AD_IMAGE_13_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_13_LINK_WARNING") val AD_IMAGE_13_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_13_TAG_DUPLICATED") val AD_IMAGE_13_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_13_TAG_LENGTH_TOO_LONG") val AD_IMAGE_13_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_13_TAG_REQUIRED") val AD_IMAGE_13_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_14_LINK_DUPLICATED") val AD_IMAGE_14_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_14_LINK_LENGTH_TOO_LONG") val AD_IMAGE_14_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_14_LINK_REQUIRED") val AD_IMAGE_14_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_14_LINK_WARNING") val AD_IMAGE_14_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_14_TAG_DUPLICATED") val AD_IMAGE_14_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_14_TAG_LENGTH_TOO_LONG") val AD_IMAGE_14_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_14_TAG_REQUIRED") val AD_IMAGE_14_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_15_LINK_DUPLICATED") val AD_IMAGE_15_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_15_LINK_LENGTH_TOO_LONG") val AD_IMAGE_15_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_15_LINK_REQUIRED") val AD_IMAGE_15_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_15_LINK_WARNING") val AD_IMAGE_15_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_15_TAG_DUPLICATED") val AD_IMAGE_15_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_15_TAG_LENGTH_TOO_LONG") val AD_IMAGE_15_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_15_TAG_REQUIRED") val AD_IMAGE_15_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_16_LINK_DUPLICATED") val AD_IMAGE_16_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_16_LINK_LENGTH_TOO_LONG") val AD_IMAGE_16_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_16_LINK_REQUIRED") val AD_IMAGE_16_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_16_LINK_WARNING") val AD_IMAGE_16_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_16_TAG_DUPLICATED") val AD_IMAGE_16_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_16_TAG_LENGTH_TOO_LONG") val AD_IMAGE_16_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_16_TAG_REQUIRED") val AD_IMAGE_16_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_17_LINK_DUPLICATED") val AD_IMAGE_17_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_17_LINK_LENGTH_TOO_LONG") val AD_IMAGE_17_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_17_LINK_REQUIRED") val AD_IMAGE_17_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_17_LINK_WARNING") val AD_IMAGE_17_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_17_TAG_DUPLICATED") val AD_IMAGE_17_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_17_TAG_LENGTH_TOO_LONG") val AD_IMAGE_17_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_17_TAG_REQUIRED") val AD_IMAGE_17_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_18_LINK_DUPLICATED") val AD_IMAGE_18_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_18_LINK_LENGTH_TOO_LONG") val AD_IMAGE_18_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_18_LINK_REQUIRED") val AD_IMAGE_18_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_18_LINK_WARNING") val AD_IMAGE_18_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_18_TAG_DUPLICATED") val AD_IMAGE_18_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_18_TAG_LENGTH_TOO_LONG") val AD_IMAGE_18_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_18_TAG_REQUIRED") val AD_IMAGE_18_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_19_LINK_DUPLICATED") val AD_IMAGE_19_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_19_LINK_LENGTH_TOO_LONG") val AD_IMAGE_19_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_19_LINK_REQUIRED") val AD_IMAGE_19_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_19_LINK_WARNING") val AD_IMAGE_19_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_19_TAG_DUPLICATED") val AD_IMAGE_19_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_19_TAG_LENGTH_TOO_LONG") val AD_IMAGE_19_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_19_TAG_REQUIRED") val AD_IMAGE_19_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_1_LINK_DUPLICATED") val AD_IMAGE_1_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_1_LINK_LENGTH_TOO_LONG") val AD_IMAGE_1_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_1_LINK_REQUIRED") val AD_IMAGE_1_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_1_LINK_WARNING") val AD_IMAGE_1_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_1_TAG_DUPLICATED") val AD_IMAGE_1_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_1_TAG_LENGTH_TOO_LONG") val AD_IMAGE_1_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_1_TAG_REQUIRED") val AD_IMAGE_1_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_2_LINK_DUPLICATED") val AD_IMAGE_2_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_2_LINK_LENGTH_TOO_LONG") val AD_IMAGE_2_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_2_LINK_REQUIRED") val AD_IMAGE_2_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_2_LINK_WARNING") val AD_IMAGE_2_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_2_TAG_DUPLICATED") val AD_IMAGE_2_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_2_TAG_LENGTH_TOO_LONG") val AD_IMAGE_2_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_2_TAG_REQUIRED") val AD_IMAGE_2_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_3_LINK_DUPLICATED") val AD_IMAGE_3_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_3_LINK_LENGTH_TOO_LONG") val AD_IMAGE_3_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_3_LINK_REQUIRED") val AD_IMAGE_3_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_3_LINK_WARNING") val AD_IMAGE_3_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_3_TAG_DUPLICATED") val AD_IMAGE_3_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_3_TAG_LENGTH_TOO_LONG") val AD_IMAGE_3_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_3_TAG_REQUIRED") val AD_IMAGE_3_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_4_LINK_DUPLICATED") val AD_IMAGE_4_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_4_LINK_LENGTH_TOO_LONG") val AD_IMAGE_4_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_4_LINK_REQUIRED") val AD_IMAGE_4_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_4_LINK_WARNING") val AD_IMAGE_4_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_4_TAG_DUPLICATED") val AD_IMAGE_4_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_4_TAG_LENGTH_TOO_LONG") val AD_IMAGE_4_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_4_TAG_REQUIRED") val AD_IMAGE_4_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_5_LINK_DUPLICATED") val AD_IMAGE_5_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_5_LINK_LENGTH_TOO_LONG") val AD_IMAGE_5_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_5_LINK_REQUIRED") val AD_IMAGE_5_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_5_LINK_WARNING") val AD_IMAGE_5_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_5_TAG_DUPLICATED") val AD_IMAGE_5_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_5_TAG_LENGTH_TOO_LONG") val AD_IMAGE_5_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_5_TAG_REQUIRED") val AD_IMAGE_5_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_6_LINK_DUPLICATED") val AD_IMAGE_6_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_6_LINK_LENGTH_TOO_LONG") val AD_IMAGE_6_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_6_LINK_REQUIRED") val AD_IMAGE_6_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_6_LINK_WARNING") val AD_IMAGE_6_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_6_TAG_DUPLICATED") val AD_IMAGE_6_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_6_TAG_LENGTH_TOO_LONG") val AD_IMAGE_6_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_6_TAG_REQUIRED") val AD_IMAGE_6_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_7_LINK_DUPLICATED") val AD_IMAGE_7_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_7_LINK_LENGTH_TOO_LONG") val AD_IMAGE_7_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_7_LINK_REQUIRED") val AD_IMAGE_7_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_7_LINK_WARNING") val AD_IMAGE_7_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_7_TAG_DUPLICATED") val AD_IMAGE_7_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_7_TAG_LENGTH_TOO_LONG") val AD_IMAGE_7_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_7_TAG_REQUIRED") val AD_IMAGE_7_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_8_LINK_DUPLICATED") val AD_IMAGE_8_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_8_LINK_LENGTH_TOO_LONG") val AD_IMAGE_8_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_8_LINK_REQUIRED") val AD_IMAGE_8_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_8_LINK_WARNING") val AD_IMAGE_8_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_8_TAG_DUPLICATED") val AD_IMAGE_8_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_8_TAG_LENGTH_TOO_LONG") val AD_IMAGE_8_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_8_TAG_REQUIRED") val AD_IMAGE_8_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_9_LINK_DUPLICATED") val AD_IMAGE_9_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_9_LINK_LENGTH_TOO_LONG") val AD_IMAGE_9_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_9_LINK_REQUIRED") val AD_IMAGE_9_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_9_LINK_WARNING") val AD_IMAGE_9_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_9_TAG_DUPLICATED") val AD_IMAGE_9_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_9_TAG_LENGTH_TOO_LONG") val AD_IMAGE_9_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_IMAGE_9_TAG_REQUIRED") val AD_IMAGE_9_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_LINK_FORMAT_WARNING") val AD_LINK_FORMAT_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_LINK_SAME_AS_LINK") val AD_LINK_SAME_AS_LINK: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_0_LINK_DUPLICATED") val AD_VIDEO_0_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_0_LINK_LENGTH_TOO_LONG") val AD_VIDEO_0_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_0_LINK_REQUIRED") val AD_VIDEO_0_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_0_LINK_WARNING") val AD_VIDEO_0_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_0_TAG_DUPLICATED") val AD_VIDEO_0_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_0_TAG_LENGTH_TOO_LONG") val AD_VIDEO_0_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_0_TAG_REQUIRED") val AD_VIDEO_0_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_1_LINK_DUPLICATED") val AD_VIDEO_1_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_1_LINK_LENGTH_TOO_LONG") val AD_VIDEO_1_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_1_LINK_REQUIRED") val AD_VIDEO_1_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_1_LINK_WARNING") val AD_VIDEO_1_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_1_TAG_DUPLICATED") val AD_VIDEO_1_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_1_TAG_LENGTH_TOO_LONG") val AD_VIDEO_1_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_1_TAG_REQUIRED") val AD_VIDEO_1_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_2_LINK_DUPLICATED") val AD_VIDEO_2_LINK_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_2_LINK_LENGTH_TOO_LONG") val AD_VIDEO_2_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_2_LINK_REQUIRED") val AD_VIDEO_2_LINK_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_2_LINK_WARNING") val AD_VIDEO_2_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_2_TAG_DUPLICATED") val AD_VIDEO_2_TAG_DUPLICATED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_2_TAG_LENGTH_TOO_LONG") val AD_VIDEO_2_TAG_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AD_VIDEO_2_TAG_REQUIRED") val AD_VIDEO_2_TAG_REQUIRED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG") val ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ADDITIONAL_IMAGE_LINK_WARNING") val ADDITIONAL_IMAGE_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ADWORDS_FORMAT_WARNING") val ADWORDS_FORMAT_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ADWORDS_SAME_AS_LINK") val ADWORDS_SAME_AS_LINK: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AGE_GROUP_INVALID") val AGE_GROUP_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ANDROID_DEEP_LINK_INVALID") val ANDROID_DEEP_LINK_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("AVAILABILITY_DATE_INVALID") val AVAILABILITY_DATE_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("COUNTRY_DOES_NOT_MAP_TO_CURRENCY") val COUNTRY_DOES_NOT_MAP_TO_CURRENCY: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("CUSTOM_LABEL_LENGTH_TOO_LONG") val CUSTOM_LABEL_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("DESCRIPTION_LENGTH_TOO_LONG") val DESCRIPTION_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("EXPIRATION_DATE_INVALID") val EXPIRATION_DATE_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("GENDER_INVALID") val GENDER_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("GTIN_INVALID") val GTIN_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IMAGE_LINK_WARNING") val IMAGE_LINK_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IOS_DEEP_LINK_INVALID") val IOS_DEEP_LINK_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("IS_BUNDLE_INVALID") val IS_BUNDLE_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE") val ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("LINK_FORMAT_WARNING") val LINK_FORMAT_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("MIN_AD_PRICE_INVALID") val MIN_AD_PRICE_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("MPN_INVALID") val MPN_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("MULTIPACK_INVALID") val MULTIPACK_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OPTIONAL_CONDITION_INVALID") val OPTIONAL_CONDITION_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OPTIONAL_CONDITION_MISSING") val OPTIONAL_CONDITION_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OPTIONAL_PRODUCT_CATEGORY_INVALID") val OPTIONAL_PRODUCT_CATEGORY_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("OPTIONAL_PRODUCT_CATEGORY_MISSING") val OPTIONAL_PRODUCT_CATEGORY_MISSING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PRODUCT_CATEGORY_DEPTH_WARNING") val PRODUCT_CATEGORY_DEPTH_WARNING: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("PRODUCT_TYPE_LENGTH_TOO_LONG") val PRODUCT_TYPE_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SALE_DATE_INVALID") val SALE_DATE_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SALES_PRICE_INVALID") val SALES_PRICE_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SALES_PRICE_TOO_HIGH") val SALES_PRICE_TOO_HIGH: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SALES_PRICE_TOO_LOW") val SALES_PRICE_TOO_LOW: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SHIPPING_HEIGHT_INVALID") val SHIPPING_HEIGHT_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SHIPPING_INVALID") val SHIPPING_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SHIPPING_WEIGHT_INVALID") val SHIPPING_WEIGHT_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SHIPPING_WIDTH_INVALID") val SHIPPING_WIDTH_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SIZE_SYSTEM_INVALID") val SIZE_SYSTEM_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("SIZE_TYPE_INVALID") val SIZE_TYPE_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("TAX_INVALID") val TAX_INVALID: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("TITLE_LENGTH_TOO_LONG") val TITLE_LENGTH_TOO_LONG: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("TOO_MANY_ADDITIONAL_IMAGE_LINKS") val TOO_MANY_ADDITIONAL_IMAGE_LINKS: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("UTM_SOURCE_AUTO_CORRECTED") val UTM_SOURCE_AUTO_CORRECTED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED") val VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED: CatalogsItemValidationDetails? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("WEIGHT_UNIT_INVALID") val WEIGHT_UNIT_INVALID: CatalogsItemValidationDetails? = null
) {

}

