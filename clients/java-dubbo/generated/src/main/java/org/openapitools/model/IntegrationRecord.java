package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Integration record
 */
public class IntegrationRecord implements Serializable {
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

  @JsonProperty("connected_user_id")
  private String connectedUserId;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("external_business_id")
  private String externalBusinessId;

  /**
   * Integration record ID.
   */
  @JsonProperty("id")
  private String id;

  @JsonProperty("partner_access_token")
  private String partnerAccessToken;

  @JsonProperty("partner_access_token_expiry")
  private Integer partnerAccessTokenExpiry;

  @JsonProperty("partner_metadata")
  private String partnerMetadata;

  @JsonProperty("partner_primary_email")
  private String partnerPrimaryEmail;

  @JsonProperty("partner_refresh_token")
  private String partnerRefreshToken;

  @JsonProperty("partner_refresh_token_expiry")
  private Integer partnerRefreshTokenExpiry;

  @JsonProperty("scopes")
  private String scopes;

  @JsonProperty("updated_time")
  private Integer updatedTime;

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
   * 
   * @return connectedUserId
   */
  public String getConnectedUserId() {
    return connectedUserId;
  }

  public void setConnectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

  /**
   * 
   * @return createdTime
   */
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * 
   * @return externalBusinessId
   */
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  /**
   * Integration record ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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
  public Integer getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  public void setPartnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
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
  public Integer getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  public void setPartnerRefreshTokenExpiry(Integer partnerRefreshTokenExpiry) {
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

  /**
   * 
   * @return updatedTime
   */
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
    return Objects.equals(this.additionalId1, integrationRecord.additionalId1) &&
        Objects.equals(this.connectedAdvertiserId, integrationRecord.connectedAdvertiserId) &&
        Objects.equals(this.connectedLbaId, integrationRecord.connectedLbaId) &&
        Objects.equals(this.connectedMerchantId, integrationRecord.connectedMerchantId) &&
        Objects.equals(this.connectedTagId, integrationRecord.connectedTagId) &&
        Objects.equals(this.connectedUserId, integrationRecord.connectedUserId) &&
        Objects.equals(this.createdTime, integrationRecord.createdTime) &&
        Objects.equals(this.externalBusinessId, integrationRecord.externalBusinessId) &&
        Objects.equals(this.id, integrationRecord.id) &&
        Objects.equals(this.partnerAccessToken, integrationRecord.partnerAccessToken) &&
        Objects.equals(this.partnerAccessTokenExpiry, integrationRecord.partnerAccessTokenExpiry) &&
        Objects.equals(this.partnerMetadata, integrationRecord.partnerMetadata) &&
        Objects.equals(this.partnerPrimaryEmail, integrationRecord.partnerPrimaryEmail) &&
        Objects.equals(this.partnerRefreshToken, integrationRecord.partnerRefreshToken) &&
        Objects.equals(this.partnerRefreshTokenExpiry, integrationRecord.partnerRefreshTokenExpiry) &&
        Objects.equals(this.scopes, integrationRecord.scopes) &&
        Objects.equals(this.updatedTime, integrationRecord.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalId1, connectedAdvertiserId, connectedLbaId, connectedMerchantId, connectedTagId, connectedUserId, createdTime, externalBusinessId, id, partnerAccessToken, partnerAccessTokenExpiry, partnerMetadata, partnerPrimaryEmail, partnerRefreshToken, partnerRefreshTokenExpiry, scopes, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationRecord {\n");
    
    sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
    sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
    sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
    sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
    sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
    sb.append("    connectedUserId: ").append(toIndentedString(connectedUserId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    externalBusinessId: ").append(toIndentedString(externalBusinessId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
    sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
    sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
    sb.append("    partnerPrimaryEmail: ").append(toIndentedString(partnerPrimaryEmail)).append("\n");
    sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
    sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
