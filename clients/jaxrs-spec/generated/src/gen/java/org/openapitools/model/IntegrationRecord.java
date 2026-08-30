package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Integration record
 **/
@ApiModel(description = "Integration record")
@JsonTypeName("IntegrationRecord")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  public IntegrationRecord() {
  }

  @JsonCreator
  public IntegrationRecord(
    @JsonProperty(required = true, value = "id") String id
  ) {
    this.id = id;
  }

  /**
   **/
  public IntegrationRecord additionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("additional_id_1")
  public String getAdditionalId1() {
    return additionalId1;
  }

  @JsonProperty("additional_id_1")
  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

  /**
   **/
  public IntegrationRecord connectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("connected_advertiser_id")
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }

  @JsonProperty("connected_advertiser_id")
  public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  /**
   **/
  public IntegrationRecord connectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("connected_lba_id")
  public String getConnectedLbaId() {
    return connectedLbaId;
  }

  @JsonProperty("connected_lba_id")
  public void setConnectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

  /**
   **/
  public IntegrationRecord connectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("connected_merchant_id")
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }

  @JsonProperty("connected_merchant_id")
  public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

  /**
   **/
  public IntegrationRecord connectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("connected_tag_id")
  public String getConnectedTagId() {
    return connectedTagId;
  }

  @JsonProperty("connected_tag_id")
  public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

  /**
   **/
  public IntegrationRecord connectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("connected_user_id")
  public String getConnectedUserId() {
    return connectedUserId;
  }

  @JsonProperty("connected_user_id")
  public void setConnectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

  /**
   **/
  public IntegrationRecord createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   **/
  public IntegrationRecord externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("external_business_id")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  @JsonProperty("external_business_id")
  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  /**
   * Integration record ID.
   **/
  public IntegrationRecord id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Integration record ID.")
  @JsonProperty(required = true, value = "id")
   @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public IntegrationRecord partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  @JsonProperty("partner_access_token")
  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  /**
   **/
  public IntegrationRecord partnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_access_token_expiry")
  public Integer getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  @JsonProperty("partner_access_token_expiry")
  public void setPartnerAccessTokenExpiry(Integer partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  /**
   **/
  public IntegrationRecord partnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_metadata")
  public String getPartnerMetadata() {
    return partnerMetadata;
  }

  @JsonProperty("partner_metadata")
  public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  /**
   **/
  public IntegrationRecord partnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_primary_email")
  public String getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }

  @JsonProperty("partner_primary_email")
  public void setPartnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }

  /**
   **/
  public IntegrationRecord partnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_refresh_token")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  @JsonProperty("partner_refresh_token")
  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

  /**
   **/
  public IntegrationRecord partnerRefreshTokenExpiry(Integer partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_refresh_token_expiry")
  public Integer getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  @JsonProperty("partner_refresh_token_expiry")
  public void setPartnerRefreshTokenExpiry(Integer partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  /**
   **/
  public IntegrationRecord scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scopes")
  public String getScopes() {
    return scopes;
  }

  @JsonProperty("scopes")
  public void setScopes(String scopes) {
    this.scopes = scopes;
  }

  /**
   **/
  public IntegrationRecord updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty("updated_time")
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
