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
import com.github.oapicf.pinterestsdk.model.AppTypeMultipliers;
import com.github.oapicf.pinterestsdk.model.PlacementMultipliers;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.pinterestsdk.JSON;

/**
 * Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionBidOptions {
  public static final String SERIALIZED_NAME_BID_IN_MICRO_CURRENCY = "bid_in_micro_currency";
  @SerializedName(SERIALIZED_NAME_BID_IN_MICRO_CURRENCY)
  private Long bidInMicroCurrency;

  public static final String SERIALIZED_NAME_APP_TYPE_MULTIPLIERS = "app_type_multipliers";
  @SerializedName(SERIALIZED_NAME_APP_TYPE_MULTIPLIERS)
  private AppTypeMultipliers appTypeMultipliers;

  public static final String SERIALIZED_NAME_PLACEMENT_MULTIPLIERS = "placement_multipliers";
  @SerializedName(SERIALIZED_NAME_PLACEMENT_MULTIPLIERS)
  private PlacementMultipliers placementMultipliers;

  public AdvancedAuctionBidOptions() {
  }

  public AdvancedAuctionBidOptions bidInMicroCurrency(Long bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

  /**
   * Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;.
   * @return bidInMicroCurrency
   */
  @javax.annotation.Nullable
  public Long getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Long bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }


  public AdvancedAuctionBidOptions appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

  /**
   * Get appTypeMultipliers
   * @return appTypeMultipliers
   */
  @javax.annotation.Nullable
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }


  public AdvancedAuctionBidOptions placementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

  /**
   * Get placementMultipliers
   * @return placementMultipliers
   */
  @javax.annotation.Nullable
  public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedAuctionBidOptions advancedAuctionBidOptions = (AdvancedAuctionBidOptions) o;
    return Objects.equals(this.bidInMicroCurrency, advancedAuctionBidOptions.bidInMicroCurrency) &&
        Objects.equals(this.appTypeMultipliers, advancedAuctionBidOptions.appTypeMultipliers) &&
        Objects.equals(this.placementMultipliers, advancedAuctionBidOptions.placementMultipliers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidInMicroCurrency, appTypeMultipliers, placementMultipliers);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionBidOptions {\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    appTypeMultipliers: ").append(toIndentedString(appTypeMultipliers)).append("\n");
    sb.append("    placementMultipliers: ").append(toIndentedString(placementMultipliers)).append("\n");
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
    openapiFields.add("bid_in_micro_currency");
    openapiFields.add("app_type_multipliers");
    openapiFields.add("placement_multipliers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdvancedAuctionBidOptions
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdvancedAuctionBidOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdvancedAuctionBidOptions is not found in the empty JSON string", AdvancedAuctionBidOptions.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdvancedAuctionBidOptions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdvancedAuctionBidOptions` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvancedAuctionBidOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvancedAuctionBidOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvancedAuctionBidOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvancedAuctionBidOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvancedAuctionBidOptions>() {
           @Override
           public void write(JsonWriter out, AdvancedAuctionBidOptions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvancedAuctionBidOptions read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdvancedAuctionBidOptions given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdvancedAuctionBidOptions
   * @throws IOException if the JSON string is invalid with respect to AdvancedAuctionBidOptions
   */
  public static AdvancedAuctionBidOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvancedAuctionBidOptions.class);
  }

  /**
   * Convert an instance of AdvancedAuctionBidOptions to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

