package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Schema used for creating the integration metadata.
 */
@ApiModel(description="Schema used for creating the integration metadata.")

public class IntegrationRequest  {
  
 /**
  * External business ID for the integration.
  */
  @ApiModelProperty(value = "External business ID for the integration.")
  private String externalBusinessId;

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
  private Integer partnerAccessTokenExpiry;

  @ApiModelProperty(value = "")
  private Integer partnerRefreshTokenExpiry;

  @ApiModelProperty(value = "")
  private String scopes;

  @ApiModelProperty(value = "")
  private String additionalId1;

  @ApiModelProperty(value = "")
  private String partnerMetadata;
 /**
  * External business ID for the integration.
  * @return externalBusinessId
  */
  @JsonProperty("external_business_id")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  /**
   * Sets the <code>externalBusinessId</code> property.
   */
 public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  /**
   * Sets the <code>externalBusinessId</code> property.
   */
  public IntegrationRequest externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

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
  public IntegrationRequest connectedMerchantId(String connectedMerchantId) {
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
  public IntegrationRequest connectedAdvertiserId(String connectedAdvertiserId) {
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
  public IntegrationRequest connectedLbaId(String connectedLbaId) {
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
  public IntegrationRequest connectedTagId(String connectedTagId) {
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
  public IntegrationRequest partnerAccessToken(String partnerAccessToken) {
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
  public IntegrationRequest partnerRefreshToken(String partnerRefreshToken) {
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
  public IntegrationRequest partnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    return this;
  }

 /**
  * Get partnerAccessTokenExpiry
  * @return partnerAccessTokenExpiry
  */
  @JsonProperty("partner_access_token_expiry")
  public Integer getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  /**
   * Sets the <code>partnerAccessTokenExpiry</code> property.
   */
 public void setPartnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  /**
   * Sets the <code>partnerAccessTokenExpiry</code> property.
   */
  public IntegrationRequest partnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    return this;
  }

 /**
  * Get partnerRefreshTokenExpiry
  * @return partnerRefreshTokenExpiry
  */
  @JsonProperty("partner_refresh_token_expiry")
  public Integer getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  /**
   * Sets the <code>partnerRefreshTokenExpiry</code> property.
   */
 public void setPartnerRefreshTokenExpiry(Integer partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  /**
   * Sets the <code>partnerRefreshTokenExpiry</code> property.
   */
  public IntegrationRequest partnerRefreshTokenExpiry(Integer partnerRefreshTokenExpiry) {
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
  public IntegrationRequest scopes(String scopes) {
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
  public IntegrationRequest additionalId1(String additionalId1) {
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
  public IntegrationRequest partnerMetadata(String partnerMetadata) {
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
    IntegrationRequest integrationRequest = (IntegrationRequest) o;
    return Objects.equals(this.externalBusinessId, integrationRequest.externalBusinessId) &&
        Objects.equals(this.connectedMerchantId, integrationRequest.connectedMerchantId) &&
        Objects.equals(this.connectedAdvertiserId, integrationRequest.connectedAdvertiserId) &&
        Objects.equals(this.connectedLbaId, integrationRequest.connectedLbaId) &&
        Objects.equals(this.connectedTagId, integrationRequest.connectedTagId) &&
        Objects.equals(this.partnerAccessToken, integrationRequest.partnerAccessToken) &&
        Objects.equals(this.partnerRefreshToken, integrationRequest.partnerRefreshToken) &&
        Objects.equals(this.partnerPrimaryEmail, integrationRequest.partnerPrimaryEmail) &&
        Objects.equals(this.partnerAccessTokenExpiry, integrationRequest.partnerAccessTokenExpiry) &&
        Objects.equals(this.partnerRefreshTokenExpiry, integrationRequest.partnerRefreshTokenExpiry) &&
        Objects.equals(this.scopes, integrationRequest.scopes) &&
        Objects.equals(this.additionalId1, integrationRequest.additionalId1) &&
        Objects.equals(this.partnerMetadata, integrationRequest.partnerMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalBusinessId, connectedMerchantId, connectedAdvertiserId, connectedLbaId, connectedTagId, partnerAccessToken, partnerRefreshToken, partnerPrimaryEmail, partnerAccessTokenExpiry, partnerRefreshTokenExpiry, scopes, additionalId1, partnerMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationRequest {\n");
    
    sb.append("    externalBusinessId: ").append(toIndentedString(externalBusinessId)).append("\n");
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

