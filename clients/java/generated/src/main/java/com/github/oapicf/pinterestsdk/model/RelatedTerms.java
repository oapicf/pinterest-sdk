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
import com.github.oapicf.pinterestsdk.model.RelatedTermsRelatedTermsListInner;
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
 * RelatedTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RelatedTerms {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RELATED_TERM_COUNT = "related_term_count";
  @SerializedName(SERIALIZED_NAME_RELATED_TERM_COUNT)
  private Integer relatedTermCount;

  public static final String SERIALIZED_NAME_RELATED_TERMS_LIST = "related_terms_list";
  @SerializedName(SERIALIZED_NAME_RELATED_TERMS_LIST)
  private List<RelatedTermsRelatedTermsListInner> relatedTermsList = new ArrayList<>();

  public RelatedTerms() {
  }

  public RelatedTerms id(String id) {
    this.id = id;
    return this;
  }

  /**
   * First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RelatedTerms relatedTermCount(Integer relatedTermCount) {
    this.relatedTermCount = relatedTermCount;
    return this;
  }

  /**
   * Total number of related terms returned
   * @return relatedTermCount
   */
  @javax.annotation.Nullable
  public Integer getRelatedTermCount() {
    return relatedTermCount;
  }

  public void setRelatedTermCount(Integer relatedTermCount) {
    this.relatedTermCount = relatedTermCount;
  }


  public RelatedTerms relatedTermsList(List<RelatedTermsRelatedTermsListInner> relatedTermsList) {
    this.relatedTermsList = relatedTermsList;
    return this;
  }

  public RelatedTerms addRelatedTermsListItem(RelatedTermsRelatedTermsListInner relatedTermsListItem) {
    if (this.relatedTermsList == null) {
      this.relatedTermsList = new ArrayList<>();
    }
    this.relatedTermsList.add(relatedTermsListItem);
    return this;
  }

  /**
   * The id of the advertiser.
   * @return relatedTermsList
   */
  @javax.annotation.Nullable
  public List<RelatedTermsRelatedTermsListInner> getRelatedTermsList() {
    return relatedTermsList;
  }

  public void setRelatedTermsList(List<RelatedTermsRelatedTermsListInner> relatedTermsList) {
    this.relatedTermsList = relatedTermsList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedTerms relatedTerms = (RelatedTerms) o;
    return Objects.equals(this.id, relatedTerms.id) &&
        Objects.equals(this.relatedTermCount, relatedTerms.relatedTermCount) &&
        Objects.equals(this.relatedTermsList, relatedTerms.relatedTermsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relatedTermCount, relatedTermsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedTerms {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relatedTermCount: ").append(toIndentedString(relatedTermCount)).append("\n");
    sb.append("    relatedTermsList: ").append(toIndentedString(relatedTermsList)).append("\n");
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
    openapiFields.add("related_term_count");
    openapiFields.add("related_terms_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RelatedTerms
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RelatedTerms.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RelatedTerms is not found in the empty JSON string", RelatedTerms.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RelatedTerms.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RelatedTerms` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("related_terms_list") != null && !jsonObj.get("related_terms_list").isJsonNull()) {
        JsonArray jsonArrayrelatedTermsList = jsonObj.getAsJsonArray("related_terms_list");
        if (jsonArrayrelatedTermsList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("related_terms_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `related_terms_list` to be an array in the JSON string but got `%s`", jsonObj.get("related_terms_list").toString()));
          }

          // validate the optional field `related_terms_list` (array)
          for (int i = 0; i < jsonArrayrelatedTermsList.size(); i++) {
            RelatedTermsRelatedTermsListInner.validateJsonElement(jsonArrayrelatedTermsList.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RelatedTerms.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RelatedTerms' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RelatedTerms> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RelatedTerms.class));

       return (TypeAdapter<T>) new TypeAdapter<RelatedTerms>() {
           @Override
           public void write(JsonWriter out, RelatedTerms value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RelatedTerms read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RelatedTerms given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RelatedTerms
   * @throws IOException if the JSON string is invalid with respect to RelatedTerms
   */
  public static RelatedTerms fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RelatedTerms.class);
  }

  /**
   * Convert an instance of RelatedTerms to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

