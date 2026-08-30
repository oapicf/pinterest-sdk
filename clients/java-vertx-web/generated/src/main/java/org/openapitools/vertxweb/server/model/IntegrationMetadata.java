package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Integration metadata
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntegrationMetadata   {
  
  private String additionalId1;
  private String connectedAdvertiserId;
  private String connectedLbaId;
  private String connectedMerchantId;
  private String connectedTagId;
  private String connectedUserId;
  private BigDecimal createdTimestamp;
  private String externalBusinessId;
  private String id;
  private BigDecimal partnerAccessTokenExpiry;
  private String partnerMetadata;
  private BigDecimal partnerRefreshTokenExpiry;
  private String scopes;
  private BigDecimal updatedTimestamp;

  public IntegrationMetadata () {

  }

  public IntegrationMetadata (String additionalId1, String connectedAdvertiserId, String connectedLbaId, String connectedMerchantId, String connectedTagId, String connectedUserId, BigDecimal createdTimestamp, String externalBusinessId, String id, BigDecimal partnerAccessTokenExpiry, String partnerMetadata, BigDecimal partnerRefreshTokenExpiry, String scopes, BigDecimal updatedTimestamp) {
    this.additionalId1 = additionalId1;
    this.connectedAdvertiserId = connectedAdvertiserId;
    this.connectedLbaId = connectedLbaId;
    this.connectedMerchantId = connectedMerchantId;
    this.connectedTagId = connectedTagId;
    this.connectedUserId = connectedUserId;
    this.createdTimestamp = createdTimestamp;
    this.externalBusinessId = externalBusinessId;
    this.id = id;
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    this.partnerMetadata = partnerMetadata;
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    this.scopes = scopes;
    this.updatedTimestamp = updatedTimestamp;
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

    
  @JsonProperty("created_timestamp")
  public BigDecimal getCreatedTimestamp() {
    return createdTimestamp;
  }
  public void setCreatedTimestamp(BigDecimal createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
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

    
  @JsonProperty("partner_access_token_expiry")
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }
  public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

    
  @JsonProperty("partner_metadata")
  public String getPartnerMetadata() {
    return partnerMetadata;
  }
  public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

    
  @JsonProperty("partner_refresh_token_expiry")
  public BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }
  public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

    
  @JsonProperty("scopes")
  public String getScopes() {
    return scopes;
  }
  public void setScopes(String scopes) {
    this.scopes = scopes;
  }

    
  @JsonProperty("updated_timestamp")
  public BigDecimal getUpdatedTimestamp() {
    return updatedTimestamp;
  }
  public void setUpdatedTimestamp(BigDecimal updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationMetadata integrationMetadata = (IntegrationMetadata) o;
    return Objects.equals(additionalId1, integrationMetadata.additionalId1) &&
        Objects.equals(connectedAdvertiserId, integrationMetadata.connectedAdvertiserId) &&
        Objects.equals(connectedLbaId, integrationMetadata.connectedLbaId) &&
        Objects.equals(connectedMerchantId, integrationMetadata.connectedMerchantId) &&
        Objects.equals(connectedTagId, integrationMetadata.connectedTagId) &&
        Objects.equals(connectedUserId, integrationMetadata.connectedUserId) &&
        Objects.equals(createdTimestamp, integrationMetadata.createdTimestamp) &&
        Objects.equals(externalBusinessId, integrationMetadata.externalBusinessId) &&
        Objects.equals(id, integrationMetadata.id) &&
        Objects.equals(partnerAccessTokenExpiry, integrationMetadata.partnerAccessTokenExpiry) &&
        Objects.equals(partnerMetadata, integrationMetadata.partnerMetadata) &&
        Objects.equals(partnerRefreshTokenExpiry, integrationMetadata.partnerRefreshTokenExpiry) &&
        Objects.equals(scopes, integrationMetadata.scopes) &&
        Objects.equals(updatedTimestamp, integrationMetadata.updatedTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalId1, connectedAdvertiserId, connectedLbaId, connectedMerchantId, connectedTagId, connectedUserId, createdTimestamp, externalBusinessId, id, partnerAccessTokenExpiry, partnerMetadata, partnerRefreshTokenExpiry, scopes, updatedTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationMetadata {\n");
    
    sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
    sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
    sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
    sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
    sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
    sb.append("    connectedUserId: ").append(toIndentedString(connectedUserId)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    externalBusinessId: ").append(toIndentedString(externalBusinessId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
    sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
    sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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
