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
  
  private String id;
  private String externalBusinessId;
  private String connectedMerchantId;
  private String connectedUserId;
  private String connectedAdvertiserId;
  private String connectedLbaId;
  private String connectedTagId;
  private String partnerAccessToken;
  private String partnerRefreshToken;
  private String partnerPrimaryEmail;
  private Integer partnerAccessTokenExpiry;
  private Integer partnerRefreshTokenExpiry;
  private String scopes;
  private String partnerMetadata;
  private String additionalId1;
  private Integer createdTime;
  private Integer updatedTime;

  public IntegrationRecord () {

  }

  public IntegrationRecord (String id, String externalBusinessId, String connectedMerchantId, String connectedUserId, String connectedAdvertiserId, String connectedLbaId, String connectedTagId, String partnerAccessToken, String partnerRefreshToken, String partnerPrimaryEmail, Integer partnerAccessTokenExpiry, Integer partnerRefreshTokenExpiry, String scopes, String partnerMetadata, String additionalId1, Integer createdTime, Integer updatedTime) {
    this.id = id;
    this.externalBusinessId = externalBusinessId;
    this.connectedMerchantId = connectedMerchantId;
    this.connectedUserId = connectedUserId;
    this.connectedAdvertiserId = connectedAdvertiserId;
    this.connectedLbaId = connectedLbaId;
    this.connectedTagId = connectedTagId;
    this.partnerAccessToken = partnerAccessToken;
    this.partnerRefreshToken = partnerRefreshToken;
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    this.scopes = scopes;
    this.partnerMetadata = partnerMetadata;
    this.additionalId1 = additionalId1;
    this.createdTime = createdTime;
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("external_business_id")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }
  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

    
  @JsonProperty("connected_merchant_id")
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }
  public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

    
  @JsonProperty("connected_user_id")
  public String getConnectedUserId() {
    return connectedUserId;
  }
  public void setConnectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
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

    
  @JsonProperty("connected_tag_id")
  public String getConnectedTagId() {
    return connectedTagId;
  }
  public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

    
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }
  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

    
  @JsonProperty("partner_refresh_token")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }
  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

    
  @JsonProperty("partner_primary_email")
  public String getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }
  public void setPartnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }

    
  @JsonProperty("partner_access_token_expiry")
  public Integer getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }
  public void setPartnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
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

    
  @JsonProperty("partner_metadata")
  public String getPartnerMetadata() {
    return partnerMetadata;
  }
  public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

    
  @JsonProperty("additional_id_1")
  public String getAdditionalId1() {
    return additionalId1;
  }
  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
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
    return Objects.equals(id, integrationRecord.id) &&
        Objects.equals(externalBusinessId, integrationRecord.externalBusinessId) &&
        Objects.equals(connectedMerchantId, integrationRecord.connectedMerchantId) &&
        Objects.equals(connectedUserId, integrationRecord.connectedUserId) &&
        Objects.equals(connectedAdvertiserId, integrationRecord.connectedAdvertiserId) &&
        Objects.equals(connectedLbaId, integrationRecord.connectedLbaId) &&
        Objects.equals(connectedTagId, integrationRecord.connectedTagId) &&
        Objects.equals(partnerAccessToken, integrationRecord.partnerAccessToken) &&
        Objects.equals(partnerRefreshToken, integrationRecord.partnerRefreshToken) &&
        Objects.equals(partnerPrimaryEmail, integrationRecord.partnerPrimaryEmail) &&
        Objects.equals(partnerAccessTokenExpiry, integrationRecord.partnerAccessTokenExpiry) &&
        Objects.equals(partnerRefreshTokenExpiry, integrationRecord.partnerRefreshTokenExpiry) &&
        Objects.equals(scopes, integrationRecord.scopes) &&
        Objects.equals(partnerMetadata, integrationRecord.partnerMetadata) &&
        Objects.equals(additionalId1, integrationRecord.additionalId1) &&
        Objects.equals(createdTime, integrationRecord.createdTime) &&
        Objects.equals(updatedTime, integrationRecord.updatedTime);
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
