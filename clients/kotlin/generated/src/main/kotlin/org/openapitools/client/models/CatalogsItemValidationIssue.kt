/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * Values: AD_LINK_FORMAT_WARNING,AD_LINK_SAME_AS_LINK,ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG,ADDITIONAL_IMAGE_LINK_WARNING,ADULT_INVALID,ADWORDS_FORMAT_INVALID,ADWORDS_FORMAT_WARNING,ADWORDS_SAME_AS_LINK,AGE_GROUP_INVALID,ANDROID_DEEP_LINK_INVALID,AVAILABILITY_DATE_INVALID,AVAILABILITY_INVALID,BLOCKLISTED_IMAGE_SIGNATURE,COUNTRY_DOES_NOT_MAP_TO_CURRENCY,CUSTOM_LABEL_LENGTH_TOO_LONG,DESCRIPTION_LENGTH_TOO_LONG,DESCRIPTION_MISSING,DUPLICATE_PRODUCTS,EXPIRATION_DATE_INVALID,GENDER_INVALID,GTIN_INVALID,IMAGE_LINK_INVALID,IMAGE_LINK_LENGTH_TOO_LONG,IMAGE_LINK_MISSING,IMAGE_LINK_WARNING,INVALID_DOMAIN,IOS_DEEP_LINK_INVALID,IS_BUNDLE_INVALID,ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE,ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE,ITEMID_MISSING,LINK_FORMAT_INVALID,LINK_FORMAT_WARNING,LINK_LENGTH_TOO_LONG,LIST_PRICE_INVALID,MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED,MIN_AD_PRICE_INVALID,MPN_INVALID,MULTIPACK_INVALID,OPTIONAL_CONDITION_INVALID,OPTIONAL_CONDITION_MISSING,OPTIONAL_PRODUCT_CATEGORY_INVALID,OPTIONAL_PRODUCT_CATEGORY_MISSING,PARSE_LINE_ERROR,PINJOIN_CONTENT_UNSAFE,PRICE_CANNOT_BE_DETERMINED,PRICE_MISSING,PRODUCT_CATEGORY_DEPTH_WARNING,PRODUCT_LINK_MISSING,PRODUCT_PRICE_INVALID,PRODUCT_TYPE_LENGTH_TOO_LONG,SALE_DATE_INVALID,SALES_PRICE_INVALID,SALES_PRICE_TOO_HIGH,SALES_PRICE_TOO_LOW,SHIPPING_INVALID,SHIPPING_HEIGHT_INVALID,SHIPPING_WEIGHT_INVALID,SHIPPING_WIDTH_INVALID,SIZE_SYSTEM_INVALID,SIZE_TYPE_INVALID,TAX_INVALID,TITLE_LENGTH_TOO_LONG,TITLE_MISSING,TOO_MANY_ADDITIONAL_IMAGE_LINKS,UTM_SOURCE_AUTO_CORRECTED,WEIGHT_UNIT_INVALID
 */

@JsonClass(generateAdapter = false)
enum class CatalogsItemValidationIssue(val value: kotlin.String) {

    @Json(name = "AD_LINK_FORMAT_WARNING")
    AD_LINK_FORMAT_WARNING("AD_LINK_FORMAT_WARNING"),

    @Json(name = "AD_LINK_SAME_AS_LINK")
    AD_LINK_SAME_AS_LINK("AD_LINK_SAME_AS_LINK"),

    @Json(name = "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG")
    ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG("ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG"),

    @Json(name = "ADDITIONAL_IMAGE_LINK_WARNING")
    ADDITIONAL_IMAGE_LINK_WARNING("ADDITIONAL_IMAGE_LINK_WARNING"),

    @Json(name = "ADULT_INVALID")
    ADULT_INVALID("ADULT_INVALID"),

    @Json(name = "ADWORDS_FORMAT_INVALID")
    ADWORDS_FORMAT_INVALID("ADWORDS_FORMAT_INVALID"),

    @Json(name = "ADWORDS_FORMAT_WARNING")
    ADWORDS_FORMAT_WARNING("ADWORDS_FORMAT_WARNING"),

    @Json(name = "ADWORDS_SAME_AS_LINK")
    ADWORDS_SAME_AS_LINK("ADWORDS_SAME_AS_LINK"),

    @Json(name = "AGE_GROUP_INVALID")
    AGE_GROUP_INVALID("AGE_GROUP_INVALID"),

    @Json(name = "ANDROID_DEEP_LINK_INVALID")
    ANDROID_DEEP_LINK_INVALID("ANDROID_DEEP_LINK_INVALID"),

