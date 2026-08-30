package org.openapitools.model;

import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class IntegrationMetadataCreate  {
  
  @ApiModelProperty(value = "")

  private String additionalId1;

  @ApiModelProperty(value = "")

  private String connectedAdvertiserId;

  @ApiModelProperty(value = "")

  private String connectedLbaId;

  @ApiModelProperty(value = "")

  private String connectedMerchantId;

  @ApiModelProperty(value = "")

  private String connectedTagId;

 /**
  * External business ID for the integration.
  */
  @ApiModelProperty(value = "External business ID for the integration.")

  private String externalBusinessId;

  @ApiModelProperty(value = "")

  private String partnerAccessToken;

  @ApiModelProperty(value = "")

  @Valid

  private BigDecimal partnerAccessTokenExpiry;

  @ApiModelProperty(value = "")

  private String partnerMetadata;

  @ApiModelProperty(value = "")

  private String partnerPrimaryEmail;

  @ApiModelProperty(value = "")

  private String partnerRefreshToken;

  @ApiModelProperty(value = "")

  @Valid

  private BigDecimal partnerRefreshTokenExpiry;

  @ApiModelProperty(value = "")

  private String scopes;
 /**
   * Get additionalId1
   * @return additionalId1
  **/
  @JsonProperty("additional_id_1")
  public String getAdditionalId1() {
    return additionalId1;
  }

  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

  public IntegrationMetadataCreate additionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
    return this;
  }

 /**
   * Get connectedAdvertiserId
   * @return connectedAdvertiserId
  **/
  @JsonProperty("connected_advertiser_id")
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }

  public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  public IntegrationMetadataCreate connectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
    return this;
  }

 /**
   * Get connectedLbaId
   * @return connectedLbaId
  **/
  @JsonProperty("connected_lba_id")
  public String getConnectedLbaId() {
    return connectedLbaId;
  }

  public void setConnectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

  public IntegrationMetadataCreate connectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
    return this;
  }

 /**
   * Get connectedMerchantId
   * @return connectedMerchantId
  **/
  @JsonProperty("connected_merchant_id")
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }

  public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

  public IntegrationMetadataCreate connectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
    return this;
  }

 /**
   * Get connectedTagId
   * @return connectedTagId
  **/
  @JsonProperty("connected_tag_id")
  public String getConnectedTagId() {
    return connectedTagId;
  }

  public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

  public IntegrationMetadataCreate connectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
    return this;
  }

 /**
   * External business ID for the integration.
   * @return externalBusinessId
  **/
  @JsonProperty("external_business_id")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  public IntegrationMetadataCreate externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

 /**
   * Get partnerAccessToken
   * @return partnerAccessToken
  **/
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  public IntegrationMetadataCreate partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

 /**
   * Get partnerAccessTokenExpiry
   * @return partnerAccessTokenExpiry
  **/
  @JsonProperty("partner_access_token_expiry")
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  public IntegrationMetadataCreate partnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    return this;
  }

 /**
   * Get partnerMetadata
   * @return partnerMetadata
  **/
  @JsonProperty("partner_metadata")
  public String getPartnerMetadata() {
    return partnerMetadata;
  }

  public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  public IntegrationMetadataCreate partnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

 /**
   * Get partnerPrimaryEmail
   * @return partnerPrimaryEmail
  **/
  @JsonProperty("partner_primary_email")
  public String getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }

  public void setPartnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }

  public IntegrationMetadataCreate partnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    return this;
  }

 /**
   * Get partnerRefreshToken
   * @return partnerRefreshToken
  **/
  @JsonProperty("partner_refresh_token")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

  public IntegrationMetadataCreate partnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
    return this;
  }

 /**
   * Get partnerRefreshTokenExpiry
   * @return partnerRefreshTokenExpiry
  **/
  @JsonProperty("partner_refresh_token_expiry")
  public BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  public IntegrationMetadataCreate partnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    return this;
  }

 /**
   * Get scopes
   * @return scopes
  **/
  @JsonProperty("scopes")
  public String getScopes() {
    return scopes;
  }

  public void setScopes(String scopes) {
    this.scopes = scopes;
  }

  public IntegrationMetadataCreate scopes(String scopes) {
    this.scopes = scopes;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

