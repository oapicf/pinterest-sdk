package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Integration record
 */
@ApiModel(description="Integration record")

public class IntegrationRecord  {
  
  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  private String externalBusinessId;

  @ApiModelProperty(value = "")
  private String connectedMerchantId;

  @ApiModelProperty(value = "")
  private String connectedUserId;

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
  private String partnerMetadata;

  @ApiModelProperty(value = "")
  private String additionalId1;

  @ApiModelProperty(value = "")
  private Integer createdTime;

  @ApiModelProperty(value = "")
  private Integer updatedTime;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public IntegrationRecord id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get externalBusinessId
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
  public IntegrationRecord externalBusinessId(String externalBusinessId) {
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
  public IntegrationRecord connectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
    return this;
  }

 /**
  * Get connectedUserId
  * @return connectedUserId
  */
  @JsonProperty("connected_user_id")
  public String getConnectedUserId() {
    return connectedUserId;
  }

  /**
   * Sets the <code>connectedUserId</code> property.
   * <br><em>N.B. <code>connectedUserId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setConnectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

  /**
   * Sets the <code>connectedUserId</code> property.
   * <br><em>N.B. <code>connectedUserId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public IntegrationRecord connectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
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
   * <br><em>N.B. <code>connectedAdvertiserId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  /**
   * Sets the <code>connectedAdvertiserId</code> property.
   * <br><em>N.B. <code>connectedAdvertiserId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public IntegrationRecord connectedAdvertiserId(String connectedAdvertiserId) {
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
  public IntegrationRecord connectedLbaId(String connectedLbaId) {
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
  public IntegrationRecord connectedTagId(String connectedTagId) {
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
  public IntegrationRecord partnerAccessToken(String partnerAccessToken) {
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
  public IntegrationRecord partnerRefreshToken(String partnerRefreshToken) {
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
  public IntegrationRecord partnerPrimaryEmail(String partnerPrimaryEmail) {
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
  public IntegrationRecord partnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
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
  public IntegrationRecord partnerRefreshTokenExpiry(Integer partnerRefreshTokenExpiry) {
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
  public IntegrationRecord scopes(String scopes) {
    this.scopes = scopes;
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
  public IntegrationRecord partnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
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
  public IntegrationRecord additionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
    return this;
  }

 /**
  * Get createdTime
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public IntegrationRecord createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Get updatedTime
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
  public IntegrationRecord updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
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
    IntegrationRecord integrationRecord = (IntegrationRecord) o;
    return Objects.equals(this.id, integrationRecord.id) &&
        Objects.equals(this.externalBusinessId, integrationRecord.externalBusinessId) &&
        Objects.equals(this.connectedMerchantId, integrationRecord.connectedMerchantId) &&
        Objects.equals(this.connectedUserId, integrationRecord.connectedUserId) &&
        Objects.equals(this.connectedAdvertiserId, integrationRecord.connectedAdvertiserId) &&
        Objects.equals(this.connectedLbaId, integrationRecord.connectedLbaId) &&
        Objects.equals(this.connectedTagId, integrationRecord.connectedTagId) &&
        Objects.equals(this.partnerAccessToken, integrationRecord.partnerAccessToken) &&
        Objects.equals(this.partnerRefreshToken, integrationRecord.partnerRefreshToken) &&
        Objects.equals(this.partnerPrimaryEmail, integrationRecord.partnerPrimaryEmail) &&
        Objects.equals(this.partnerAccessTokenExpiry, integrationRecord.partnerAccessTokenExpiry) &&
        Objects.equals(this.partnerRefreshTokenExpiry, integrationRecord.partnerRefreshTokenExpiry) &&
        Objects.equals(this.scopes, integrationRecord.scopes) &&
        Objects.equals(this.partnerMetadata, integrationRecord.partnerMetadata) &&
        Objects.equals(this.additionalId1, integrationRecord.additionalId1) &&
        Objects.equals(this.createdTime, integrationRecord.createdTime) &&
        Objects.equals(this.updatedTime, integrationRecord.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalBusinessId, connectedMerchantId, connectedUserId, connectedAdvertiserId, connectedLbaId, connectedTagId, partnerAccessToken, partnerRefreshToken, partnerPrimaryEmail, partnerAccessTokenExpiry, partnerRefreshTokenExpiry, scopes, partnerMetadata, additionalId1, createdTime, updatedTime);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

