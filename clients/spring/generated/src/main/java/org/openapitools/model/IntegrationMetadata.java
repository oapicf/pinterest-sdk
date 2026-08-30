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
 * Integration metadata
 */

@Schema(name = "IntegrationMetadata", description = "Integration metadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationMetadata {

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
  private @Nullable String connectedUserId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal createdTimestamp;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String externalBusinessId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal partnerAccessTokenExpiry;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String partnerMetadata;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal partnerRefreshTokenExpiry;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String scopes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal updatedTimestamp;

  public IntegrationMetadata additionalId1(@Nullable String additionalId1) {
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

  public IntegrationMetadata connectedAdvertiserId(@Nullable String connectedAdvertiserId) {
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

  public IntegrationMetadata connectedLbaId(@Nullable String connectedLbaId) {
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

  public IntegrationMetadata connectedMerchantId(@Nullable String connectedMerchantId) {
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

  public IntegrationMetadata connectedTagId(@Nullable String connectedTagId) {
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

  public IntegrationMetadata connectedUserId(@Nullable String connectedUserId) {
    this.connectedUserId = connectedUserId;
    return this;
  }

  /**
   * Get connectedUserId
   * @return connectedUserId
   */
  
  @Schema(name = "connected_user_id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connected_user_id")
  public @Nullable String getConnectedUserId() {
    return connectedUserId;
  }

  @JsonProperty("connected_user_id")
  public void setConnectedUserId(@Nullable String connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

  public IntegrationMetadata createdTimestamp(@Nullable BigDecimal createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  /**
   * Get createdTimestamp
   * @return createdTimestamp
   */
  @Valid 
  @Schema(name = "created_timestamp", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_timestamp")
  public @Nullable BigDecimal getCreatedTimestamp() {
    return createdTimestamp;
  }

  @JsonProperty("created_timestamp")
  public void setCreatedTimestamp(@Nullable BigDecimal createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  public IntegrationMetadata externalBusinessId(@Nullable String externalBusinessId) {
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

  public IntegrationMetadata id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public IntegrationMetadata partnerAccessTokenExpiry(@Nullable BigDecimal partnerAccessTokenExpiry) {
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

  public IntegrationMetadata partnerMetadata(@Nullable String partnerMetadata) {
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

  public IntegrationMetadata partnerRefreshTokenExpiry(@Nullable BigDecimal partnerRefreshTokenExpiry) {
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

  public IntegrationMetadata scopes(@Nullable String scopes) {
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

  public IntegrationMetadata updatedTimestamp(@Nullable BigDecimal updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

  /**
   * Get updatedTimestamp
   * @return updatedTimestamp
   */
  @Valid 
  @Schema(name = "updated_timestamp", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_timestamp")
  public @Nullable BigDecimal getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  @JsonProperty("updated_timestamp")
  public void setUpdatedTimestamp(@Nullable BigDecimal updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationMetadata integrationMetadata = (IntegrationMetadata) o;
    return Objects.equals(this.additionalId1, integrationMetadata.additionalId1) &&
        Objects.equals(this.connectedAdvertiserId, integrationMetadata.connectedAdvertiserId) &&
        Objects.equals(this.connectedLbaId, integrationMetadata.connectedLbaId) &&
        Objects.equals(this.connectedMerchantId, integrationMetadata.connectedMerchantId) &&
        Objects.equals(this.connectedTagId, integrationMetadata.connectedTagId) &&
        Objects.equals(this.connectedUserId, integrationMetadata.connectedUserId) &&
        Objects.equals(this.createdTimestamp, integrationMetadata.createdTimestamp) &&
        Objects.equals(this.externalBusinessId, integrationMetadata.externalBusinessId) &&
        Objects.equals(this.id, integrationMetadata.id) &&
        Objects.equals(this.partnerAccessTokenExpiry, integrationMetadata.partnerAccessTokenExpiry) &&
        Objects.equals(this.partnerMetadata, integrationMetadata.partnerMetadata) &&
        Objects.equals(this.partnerRefreshTokenExpiry, integrationMetadata.partnerRefreshTokenExpiry) &&
        Objects.equals(this.scopes, integrationMetadata.scopes) &&
        Objects.equals(this.updatedTimestamp, integrationMetadata.updatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalId1, connectedAdvertiserId, connectedLbaId, connectedMerchantId, connectedTagId, connectedUserId, createdTimestamp, externalBusinessId, id, partnerAccessTokenExpiry, partnerMetadata, partnerRefreshTokenExpiry, scopes, updatedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationMetadata {\n");
    sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
    sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
    sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
    sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
    sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
    sb.append("    connectedUserId: ").append(toIndentedString(connectedUserId)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    externalBusinessId: ").append(toIndentedString(externalBusinessId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
    sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
    sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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

