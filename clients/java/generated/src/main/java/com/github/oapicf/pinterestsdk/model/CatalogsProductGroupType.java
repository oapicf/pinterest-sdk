/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.pinterestsdk.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * &lt;p&gt;Catalog product group type&lt;/p&gt; &lt;p&gt;MERCHANT_CREATED: Product groups created by merchants. &lt;br&gt;ALL_PRODUCTS: Consists of every product in your latest successful feed upload. &lt;br&gt;BEST_DEALS: Consists of products with the deepest drop in price. &lt;br&gt;PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. &lt;br&gt;TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. &lt;br&gt;BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. &lt;br&gt;NEW_ARRIVALS: Consists of products that are new to your Catalog. &lt;br&gt;SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. &lt;br&gt;I2PC: Product groups created based on predicted product category.&lt;/p&gt;
 */
@JsonAdapter(CatalogsProductGroupType.Adapter.class)
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

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogsProductGroupType fromValue(String value) {
    for (CatalogsProductGroupType b : CatalogsProductGroupType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CatalogsProductGroupType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogsProductGroupType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CatalogsProductGroupType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CatalogsProductGroupType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    CatalogsProductGroupType.fromValue(value);
  }
}

