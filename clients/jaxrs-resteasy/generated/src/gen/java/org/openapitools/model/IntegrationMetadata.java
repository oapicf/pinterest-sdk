package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@ApiModel(description="Integration metadata")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationMetadata   {
  
  private String id;
  private String externalBusinessId;
  private String connectedMerchantId;
  private String connectedUserId;
  private String connectedAdvertiserId;
  private String connectedLbaId;
  private String connectedTagId;
  private BigDecimal partnerAccessTokenExpiry;
  private BigDecimal partnerRefreshTokenExpiry;
  private String scopes;
  private BigDecimal createdTimestamp;
  private BigDecimal updatedTimestamp;
  private String additionalId1;
  private String partnerMetadata;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("external_business_id")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }
  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connected_merchant_id")
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }
  public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connected_user_id")
  public String getConnectedUserId() {
    return connectedUserId;
  }
  public void setConnectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connected_advertiser_id")
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }
  public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connected_lba_id")
  public String getConnectedLbaId() {
    return connectedLbaId;
  }
  public void setConnectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("connected_tag_id")
  public String getConnectedTagId() {
    return connectedTagId;
  }
  public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_access_token_expiry")
  @Valid
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }
  public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_refresh_token_expiry")
  @Valid
  public BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }
  public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("scopes")
  public String getScopes() {
    return scopes;
  }
  public void setScopes(String scopes) {
    this.scopes = scopes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("created_timestamp")
  @Valid
  public BigDecimal getCreatedTimestamp() {
    return createdTimestamp;
  }
  public void setCreatedTimestamp(BigDecimal createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updated_timestamp")
  @Valid
  public BigDecimal getUpdatedTimestamp() {
    return updatedTimestamp;
  }
  public void setUpdatedTimestamp(BigDecimal updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("additional_id_1")
  public String getAdditionalId1() {
    return additionalId1;
  }
  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_metadata")
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
    return Objects.equals(this.id, integrationMetadata.id) &&
        Objects.equals(this.externalBusinessId, integrationMetadata.externalBusinessId) &&
        Objects.equals(this.connectedMerchantId, integrationMetadata.connectedMerchantId) &&
        Objects.equals(this.connectedUserId, integrationMetadata.connectedUserId) &&
        Objects.equals(this.connectedAdvertiserId, integrationMetadata.connectedAdvertiserId) &&
        Objects.equals(this.connectedLbaId, integrationMetadata.connectedLbaId) &&
        Objects.equals(this.connectedTagId, integrationMetadata.connectedTagId) &&
        Objects.equals(this.partnerAccessTokenExpiry, integrationMetadata.partnerAccessTokenExpiry) &&
        Objects.equals(this.partnerRefreshTokenExpiry, integrationMetadata.partnerRefreshTokenExpiry) &&
        Objects.equals(this.scopes, integrationMetadata.scopes) &&
        Objects.equals(this.createdTimestamp, integrationMetadata.createdTimestamp) &&
        Objects.equals(this.updatedTimestamp, integrationMetadata.updatedTimestamp) &&
        Objects.equals(this.additionalId1, integrationMetadata.additionalId1) &&
        Objects.equals(this.partnerMetadata, integrationMetadata.partnerMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalBusinessId, connectedMerchantId, connectedUserId, connectedAdvertiserId, connectedLbaId, connectedTagId, partnerAccessTokenExpiry, partnerRefreshTokenExpiry, scopes, createdTimestamp, updatedTimestamp, additionalId1, partnerMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationMetadata {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalBusinessId: ").append(toIndentedString(externalBusinessId)).append("\n");
    sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
    sb.append("    connectedUserId: ").append(toIndentedString(connectedUserId)).append("\n");
    sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
    sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
    sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
    sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
    sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
    sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
    sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
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

