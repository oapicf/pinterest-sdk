package org.openapitools.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class IntegrationMetadataCreate implements Serializable {
  private static final long serialVersionUID = 1L;

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

  /**
   * External business ID for the integration.
   */
  @JsonProperty("external_business_id")
  private String externalBusinessId;

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

  /**
   * 
   * @return additionalId1
   */
  public String getAdditionalId1() {
    return additionalId1;
  }

  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

  /**
   * 
   * @return connectedAdvertiserId
   */
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }

  public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  /**
   * 
   * @return connectedLbaId
   */
  public String getConnectedLbaId() {
    return connectedLbaId;
  }

  public void setConnectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

  /**
   * 
   * @return connectedMerchantId
   */
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }

  public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

  /**
   * 
   * @return connectedTagId
   */
  public String getConnectedTagId() {
    return connectedTagId;
  }

  public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

  /**
   * External business ID for the integration.
   * @return externalBusinessId
   */
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  /**
   * 
   * @return partnerAccessToken
   */
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  /**
   * 
   * @return partnerAccessTokenExpiry
   */
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  /**
   * 
   * @return partnerMetadata
   */
  public String getPartnerMetadata() {
    return partnerMetadata;
  }

  public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  /**
   * 
   * @return partnerPrimaryEmail
   */
  public String getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }

  public void setPartnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }

  /**
   * 
   * @return partnerRefreshToken
   */
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

  /**
   * 
   * @return partnerRefreshTokenExpiry
   */
  public BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  /**
   * 
   * @return scopes
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
