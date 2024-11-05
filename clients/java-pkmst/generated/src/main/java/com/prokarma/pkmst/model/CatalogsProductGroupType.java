package com.prokarma.pkmst.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <p>Catalog product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_PRODUCTS: Consists of every product in your latest successful feed upload. <br>BEST_DEALS: Consists of products with the deepest drop in price. <br>PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. <br>TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. <br>BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. <br>NEW_ARRIVALS: Consists of products that are new to your Catalog. <br>SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. <br>I2PC: Product groups created based on predicted product category.</p>
 */
public enum CatalogsProductGroupType {
  
  MERCHANT_CREATED("MERCHANT_CREATED"),
  
  ALL_PRODUCTS("ALL_PRODUCTS"),
  
  BEST_DEALS("BEST_DEALS"),
  
  PINNER_FAVORITES("PINNER_FAVORITES"),
  
  TOP_SELLERS("TOP_SELLERS"),
  
  BACK_IN_STOCK("BACK_IN_STOCK"),
  
  NEW_ARRIVALS("NEW_ARRIVALS"),
  
  SHOPIFY_COLLECTIONS("SHOPIFY_COLLECTIONS"),
  
  I2_PC("I2PC");

  private String value;

  CatalogsProductGroupType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogsProductGroupType fromValue(String text) {
    for (CatalogsProductGroupType b : CatalogsProductGroupType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

