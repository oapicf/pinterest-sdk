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
import com.github.oapicf.pinterestsdk.model.CatalogsFeedsCreateRequestDefaultLocale;
import com.github.oapicf.pinterestsdk.model.CatalogsFormat;
import com.github.oapicf.pinterestsdk.model.CatalogsStatus;
import com.github.oapicf.pinterestsdk.model.Country;
import com.github.oapicf.pinterestsdk.model.NullableCurrency;
import com.github.oapicf.pinterestsdk.model.ProductAvailabilityType;
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
 * Request object for creating a feed. Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsFeedsCreateRequest {
  public static final String SERIALIZED_NAME_DEFAULT_CURRENCY = "default_currency";
  @SerializedName(SERIALIZED_NAME_DEFAULT_CURRENCY)
  private NullableCurrency defaultCurrency;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private CatalogsFormat format;

  public static final String SERIALIZED_NAME_DEFAULT_LOCALE = "default_locale";
  @SerializedName(SERIALIZED_NAME_DEFAULT_LOCALE)
  private CatalogsFeedsCreateRequestDefaultLocale defaultLocale;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private CatalogsFeedCredentials credentials;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_PREFERRED_PROCESSING_SCHEDULE = "preferred_processing_schedule";
  @SerializedName(SERIALIZED_NAME_PREFERRED_PROCESSING_SCHEDULE)
  private CatalogsFeedProcessingSchedule preferredProcessingSchedule;

  public static final String SERIALIZED_NAME_DEFAULT_COUNTRY = "default_country";
  @SerializedName(SERIALIZED_NAME_DEFAULT_COUNTRY)
  private Country defaultCountry;

  public static final String SERIALIZED_NAME_DEFAULT_AVAILABILITY = "default_availability";
  @SerializedName(SERIALIZED_NAME_DEFAULT_AVAILABILITY)
  private ProductAvailabilityType defaultAvailability;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private CatalogsStatus status;

  public CatalogsFeedsCreateRequest() {
  }

  public CatalogsFeedsCreateRequest defaultCurrency(NullableCurrency defaultCurrency) {
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


  public CatalogsFeedsCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name associated to a given feed.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CatalogsFeedsCreateRequest format(CatalogsFormat format) {
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


  public CatalogsFeedsCreateRequest defaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
    return this;
  }

  /**
   * Get defaultLocale
   * @return defaultLocale
   */
  @javax.annotation.Nullable
  public CatalogsFeedsCreateRequestDefaultLocale getDefaultLocale() {
    return defaultLocale;
  }

  public void setDefaultLocale(CatalogsFeedsCreateRequestDefaultLocale defaultLocale) {
    this.defaultLocale = defaultLocale;
  }


  public CatalogsFeedsCreateRequest credentials(CatalogsFeedCredentials credentials) {
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


  public CatalogsFeedsCreateRequest location(String location) {
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


  public CatalogsFeedsCreateRequest preferredProcessingSchedule(CatalogsFeedProcessingSchedule preferredProcessingSchedule) {
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


  public CatalogsFeedsCreateRequest defaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
    return this;
  }

  /**
   * Get defaultCountry
   * @return defaultCountry
   */
  @javax.annotation.Nullable
  public Country getDefaultCountry() {
    return defaultCountry;
  }

  public void setDefaultCountry(Country defaultCountry) {
    this.defaultCountry = defaultCountry;
  }


  public CatalogsFeedsCreateRequest defaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
    return this;
  }

  /**
   * Get defaultAvailability
   * @return defaultAvailability
   */
  @javax.annotation.Nullable
  public ProductAvailabilityType getDefaultAvailability() {
    return defaultAvailability;
  }

  public void setDefaultAvailability(ProductAvailabilityType defaultAvailability) {
    this.defaultAvailability = defaultAvailability;
  }


  public CatalogsFeedsCreateRequest status(CatalogsStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @javax.annotation.Nullable
  public CatalogsStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedsCreateRequest catalogsFeedsCreateRequest = (CatalogsFeedsCreateRequest) o;
    return Objects.equals(this.defaultCurrency, catalogsFeedsCreateRequest.defaultCurrency) &&
        Objects.equals(this.name, catalogsFeedsCreateRequest.name) &&
        Objects.equals(this.format, catalogsFeedsCreateRequest.format) &&
        Objects.equals(this.defaultLocale, catalogsFeedsCreateRequest.defaultLocale) &&
        Objects.equals(this.credentials, catalogsFeedsCreateRequest.credentials) &&
        Objects.equals(this.location, catalogsFeedsCreateRequest.location) &&
        Objects.equals(this.preferredProcessingSchedule, catalogsFeedsCreateRequest.preferredProcessingSchedule) &&
        Objects.equals(this.defaultCountry, catalogsFeedsCreateRequest.defaultCountry) &&
        Objects.equals(this.defaultAvailability, catalogsFeedsCreateRequest.defaultAvailability) &&
        Objects.equals(this.status, catalogsFeedsCreateRequest.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultCurrency, name, format, defaultLocale, credentials, location, preferredProcessingSchedule, defaultCountry, defaultAvailability, status);
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
    sb.append("class CatalogsFeedsCreateRequest {\n");
    sb.append("    defaultCurrency: ").append(toIndentedString(defaultCurrency)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    defaultLocale: ").append(toIndentedString(defaultLocale)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    preferredProcessingSchedule: ").append(toIndentedString(preferredProcessingSchedule)).append("\n");
    sb.append("    defaultCountry: ").append(toIndentedString(defaultCountry)).append("\n");
    sb.append("    defaultAvailability: ").append(toIndentedString(defaultAvailability)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("default_currency");
    openapiFields.add("name");
    openapiFields.add("format");
    openapiFields.add("default_locale");
    openapiFields.add("credentials");
    openapiFields.add("location");
    openapiFields.add("preferred_processing_schedule");
    openapiFields.add("default_country");
    openapiFields.add("default_availability");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("format");
    openapiRequiredFields.add("location");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CatalogsFeedsCreateRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CatalogsFeedsCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogsFeedsCreateRequest is not found in the empty JSON string", CatalogsFeedsCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CatalogsFeedsCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogsFeedsCreateRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CatalogsFeedsCreateRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `default_currency`
      if (jsonObj.get("default_currency") != null && !jsonObj.get("default_currency").isJsonNull()) {
        NullableCurrency.validateJsonElement(jsonObj.get("default_currency"));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `format`
      CatalogsFormat.validateJsonElement(jsonObj.get("format"));
      // validate the optional field `default_locale`
      if (jsonObj.get("default_locale") != null && !jsonObj.get("default_locale").isJsonNull()) {
        CatalogsFeedsCreateRequestDefaultLocale.validateJsonElement(jsonObj.get("default_locale"));
      }
      // validate the optional field `credentials`
      if (jsonObj.get("credentials") != null && !jsonObj.get("credentials").isJsonNull()) {
        CatalogsFeedCredentials.validateJsonElement(jsonObj.get("credentials"));
      }
      if (!jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      // validate the optional field `preferred_processing_schedule`
      if (jsonObj.get("preferred_processing_schedule") != null && !jsonObj.get("preferred_processing_schedule").isJsonNull()) {
        CatalogsFeedProcessingSchedule.validateJsonElement(jsonObj.get("preferred_processing_schedule"));
      }
      // validate the optional field `default_country`
      if (jsonObj.get("default_country") != null && !jsonObj.get("default_country").isJsonNull()) {
        Country.validateJsonElement(jsonObj.get("default_country"));
      }
      // validate the optional field `default_availability`
      if (jsonObj.get("default_availability") != null && !jsonObj.get("default_availability").isJsonNull()) {
        ProductAvailabilityType.validateJsonElement(jsonObj.get("default_availability"));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        CatalogsStatus.validateJsonElement(jsonObj.get("status"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogsFeedsCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogsFeedsCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogsFeedsCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogsFeedsCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogsFeedsCreateRequest>() {
           @Override
           public void write(JsonWriter out, CatalogsFeedsCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogsFeedsCreateRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CatalogsFeedsCreateRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CatalogsFeedsCreateRequest
   * @throws IOException if the JSON string is invalid with respect to CatalogsFeedsCreateRequest
   */
  public static CatalogsFeedsCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogsFeedsCreateRequest.class);
  }

  /**
   * Convert an instance of CatalogsFeedsCreateRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

