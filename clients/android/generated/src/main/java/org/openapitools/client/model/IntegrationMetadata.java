/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Integration metadata
 **/
@ApiModel(description = "Integration metadata")
public class IntegrationMetadata {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("external_business_id")
  private String externalBusinessId = null;
  @SerializedName("connected_merchant_id")
  private String connectedMerchantId = null;
  @SerializedName("connected_user_id")
  private String connectedUserId = null;
  @SerializedName("connected_advertiser_id")
  private String connectedAdvertiserId = null;
  @SerializedName("connected_lba_id")
  private String connectedLbaId = null;
  @SerializedName("connected_tag_id")
  private String connectedTagId = null;
  @SerializedName("partner_access_token_expiry")
  private BigDecimal partnerAccessTokenExpiry = null;
  @SerializedName("partner_refresh_token_expiry")
  private BigDecimal partnerRefreshTokenExpiry = null;
  @SerializedName("scopes")
  private String scopes = null;
  @SerializedName("created_timestamp")
  private BigDecimal createdTimestamp = null;
  @SerializedName("updated_timestamp")
  private BigDecimal updatedTimestamp = null;
  @SerializedName("additional_id_1")
  private String additionalId1 = null;
  @SerializedName("partner_metadata")
  private String partnerMetadata = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }
  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }
  public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getConnectedUserId() {
    return connectedUserId;
  }
  public void setConnectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }
  public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getConnectedLbaId() {
    return connectedLbaId;
  }
  public void setConnectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getConnectedTagId() {
    return connectedTagId;
  }
  public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }
  public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }
  public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getScopes() {
    return scopes;
  }
  public void setScopes(String scopes) {
    this.scopes = scopes;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getCreatedTimestamp() {
    return createdTimestamp;
  }
  public void setCreatedTimestamp(BigDecimal createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUpdatedTimestamp() {
    return updatedTimestamp;
  }
  public void setUpdatedTimestamp(BigDecimal updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAdditionalId1() {
    return additionalId1;
  }
  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPartnerMetadata() {
    return partnerMetadata;
  }
  public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
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
    return (this.id == null ? integrationMetadata.id == null : this.id.equals(integrationMetadata.id)) &&
        (this.externalBusinessId == null ? integrationMetadata.externalBusinessId == null : this.externalBusinessId.equals(integrationMetadata.externalBusinessId)) &&
        (this.connectedMerchantId == null ? integrationMetadata.connectedMerchantId == null : this.connectedMerchantId.equals(integrationMetadata.connectedMerchantId)) &&
        (this.connectedUserId == null ? integrationMetadata.connectedUserId == null : this.connectedUserId.equals(integrationMetadata.connectedUserId)) &&
        (this.connectedAdvertiserId == null ? integrationMetadata.connectedAdvertiserId == null : this.connectedAdvertiserId.equals(integrationMetadata.connectedAdvertiserId)) &&
        (this.connectedLbaId == null ? integrationMetadata.connectedLbaId == null : this.connectedLbaId.equals(integrationMetadata.connectedLbaId)) &&
        (this.connectedTagId == null ? integrationMetadata.connectedTagId == null : this.connectedTagId.equals(integrationMetadata.connectedTagId)) &&
        (this.partnerAccessTokenExpiry == null ? integrationMetadata.partnerAccessTokenExpiry == null : this.partnerAccessTokenExpiry.equals(integrationMetadata.partnerAccessTokenExpiry)) &&
        (this.partnerRefreshTokenExpiry == null ? integrationMetadata.partnerRefreshTokenExpiry == null : this.partnerRefreshTokenExpiry.equals(integrationMetadata.partnerRefreshTokenExpiry)) &&
        (this.scopes == null ? integrationMetadata.scopes == null : this.scopes.equals(integrationMetadata.scopes)) &&
        (this.createdTimestamp == null ? integrationMetadata.createdTimestamp == null : this.createdTimestamp.equals(integrationMetadata.createdTimestamp)) &&
        (this.updatedTimestamp == null ? integrationMetadata.updatedTimestamp == null : this.updatedTimestamp.equals(integrationMetadata.updatedTimestamp)) &&
        (this.additionalId1 == null ? integrationMetadata.additionalId1 == null : this.additionalId1.equals(integrationMetadata.additionalId1)) &&
        (this.partnerMetadata == null ? integrationMetadata.partnerMetadata == null : this.partnerMetadata.equals(integrationMetadata.partnerMetadata));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.externalBusinessId == null ? 0: this.externalBusinessId.hashCode());
    result = 31 * result + (this.connectedMerchantId == null ? 0: this.connectedMerchantId.hashCode());
    result = 31 * result + (this.connectedUserId == null ? 0: this.connectedUserId.hashCode());
    result = 31 * result + (this.connectedAdvertiserId == null ? 0: this.connectedAdvertiserId.hashCode());
    result = 31 * result + (this.connectedLbaId == null ? 0: this.connectedLbaId.hashCode());
    result = 31 * result + (this.connectedTagId == null ? 0: this.connectedTagId.hashCode());
    result = 31 * result + (this.partnerAccessTokenExpiry == null ? 0: this.partnerAccessTokenExpiry.hashCode());
    result = 31 * result + (this.partnerRefreshTokenExpiry == null ? 0: this.partnerRefreshTokenExpiry.hashCode());
    result = 31 * result + (this.scopes == null ? 0: this.scopes.hashCode());
    result = 31 * result + (this.createdTimestamp == null ? 0: this.createdTimestamp.hashCode());
    result = 31 * result + (this.updatedTimestamp == null ? 0: this.updatedTimestamp.hashCode());
    result = 31 * result + (this.additionalId1 == null ? 0: this.additionalId1.hashCode());
    result = 31 * result + (this.partnerMetadata == null ? 0: this.partnerMetadata.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationMetadata {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  externalBusinessId: ").append(externalBusinessId).append("\n");
    sb.append("  connectedMerchantId: ").append(connectedMerchantId).append("\n");
    sb.append("  connectedUserId: ").append(connectedUserId).append("\n");
    sb.append("  connectedAdvertiserId: ").append(connectedAdvertiserId).append("\n");
    sb.append("  connectedLbaId: ").append(connectedLbaId).append("\n");
    sb.append("  connectedTagId: ").append(connectedTagId).append("\n");
    sb.append("  partnerAccessTokenExpiry: ").append(partnerAccessTokenExpiry).append("\n");
    sb.append("  partnerRefreshTokenExpiry: ").append(partnerRefreshTokenExpiry).append("\n");
    sb.append("  scopes: ").append(scopes).append("\n");
    sb.append("  createdTimestamp: ").append(createdTimestamp).append("\n");
    sb.append("  updatedTimestamp: ").append(updatedTimestamp).append("\n");
    sb.append("  additionalId1: ").append(additionalId1).append("\n");
    sb.append("  partnerMetadata: ").append(partnerMetadata).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}