package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
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
* Product item fields
* Values: ITEM_ID,ITEM_GROUP_ID,TITLE,DESCRIPTION,ITEM_LINK,ORGANIC_LINK,IMAGE_LINK,ADWORDS_REDIRECT_LINK,AD_LINK,SIZE,GOOGLE_PRODUCT_CATEGORY,PRODUCT_CATEGORY,CONDITION,AVAILABILITY,GENDER,AGE_GROUP,SIZE_TYPE,SIZE_SYSTEM,ADULT,SHIPPING,SHIPPING_WEIGHT,TAX,MULTIPACK,ADDITIONAL_IMAGE_LINK,PRICE,SALE_PRICE,IS_BUNDLE,EXPIRATION_DATE,SALE_PRICE_EFFECTIVE_DATE,AVAILABILITY_DATE,WEIGHT_UNIT,PRODUCT_TYPE,CUSTOM_LABEL_0,CUSTOM_LABEL_1,CUSTOM_LABEL_2,CUSTOM_LABEL_3,CUSTOM_LABEL_4,MATERIAL,PATTERN,COLOR,BRAND,GTIN,MPN,IOS_DEEP_LINK,ANDROID_DEEP_LINK,FREE_SHIPPING_LABEL,FREE_SHIPPING_LIMIT,AVG_REVIEW_RATING,NUM_RATINGS,NUM_REVIEWS,ALT_TEXT,VARIANT_NAMES,VARIANT_VALUES,MIN_AD_PRICE,SHIPPING_WIDTH,SHIPPING_HEIGHT
*/
enum class NullableCatalogsItemFieldType(@get:JsonValue val value: kotlin.String) {

    ITEM_ID("ITEM_ID"),
    ITEM_GROUP_ID("ITEM_GROUP_ID"),
    TITLE("TITLE"),
    DESCRIPTION("DESCRIPTION"),
    ITEM_LINK("ITEM_LINK"),
    ORGANIC_LINK("ORGANIC_LINK"),
    IMAGE_LINK("IMAGE_LINK"),
    ADWORDS_REDIRECT_LINK("ADWORDS_REDIRECT_LINK"),
    AD_LINK("AD_LINK"),
    SIZE("SIZE"),
    GOOGLE_PRODUCT_CATEGORY("GOOGLE_PRODUCT_CATEGORY"),
    PRODUCT_CATEGORY("PRODUCT_CATEGORY"),
    CONDITION("CONDITION"),
    AVAILABILITY("AVAILABILITY"),
    GENDER("GENDER"),
    AGE_GROUP("AGE_GROUP"),
    SIZE_TYPE("SIZE_TYPE"),
    SIZE_SYSTEM("SIZE_SYSTEM"),
    ADULT("ADULT"),
    SHIPPING("SHIPPING"),
    SHIPPING_WEIGHT("SHIPPING_WEIGHT"),
    TAX("TAX"),
    MULTIPACK("MULTIPACK"),
    ADDITIONAL_IMAGE_LINK("ADDITIONAL_IMAGE_LINK"),
    PRICE("PRICE"),
    SALE_PRICE("SALE_PRICE"),
    IS_BUNDLE("IS_BUNDLE"),
    EXPIRATION_DATE("EXPIRATION_DATE"),
    SALE_PRICE_EFFECTIVE_DATE("SALE_PRICE_EFFECTIVE_DATE"),
    AVAILABILITY_DATE("AVAILABILITY_DATE"),
    WEIGHT_UNIT("WEIGHT_UNIT"),
    PRODUCT_TYPE("PRODUCT_TYPE"),
    CUSTOM_LABEL_0("CUSTOM_LABEL_0"),
    CUSTOM_LABEL_1("CUSTOM_LABEL_1"),
    CUSTOM_LABEL_2("CUSTOM_LABEL_2"),
    CUSTOM_LABEL_3("CUSTOM_LABEL_3"),
    CUSTOM_LABEL_4("CUSTOM_LABEL_4"),
    MATERIAL("MATERIAL"),
    PATTERN("PATTERN"),
    COLOR("COLOR"),
    BRAND("BRAND"),
    GTIN("GTIN"),
    MPN("MPN"),
    IOS_DEEP_LINK("IOS_DEEP_LINK"),
    ANDROID_DEEP_LINK("ANDROID_DEEP_LINK"),
    FREE_SHIPPING_LABEL("FREE_SHIPPING_LABEL"),
    FREE_SHIPPING_LIMIT("FREE_SHIPPING_LIMIT"),
    AVG_REVIEW_RATING("AVG_REVIEW_RATING"),
    NUM_RATINGS("NUM_RATINGS"),
    NUM_REVIEWS("NUM_REVIEWS"),
    ALT_TEXT("ALT_TEXT"),
    VARIANT_NAMES("VARIANT_NAMES"),
    VARIANT_VALUES("VARIANT_VALUES"),
    MIN_AD_PRICE("MIN_AD_PRICE"),
    SHIPPING_WIDTH("SHIPPING_WIDTH"),
    SHIPPING_HEIGHT("SHIPPING_HEIGHT");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): NullableCatalogsItemFieldType {
                return values().first{it -> it.value == value}
        }
    }
}

