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
import com.github.oapicf.pinterestsdk.model.LeadFormQuestionFieldType;
import com.github.oapicf.pinterestsdk.model.LeadFormQuestionType;
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
 * LeadFormQuestion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadFormQuestion {
  public static final String SERIALIZED_NAME_QUESTION_TYPE = "question_type";
  @SerializedName(SERIALIZED_NAME_QUESTION_TYPE)
  private LeadFormQuestionType questionType;

  public static final String SERIALIZED_NAME_CUSTOM_QUESTION_FIELD_TYPE = "custom_question_field_type";
  @SerializedName(SERIALIZED_NAME_CUSTOM_QUESTION_FIELD_TYPE)
  private LeadFormQuestionFieldType customQuestionFieldType;

  public static final String SERIALIZED_NAME_CUSTOM_QUESTION_LABEL = "custom_question_label";
  @SerializedName(SERIALIZED_NAME_CUSTOM_QUESTION_LABEL)
  private String customQuestionLabel;

  public static final String SERIALIZED_NAME_CUSTOM_QUESTION_OPTIONS = "custom_question_options";
  @SerializedName(SERIALIZED_NAME_CUSTOM_QUESTION_OPTIONS)
  private List<String> customQuestionOptions;

  public LeadFormQuestion() {
  }

  public LeadFormQuestion questionType(LeadFormQuestionType questionType) {
    this.questionType = questionType;
    return this;
  }

  /**
   * Get questionType
   * @return questionType
   */
  @javax.annotation.Nullable
  public LeadFormQuestionType getQuestionType() {
    return questionType;
  }

  public void setQuestionType(LeadFormQuestionType questionType) {
    this.questionType = questionType;
  }


  public LeadFormQuestion customQuestionFieldType(LeadFormQuestionFieldType customQuestionFieldType) {
    this.customQuestionFieldType = customQuestionFieldType;
    return this;
  }

  /**
   * Get customQuestionFieldType
   * @return customQuestionFieldType
   */
  @javax.annotation.Nullable
  public LeadFormQuestionFieldType getCustomQuestionFieldType() {
    return customQuestionFieldType;
  }

  public void setCustomQuestionFieldType(LeadFormQuestionFieldType customQuestionFieldType) {
    this.customQuestionFieldType = customQuestionFieldType;
  }


  public LeadFormQuestion customQuestionLabel(String customQuestionLabel) {
    this.customQuestionLabel = customQuestionLabel;
    return this;
  }

  /**
   * Question label for a custom question.
   * @return customQuestionLabel
   */
  @javax.annotation.Nullable
  public String getCustomQuestionLabel() {
    return customQuestionLabel;
  }

  public void setCustomQuestionLabel(String customQuestionLabel) {
    this.customQuestionLabel = customQuestionLabel;
  }


  public LeadFormQuestion customQuestionOptions(List<String> customQuestionOptions) {
    this.customQuestionOptions = customQuestionOptions;
    return this;
  }

  public LeadFormQuestion addCustomQuestionOptionsItem(String customQuestionOptionsItem) {
    if (this.customQuestionOptions == null) {
      this.customQuestionOptions = new ArrayList<>();
    }
    this.customQuestionOptions.add(customQuestionOptionsItem);
    return this;
  }

  /**
   * Question options for a custom question.
   * @return customQuestionOptions
   */
  @javax.annotation.Nullable
  public List<String> getCustomQuestionOptions() {
    return customQuestionOptions;
  }

  public void setCustomQuestionOptions(List<String> customQuestionOptions) {
    this.customQuestionOptions = customQuestionOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormQuestion leadFormQuestion = (LeadFormQuestion) o;
    return Objects.equals(this.questionType, leadFormQuestion.questionType) &&
        Objects.equals(this.customQuestionFieldType, leadFormQuestion.customQuestionFieldType) &&
        Objects.equals(this.customQuestionLabel, leadFormQuestion.customQuestionLabel) &&
        Objects.equals(this.customQuestionOptions, leadFormQuestion.customQuestionOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionType, customQuestionFieldType, customQuestionLabel, customQuestionOptions);
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
    sb.append("class LeadFormQuestion {\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    customQuestionFieldType: ").append(toIndentedString(customQuestionFieldType)).append("\n");
    sb.append("    customQuestionLabel: ").append(toIndentedString(customQuestionLabel)).append("\n");
    sb.append("    customQuestionOptions: ").append(toIndentedString(customQuestionOptions)).append("\n");
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
    openapiFields.add("question_type");
    openapiFields.add("custom_question_field_type");
    openapiFields.add("custom_question_label");
    openapiFields.add("custom_question_options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LeadFormQuestion
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LeadFormQuestion.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LeadFormQuestion is not found in the empty JSON string", LeadFormQuestion.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!LeadFormQuestion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LeadFormQuestion` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `question_type`
      if (jsonObj.get("question_type") != null && !jsonObj.get("question_type").isJsonNull()) {
        LeadFormQuestionType.validateJsonElement(jsonObj.get("question_type"));
      }
      // validate the optional field `custom_question_field_type`
      if (jsonObj.get("custom_question_field_type") != null && !jsonObj.get("custom_question_field_type").isJsonNull()) {
        LeadFormQuestionFieldType.validateJsonElement(jsonObj.get("custom_question_field_type"));
      }
      if ((jsonObj.get("custom_question_label") != null && !jsonObj.get("custom_question_label").isJsonNull()) && !jsonObj.get("custom_question_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_question_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_question_label").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("custom_question_options") != null && !jsonObj.get("custom_question_options").isJsonNull() && !jsonObj.get("custom_question_options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_question_options` to be an array in the JSON string but got `%s`", jsonObj.get("custom_question_options").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LeadFormQuestion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LeadFormQuestion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LeadFormQuestion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LeadFormQuestion.class));

       return (TypeAdapter<T>) new TypeAdapter<LeadFormQuestion>() {
           @Override
           public void write(JsonWriter out, LeadFormQuestion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LeadFormQuestion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of LeadFormQuestion given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LeadFormQuestion
   * @throws IOException if the JSON string is invalid with respect to LeadFormQuestion
   */
  public static LeadFormQuestion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LeadFormQuestion.class);
  }

  /**
   * Convert an instance of LeadFormQuestion to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

