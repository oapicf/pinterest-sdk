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
import com.github.oapicf.pinterestsdk.model.DeleteAssetGroupResponseExceptionsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * DeleteAssetGroupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteAssetGroupResponse {
  public static final String SERIALIZED_NAME_DELETED_ASSET_GROUPS = "deleted_asset_groups";
  @SerializedName(SERIALIZED_NAME_DELETED_ASSET_GROUPS)
  private List<String> deletedAssetGroups = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXCEPTIONS = "exceptions";
  @SerializedName(SERIALIZED_NAME_EXCEPTIONS)
  private List<DeleteAssetGroupResponseExceptionsInner> exceptions;

  public DeleteAssetGroupResponse() {
  }

  public DeleteAssetGroupResponse deletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
    return this;
  }

  public DeleteAssetGroupResponse addDeletedAssetGroupsItem(String deletedAssetGroupsItem) {
    if (this.deletedAssetGroups == null) {
      this.deletedAssetGroups = new ArrayList<>();
    }
    this.deletedAssetGroups.add(deletedAssetGroupsItem);
    return this;
  }

  /**
   * A list of ids of successfully deleted asset groups.
   * @return deletedAssetGroups
   */
  @javax.annotation.Nullable
  public List<String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }

  public void setDeletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }


  public DeleteAssetGroupResponse exceptions(List<DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public DeleteAssetGroupResponse addExceptionsItem(DeleteAssetGroupResponseExceptionsInner exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
   */
  @javax.annotation.Nullable
  public List<DeleteAssetGroupResponseExceptionsInner> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAssetGroupResponse deleteAssetGroupResponse = (DeleteAssetGroupResponse) o;
    return Objects.equals(this.deletedAssetGroups, deleteAssetGroupResponse.deletedAssetGroups) &&
        Objects.equals(this.exceptions, deleteAssetGroupResponse.exceptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAssetGroups, exceptions);
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
    sb.append("class DeleteAssetGroupResponse {\n");
    sb.append("    deletedAssetGroups: ").append(toIndentedString(deletedAssetGroups)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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
    openapiFields.add("deleted_asset_groups");
    openapiFields.add("exceptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DeleteAssetGroupResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteAssetGroupResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteAssetGroupResponse is not found in the empty JSON string", DeleteAssetGroupResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteAssetGroupResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteAssetGroupResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("deleted_asset_groups") != null && !jsonObj.get("deleted_asset_groups").isJsonNull() && !jsonObj.get("deleted_asset_groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `deleted_asset_groups` to be an array in the JSON string but got `%s`", jsonObj.get("deleted_asset_groups").toString()));
      }
      if (jsonObj.get("exceptions") != null && !jsonObj.get("exceptions").isJsonNull()) {
        JsonArray jsonArrayexceptions = jsonObj.getAsJsonArray("exceptions");
        if (jsonArrayexceptions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("exceptions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `exceptions` to be an array in the JSON string but got `%s`", jsonObj.get("exceptions").toString()));
          }

          // validate the optional field `exceptions` (array)
          for (int i = 0; i < jsonArrayexceptions.size(); i++) {
            DeleteAssetGroupResponseExceptionsInner.validateJsonElement(jsonArrayexceptions.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteAssetGroupResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteAssetGroupResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteAssetGroupResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteAssetGroupResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteAssetGroupResponse>() {
           @Override
           public void write(JsonWriter out, DeleteAssetGroupResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteAssetGroupResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of DeleteAssetGroupResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DeleteAssetGroupResponse
   * @throws IOException if the JSON string is invalid with respect to DeleteAssetGroupResponse
   */
  public static DeleteAssetGroupResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteAssetGroupResponse.class);
  }

  /**
   * Convert an instance of DeleteAssetGroupResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

