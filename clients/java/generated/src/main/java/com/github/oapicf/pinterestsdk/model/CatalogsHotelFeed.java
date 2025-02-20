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
import com.github.oapicf.pinterestsdk.model.CatalogsFeedCredentials;
import com.github.oapicf.pinterestsdk.model.CatalogsFeedProcessingSchedule;
import com.github.oapicf.pinterestsdk.model.CatalogsFormat;
import com.github.oapicf.pinterestsdk.model.CatalogsStatus;
import com.github.oapicf.pinterestsdk.model.CatalogsType;
import com.github.oapicf.pinterestsdk.model.NullableCurrency;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Catalogs Hotel Feed object
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsHotelFeed {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private CatalogsFormat format;

  public static final String SERIALIZED_NAME_CATALOG_TYPE = "catalog_type";
  @SerializedName(SERIALIZED_NAME_CATALOG_TYPE)
  private CatalogsType catalogType;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private CatalogsFeedCredentials credentials;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_PREFERRED_PROCESSING_SCHEDULE = "preferred_processing_schedule";
  @SerializedName(SERIALIZED_NAME_PREFERRED_PROCESSING_SCHEDULE)
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CatalogsStatus status;

  public static final String SERIALIZED_NAME_DEFAULT_CURRENCY = "default_currency";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CURRENCY)
  private NullableCurrency defaultCurrency;

  public static final String SERIALIZED_NAME_DEFAULT_LOCALE = "default_locale";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LOCALE)
  private String defaultLocale;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalog_id";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private String catalogId;

  public CatalogsHotelFeed() {
  }

  public CatalogsHotelFeed createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CatalogsHotelFeed id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public CatalogsHotelFeed updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CatalogsHotelFeed name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CatalogsHotelFeed format(CatalogsFormat format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   * @return format
   */
  @javax.annotation.Nonnull
  public CatalogsFormat getFormat() {
    return format;
  }

  public void setFormat(CatalogsFormat format) {
    this.format = format;
  }


  public CatalogsHotelFeed catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @javax.annotation.Nonnull
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }


  public CatalogsHotelFeed credentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * Get credentials
   * @return credentials
   */
  @javax.annotation.Nullable
  public CatalogsFeedCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(CatalogsFeedCredentials credentials) {
    this.credentials = credentials;
  }


  public CatalogsHotelFeed location(String location) {
    this.location = location;
    return this;
  }

  /**
   * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
   * @return location
   */
  @javax.annotation.Nonnull
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }


  public CatalogsHotelFeed preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
    return this;
  }

  /**
   * Get preferredProcessingSchedule
   * @return preferredProcessingSchedule
   */
  @javax.annotation.Nullable
  public CatalogsFeedProcessingSchedule getPreferredProcessingSchedule() {
    return preferredProcessingSchedule;
  }

  public void setPreferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
    this.preferredProcessingSchedule = preferredProcessingSchedule;
  }


  public CatalogsHotelFeed status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nonnull
  public CatalogsStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }


  public CatalogsHotelFeed defaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
    return this;
  }

  /**
   * Get defaultCurrency
   * @return defaultCurrency
   */
  @javax.annotation.Nullable
  public NullableCurrency getDefaultCurrency() {
    return defaultCurrency;
  }

  public void setDefaultCurrency(NullableCurrency defaultCurrency) {
    this.defaultCurrency = defaultCurrency;
  }


  public CatalogsHotelFeed defaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  /**
   * The locale used within a feed for product descriptions.
   * @return defaultLocale
   */
  @javax.annotation.Nonnull
  public String getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(String defaultLocale) {
    this.defaultLocale = defaultLocale;
  }


  public CatalogsHotelFeed catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  /**
   * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
   * @return catalogId
   */
  @javax.annotation.Nullable
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelFeed catalogsHotelFeed = (CatalogsHotelFeed) o;
    return Objects.equals(this.createdAt, catalogsHotelFeed.createdAt) &&
        Objects.equals(this.id, catalogsHotelFeed.id) &&
        Objects.equals(this.updatedAt, catalogsHotelFeed.updatedAt) &&
        Objects.equals(this.name, catalogsHotelFeed.name) &&
        Objects.equals(this.format, catalogsHotelFeed.format) &&
        Objects.equals(this.catalogType, catalogsHotelFeed.catalogType) &&
        Objects.equals(this.credentials, catalogsHotelFeed.credentials) &&
        Objects.equals(this.location, catalogsHotelFeed.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsHotelFeed.preferredProcessingSchedule) &&
        Objects.equals(this.status, catalogsHotelFeed.status) &&
        Objects.equals(this.defaultCurrency, catalogsHotelFeed.defaultCurrency) &&
        Objects.equals(this.defaultLocale, catalogsHotelFeed.defaultLocale) &&
        Objects.equals(this.catalogId, catalogsHotelFeed.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, updatedAt, name, format, catalogType, credentials, location, preferredProcessingSchedule, status, defaultCurrency, defaultLocale, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelFeed {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("updated_at");
    openapiFields.add("name");
    openapiFields.add("format");
    openapiFields.add("catalog_type");
    openapiFields.add("credentials");
    openapiFields.add("location");
    openapiFields.add("preferred_processing_schedule");
    openapiFields.add("status");
    openapiFields.add("default_currency");
    openapiFields.add("default_locale");
    openapiFields.add("catalog_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("format");
    openapiRequiredFields.add("catalog_type");
    openapiRequiredFields.add("credentials");
    openapiRequiredFields.add("location");
    openapiRequiredFields.add("preferred_processing_schedule");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("default_currency");
    openapiRequiredFields.add("default_locale");
    openapiRequiredFields.add("catalog_id");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CatalogsHotelFeed
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CatalogsHotelFeed.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogsHotelFeed is not found in the empty JSON string", CatalogsHotelFeed.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CatalogsHotelFeed.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogsHotelFeed` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CatalogsHotelFeed.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `format`
      CatalogsFormat.validateJsonElement(jsonObj.get("format"));
      // validate the required field `catalog_type`
      CatalogsType.validateJsonElement(jsonObj.get("catalog_type"));
      // validate the required field `credentials`
      CatalogsFeedCredentials.validateJsonElement(jsonObj.get("credentials"));
      if (!jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      // validate the required field `preferred_processing_schedule`
      CatalogsFeedProcessingSchedule.validateJsonElement(jsonObj.get("preferred_processing_schedule"));
      // validate the required field `status`
      CatalogsStatus.validateJsonElement(jsonObj.get("status"));
      // validate the required field `default_currency`
      NullableCurrency.validateJsonElement(jsonObj.get("default_currency"));
      if (!jsonObj.get("default_locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_locale").toString()));
      }
      if ((jsonObj.get("catalog_id") != null && !jsonObj.get("catalog_id").isJsonNull()) && !jsonObj.get("catalog_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `catalog_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("catalog_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogsHotelFeed.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogsHotelFeed' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogsHotelFeed> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogsHotelFeed.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogsHotelFeed>() {
           @Override
           public void write(JsonWriter out, CatalogsHotelFeed value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogsHotelFeed read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CatalogsHotelFeed given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CatalogsHotelFeed
   * @throws IOException if the JSON string is invalid with respect to CatalogsHotelFeed
   */
  public static CatalogsHotelFeed fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogsHotelFeed.class);
  }

  /**
   * Convert an instance of CatalogsHotelFeed to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

