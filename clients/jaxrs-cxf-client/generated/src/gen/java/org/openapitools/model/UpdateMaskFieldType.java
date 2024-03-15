package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * The field types supported by the update mask
 */
public enum UpdateMaskFieldType {
  
  AD_LINK("ad_link"),
  
  ADULT("adult"),
  
  AGE_GROUP("age_group"),
  
  AVAILABILITY("availability"),
  
  AVERAGE_REVIEW_RATING("average_review_rating"),
  
  BRAND("brand"),
  
  CHECKOUT_ENABLED("checkout_enabled"),
  
  COLOR("color"),
  
  CONDITION("condition"),
  
  CUSTOM_LABEL_0("custom_label_0"),
  
  CUSTOM_LABEL_1("custom_label_1"),
  
  CUSTOM_LABEL_2("custom_label_2"),
  
  CUSTOM_LABEL_3("custom_label_3"),
  
  CUSTOM_LABEL_4("custom_label_4"),
  
  DESCRIPTION("description"),
  
  FREE_SHIPPING_LABEL("free_shipping_label"),
  
  FREE_SHIPPING_LIMIT("free_shipping_limit"),
  
  GENDER("gender"),
  
  GOOGLE_PRODUCT_CATEGORY("google_product_category"),
  
  GTIN("gtin"),
  
  ITEM_GROUP_ID("item_group_id"),
  
  LAST_UPDATED_TIME("last_updated_time"),
  
  LINK("link"),
  
  MATERIAL("material"),
  
  MIN_AD_PRICE("min_ad_price"),
  
  MPN("mpn"),
  
  NUMBER_OF_RATINGS("number_of_ratings"),
  
  NUMBER_OF_REVIEWS("number_of_reviews"),
  
  PATTERN("pattern"),
  
  PRICE("price"),
  
  PRODUCT_TYPE("product_type"),
  
  SALE_PRICE("sale_price"),
  
  SHIPPING("shipping"),
  
  SHIPPING_HEIGHT("shipping_height"),
  
  SHIPPING_WEIGHT("shipping_weight"),
  
  SHIPPING_WIDTH("shipping_width"),
  
  SIZE("size"),
  
  SIZE_SYSTEM("size_system"),
  
  SIZE_TYPE("size_type"),
  
  TAX("tax"),
  
  TITLE("title"),
  
  VARIANT_NAMES("variant_names"),
  
  VARIANT_VALUES("variant_values");

  private String value;

  UpdateMaskFieldType(String value) {
    this.value = value;
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

