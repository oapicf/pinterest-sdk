package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Resource create or update operation model.
 */
@ApiModel(description = "Resource create or update operation model.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationMetadataUpdate   {
  @JsonProperty("additional_id_1")
  private String additionalId1;

  @JsonProperty("connected_advertiser_id")
  private String connectedAdvertiserId;

  @JsonProperty("connected_lba_id")
  private String connectedLbaId;

  @JsonProperty("connected_merchant_id")
  private String connectedMerchantId;

  @JsonProperty("connected_tag_id")
  private String connectedTagId;

  @JsonProperty("partner_access_token")
  private String partnerAccessToken;

  @JsonProperty("partner_access_token_expiry")
  private BigDecimal partnerAccessTokenExpiry;

  @JsonProperty("partner_metadata")
  private String partnerMetadata;

  @JsonProperty("partner_primary_email")
  private String partnerPrimaryEmail;

  @JsonProperty("partner_refresh_token")
  private String partnerRefreshToken;

  @JsonProperty("partner_refresh_token_expiry")
  private BigDecimal partnerRefreshTokenExpiry;

  @JsonProperty("scopes")
  private String scopes;

  public IntegrationMetadataUpdate additionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
    return this;
  }

  /**
   * Get additionalId1
   * @return additionalId1
   */
  @ApiModelProperty(value = "")
  public String getAdditionalId1() {
    return additionalId1;
  }

  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

  public IntegrationMetadataUpdate connectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
    return this;
  }

  /**
   * Get connectedAdvertiserId
   * @return connectedAdvertiserId
   */
  @ApiModelProperty(value = "")
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }

  public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  public IntegrationMetadataUpdate connectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
    return this;
  }

  /**
   * Get connectedLbaId
   * @return connectedLbaId
   */
  @ApiModelProperty(value = "")
  public String getConnectedLbaId() {
    return connectedLbaId;
  }

  public void setConnectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

  public IntegrationMetadataUpdate connectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
    return this;
  }

  /**
   * Get connectedMerchantId
   * @return connectedMerchantId
   */
  @ApiModelProperty(value = "")
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }

  public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

  public IntegrationMetadataUpdate connectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
    return this;
  }

  /**
   * Get connectedTagId
   * @return connectedTagId
   */
  @ApiModelProperty(value = "")
  public String getConnectedTagId() {
    return connectedTagId;
  }

  public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

  public IntegrationMetadataUpdate partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

  /**
   * Get partnerAccessToken
   * @return partnerAccessToken
   */
  @ApiModelProperty(value = "")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  public IntegrationMetadataUpdate partnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    return this;
  }

  /**
   * Get partnerAccessTokenExpiry
   * @return partnerAccessTokenExpiry
   */
  @ApiModelProperty(value = "")
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  public IntegrationMetadataUpdate partnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

  /**
   * Get partnerMetadata
   * @return partnerMetadata
   */
  @ApiModelProperty(value = "")
  public String getPartnerMetadata() {
    return partnerMetadata;
  }

  public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  public IntegrationMetadataUpdate partnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    return this;
  }

  /**
   * Get partnerPrimaryEmail
   * @return partnerPrimaryEmail
   */
  @ApiModelProperty(value = "")
  public String getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }

  public void setPartnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }

  public IntegrationMetadataUpdate partnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
    return this;
  }

  /**
   * Get partnerRefreshToken
   * @return partnerRefreshToken
   */
  @ApiModelProperty(value = "")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

  public IntegrationMetadataUpdate partnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    return this;
  }

  /**
   * Get partnerRefreshTokenExpiry
   * @return partnerRefreshTokenExpiry
   */
  @ApiModelProperty(value = "")
  public BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  public IntegrationMetadataUpdate scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Get scopes
   * @return scopes
   */
  @ApiModelProperty(value = "")
  public String getScopes() {
    return scopes;
  }

  public void setScopes(String scopes) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

