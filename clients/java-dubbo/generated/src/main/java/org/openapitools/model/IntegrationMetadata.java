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
 * Integration metadata
 */
public class IntegrationMetadata implements Serializable {
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

  @JsonProperty("created_timestamp")
  private BigDecimal createdTimestamp;

  /**
   * External business ID for the integration.
   */
  @JsonProperty("external_business_id")
  private String externalBusinessId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("partner_access_token_expiry")
  private BigDecimal partnerAccessTokenExpiry;

  @JsonProperty("partner_metadata")
  private String partnerMetadata;

  @JsonProperty("partner_refresh_token_expiry")
  private BigDecimal partnerRefreshTokenExpiry;

  @JsonProperty("scopes")
  private String scopes;

  @JsonProperty("updated_timestamp")
  private BigDecimal updatedTimestamp;

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
   * @return createdTimestamp
   */
  public BigDecimal getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(BigDecimal createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
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

  /**
   * 
   * @return updatedTimestamp
   */
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
    return Objects.equals(this.additionalId1, integrationMetadata.additionalId1) &&
        Objects.equals(this.connectedAdvertiserId, integrationMetadata.connectedAdvertiserId) &&
        Objects.equals(this.connectedLbaId, integrationMetadata.connectedLbaId) &&
        Objects.equals(this.connectedMerchantId, integrationMetadata.connectedMerchantId) &&
        Objects.equals(this.connectedTagId, integrationMetadata.connectedTagId) &&
        Objects.equals(this.connectedUserId, integrationMetadata.connectedUserId) &&
        Objects.equals(this.createdTimestamp, integrationMetadata.createdTimestamp) &&
        Objects.equals(this.externalBusinessId, integrationMetadata.externalBusinessId) &&
        Objects.equals(this.id, integrationMetadata.id) &&
        Objects.equals(this.partnerAccessTokenExpiry, integrationMetadata.partnerAccessTokenExpiry) &&
        Objects.equals(this.partnerMetadata, integrationMetadata.partnerMetadata) &&
        Objects.equals(this.partnerRefreshTokenExpiry, integrationMetadata.partnerRefreshTokenExpiry) &&
        Objects.equals(this.scopes, integrationMetadata.scopes) &&
        Objects.equals(this.updatedTimestamp, integrationMetadata.updatedTimestamp);
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
