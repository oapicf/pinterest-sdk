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
import com.github.oapicf.pinterestsdk.model.DataStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * Array with metrics, status, and pin id for the requested metric
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TopPinsAnalyticsResponsePinsInner {
  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private Map<String, BigDecimal> metrics = new HashMap<>();

  public static final String SERIALIZED_NAME_DATA_STATUS = "data_status";
  @SerializedName(SERIALIZED_NAME_DATA_STATUS)
  private Map<String, DataStatus> dataStatus = new HashMap<>();

  public static final String SERIALIZED_NAME_PIN_ID = "pin_id";
  @SerializedName(SERIALIZED_NAME_PIN_ID)
  private String pinId;

  public TopPinsAnalyticsResponsePinsInner() {
  }

  public TopPinsAnalyticsResponsePinsInner metrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
    return this;
  }

  public TopPinsAnalyticsResponsePinsInner putMetricsItem(String key, BigDecimal metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

  /**
   * The metric name and daily value for each requested metric
   * @return metrics
   */
  @javax.annotation.Nullable
  public Map<String, BigDecimal> getMetrics() {
    return metrics;
  }

  public void setMetrics(Map<String, BigDecimal> metrics) {
    this.metrics = metrics;
  }


  public TopPinsAnalyticsResponsePinsInner dataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
    return this;
  }

  public TopPinsAnalyticsResponsePinsInner putDataStatusItem(String key, DataStatus dataStatusItem) {
    if (this.dataStatus == null) {
      this.dataStatus = new HashMap<>();
    }
    this.dataStatus.put(key, dataStatusItem);
    return this;
  }

  /**
   * Get dataStatus
   * @return dataStatus
   */
  @javax.annotation.Nullable
  public Map<String, DataStatus> getDataStatus() {
    return dataStatus;
  }

  public void setDataStatus(Map<String, DataStatus> dataStatus) {
    this.dataStatus = dataStatus;
  }


  public TopPinsAnalyticsResponsePinsInner pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * The pin id
   * @return pinId
   */
  @javax.annotation.Nullable
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopPinsAnalyticsResponsePinsInner topPinsAnalyticsResponsePinsInner = (TopPinsAnalyticsResponsePinsInner) o;
    return Objects.equals(this.metrics, topPinsAnalyticsResponsePinsInner.metrics) &&
        Objects.equals(this.dataStatus, topPinsAnalyticsResponsePinsInner.dataStatus) &&
        Objects.equals(this.pinId, topPinsAnalyticsResponsePinsInner.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metrics, dataStatus, pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopPinsAnalyticsResponsePinsInner {\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    dataStatus: ").append(toIndentedString(dataStatus)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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
    openapiFields.add("metrics");
    openapiFields.add("data_status");
    openapiFields.add("pin_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TopPinsAnalyticsResponsePinsInner
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TopPinsAnalyticsResponsePinsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TopPinsAnalyticsResponsePinsInner is not found in the empty JSON string", TopPinsAnalyticsResponsePinsInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!TopPinsAnalyticsResponsePinsInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TopPinsAnalyticsResponsePinsInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("pin_id") != null && !jsonObj.get("pin_id").isJsonNull()) && !jsonObj.get("pin_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pin_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pin_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TopPinsAnalyticsResponsePinsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TopPinsAnalyticsResponsePinsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TopPinsAnalyticsResponsePinsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TopPinsAnalyticsResponsePinsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TopPinsAnalyticsResponsePinsInner>() {
           @Override
           public void write(JsonWriter out, TopPinsAnalyticsResponsePinsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TopPinsAnalyticsResponsePinsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of TopPinsAnalyticsResponsePinsInner given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TopPinsAnalyticsResponsePinsInner
   * @throws IOException if the JSON string is invalid with respect to TopPinsAnalyticsResponsePinsInner
   */
  public static TopPinsAnalyticsResponsePinsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TopPinsAnalyticsResponsePinsInner.class);
  }

  /**
   * Convert an instance of TopPinsAnalyticsResponsePinsInner to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

