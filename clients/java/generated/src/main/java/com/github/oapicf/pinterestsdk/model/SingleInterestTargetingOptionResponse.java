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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.pinterestsdk.JSON;

/**
 * SingleInterestTargetingOptionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-14T23:01:05.225954683Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SingleInterestTargetingOptionResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHILD_INTERESTS = "child_interests";
  @SerializedName(SERIALIZED_NAME_CHILD_INTERESTS)
  private List<String> childInterests;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public SingleInterestTargetingOptionResponse() {
  }

  public SingleInterestTargetingOptionResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public SingleInterestTargetingOptionResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SingleInterestTargetingOptionResponse childInterests(List<String> childInterests) {
    this.childInterests = childInterests;
    return this;
  }

  public SingleInterestTargetingOptionResponse addChildInterestsItem(String childInterestsItem) {
    if (this.childInterests == null) {
      this.childInterests = new ArrayList<>();
    }
    this.childInterests.add(childInterestsItem);
    return this;
  }

   /**
   * Get childInterests
   * @return childInterests
  **/
  @javax.annotation.Nullable
  public List<String> getChildInterests() {
    return childInterests;
  }

  public void setChildInterests(List<String> childInterests) {
    this.childInterests = childInterests;
  }


  public SingleInterestTargetingOptionResponse level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleInterestTargetingOptionResponse singleInterestTargetingOptionResponse = (SingleInterestTargetingOptionResponse) o;
    return Objects.equals(this.id, singleInterestTargetingOptionResponse.id) &&
        Objects.equals(this.name, singleInterestTargetingOptionResponse.name) &&
        Objects.equals(this.childInterests, singleInterestTargetingOptionResponse.childInterests) &&
        Objects.equals(this.level, singleInterestTargetingOptionResponse.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, childInterests, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleInterestTargetingOptionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    childInterests: ").append(toIndentedString(childInterests)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("child_interests");
    openapiFields.add("level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SingleInterestTargetingOptionResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SingleInterestTargetingOptionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SingleInterestTargetingOptionResponse is not found in the empty JSON string", SingleInterestTargetingOptionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SingleInterestTargetingOptionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SingleInterestTargetingOptionResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("child_interests") != null && !jsonObj.get("child_interests").isJsonNull() && !jsonObj.get("child_interests").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `child_interests` to be an array in the JSON string but got `%s`", jsonObj.get("child_interests").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SingleInterestTargetingOptionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SingleInterestTargetingOptionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SingleInterestTargetingOptionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SingleInterestTargetingOptionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SingleInterestTargetingOptionResponse>() {
           @Override
           public void write(JsonWriter out, SingleInterestTargetingOptionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SingleInterestTargetingOptionResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SingleInterestTargetingOptionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SingleInterestTargetingOptionResponse
  * @throws IOException if the JSON string is invalid with respect to SingleInterestTargetingOptionResponse
  */
  public static SingleInterestTargetingOptionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SingleInterestTargetingOptionResponse.class);
  }

 /**
  * Convert an instance of SingleInterestTargetingOptionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
