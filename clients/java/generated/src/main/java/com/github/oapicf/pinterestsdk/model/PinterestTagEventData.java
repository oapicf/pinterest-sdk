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
import com.github.oapicf.pinterestsdk.model.Currency;
import com.github.oapicf.pinterestsdk.model.LineItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.pinterestsdk.JSON;

/**
 * Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’ s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot; , \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PinterestTagEventData {
  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_LEAD_TYPE = "lead_type";
  @SerializedName(SERIALIZED_NAME_LEAD_TYPE)
  private String leadType;

  public static final String SERIALIZED_NAME_LINE_ITEMS = "line_items";
  @SerializedName(SERIALIZED_NAME_LINE_ITEMS)
  private LineItem lineItems;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORDER_QUANTITY = "order_quantity";
  @SerializedName(SERIALIZED_NAME_ORDER_QUANTITY)
  private Integer orderQuantity;

  public static final String SERIALIZED_NAME_PAGE_NAME = "page_name";
  @SerializedName(SERIALIZED_NAME_PAGE_NAME)
  private String pageName;

  public static final String SERIALIZED_NAME_PROMO_CODE = "promo_code";
  @SerializedName(SERIALIZED_NAME_PROMO_CODE)
  private String promoCode;

  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  private String property;

  public static final String SERIALIZED_NAME_SEARCH_QUERY = "search_query";
  @SerializedName(SERIALIZED_NAME_SEARCH_QUERY)
  private String searchQuery;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VIDEO_TITLE = "video_title";
  @SerializedName(SERIALIZED_NAME_VIDEO_TITLE)
  private String videoTitle;

  public PinterestTagEventData() {
  }

  public PinterestTagEventData currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @javax.annotation.Nullable
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }


  public PinterestTagEventData leadType(String leadType) {
    this.leadType = leadType;
    return this;
  }

  /**
   * Promotion code. For example, \&quot;Newsletter\&quot;.
   * @return leadType
   */
  @javax.annotation.Nullable
  public String getLeadType() {
    return leadType;
  }

  public void setLeadType(String leadType) {
    this.leadType = leadType;
  }


  public PinterestTagEventData lineItems(LineItem lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  /**
   * Get lineItems
   * @return lineItems
   */
  @javax.annotation.Nullable
  public LineItem getLineItems() {
    return lineItems;
  }

  public void setLineItems(LineItem lineItems) {
    this.lineItems = lineItems;
  }


  public PinterestTagEventData orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order ID. For example, \&quot;X-151481\&quot;.
   * @return orderId
   */
  @javax.annotation.Nullable
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public PinterestTagEventData orderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
    return this;
  }

  /**
   * Order quantity. For example, 1.
   * @return orderQuantity
   */
  @javax.annotation.Nullable
  public Integer getOrderQuantity() {
    return orderQuantity;
  }

  public void setOrderQuantity(Integer orderQuantity) {
    this.orderQuantity = orderQuantity;
  }


  public PinterestTagEventData pageName(String pageName) {
    this.pageName = pageName;
    return this;
  }

  /**
   * Page name. For example, \&quot;Our Favorite Pins on Pinterest\&quot;.
   * @return pageName
   */
  @javax.annotation.Nullable
  public String getPageName() {
    return pageName;
  }

  public void setPageName(String pageName) {
    this.pageName = pageName;
  }


  public PinterestTagEventData promoCode(String promoCode) {
    this.promoCode = promoCode;
    return this;
  }

  /**
   * Promotion code. For example, \&quot;WINTER10\&quot;.
   * @return promoCode
   */
  @javax.annotation.Nullable
  public String getPromoCode() {
    return promoCode;
  }

  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }


  public PinterestTagEventData property(String property) {
    this.property = property;
    return this;
  }

  /**
   * Property. For example, \&quot;Athleta\&quot;.
   * @return property
   */
  @javax.annotation.Nullable
  public String getProperty() {
    return property;
  }

  public void setProperty(String property) {
    this.property = property;
  }


  public PinterestTagEventData searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  /**
   * Search query string. For example, \&quot;boots\&quot;.
   * @return searchQuery
   */
  @javax.annotation.Nullable
  public String getSearchQuery() {
    return searchQuery;
  }

  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }


  public PinterestTagEventData value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Product value. For example, \&quot;199.98\&quot;
   * @return value
   */
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public PinterestTagEventData videoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
    return this;
  }

  /**
   * Video title. For example, \&quot;How to style your Parker Boots\&quot;.
   * @return videoTitle
   */
  @javax.annotation.Nullable
  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinterestTagEventData pinterestTagEventData = (PinterestTagEventData) o;
    return Objects.equals(this.currency, pinterestTagEventData.currency) &&
        Objects.equals(this.leadType, pinterestTagEventData.leadType) &&
        Objects.equals(this.lineItems, pinterestTagEventData.lineItems) &&
        Objects.equals(this.orderId, pinterestTagEventData.orderId) &&
        Objects.equals(this.orderQuantity, pinterestTagEventData.orderQuantity) &&
        Objects.equals(this.pageName, pinterestTagEventData.pageName) &&
        Objects.equals(this.promoCode, pinterestTagEventData.promoCode) &&
        Objects.equals(this.property, pinterestTagEventData.property) &&
        Objects.equals(this.searchQuery, pinterestTagEventData.searchQuery) &&
        Objects.equals(this.value, pinterestTagEventData.value) &&
        Objects.equals(this.videoTitle, pinterestTagEventData.videoTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, leadType, lineItems, orderId, orderQuantity, pageName, promoCode, property, searchQuery, value, videoTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinterestTagEventData {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    leadType: ").append(toIndentedString(leadType)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderQuantity: ").append(toIndentedString(orderQuantity)).append("\n");
    sb.append("    pageName: ").append(toIndentedString(pageName)).append("\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
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
    openapiFields.add("currency");
    openapiFields.add("lead_type");
    openapiFields.add("line_items");
    openapiFields.add("order_id");
    openapiFields.add("order_quantity");
    openapiFields.add("page_name");
    openapiFields.add("promo_code");
    openapiFields.add("property");
    openapiFields.add("search_query");
    openapiFields.add("value");
    openapiFields.add("video_title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PinterestTagEventData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PinterestTagEventData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PinterestTagEventData is not found in the empty JSON string", PinterestTagEventData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PinterestTagEventData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PinterestTagEventData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        Currency.validateJsonElement(jsonObj.get("currency"));
      }
      if ((jsonObj.get("lead_type") != null && !jsonObj.get("lead_type").isJsonNull()) && !jsonObj.get("lead_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lead_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lead_type").toString()));
      }
      // validate the optional field `line_items`
      if (jsonObj.get("line_items") != null && !jsonObj.get("line_items").isJsonNull()) {
        LineItem.validateJsonElement(jsonObj.get("line_items"));
      }
      if ((jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonNull()) && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if ((jsonObj.get("page_name") != null && !jsonObj.get("page_name").isJsonNull()) && !jsonObj.get("page_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_name").toString()));
      }
      if ((jsonObj.get("promo_code") != null && !jsonObj.get("promo_code").isJsonNull()) && !jsonObj.get("promo_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `promo_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("promo_code").toString()));
      }
      if ((jsonObj.get("property") != null && !jsonObj.get("property").isJsonNull()) && !jsonObj.get("property").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `property` to be a primitive type in the JSON string but got `%s`", jsonObj.get("property").toString()));
      }
      if ((jsonObj.get("search_query") != null && !jsonObj.get("search_query").isJsonNull()) && !jsonObj.get("search_query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_query").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("video_title") != null && !jsonObj.get("video_title").isJsonNull()) && !jsonObj.get("video_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PinterestTagEventData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PinterestTagEventData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PinterestTagEventData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PinterestTagEventData.class));

       return (TypeAdapter<T>) new TypeAdapter<PinterestTagEventData>() {
           @Override
           public void write(JsonWriter out, PinterestTagEventData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PinterestTagEventData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PinterestTagEventData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PinterestTagEventData
   * @throws IOException if the JSON string is invalid with respect to PinterestTagEventData
   */
  public static PinterestTagEventData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PinterestTagEventData.class);
  }

  /**
   * Convert an instance of PinterestTagEventData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

