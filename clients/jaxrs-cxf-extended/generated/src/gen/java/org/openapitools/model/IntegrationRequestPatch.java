package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Schema used for updating the integration metadata.
 */
@ApiModel(description="Schema used for updating the integration metadata.")

public class IntegrationRequestPatch  {
  
  @ApiModelProperty(value = "")
  private String connectedMerchantId;

  @ApiModelProperty(value = "")
  private String connectedAdvertiserId;

  @ApiModelProperty(value = "")
  private String connectedLbaId;

  @ApiModelProperty(value = "")
  private String connectedTagId;

  @ApiModelProperty(value = "")
  private String partnerAccessToken;

  @ApiModelProperty(value = "")
  private String partnerRefreshToken;

  @ApiModelProperty(value = "")
  private String partnerPrimaryEmail;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal partnerAccessTokenExpiry;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal partnerRefreshTokenExpiry;

  @ApiModelProperty(value = "")
  private String scopes;

  @ApiModelProperty(value = "")
  private String additionalId1;

  @ApiModelProperty(value = "")
  private String partnerMetadata;
 /**
  * Get connectedMerchantId
  * @return connectedMerchantId
  */
  @JsonProperty("connected_merchant_id")
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }

  /**
   * Sets the <code>connectedMerchantId</code> property.
   */
 public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

  /**
   * Sets the <code>connectedMerchantId</code> property.
   */
  public IntegrationRequestPatch connectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
    return this;
  }

 /**
  * Get connectedAdvertiserId
  * @return connectedAdvertiserId
  */
  @JsonProperty("connected_advertiser_id")
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }

  /**
   * Sets the <code>connectedAdvertiserId</code> property.
   */
 public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  /**
   * Sets the <code>connectedAdvertiserId</code> property.
   */
  public IntegrationRequestPatch connectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
    return this;
  }

 /**
  * Get connectedLbaId
  * @return connectedLbaId
  */
  @JsonProperty("connected_lba_id")
  public String getConnectedLbaId() {
    return connectedLbaId;
  }

  /**
   * Sets the <code>connectedLbaId</code> property.
   */
 public void setConnectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

  /**
   * Sets the <code>connectedLbaId</code> property.
   */
  public IntegrationRequestPatch connectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
    return this;
  }

 /**
  * Get connectedTagId
  * @return connectedTagId
  */
  @JsonProperty("connected_tag_id")
  public String getConnectedTagId() {
    return connectedTagId;
  }

  /**
   * Sets the <code>connectedTagId</code> property.
   */
 public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

  /**
   * Sets the <code>connectedTagId</code> property.
   */
  public IntegrationRequestPatch connectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
    return this;
  }

 /**
  * Get partnerAccessToken
  * @return partnerAccessToken
  */
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  /**
   * Sets the <code>partnerAccessToken</code> property.
   */
 public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  /**
   * Sets the <code>partnerAccessToken</code> property.
   */
  public IntegrationRequestPatch partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

 /**
  * Get partnerRefreshToken
  * @return partnerRefreshToken
  */
  @JsonProperty("partner_refresh_token")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  /**
   * Sets the <code>partnerRefreshToken</code> property.
   */
 public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

  /**
   * Sets the <code>partnerRefreshToken</code> property.
   */
  public IntegrationRequestPatch partnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
    return this;
  }

 /**
  * Get partnerPrimaryEmail
  * @return partnerPrimaryEmail
  */
  @JsonProperty("partner_primary_email")
  public String getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }

  /**
   * Sets the <code>partnerPrimaryEmail</code> property.
   */
 public void setPartnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }

  /**
   * Sets the <code>partnerPrimaryEmail</code> property.
   */
  public IntegrationRequestPatch partnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    return this;
  }

 /**
  * Get partnerAccessTokenExpiry
  * @return partnerAccessTokenExpiry
  */
  @JsonProperty("partner_access_token_expiry")
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  /**
   * Sets the <code>partnerAccessTokenExpiry</code> property.
   */
 public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  /**
   * Sets the <code>partnerAccessTokenExpiry</code> property.
   */
  public IntegrationRequestPatch partnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    return this;
  }

 /**
  * Get partnerRefreshTokenExpiry
  * @return partnerRefreshTokenExpiry
  */
  @JsonProperty("partner_refresh_token_expiry")
  public BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  /**
   * Sets the <code>partnerRefreshTokenExpiry</code> property.
   */
 public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  /**
   * Sets the <code>partnerRefreshTokenExpiry</code> property.
   */
  public IntegrationRequestPatch partnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    return this;
  }

 /**
  * Get scopes
  * @return scopes
  */
  @JsonProperty("scopes")
  public String getScopes() {
    return scopes;
  }

  /**
   * Sets the <code>scopes</code> property.
   */
 public void setScopes(String scopes) {
    this.scopes = scopes;
  }

  /**
   * Sets the <code>scopes</code> property.
   */
  public IntegrationRequestPatch scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

 /**
  * Get additionalId1
  * @return additionalId1
  */
  @JsonProperty("additional_id_1")
  public String getAdditionalId1() {
    return additionalId1;
  }

  /**
   * Sets the <code>additionalId1</code> property.
   */
 public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

  /**
   * Sets the <code>additionalId1</code> property.
   */
  public IntegrationRequestPatch additionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
    return this;
  }

 /**
  * Get partnerMetadata
  * @return partnerMetadata
  */
  @JsonProperty("partner_metadata")
  public String getPartnerMetadata() {
    return partnerMetadata;
  }

  /**
   * Sets the <code>partnerMetadata</code> property.
   */
 public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  /**
   * Sets the <code>partnerMetadata</code> property.
   */
  public IntegrationRequestPatch partnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

