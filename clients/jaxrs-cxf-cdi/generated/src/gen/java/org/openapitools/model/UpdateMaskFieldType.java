package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The field types supported by the update mask
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum UpdateMaskFieldType {

    @JsonProperty("ad_link") AD_LINK(String.valueOf("ad_link")), @JsonProperty("adult") ADULT(String.valueOf("adult")), @JsonProperty("age_group") AGE_GROUP(String.valueOf("age_group")), @JsonProperty("availability") AVAILABILITY(String.valueOf("availability")), @JsonProperty("average_review_rating") AVERAGE_REVIEW_RATING(String.valueOf("average_review_rating")), @JsonProperty("brand") BRAND(String.valueOf("brand")), @JsonProperty("checkout_enabled") CHECKOUT_ENABLED(String.valueOf("checkout_enabled")), @JsonProperty("color") COLOR(String.valueOf("color")), @JsonProperty("condition") CONDITION(String.valueOf("condition")), @JsonProperty("custom_label_0") CUSTOM_LABEL_0(String.valueOf("custom_label_0")), @JsonProperty("custom_label_1") CUSTOM_LABEL_1(String.valueOf("custom_label_1")), @JsonProperty("custom_label_2") CUSTOM_LABEL_2(String.valueOf("custom_label_2")), @JsonProperty("custom_label_3") CUSTOM_LABEL_3(String.valueOf("custom_label_3")), @JsonProperty("custom_label_4") CUSTOM_LABEL_4(String.valueOf("custom_label_4")), @JsonProperty("description") DESCRIPTION(String.valueOf("description")), @JsonProperty("free_shipping_label") FREE_SHIPPING_LABEL(String.valueOf("free_shipping_label")), @JsonProperty("free_shipping_limit") FREE_SHIPPING_LIMIT(String.valueOf("free_shipping_limit")), @JsonProperty("gender") GENDER(String.valueOf("gender")), @JsonProperty("google_product_category") GOOGLE_PRODUCT_CATEGORY(String.valueOf("google_product_category")), @JsonProperty("gtin") GTIN(String.valueOf("gtin")), @JsonProperty("item_group_id") ITEM_GROUP_ID(String.valueOf("item_group_id")), @JsonProperty("last_updated_time") LAST_UPDATED_TIME(String.valueOf("last_updated_time")), @JsonProperty("link") LINK(String.valueOf("link")), @JsonProperty("material") MATERIAL(String.valueOf("material")), @JsonProperty("min_ad_price") MIN_AD_PRICE(String.valueOf("min_ad_price")), @JsonProperty("mpn") MPN(String.valueOf("mpn")), @JsonProperty("number_of_ratings") NUMBER_OF_RATINGS(String.valueOf("number_of_ratings")), @JsonProperty("number_of_reviews") NUMBER_OF_REVIEWS(String.valueOf("number_of_reviews")), @JsonProperty("pattern") PATTERN(String.valueOf("pattern")), @JsonProperty("price") PRICE(String.valueOf("price")), @JsonProperty("product_type") PRODUCT_TYPE(String.valueOf("product_type")), @JsonProperty("sale_price") SALE_PRICE(String.valueOf("sale_price")), @JsonProperty("shipping") SHIPPING(String.valueOf("shipping")), @JsonProperty("shipping_height") SHIPPING_HEIGHT(String.valueOf("shipping_height")), @JsonProperty("shipping_weight") SHIPPING_WEIGHT(String.valueOf("shipping_weight")), @JsonProperty("shipping_width") SHIPPING_WIDTH(String.valueOf("shipping_width")), @JsonProperty("size") SIZE(String.valueOf("size")), @JsonProperty("size_system") SIZE_SYSTEM(String.valueOf("size_system")), @JsonProperty("size_type") SIZE_TYPE(String.valueOf("size_type")), @JsonProperty("tax") TAX(String.valueOf("tax")), @JsonProperty("title") TITLE(String.valueOf("title")), @JsonProperty("variant_names") VARIANT_NAMES(String.valueOf("variant_names")), @JsonProperty("variant_values") VARIANT_VALUES(String.valueOf("variant_values"));


    private String value;

    UpdateMaskFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UpdateMaskFieldType fromValue(String value) {
        for (UpdateMaskFieldType b : UpdateMaskFieldType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



