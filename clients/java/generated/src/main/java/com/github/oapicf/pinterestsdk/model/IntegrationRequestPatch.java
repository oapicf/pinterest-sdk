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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
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
 * Schema used for updating the integration metadata.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IntegrationRequestPatch {
  public static final String SERIALIZED_NAME_CONNECTED_MERCHANT_ID = "connected_merchant_id";
  @SerializedName(SERIALIZED_NAME_CONNECTED_MERCHANT_ID)
  private String connectedMerchantId;

  public static final String SERIALIZED_NAME_CONNECTED_ADVERTISER_ID = "connected_advertiser_id";
  @SerializedName(SERIALIZED_NAME_CONNECTED_ADVERTISER_ID)
  private String connectedAdvertiserId;

  public static final String SERIALIZED_NAME_CONNECTED_LBA_ID = "connected_lba_id";
  @SerializedName(SERIALIZED_NAME_CONNECTED_LBA_ID)
  private String connectedLbaId;

  public static final String SERIALIZED_NAME_CONNECTED_TAG_ID = "connected_tag_id";
  @SerializedName(SERIALIZED_NAME_CONNECTED_TAG_ID)
  private String connectedTagId;

  public static final String SERIALIZED_NAME_PARTNER_ACCESS_TOKEN = "partner_access_token";
  @SerializedName(SERIALIZED_NAME_PARTNER_ACCESS_TOKEN)
  private String partnerAccessToken;

  public static final String SERIALIZED_NAME_PARTNER_REFRESH_TOKEN = "partner_refresh_token";
  @SerializedName(SERIALIZED_NAME_PARTNER_REFRESH_TOKEN)
  private String partnerRefreshToken;

  public static final String SERIALIZED_NAME_PARTNER_PRIMARY_EMAIL = "partner_primary_email";
  @SerializedName(SERIALIZED_NAME_PARTNER_PRIMARY_EMAIL)
  private String partnerPrimaryEmail;

  public static final String SERIALIZED_NAME_PARTNER_ACCESS_TOKEN_EXPIRY = "partner_access_token_expiry";
  @SerializedName(SERIALIZED_NAME_PARTNER_ACCESS_TOKEN_EXPIRY)
  private BigDecimal partnerAccessTokenExpiry;

  public static final String SERIALIZED_NAME_PARTNER_REFRESH_TOKEN_EXPIRY = "partner_refresh_token_expiry";
  @SerializedName(SERIALIZED_NAME_PARTNER_REFRESH_TOKEN_EXPIRY)
  private BigDecimal partnerRefreshTokenExpiry;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private String scopes;

  public static final String SERIALIZED_NAME_ADDITIONAL_ID1 = "additional_id_1";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ID1)
  private String additionalId1;

  public static final String SERIALIZED_NAME_PARTNER_METADATA = "partner_metadata";
  @SerializedName(SERIALIZED_NAME_PARTNER_METADATA)
  private String partnerMetadata;

  public IntegrationRequestPatch() {
  }

  public IntegrationRequestPatch connectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
    return this;
  }

  /**
   * Get connectedMerchantId
   * @return connectedMerchantId
   */
  @javax.annotation.Nullable
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }

  public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }


  public IntegrationRequestPatch connectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
    return this;
  }

  /**
   * Get connectedAdvertiserId
   * @return connectedAdvertiserId
   */
  @javax.annotation.Nullable
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }

  public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }


  public IntegrationRequestPatch connectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
    return this;
  }

  /**
   * Get connectedLbaId
   * @return connectedLbaId
   */
  @javax.annotation.Nullable
  public String getConnectedLbaId() {
    return connectedLbaId;
  }

  public void setConnectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }


  public IntegrationRequestPatch connectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
    return this;
  }

  /**
   * Get connectedTagId
   * @return connectedTagId
   */
  @javax.annotation.Nullable
  public String getConnectedTagId() {
    return connectedTagId;
  }

  public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }


  public IntegrationRequestPatch partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

  /**
   * Get partnerAccessToken
   * @return partnerAccessToken
   */
  @javax.annotation.Nullable
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }


  public IntegrationRequestPatch partnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
    return this;
  }

  /**
   * Get partnerRefreshToken
   * @return partnerRefreshToken
   */
  @javax.annotation.Nullable
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }


  public IntegrationRequestPatch partnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    return this;
  }

  /**
   * Get partnerPrimaryEmail
   * @return partnerPrimaryEmail
   */
  @javax.annotation.Nullable
  public String getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }

  public void setPartnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }


  public IntegrationRequestPatch partnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    return this;
  }

  /**
   * Get partnerAccessTokenExpiry
   * @return partnerAccessTokenExpiry
   */
  @javax.annotation.Nullable
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }


  public IntegrationRequestPatch partnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    return this;
  }

  /**
   * Get partnerRefreshTokenExpiry
   * @return partnerRefreshTokenExpiry
   */
  @javax.annotation.Nullable
  public BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }


  public IntegrationRequestPatch scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Get scopes
   * @return scopes
   */
  @javax.annotation.Nullable
  public String getScopes() {
    return scopes;
  }

  public void setScopes(String scopes) {
    this.scopes = scopes;
  }


  public IntegrationRequestPatch additionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
    return this;
  }

  /**
   * Get additionalId1
   * @return additionalId1
   */
  @javax.annotation.Nullable
  public String getAdditionalId1() {
    return additionalId1;
  }

  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }


  public IntegrationRequestPatch partnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

  /**
   * Get partnerMetadata
   * @return partnerMetadata
   */
  @javax.annotation.Nullable
  public String getPartnerMetadata() {
    return partnerMetadata;
  }

  public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationRequestPatch integrationRequestPatch = (IntegrationRequestPatch) o;
    return Objects.equals(this.connectedMerchantId, integrationRequestPatch.connectedMerchantId) &&
        Objects.equals(this.connectedAdvertiserId, integrationRequestPatch.connectedAdvertiserId) &&
        Objects.equals(this.connectedLbaId, integrationRequestPatch.connectedLbaId) &&
        Objects.equals(this.connectedTagId, integrationRequestPatch.connectedTagId) &&
        Objects.equals(this.partnerAccessToken, integrationRequestPatch.partnerAccessToken) &&
        Objects.equals(this.partnerRefreshToken, integrationRequestPatch.partnerRefreshToken) &&
        Objects.equals(this.partnerPrimaryEmail, integrationRequestPatch.partnerPrimaryEmail) &&
        Objects.equals(this.partnerAccessTokenExpiry, integrationRequestPatch.partnerAccessTokenExpiry) &&
        Objects.equals(this.partnerRefreshTokenExpiry, integrationRequestPatch.partnerRefreshTokenExpiry) &&
        Objects.equals(this.scopes, integrationRequestPatch.scopes) &&
        Objects.equals(this.additionalId1, integrationRequestPatch.additionalId1) &&
        Objects.equals(this.partnerMetadata, integrationRequestPatch.partnerMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectedMerchantId, connectedAdvertiserId, connectedLbaId, connectedTagId, partnerAccessToken, partnerRefreshToken, partnerPrimaryEmail, partnerAccessTokenExpiry, partnerRefreshTokenExpiry, scopes, additionalId1, partnerMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationRequestPatch {\n");
    sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
    sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
    sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
    sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
    sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
    sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
    sb.append("    partnerPrimaryEmail: ").append(toIndentedString(partnerPrimaryEmail)).append("\n");
    sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
    sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
    sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
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
    openapiFields.add("connected_merchant_id");
    openapiFields.add("connected_advertiser_id");
    openapiFields.add("connected_lba_id");
    openapiFields.add("connected_tag_id");
    openapiFields.add("partner_access_token");
    openapiFields.add("partner_refresh_token");
    openapiFields.add("partner_primary_email");
    openapiFields.add("partner_access_token_expiry");
    openapiFields.add("partner_refresh_token_expiry");
    openapiFields.add("scopes");
    openapiFields.add("additional_id_1");
    openapiFields.add("partner_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IntegrationRequestPatch
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IntegrationRequestPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntegrationRequestPatch is not found in the empty JSON string", IntegrationRequestPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IntegrationRequestPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntegrationRequestPatch` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("connected_merchant_id") != null && !jsonObj.get("connected_merchant_id").isJsonNull()) && !jsonObj.get("connected_merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connected_merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connected_merchant_id").toString()));
      }
      if ((jsonObj.get("connected_advertiser_id") != null && !jsonObj.get("connected_advertiser_id").isJsonNull()) && !jsonObj.get("connected_advertiser_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connected_advertiser_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connected_advertiser_id").toString()));
      }
      if ((jsonObj.get("connected_lba_id") != null && !jsonObj.get("connected_lba_id").isJsonNull()) && !jsonObj.get("connected_lba_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connected_lba_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connected_lba_id").toString()));
      }
      if ((jsonObj.get("connected_tag_id") != null && !jsonObj.get("connected_tag_id").isJsonNull()) && !jsonObj.get("connected_tag_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connected_tag_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connected_tag_id").toString()));
      }
      if ((jsonObj.get("partner_access_token") != null && !jsonObj.get("partner_access_token").isJsonNull()) && !jsonObj.get("partner_access_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_access_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_access_token").toString()));
      }
      if ((jsonObj.get("partner_refresh_token") != null && !jsonObj.get("partner_refresh_token").isJsonNull()) && !jsonObj.get("partner_refresh_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_refresh_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_refresh_token").toString()));
      }
      if ((jsonObj.get("partner_primary_email") != null && !jsonObj.get("partner_primary_email").isJsonNull()) && !jsonObj.get("partner_primary_email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_primary_email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_primary_email").toString()));
      }
      if ((jsonObj.get("scopes") != null && !jsonObj.get("scopes").isJsonNull()) && !jsonObj.get("scopes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scopes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scopes").toString()));
      }
      if ((jsonObj.get("additional_id_1") != null && !jsonObj.get("additional_id_1").isJsonNull()) && !jsonObj.get("additional_id_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_id_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("additional_id_1").toString()));
      }
      if ((jsonObj.get("partner_metadata") != null && !jsonObj.get("partner_metadata").isJsonNull()) && !jsonObj.get("partner_metadata").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partner_metadata` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partner_metadata").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntegrationRequestPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntegrationRequestPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntegrationRequestPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntegrationRequestPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<IntegrationRequestPatch>() {
           @Override
           public void write(JsonWriter out, IntegrationRequestPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntegrationRequestPatch read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IntegrationRequestPatch given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IntegrationRequestPatch
   * @throws IOException if the JSON string is invalid with respect to IntegrationRequestPatch
   */
  public static IntegrationRequestPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntegrationRequestPatch.class);
  }

  /**
   * Convert an instance of IntegrationRequestPatch to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

