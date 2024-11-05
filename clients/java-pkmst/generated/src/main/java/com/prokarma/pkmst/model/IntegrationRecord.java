package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Integration record
 */
@ApiModel(description = "Integration record")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class IntegrationRecord   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("external_business_id")
  private String externalBusinessId;

  @JsonProperty("connected_merchant_id")
  private String connectedMerchantId;

  @JsonProperty("connected_user_id")
  private String connectedUserId;

  @JsonProperty("connected_advertiser_id")
  private String connectedAdvertiserId;

  @JsonProperty("connected_lba_id")
  private String connectedLbaId;

  @JsonProperty("connected_tag_id")
  private String connectedTagId;

  @JsonProperty("partner_access_token")
  private String partnerAccessToken;

  @JsonProperty("partner_refresh_token")
  private String partnerRefreshToken;

  @JsonProperty("partner_primary_email")
  private String partnerPrimaryEmail;

  @JsonProperty("partner_access_token_expiry")
  private Integer partnerAccessTokenExpiry;

  @JsonProperty("partner_refresh_token_expiry")
  private Integer partnerRefreshTokenExpiry;

  @JsonProperty("scopes")
  private String scopes;

  @JsonProperty("partner_metadata")
  private String partnerMetadata;

  @JsonProperty("additional_id_1")
  private String additionalId1;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  public IntegrationRecord id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IntegrationRecord externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

  /**
   * Get externalBusinessId
   * @return externalBusinessId
   */
  @ApiModelProperty(value = "")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  public IntegrationRecord connectedMerchantId(String connectedMerchantId) {
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

  public IntegrationRecord connectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
    return this;
  }

  /**
   * Get connectedUserId
   * @return connectedUserId
   */
  @ApiModelProperty(readOnly = true, value = "")
  public String getConnectedUserId() {
    return connectedUserId;
  }

  public void setConnectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

  public IntegrationRecord connectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
    return this;
  }

  /**
   * Get connectedAdvertiserId
   * @return connectedAdvertiserId
   */
  @ApiModelProperty(readOnly = true, value = "")
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }

  public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  public IntegrationRecord connectedLbaId(String connectedLbaId) {
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

  public IntegrationRecord connectedTagId(String connectedTagId) {
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

  public IntegrationRecord partnerAccessToken(String partnerAccessToken) {
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

  public IntegrationRecord partnerRefreshToken(String partnerRefreshToken) {
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

  public IntegrationRecord partnerPrimaryEmail(String partnerPrimaryEmail) {
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

  public IntegrationRecord partnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    return this;
  }

  /**
   * Get partnerAccessTokenExpiry
   * @return partnerAccessTokenExpiry
   */
  @ApiModelProperty(value = "")
  public Integer getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  public void setPartnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  public IntegrationRecord partnerRefreshTokenExpiry(Integer partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    return this;
  }

  /**
   * Get partnerRefreshTokenExpiry
   * @return partnerRefreshTokenExpiry
   */
  @ApiModelProperty(value = "")
  public Integer getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  public void setPartnerRefreshTokenExpiry(Integer partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  public IntegrationRecord scopes(String scopes) {
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

  public IntegrationRecord partnerMetadata(String partnerMetadata) {
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

  public IntegrationRecord additionalId1(String additionalId1) {
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

  public IntegrationRecord createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   * @return createdTime
   */
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

