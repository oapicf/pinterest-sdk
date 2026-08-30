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
 * Resource create operation model.
 */

@Schema(name = "IntegrationMetadataCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationMetadataCreate {

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
  private @Nullable String externalBusinessId;

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

  public IntegrationMetadataCreate additionalId1(@Nullable String additionalId1) {
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

  public IntegrationMetadataCreate connectedAdvertiserId(@Nullable String connectedAdvertiserId) {
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

  public IntegrationMetadataCreate connectedLbaId(@Nullable String connectedLbaId) {
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

  public IntegrationMetadataCreate connectedMerchantId(@Nullable String connectedMerchantId) {
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

  public IntegrationMetadataCreate connectedTagId(@Nullable String connectedTagId) {
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

  public IntegrationMetadataCreate externalBusinessId(@Nullable String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

  /**
   * External business ID for the integration.
   * @return externalBusinessId
   */
  
  @Schema(name = "external_business_id", description = "External business ID for the integration.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external_business_id")
  public @Nullable String getExternalBusinessId() {
    return externalBusinessId;
  }

  @JsonProperty("external_business_id")
  public void setExternalBusinessId(@Nullable String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  public IntegrationMetadataCreate partnerAccessToken(@Nullable String partnerAccessToken) {
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

  public IntegrationMetadataCreate partnerAccessTokenExpiry(@Nullable BigDecimal partnerAccessTokenExpiry) {
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

  public IntegrationMetadataCreate partnerMetadata(@Nullable String partnerMetadata) {
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

  public IntegrationMetadataCreate partnerPrimaryEmail(@Nullable String partnerPrimaryEmail) {
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

  public IntegrationMetadataCreate partnerRefreshToken(@Nullable String partnerRefreshToken) {
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

  public IntegrationMetadataCreate partnerRefreshTokenExpiry(@Nullable BigDecimal partnerRefreshTokenExpiry) {
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

  public IntegrationMetadataCreate scopes(@Nullable String scopes) {
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
    IntegrationMetadataCreate integrationMetadataCreate = (IntegrationMetadataCreate) o;
    return Objects.equals(this.additionalId1, integrationMetadataCreate.additionalId1) &&
        Objects.equals(this.connectedAdvertiserId, integrationMetadataCreate.connectedAdvertiserId) &&
        Objects.equals(this.connectedLbaId, integrationMetadataCreate.connectedLbaId) &&
        Objects.equals(this.connectedMerchantId, integrationMetadataCreate.connectedMerchantId) &&
        Objects.equals(this.connectedTagId, integrationMetadataCreate.connectedTagId) &&
        Objects.equals(this.externalBusinessId, integrationMetadataCreate.externalBusinessId) &&
        Objects.equals(this.partnerAccessToken, integrationMetadataCreate.partnerAccessToken) &&
        Objects.equals(this.partnerAccessTokenExpiry, integrationMetadataCreate.partnerAccessTokenExpiry) &&
        Objects.equals(this.partnerMetadata, integrationMetadataCreate.partnerMetadata) &&
        Objects.equals(this.partnerPrimaryEmail, integrationMetadataCreate.partnerPrimaryEmail) &&
        Objects.equals(this.partnerRefreshToken, integrationMetadataCreate.partnerRefreshToken) &&
        Objects.equals(this.partnerRefreshTokenExpiry, integrationMetadataCreate.partnerRefreshTokenExpiry) &&
        Objects.equals(this.scopes, integrationMetadataCreate.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalId1, connectedAdvertiserId, connectedLbaId, connectedMerchantId, connectedTagId, externalBusinessId, partnerAccessToken, partnerAccessTokenExpiry, partnerMetadata, partnerPrimaryEmail, partnerRefreshToken, partnerRefreshTokenExpiry, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationMetadataCreate {\n");
    sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
    sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
    sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
    sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
    sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
    sb.append("    externalBusinessId: ").append(toIndentedString(externalBusinessId)).append("\n");
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