    @Json(name = "AVAILABILITY_DATE_INVALID")
    AVAILABILITY_DATE_INVALID("AVAILABILITY_DATE_INVALID"),

    @Json(name = "AVAILABILITY_INVALID")
    AVAILABILITY_INVALID("AVAILABILITY_INVALID"),

    @Json(name = "BLOCKLISTED_IMAGE_SIGNATURE")
    BLOCKLISTED_IMAGE_SIGNATURE("BLOCKLISTED_IMAGE_SIGNATURE"),

    @Json(name = "COUNTRY_DOES_NOT_MAP_TO_CURRENCY")
    COUNTRY_DOES_NOT_MAP_TO_CURRENCY("COUNTRY_DOES_NOT_MAP_TO_CURRENCY"),

    @Json(name = "CUSTOM_LABEL_LENGTH_TOO_LONG")
    CUSTOM_LABEL_LENGTH_TOO_LONG("CUSTOM_LABEL_LENGTH_TOO_LONG"),

    @Json(name = "DESCRIPTION_LENGTH_TOO_LONG")
    DESCRIPTION_LENGTH_TOO_LONG("DESCRIPTION_LENGTH_TOO_LONG"),

    @Json(name = "DESCRIPTION_MISSING")
    DESCRIPTION_MISSING("DESCRIPTION_MISSING"),

    @Json(name = "DUPLICATE_PRODUCTS")
    DUPLICATE_PRODUCTS("DUPLICATE_PRODUCTS"),

    @Json(name = "EXPIRATION_DATE_INVALID")
    EXPIRATION_DATE_INVALID("EXPIRATION_DATE_INVALID"),

    @Json(name = "GENDER_INVALID")
    GENDER_INVALID("GENDER_INVALID"),

    @Json(name = "GTIN_INVALID")
    GTIN_INVALID("GTIN_INVALID"),

    @Json(name = "IMAGE_LINK_INVALID")
    IMAGE_LINK_INVALID("IMAGE_LINK_INVALID"),

    @Json(name = "IMAGE_LINK_LENGTH_TOO_LONG")
    IMAGE_LINK_LENGTH_TOO_LONG("IMAGE_LINK_LENGTH_TOO_LONG"),

    @Json(name = "IMAGE_LINK_MISSING")
    IMAGE_LINK_MISSING("IMAGE_LINK_MISSING"),

    @Json(name = "IMAGE_LINK_WARNING")
    IMAGE_LINK_WARNING("IMAGE_LINK_WARNING"),

    @Json(name = "INVALID_DOMAIN")
    INVALID_DOMAIN("INVALID_DOMAIN"),

    @Json(name = "IOS_DEEP_LINK_INVALID")
    IOS_DEEP_LINK_INVALID("IOS_DEEP_LINK_INVALID"),

    @Json(name = "IS_BUNDLE_INVALID")
    IS_BUNDLE_INVALID("IS_BUNDLE_INVALID"),

    @Json(name = "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE")
    ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE("ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE"),

    @Json(name = "ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE")
    ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE("ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE"),

    @Json(name = "ITEMID_MISSING")
    ITEMID_MISSING("ITEMID_MISSING"),

    @Json(name = "LINK_FORMAT_INVALID")
    LINK_FORMAT_INVALID("LINK_FORMAT_INVALID"),

    @Json(name = "LINK_FORMAT_WARNING")
    LINK_FORMAT_WARNING("LINK_FORMAT_WARNING"),

    @Json(name = "LINK_LENGTH_TOO_LONG")
    LINK_LENGTH_TOO_LONG("LINK_LENGTH_TOO_LONG"),

    @Json(name = "LIST_PRICE_INVALID")
    LIST_PRICE_INVALID("LIST_PRICE_INVALID"),

    @Json(name = "MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED")
    MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED("MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED"),

    @Json(name = "MIN_AD_PRICE_INVALID")
    MIN_AD_PRICE_INVALID("MIN_AD_PRICE_INVALID"),

    @Json(name = "MPN_INVALID")
    MPN_INVALID("MPN_INVALID"),

    @Json(name = "MULTIPACK_INVALID")
    MULTIPACK_INVALID("MULTIPACK_INVALID"),

    @Json(name = "OPTIONAL_CONDITION_INVALID")
    OPTIONAL_CONDITION_INVALID("OPTIONAL_CONDITION_INVALID"),

    @Json(name = "OPTIONAL_CONDITION_MISSING")
    OPTIONAL_CONDITION_MISSING("OPTIONAL_CONDITION_MISSING"),

