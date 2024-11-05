package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Product item fields
 */
public enum NullableCatalogsItemFieldType {
  
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

  private String value;

  NullableCatalogsItemFieldType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static NullableCatalogsItemFieldType fromValue(String value) {
    for (NullableCatalogsItemFieldType b : NullableCatalogsItemFieldType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

}

