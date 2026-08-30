package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create or update operation model.
 */

@Schema(name = "IntegrationMetadataUpdate", description = "Resource create or update operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationMetadataUpdate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String additionalId1;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String connectedAdvertiserId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String connectedLbaId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String connectedMerchantId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String connectedTagId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String partnerAccessToken;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal partnerAccessTokenExpiry;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String partnerMetadata;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String partnerPrimaryEmail;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String partnerRefreshToken;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal partnerRefreshTokenExpiry;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String scopes;

  public IntegrationMetadataUpdate additionalId1(@Nullable String additionalId1) {
    this.additionalId1 = additionalId1;
    return this;
  }

  /**
   * Get additionalId1
   * @return additionalId1
   */
  
  @Schema(name = "additional_id_1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional_id_1")
  public @Nullable String getAdditionalId1() {
    return additionalId1;
  }

  @JsonProperty("additional_id_1")
  public void setAdditionalId1(@Nullable String additionalId1) {
    this.additionalId1 = additionalId1;
  }

  public IntegrationMetadataUpdate connectedAdvertiserId(@Nullable String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
    return this;
  }

  /**
   * Get connectedAdvertiserId
   * @return connectedAdvertiserId
   */
  
  @Schema(name = "connected_advertiser_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_advertiser_id")
  public @Nullable String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }

  @JsonProperty("connected_advertiser_id")
  public void setConnectedAdvertiserId(@Nullable String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  public IntegrationMetadataUpdate connectedLbaId(@Nullable String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
    return this;
  }

  /**
   * Get connectedLbaId
   * @return connectedLbaId
   */
  
  @Schema(name = "connected_lba_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_lba_id")
  public @Nullable String getConnectedLbaId() {
    return connectedLbaId;
  }

  @JsonProperty("connected_lba_id")
  public void setConnectedLbaId(@Nullable String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

  public IntegrationMetadataUpdate connectedMerchantId(@Nullable String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
    return this;
  }

  /**
   * Get connectedMerchantId
   * @return connectedMerchantId
   */
  
  @Schema(name = "connected_merchant_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_merchant_id")
  public @Nullable String getConnectedMerchantId() {
    return connectedMerchantId;
  }

  @JsonProperty("connected_merchant_id")
  public void setConnectedMerchantId(@Nullable String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

  public IntegrationMetadataUpdate connectedTagId(@Nullable String connectedTagId) {
    this.connectedTagId = connectedTagId;
    return this;
  }

  /**
   * Get connectedTagId
   * @return connectedTagId
   */
  
  @Schema(name = "connected_tag_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_tag_id")
  public @Nullable String getConnectedTagId() {
    return connectedTagId;
  }

  @JsonProperty("connected_tag_id")
  public void setConnectedTagId(@Nullable String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

  public IntegrationMetadataUpdate partnerAccessToken(@Nullable String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

  /**
   * Get partnerAccessToken
   * @return partnerAccessToken
   */
  
  @Schema(name = "partner_access_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_access_token")
  public @Nullable String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  @JsonProperty("partner_access_token")
  public void setPartnerAccessToken(@Nullable String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  public IntegrationMetadataUpdate partnerAccessTokenExpiry(@Nullable BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    return this;
  }

  /**
   * Get partnerAccessTokenExpiry
   * @return partnerAccessTokenExpiry
   */
  @Valid 
  @Schema(name = "partner_access_token_expiry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_access_token_expiry")
  public @Nullable BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  @JsonProperty("partner_access_token_expiry")
  public void setPartnerAccessTokenExpiry(@Nullable BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  public IntegrationMetadataUpdate partnerMetadata(@Nullable String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

  /**
   * Get partnerMetadata
   * @return partnerMetadata
   */
  
  @Schema(name = "partner_metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_metadata")
  public @Nullable String getPartnerMetadata() {
    return partnerMetadata;
  }

  @JsonProperty("partner_metadata")
  public void setPartnerMetadata(@Nullable String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  public IntegrationMetadataUpdate partnerPrimaryEmail(@Nullable String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    return this;
  }

  /**
   * Get partnerPrimaryEmail
   * @return partnerPrimaryEmail
   */
  
  @Schema(name = "partner_primary_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_primary_email")
  public @Nullable String getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }

  @JsonProperty("partner_primary_email")
  public void setPartnerPrimaryEmail(@Nullable String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }

  public IntegrationMetadataUpdate partnerRefreshToken(@Nullable String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
    return this;
  }

  /**
   * Get partnerRefreshToken
   * @return partnerRefreshToken
   */
  
  @Schema(name = "partner_refresh_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_refresh_token")
  public @Nullable String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  @JsonProperty("partner_refresh_token")
  public void setPartnerRefreshToken(@Nullable String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

  public IntegrationMetadataUpdate partnerRefreshTokenExpiry(@Nullable BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    return this;
  }

  /**
   * Get partnerRefreshTokenExpiry
   * @return partnerRefreshTokenExpiry
   */
  @Valid 
  @Schema(name = "partner_refresh_token_expiry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_refresh_token_expiry")
  public @Nullable BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  @JsonProperty("partner_refresh_token_expiry")
  public void setPartnerRefreshTokenExpiry(@Nullable BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  public IntegrationMetadataUpdate scopes(@Nullable String scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Get scopes
   * @return scopes
   */
  
  @Schema(name = "scopes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scopes")
  public @Nullable String getScopes() {
    return scopes;
  }

  @JsonProperty("scopes")
  public void setScopes(@Nullable String scopes) {
    this.scopes = scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationMetadataUpdate integrationMetadataUpdate = (IntegrationMetadataUpdate) o;
    return Objects.equals(this.additionalId1, integrationMetadataUpdate.additionalId1) &&
        Objects.equals(this.connectedAdvertiserId, integrationMetadataUpdate.connectedAdvertiserId) &&
        Objects.equals(this.connectedLbaId, integrationMetadataUpdate.connectedLbaId) &&
        Objects.equals(this.connectedMerchantId, integrationMetadataUpdate.connectedMerchantId) &&
        Objects.equals(this.connectedTagId, integrationMetadataUpdate.connectedTagId) &&
        Objects.equals(this.partnerAccessToken, integrationMetadataUpdate.partnerAccessToken) &&
        Objects.equals(this.partnerAccessTokenExpiry, integrationMetadataUpdate.partnerAccessTokenExpiry) &&
        Objects.equals(this.partnerMetadata, integrationMetadataUpdate.partnerMetadata) &&
        Objects.equals(this.partnerPrimaryEmail, integrationMetadataUpdate.partnerPrimaryEmail) &&
        Objects.equals(this.partnerRefreshToken, integrationMetadataUpdate.partnerRefreshToken) &&
        Objects.equals(this.partnerRefreshTokenExpiry, integrationMetadataUpdate.partnerRefreshTokenExpiry) &&
        Objects.equals(this.scopes, integrationMetadataUpdate.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalId1, connectedAdvertiserId, connectedLbaId, connectedMerchantId, connectedTagId, partnerAccessToken, partnerAccessTokenExpiry, partnerMetadata, partnerPrimaryEmail, partnerRefreshToken, partnerRefreshTokenExpiry, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationMetadataUpdate {\n");
    sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
    sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
    sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
    sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
    sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
    sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
    sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
    sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
    sb.append("    partnerPrimaryEmail: ").append(toIndentedString(partnerPrimaryEmail)).append("\n");
    sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
    sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