    @Json(name = "OPTIONAL_PRODUCT_CATEGORY_INVALID")
    OPTIONAL_PRODUCT_CATEGORY_INVALID("OPTIONAL_PRODUCT_CATEGORY_INVALID"),

    @Json(name = "OPTIONAL_PRODUCT_CATEGORY_MISSING")
    OPTIONAL_PRODUCT_CATEGORY_MISSING("OPTIONAL_PRODUCT_CATEGORY_MISSING"),

    @Json(name = "PARSE_LINE_ERROR")
    PARSE_LINE_ERROR("PARSE_LINE_ERROR"),

    @Json(name = "PINJOIN_CONTENT_UNSAFE")
    PINJOIN_CONTENT_UNSAFE("PINJOIN_CONTENT_UNSAFE"),

    @Json(name = "PRICE_CANNOT_BE_DETERMINED")
    PRICE_CANNOT_BE_DETERMINED("PRICE_CANNOT_BE_DETERMINED"),

    @Json(name = "PRICE_MISSING")
    PRICE_MISSING("PRICE_MISSING"),

    @Json(name = "PRODUCT_CATEGORY_DEPTH_WARNING")
    PRODUCT_CATEGORY_DEPTH_WARNING("PRODUCT_CATEGORY_DEPTH_WARNING"),

    @Json(name = "PRODUCT_LINK_MISSING")
    PRODUCT_LINK_MISSING("PRODUCT_LINK_MISSING"),

    @Json(name = "PRODUCT_PRICE_INVALID")
    PRODUCT_PRICE_INVALID("PRODUCT_PRICE_INVALID"),

    @Json(name = "PRODUCT_TYPE_LENGTH_TOO_LONG")
    PRODUCT_TYPE_LENGTH_TOO_LONG("PRODUCT_TYPE_LENGTH_TOO_LONG"),

    @Json(name = "SALE_DATE_INVALID")
    SALE_DATE_INVALID("SALE_DATE_INVALID"),

    @Json(name = "SALES_PRICE_INVALID")
    SALES_PRICE_INVALID("SALES_PRICE_INVALID"),

    @Json(name = "SALES_PRICE_TOO_HIGH")
    SALES_PRICE_TOO_HIGH("SALES_PRICE_TOO_HIGH"),

    @Json(name = "SALES_PRICE_TOO_LOW")
    SALES_PRICE_TOO_LOW("SALES_PRICE_TOO_LOW"),

    @Json(name = "SHIPPING_INVALID")
    SHIPPING_INVALID("SHIPPING_INVALID"),

    @Json(name = "SHIPPING_HEIGHT_INVALID")
    SHIPPING_HEIGHT_INVALID("SHIPPING_HEIGHT_INVALID"),

    @Json(name = "SHIPPING_WEIGHT_INVALID")
    SHIPPING_WEIGHT_INVALID("SHIPPING_WEIGHT_INVALID"),

    @Json(name = "SHIPPING_WIDTH_INVALID")
    SHIPPING_WIDTH_INVALID("SHIPPING_WIDTH_INVALID"),

    @Json(name = "SIZE_SYSTEM_INVALID")
    SIZE_SYSTEM_INVALID("SIZE_SYSTEM_INVALID"),

    @Json(name = "SIZE_TYPE_INVALID")
    SIZE_TYPE_INVALID("SIZE_TYPE_INVALID"),

    @Json(name = "TAX_INVALID")
    TAX_INVALID("TAX_INVALID"),

    @Json(name = "TITLE_LENGTH_TOO_LONG")
    TITLE_LENGTH_TOO_LONG("TITLE_LENGTH_TOO_LONG"),

    @Json(name = "TITLE_MISSING")
    TITLE_MISSING("TITLE_MISSING"),

    @Json(name = "TOO_MANY_ADDITIONAL_IMAGE_LINKS")
    TOO_MANY_ADDITIONAL_IMAGE_LINKS("TOO_MANY_ADDITIONAL_IMAGE_LINKS"),

    @Json(name = "UTM_SOURCE_AUTO_CORRECTED")
    UTM_SOURCE_AUTO_CORRECTED("UTM_SOURCE_AUTO_CORRECTED"),

    @Json(name = "WEIGHT_UNIT_INVALID")
    WEIGHT_UNIT_INVALID("WEIGHT_UNIT_INVALID");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is CatalogsItemValidationIssue) "$data" else null

        /**
         * Returns a valid [CatalogsItemValidationIssue] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): CatalogsItemValidationIssue? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
