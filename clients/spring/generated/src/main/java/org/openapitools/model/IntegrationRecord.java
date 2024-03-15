package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Integration record
 */

@Schema(name = "IntegrationRecord", description = "Integration record")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationRecord {

  private String id;

  private JsonNullable<String> externalBusinessId = JsonNullable.<String>undefined();

  private JsonNullable<String> connectedMerchantId = JsonNullable.<String>undefined();

  private String connectedUserId;

  private JsonNullable<String> connectedAdvertiserId = JsonNullable.<String>undefined();

  private JsonNullable<String> connectedLbaId = JsonNullable.<String>undefined();

  private JsonNullable<String> connectedTagId = JsonNullable.<String>undefined();

  private JsonNullable<String> partnerAccessToken = JsonNullable.<String>undefined();

  private JsonNullable<String> partnerRefreshToken = JsonNullable.<String>undefined();

  private JsonNullable<String> partnerPrimaryEmail = JsonNullable.<String>undefined();

  private JsonNullable<Integer> partnerAccessTokenExpiry = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> partnerRefreshTokenExpiry = JsonNullable.<Integer>undefined();

  private JsonNullable<String> scopes = JsonNullable.<String>undefined();

  private JsonNullable<String> partnerMetadata = JsonNullable.<String>undefined();

  private JsonNullable<String> additionalId1 = JsonNullable.<String>undefined();

  private Integer createdTime;

  private Integer updatedTime;

  public IntegrationRecord id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IntegrationRecord externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = JsonNullable.of(externalBusinessId);
    return this;
  }

  /**
   * Get externalBusinessId
   * @return externalBusinessId
  */
  
  @Schema(name = "external_business_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_business_id")
  public JsonNullable<String> getExternalBusinessId() {
    return externalBusinessId;
  }

  public void setExternalBusinessId(JsonNullable<String> externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  public IntegrationRecord connectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = JsonNullable.of(connectedMerchantId);
    return this;
  }

  /**
   * Get connectedMerchantId
   * @return connectedMerchantId
  */
  
  @Schema(name = "connected_merchant_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_merchant_id")
  public JsonNullable<String> getConnectedMerchantId() {
    return connectedMerchantId;
  }

  public void setConnectedMerchantId(JsonNullable<String> connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

  public IntegrationRecord connectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
    return this;
  }

  /**
   * Get connectedUserId
   * @return connectedUserId
  */
  
  @Schema(name = "connected_user_id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_user_id")
  public String getConnectedUserId() {
    return connectedUserId;
  }

  public void setConnectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

  public IntegrationRecord connectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = JsonNullable.of(connectedAdvertiserId);
    return this;
  }

  /**
   * Get connectedAdvertiserId
   * @return connectedAdvertiserId
  */
  
  @Schema(name = "connected_advertiser_id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_advertiser_id")
  public JsonNullable<String> getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }

  public void setConnectedAdvertiserId(JsonNullable<String> connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  public IntegrationRecord connectedLbaId(String connectedLbaId) {
    this.connectedLbaId = JsonNullable.of(connectedLbaId);
    return this;
  }

  /**
   * Get connectedLbaId
   * @return connectedLbaId
  */
  
  @Schema(name = "connected_lba_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_lba_id")
  public JsonNullable<String> getConnectedLbaId() {
    return connectedLbaId;
  }

  public void setConnectedLbaId(JsonNullable<String> connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

  public IntegrationRecord connectedTagId(String connectedTagId) {
    this.connectedTagId = JsonNullable.of(connectedTagId);
    return this;
  }

  /**
   * Get connectedTagId
   * @return connectedTagId
  */
  
  @Schema(name = "connected_tag_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_tag_id")
  public JsonNullable<String> getConnectedTagId() {
    return connectedTagId;
  }

  public void setConnectedTagId(JsonNullable<String> connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

  public IntegrationRecord partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = JsonNullable.of(partnerAccessToken);
    return this;
  }

  /**
   * Get partnerAccessToken
   * @return partnerAccessToken
  */
  
  @Schema(name = "partner_access_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_access_token")
  public JsonNullable<String> getPartnerAccessToken() {
    return partnerAccessToken;
  }

  public void setPartnerAccessToken(JsonNullable<String> partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  public IntegrationRecord partnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = JsonNullable.of(partnerRefreshToken);
    return this;
  }

  /**
   * Get partnerRefreshToken
   * @return partnerRefreshToken
  */
  
  @Schema(name = "partner_refresh_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_refresh_token")
  public JsonNullable<String> getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  public void setPartnerRefreshToken(JsonNullable<String> partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

  public IntegrationRecord partnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = JsonNullable.of(partnerPrimaryEmail);
    return this;
  }

  /**
   * Get partnerPrimaryEmail
   * @return partnerPrimaryEmail
  */
  
  @Schema(name = "partner_primary_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_primary_email")
  public JsonNullable<String> getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }

  public void setPartnerPrimaryEmail(JsonNullable<String> partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }

  public IntegrationRecord partnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = JsonNullable.of(partnerAccessTokenExpiry);
    return this;
  }

  /**
   * Get partnerAccessTokenExpiry
   * @return partnerAccessTokenExpiry
  */
  
  @Schema(name = "partner_access_token_expiry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_access_token_expiry")
  public JsonNullable<Integer> getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  public void setPartnerAccessTokenExpiry(JsonNullable<Integer> partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  public IntegrationRecord partnerRefreshTokenExpiry(Integer partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = JsonNullable.of(partnerRefreshTokenExpiry);
    return this;
  }

  /**
   * Get partnerRefreshTokenExpiry
   * @return partnerRefreshTokenExpiry
  */
  
  @Schema(name = "partner_refresh_token_expiry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_refresh_token_expiry")
  public JsonNullable<Integer> getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  public void setPartnerRefreshTokenExpiry(JsonNullable<Integer> partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  public IntegrationRecord scopes(String scopes) {
    this.scopes = JsonNullable.of(scopes);
    return this;
  }

  /**
   * Get scopes
   * @return scopes
  */
  
  @Schema(name = "scopes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scopes")
  public JsonNullable<String> getScopes() {
    return scopes;
  }

  public void setScopes(JsonNullable<String> scopes) {
    this.scopes = scopes;
  }

  public IntegrationRecord partnerMetadata(String partnerMetadata) {
    this.partnerMetadata = JsonNullable.of(partnerMetadata);
    return this;
  }

  /**
   * Get partnerMetadata
   * @return partnerMetadata
  */
  
  @Schema(name = "partner_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_metadata")
  public JsonNullable<String> getPartnerMetadata() {
    return partnerMetadata;
  }

  public void setPartnerMetadata(JsonNullable<String> partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  public IntegrationRecord additionalId1(String additionalId1) {
    this.additionalId1 = JsonNullable.of(additionalId1);
    return this;
  }

  /**
   * Get additionalId1
   * @return additionalId1
  */
  
  @Schema(name = "additional_id_1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional_id_1")
  public JsonNullable<String> getAdditionalId1() {
    return additionalId1;
  }

  public void setAdditionalId1(JsonNullable<String> additionalId1) {
    this.additionalId1 = additionalId1;
  }

  public IntegrationRecord createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
  */
  
  @Schema(name = "created_time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public IntegrationRecord updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Get updatedTime
   * @return updatedTime
  */
  
  @Schema(name = "updated_time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
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
    IntegrationRecord integrationRecord = (IntegrationRecord) o;
    return Objects.equals(this.id, integrationRecord.id) &&
        equalsNullable(this.externalBusinessId, integrationRecord.externalBusinessId) &&
        equalsNullable(this.connectedMerchantId, integrationRecord.connectedMerchantId) &&
        Objects.equals(this.connectedUserId, integrationRecord.connectedUserId) &&
        equalsNullable(this.connectedAdvertiserId, integrationRecord.connectedAdvertiserId) &&
        equalsNullable(this.connectedLbaId, integrationRecord.connectedLbaId) &&
        equalsNullable(this.connectedTagId, integrationRecord.connectedTagId) &&
        equalsNullable(this.partnerAccessToken, integrationRecord.partnerAccessToken) &&
        equalsNullable(this.partnerRefreshToken, integrationRecord.partnerRefreshToken) &&
        equalsNullable(this.partnerPrimaryEmail, integrationRecord.partnerPrimaryEmail) &&
        equalsNullable(this.partnerAccessTokenExpiry, integrationRecord.partnerAccessTokenExpiry) &&
        equalsNullable(this.partnerRefreshTokenExpiry, integrationRecord.partnerRefreshTokenExpiry) &&
        equalsNullable(this.scopes, integrationRecord.scopes) &&
        equalsNullable(this.partnerMetadata, integrationRecord.partnerMetadata) &&
        equalsNullable(this.additionalId1, integrationRecord.additionalId1) &&
        Objects.equals(this.createdTime, integrationRecord.createdTime) &&
        Objects.equals(this.updatedTime, integrationRecord.updatedTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(externalBusinessId), hashCodeNullable(connectedMerchantId), connectedUserId, hashCodeNullable(connectedAdvertiserId), hashCodeNullable(connectedLbaId), hashCodeNullable(connectedTagId), hashCodeNullable(partnerAccessToken), hashCodeNullable(partnerRefreshToken), hashCodeNullable(partnerPrimaryEmail), hashCodeNullable(partnerAccessTokenExpiry), hashCodeNullable(partnerRefreshTokenExpiry), hashCodeNullable(scopes), hashCodeNullable(partnerMetadata), hashCodeNullable(additionalId1), createdTime, updatedTime);
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
    sb.append("class IntegrationRecord {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalBusinessId: ").append(toIndentedString(externalBusinessId)).append("\n");
    sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
    sb.append("    connectedUserId: ").append(toIndentedString(connectedUserId)).append("\n");
    sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
    sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
    sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
    sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
    sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
    sb.append("    partnerPrimaryEmail: ").append(toIndentedString(partnerPrimaryEmail)).append("\n");
    sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
    sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
    sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
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
}

