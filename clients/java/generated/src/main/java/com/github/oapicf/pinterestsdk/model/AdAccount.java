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
import com.github.oapicf.pinterestsdk.model.AdAccountOwner;
import com.github.oapicf.pinterestsdk.model.BusinessAccessRole;
import com.github.oapicf.pinterestsdk.model.Country;
import com.github.oapicf.pinterestsdk.model.Currency;
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
 * AdAccount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdAccount {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private AdAccountOwner owner;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private Country country;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<BusinessAccessRole> permissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED_TIME = "created_time";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private Integer createdTime;

  public static final String SERIALIZED_NAME_UPDATED_TIME = "updated_time";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIME)
  private Integer updatedTime;

  public AdAccount() {
  }

  public AdAccount id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public AdAccount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AdAccount owner(AdAccountOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @javax.annotation.Nullable
  public AdAccountOwner getOwner() {
    return owner;
  }

  public void setOwner(AdAccountOwner owner) {
    this.owner = owner;
  }


  public AdAccount country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @javax.annotation.Nullable
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }


  public AdAccount currency(Currency currency) {
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


  public AdAccount permissions(List<BusinessAccessRole> permissions) {
    this.permissions = permissions;
    return this;
  }

  public AdAccount addPermissionsItem(BusinessAccessRole permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Get permissions
   * @return permissions
   */
  @javax.annotation.Nullable
  public List<BusinessAccessRole> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<BusinessAccessRole> permissions) {
    this.permissions = permissions;
  }


  public AdAccount createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Creation time. Unix timestamp in seconds.
   * @return createdTime
   */
  @javax.annotation.Nullable
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }


  public AdAccount updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
   */
  @javax.annotation.Nullable
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccount adAccount = (AdAccount) o;
    return Objects.equals(this.id, adAccount.id) &&
        Objects.equals(this.name, adAccount.name) &&
        Objects.equals(this.owner, adAccount.owner) &&
        Objects.equals(this.country, adAccount.country) &&
        Objects.equals(this.currency, adAccount.currency) &&
        Objects.equals(this.permissions, adAccount.permissions) &&
        Objects.equals(this.createdTime, adAccount.createdTime) &&
        Objects.equals(this.updatedTime, adAccount.updatedTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, owner, country, currency, permissions, createdTime, updatedTime);
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
    sb.append("class AdAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
    openapiFields.add("owner");
    openapiFields.add("country");
    openapiFields.add("currency");
    openapiFields.add("permissions");
    openapiFields.add("created_time");
    openapiFields.add("updated_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AdAccount
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AdAccount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AdAccount is not found in the empty JSON string", AdAccount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AdAccount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AdAccount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `owner`
      if (jsonObj.get("owner") != null && !jsonObj.get("owner").isJsonNull()) {
        AdAccountOwner.validateJsonElement(jsonObj.get("owner"));
      }
      // validate the optional field `country`
      if (jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) {
        Country.validateJsonElement(jsonObj.get("country"));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        Currency.validateJsonElement(jsonObj.get("currency"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull() && !jsonObj.get("permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdAccount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdAccount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdAccount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdAccount.class));

       return (TypeAdapter<T>) new TypeAdapter<AdAccount>() {
           @Override
           public void write(JsonWriter out, AdAccount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdAccount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AdAccount given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AdAccount
   * @throws IOException if the JSON string is invalid with respect to AdAccount
   */
  public static AdAccount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdAccount.class);
  }

  /**
   * Convert an instance of AdAccount to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

