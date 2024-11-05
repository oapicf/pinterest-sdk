package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Product item fields
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum NullableCatalogsItemFieldType {

    @JsonProperty("ITEM_ID") ITEM_ID(String.valueOf("ITEM_ID")), @JsonProperty("ITEM_GROUP_ID") ITEM_GROUP_ID(String.valueOf("ITEM_GROUP_ID")), @JsonProperty("TITLE") TITLE(String.valueOf("TITLE")), @JsonProperty("DESCRIPTION") DESCRIPTION(String.valueOf("DESCRIPTION")), @JsonProperty("ITEM_LINK") ITEM_LINK(String.valueOf("ITEM_LINK")), @JsonProperty("ORGANIC_LINK") ORGANIC_LINK(String.valueOf("ORGANIC_LINK")), @JsonProperty("IMAGE_LINK") IMAGE_LINK(String.valueOf("IMAGE_LINK")), @JsonProperty("ADWORDS_REDIRECT_LINK") ADWORDS_REDIRECT_LINK(String.valueOf("ADWORDS_REDIRECT_LINK")), @JsonProperty("AD_LINK") AD_LINK(String.valueOf("AD_LINK")), @JsonProperty("SIZE") SIZE(String.valueOf("SIZE")), @JsonProperty("GOOGLE_PRODUCT_CATEGORY") GOOGLE_PRODUCT_CATEGORY(String.valueOf("GOOGLE_PRODUCT_CATEGORY")), @JsonProperty("PRODUCT_CATEGORY") PRODUCT_CATEGORY(String.valueOf("PRODUCT_CATEGORY")), @JsonProperty("CONDITION") CONDITION(String.valueOf("CONDITION")), @JsonProperty("AVAILABILITY") AVAILABILITY(String.valueOf("AVAILABILITY")), @JsonProperty("GENDER") GENDER(String.valueOf("GENDER")), @JsonProperty("AGE_GROUP") AGE_GROUP(String.valueOf("AGE_GROUP")), @JsonProperty("SIZE_TYPE") SIZE_TYPE(String.valueOf("SIZE_TYPE")), @JsonProperty("SIZE_SYSTEM") SIZE_SYSTEM(String.valueOf("SIZE_SYSTEM")), @JsonProperty("ADULT") ADULT(String.valueOf("ADULT")), @JsonProperty("SHIPPING") SHIPPING(String.valueOf("SHIPPING")), @JsonProperty("SHIPPING_WEIGHT") SHIPPING_WEIGHT(String.valueOf("SHIPPING_WEIGHT")), @JsonProperty("TAX") TAX(String.valueOf("TAX")), @JsonProperty("MULTIPACK") MULTIPACK(String.valueOf("MULTIPACK")), @JsonProperty("ADDITIONAL_IMAGE_LINK") ADDITIONAL_IMAGE_LINK(String.valueOf("ADDITIONAL_IMAGE_LINK")), @JsonProperty("PRICE") PRICE(String.valueOf("PRICE")), @JsonProperty("SALE_PRICE") SALE_PRICE(String.valueOf("SALE_PRICE")), @JsonProperty("IS_BUNDLE") IS_BUNDLE(String.valueOf("IS_BUNDLE")), @JsonProperty("EXPIRATION_DATE") EXPIRATION_DATE(String.valueOf("EXPIRATION_DATE")), @JsonProperty("SALE_PRICE_EFFECTIVE_DATE") SALE_PRICE_EFFECTIVE_DATE(String.valueOf("SALE_PRICE_EFFECTIVE_DATE")), @JsonProperty("AVAILABILITY_DATE") AVAILABILITY_DATE(String.valueOf("AVAILABILITY_DATE")), @JsonProperty("WEIGHT_UNIT") WEIGHT_UNIT(String.valueOf("WEIGHT_UNIT")), @JsonProperty("PRODUCT_TYPE") PRODUCT_TYPE(String.valueOf("PRODUCT_TYPE")), @JsonProperty("CUSTOM_LABEL_0") CUSTOM_LABEL_0(String.valueOf("CUSTOM_LABEL_0")), @JsonProperty("CUSTOM_LABEL_1") CUSTOM_LABEL_1(String.valueOf("CUSTOM_LABEL_1")), @JsonProperty("CUSTOM_LABEL_2") CUSTOM_LABEL_2(String.valueOf("CUSTOM_LABEL_2")), @JsonProperty("CUSTOM_LABEL_3") CUSTOM_LABEL_3(String.valueOf("CUSTOM_LABEL_3")), @JsonProperty("CUSTOM_LABEL_4") CUSTOM_LABEL_4(String.valueOf("CUSTOM_LABEL_4")), @JsonProperty("MATERIAL") MATERIAL(String.valueOf("MATERIAL")), @JsonProperty("PATTERN") PATTERN(String.valueOf("PATTERN")), @JsonProperty("COLOR") COLOR(String.valueOf("COLOR")), @JsonProperty("BRAND") BRAND(String.valueOf("BRAND")), @JsonProperty("GTIN") GTIN(String.valueOf("GTIN")), @JsonProperty("MPN") MPN(String.valueOf("MPN")), @JsonProperty("IOS_DEEP_LINK") IOS_DEEP_LINK(String.valueOf("IOS_DEEP_LINK")), @JsonProperty("ANDROID_DEEP_LINK") ANDROID_DEEP_LINK(String.valueOf("ANDROID_DEEP_LINK")), @JsonProperty("FREE_SHIPPING_LABEL") FREE_SHIPPING_LABEL(String.valueOf("FREE_SHIPPING_LABEL")), @JsonProperty("FREE_SHIPPING_LIMIT") FREE_SHIPPING_LIMIT(String.valueOf("FREE_SHIPPING_LIMIT")), @JsonProperty("AVG_REVIEW_RATING") AVG_REVIEW_RATING(String.valueOf("AVG_REVIEW_RATING")), @JsonProperty("NUM_RATINGS") NUM_RATINGS(String.valueOf("NUM_RATINGS")), @JsonProperty("NUM_REVIEWS") NUM_REVIEWS(String.valueOf("NUM_REVIEWS")), @JsonProperty("ALT_TEXT") ALT_TEXT(String.valueOf("ALT_TEXT")), @JsonProperty("VARIANT_NAMES") VARIANT_NAMES(String.valueOf("VARIANT_NAMES")), @JsonProperty("VARIANT_VALUES") VARIANT_VALUES(String.valueOf("VARIANT_VALUES")), @JsonProperty("MIN_AD_PRICE") MIN_AD_PRICE(String.valueOf("MIN_AD_PRICE")), @JsonProperty("SHIPPING_WIDTH") SHIPPING_WIDTH(String.valueOf("SHIPPING_WIDTH")), @JsonProperty("SHIPPING_HEIGHT") SHIPPING_HEIGHT(String.valueOf("SHIPPING_HEIGHT"));


    private String value;

    NullableCatalogsItemFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NullableCatalogsItemFieldType fromValue(String value) {
        for (NullableCatalogsItemFieldType b : NullableCatalogsItemFieldType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



