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
import com.github.oapicf.pinterestsdk.model.CatalogsProductGroupMultipleStringListCriteria;
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
 * GoogleProductCategory0Filter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GoogleProductCategory0Filter {
  public static final String SERIALIZED_NAME_G_O_O_G_L_E_P_R_O_D_U_C_T_C_A_T_E_G_O_R_Y0 = "GOOGLE_PRODUCT_CATEGORY_0";
  @SerializedName(SERIALIZED_NAME_G_O_O_G_L_E_P_R_O_D_U_C_T_C_A_T_E_G_O_R_Y0)
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0;

  public GoogleProductCategory0Filter() {
  }

  public GoogleProductCategory0Filter GOOGLE_PRODUCT_CATEGORY_0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_0
   * @return GOOGLE_PRODUCT_CATEGORY_0
   */
  @javax.annotation.Nonnull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY0() {
    return GOOGLE_PRODUCT_CATEGORY_0;
  }

  public void setGOOGLEPRODUCTCATEGORY0(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_0) {
    this.GOOGLE_PRODUCT_CATEGORY_0 = GOOGLE_PRODUCT_CATEGORY_0;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleProductCategory0Filter googleProductCategory0Filter = (GoogleProductCategory0Filter) o;
    return Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_0, googleProductCategory0Filter.GOOGLE_PRODUCT_CATEGORY_0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GOOGLE_PRODUCT_CATEGORY_0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory0Filter {\n");
    sb.append("    GOOGLE_PRODUCT_CATEGORY_0: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_0)).append("\n");
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
    openapiFields.add("GOOGLE_PRODUCT_CATEGORY_0");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("GOOGLE_PRODUCT_CATEGORY_0");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GoogleProductCategory0Filter
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GoogleProductCategory0Filter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoogleProductCategory0Filter is not found in the empty JSON string", GoogleProductCategory0Filter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!GoogleProductCategory0Filter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoogleProductCategory0Filter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GoogleProductCategory0Filter.openapiRequiredFields) {
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
       if (!GoogleProductCategory0Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoogleProductCategory0Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoogleProductCategory0Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoogleProductCategory0Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<GoogleProductCategory0Filter>() {
           @Override
           public void write(JsonWriter out, GoogleProductCategory0Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoogleProductCategory0Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of GoogleProductCategory0Filter given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of GoogleProductCategory0Filter
   * @throws IOException if the JSON string is invalid with respect to GoogleProductCategory0Filter
   */
  public static GoogleProductCategory0Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoogleProductCategory0Filter.class);
  }

  /**
   * Convert an instance of GoogleProductCategory0Filter to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

