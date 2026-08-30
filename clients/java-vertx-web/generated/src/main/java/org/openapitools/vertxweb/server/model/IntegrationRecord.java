package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Integration record
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntegrationRecord   {
  
  private String additionalId1;
  private String connectedAdvertiserId;
  private String connectedLbaId;
  private String connectedMerchantId;
  private String connectedTagId;
  private String connectedUserId;
  private Integer createdTime;
  private String externalBusinessId;
  private String id;
  private String partnerAccessToken;
  private Integer partnerAccessTokenExpiry;
  private String partnerMetadata;
  private String partnerPrimaryEmail;
  private String partnerRefreshToken;
  private Integer partnerRefreshTokenExpiry;
  private String scopes;
  private Integer updatedTime;

  public IntegrationRecord () {

  }

  public IntegrationRecord (String additionalId1, String connectedAdvertiserId, String connectedLbaId, String connectedMerchantId, String connectedTagId, String connectedUserId, Integer createdTime, String externalBusinessId, String id, String partnerAccessToken, Integer partnerAccessTokenExpiry, String partnerMetadata, String partnerPrimaryEmail, String partnerRefreshToken, Integer partnerRefreshTokenExpiry, String scopes, Integer updatedTime) {
    this.additionalId1 = additionalId1;
    this.connectedAdvertiserId = connectedAdvertiserId;
    this.connectedLbaId = connectedLbaId;
    this.connectedMerchantId = connectedMerchantId;
    this.connectedTagId = connectedTagId;
    this.connectedUserId = connectedUserId;
    this.createdTime = createdTime;
    this.externalBusinessId = externalBusinessId;
    this.id = id;
    this.partnerAccessToken = partnerAccessToken;
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    this.partnerMetadata = partnerMetadata;
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    this.partnerRefreshToken = partnerRefreshToken;
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    this.scopes = scopes;
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("additional_id_1")
  public String getAdditionalId1() {
    return additionalId1;
  }
  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

    
  @JsonProperty("connected_advertiser_id")
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }
  public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

    
  @JsonProperty("connected_lba_id")
  public String getConnectedLbaId() {
    return connectedLbaId;
  }
  public void setConnectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

    
  @JsonProperty("connected_merchant_id")
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }
  public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

    
  @JsonProperty("connected_tag_id")
  public String getConnectedTagId() {
    return connectedTagId;
  }
  public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

    
  @JsonProperty("connected_user_id")
  public String getConnectedUserId() {
    return connectedUserId;
  }
  public void setConnectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("external_business_id")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }
  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }
  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

    
  @JsonProperty("partner_access_token_expiry")
  public Integer getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }
  public void setPartnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

    
  @JsonProperty("partner_metadata")
  public String getPartnerMetadata() {
    return partnerMetadata;
  }
  public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

    
  @JsonProperty("partner_primary_email")
  public String getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }
  public void setPartnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }

    
  @JsonProperty("partner_refresh_token")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }
  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

    
  @JsonProperty("partner_refresh_token_expiry")
  public Integer getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }
  public void setPartnerRefreshTokenExpiry(Integer partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

    
  @JsonProperty("scopes")
  public String getScopes() {
    return scopes;
  }
  public void setScopes(String scopes) {
    this.scopes = scopes;
  }

    
  @JsonProperty("updated_time")
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
    return Objects.equals(additionalId1, integrationRecord.additionalId1) &&
        Objects.equals(connectedAdvertiserId, integrationRecord.connectedAdvertiserId) &&
        Objects.equals(connectedLbaId, integrationRecord.connectedLbaId) &&
        Objects.equals(connectedMerchantId, integrationRecord.connectedMerchantId) &&
        Objects.equals(connectedTagId, integrationRecord.connectedTagId) &&
        Objects.equals(connectedUserId, integrationRecord.connectedUserId) &&
        Objects.equals(createdTime, integrationRecord.createdTime) &&
        Objects.equals(externalBusinessId, integrationRecord.externalBusinessId) &&
        Objects.equals(id, integrationRecord.id) &&
        Objects.equals(partnerAccessToken, integrationRecord.partnerAccessToken) &&
        Objects.equals(partnerAccessTokenExpiry, integrationRecord.partnerAccessTokenExpiry) &&
        Objects.equals(partnerMetadata, integrationRecord.partnerMetadata) &&
        Objects.equals(partnerPrimaryEmail, integrationRecord.partnerPrimaryEmail) &&
        Objects.equals(partnerRefreshToken, integrationRecord.partnerRefreshToken) &&
        Objects.equals(partnerRefreshTokenExpiry, integrationRecord.partnerRefreshTokenExpiry) &&
        Objects.equals(scopes, integrationRecord.scopes) &&
        Objects.equals(updatedTime, integrationRecord.updatedTime);
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
