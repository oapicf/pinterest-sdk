/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.pinterestsdk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.pinterestsdk.JSON;

/**
 * Product counts for a CatalogsProductGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T23:01:05.225954683Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsProductGroupProductCounts {
  public static final String SERIALIZED_NAME_IN_STOCK = "in_stock";
  @SerializedName(SERIALIZED_NAME_IN_STOCK)
  private BigDecimal inStock;

  public static final String SERIALIZED_NAME_OUT_OF_STOCK = "out_of_stock";
  @SerializedName(SERIALIZED_NAME_OUT_OF_STOCK)
  private BigDecimal outOfStock;

  public static final String SERIALIZED_NAME_PREORDER = "preorder";
  @SerializedName(SERIALIZED_NAME_PREORDER)
  private BigDecimal preorder;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private BigDecimal total;

  public CatalogsProductGroupProductCounts() {
  }

  public CatalogsProductGroupProductCounts inStock(BigDecimal inStock) {
    this.inStock = inStock;
    return this;
  }

   /**
   * Get inStock
   * minimum: 0
   * @return inStock
  **/
  @javax.annotation.Nonnull
  public BigDecimal getInStock() {
    return inStock;
  }

  public void setInStock(BigDecimal inStock) {
    this.inStock = inStock;
  }


  public CatalogsProductGroupProductCounts outOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

   /**
   * Get outOfStock
   * minimum: 0
   * @return outOfStock
  **/
  @javax.annotation.Nonnull
  public BigDecimal getOutOfStock() {
    return outOfStock;
  }

  public void setOutOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
  }


  public CatalogsProductGroupProductCounts preorder(BigDecimal preorder) {
    this.preorder = preorder;
    return this;
  }

   /**
   * Get preorder
   * minimum: 0
   * @return preorder
  **/
  @javax.annotation.Nonnull
  public BigDecimal getPreorder() {
    return preorder;
  }

  public void setPreorder(BigDecimal preorder) {
    this.preorder = preorder;
  }


  public CatalogsProductGroupProductCounts total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * minimum: 0
   * @return total
  **/
  @javax.annotation.Nonnull
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupProductCounts catalogsProductGroupProductCounts = (CatalogsProductGroupProductCounts) o;
    return Objects.equals(this.inStock, catalogsProductGroupProductCounts.inStock) &&
        Objects.equals(this.outOfStock, catalogsProductGroupProductCounts.outOfStock) &&
        Objects.equals(this.preorder, catalogsProductGroupProductCounts.preorder) &&
        Objects.equals(this.total, catalogsProductGroupProductCounts.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inStock, outOfStock, preorder, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupProductCounts {\n");
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
    sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
    sb.append("    preorder: ").append(toIndentedString(preorder)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("in_stock");
    openapiFields.add("out_of_stock");
    openapiFields.add("preorder");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("in_stock");
    openapiRequiredFields.add("out_of_stock");
    openapiRequiredFields.add("preorder");
    openapiRequiredFields.add("total");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CatalogsProductGroupProductCounts
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CatalogsProductGroupProductCounts.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogsProductGroupProductCounts is not found in the empty JSON string", CatalogsProductGroupProductCounts.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CatalogsProductGroupProductCounts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogsProductGroupProductCounts` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CatalogsProductGroupProductCounts.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogsProductGroupProductCounts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogsProductGroupProductCounts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogsProductGroupProductCounts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogsProductGroupProductCounts.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogsProductGroupProductCounts>() {
           @Override
           public void write(JsonWriter out, CatalogsProductGroupProductCounts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogsProductGroupProductCounts read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CatalogsProductGroupProductCounts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CatalogsProductGroupProductCounts
  * @throws IOException if the JSON string is invalid with respect to CatalogsProductGroupProductCounts
  */
  public static CatalogsProductGroupProductCounts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogsProductGroupProductCounts.class);
  }

 /**
  * Convert an instance of CatalogsProductGroupProductCounts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
