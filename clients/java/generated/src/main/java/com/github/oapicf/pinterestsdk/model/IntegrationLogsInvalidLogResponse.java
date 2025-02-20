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
import com.github.oapicf.pinterestsdk.model.IntegrationLogsInvalidLogResponseRejectedLogsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Schema describing the response when a log has invalid fields.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IntegrationLogsInvalidLogResponse {
  public static final String SERIALIZED_NAME_REJECTED_LOGS = "rejected_logs";
  @SerializedName(SERIALIZED_NAME_REJECTED_LOGS)
  private List<IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs = new ArrayList<>();

  public IntegrationLogsInvalidLogResponse() {
  }

  public IntegrationLogsInvalidLogResponse rejectedLogs(List<IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
    return this;
  }

  public IntegrationLogsInvalidLogResponse addRejectedLogsItem(IntegrationLogsInvalidLogResponseRejectedLogsInner rejectedLogsItem) {
    if (this.rejectedLogs == null) {
      this.rejectedLogs = new ArrayList<>();
    }
    this.rejectedLogs.add(rejectedLogsItem);
    return this;
  }

  /**
   * Get rejectedLogs
   * @return rejectedLogs
   */
  @javax.annotation.Nullable
  public List<IntegrationLogsInvalidLogResponseRejectedLogsInner> getRejectedLogs() {
    return rejectedLogs;
  }

  public void setRejectedLogs(List<IntegrationLogsInvalidLogResponseRejectedLogsInner> rejectedLogs) {
    this.rejectedLogs = rejectedLogs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationLogsInvalidLogResponse integrationLogsInvalidLogResponse = (IntegrationLogsInvalidLogResponse) o;
    return Objects.equals(this.rejectedLogs, integrationLogsInvalidLogResponse.rejectedLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectedLogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogsInvalidLogResponse {\n");
    sb.append("    rejectedLogs: ").append(toIndentedString(rejectedLogs)).append("\n");
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
    openapiFields.add("rejected_logs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IntegrationLogsInvalidLogResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntegrationLogsInvalidLogResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntegrationLogsInvalidLogResponse is not found in the empty JSON string", IntegrationLogsInvalidLogResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntegrationLogsInvalidLogResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntegrationLogsInvalidLogResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("rejected_logs") != null && !jsonObj.get("rejected_logs").isJsonNull()) {
        JsonArray jsonArrayrejectedLogs = jsonObj.getAsJsonArray("rejected_logs");
        if (jsonArrayrejectedLogs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("rejected_logs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `rejected_logs` to be an array in the JSON string but got `%s`", jsonObj.get("rejected_logs").toString()));
          }

          // validate the optional field `rejected_logs` (array)
          for (int i = 0; i < jsonArrayrejectedLogs.size(); i++) {
            IntegrationLogsInvalidLogResponseRejectedLogsInner.validateJsonElement(jsonArrayrejectedLogs.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntegrationLogsInvalidLogResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntegrationLogsInvalidLogResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntegrationLogsInvalidLogResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntegrationLogsInvalidLogResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<IntegrationLogsInvalidLogResponse>() {
           @Override
           public void write(JsonWriter out, IntegrationLogsInvalidLogResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntegrationLogsInvalidLogResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IntegrationLogsInvalidLogResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IntegrationLogsInvalidLogResponse
   * @throws IOException if the JSON string is invalid with respect to IntegrationLogsInvalidLogResponse
   */
  public static IntegrationLogsInvalidLogResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntegrationLogsInvalidLogResponse.class);
  }

  /**
   * Convert an instance of IntegrationLogsInvalidLogResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

