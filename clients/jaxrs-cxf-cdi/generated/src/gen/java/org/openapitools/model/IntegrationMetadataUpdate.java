package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Resource create or update operation model.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Resource create or update operation model.")
public class IntegrationMetadataUpdate   {
  
  private String additionalId1;

  private String connectedAdvertiserId;

  private String connectedLbaId;

  private String connectedMerchantId;

  private String connectedTagId;

  private String partnerAccessToken;

  private BigDecimal partnerAccessTokenExpiry;

  private String partnerMetadata;

  private String partnerPrimaryEmail;

  private String partnerRefreshToken;

  private BigDecimal partnerRefreshTokenExpiry;

  private String scopes;

  /**
   **/
  public IntegrationMetadataUpdate additionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
    return this;
  }

  
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
  public IntegrationMetadataUpdate connectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
    return this;
  }

  
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
  public IntegrationMetadataUpdate connectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
    return this;
  }

  
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
  public IntegrationMetadataUpdate connectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
    return this;
  }

  
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
  public IntegrationMetadataUpdate connectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
    return this;
  }

  
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
  public IntegrationMetadataUpdate partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }
  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }


  /**
   **/
  public IntegrationMetadataUpdate partnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_access_token_expiry")
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }
  public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }


  /**
   **/
  public IntegrationMetadataUpdate partnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_metadata")
  public String getPartnerMetadata() {
    return partnerMetadata;
  }
  public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }


  /**
   **/
  public IntegrationMetadataUpdate partnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_primary_email")
  public String getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }
  public void setPartnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }


  /**
   **/
  public IntegrationMetadataUpdate partnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_refresh_token")
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }
  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }


  /**
   **/
  public IntegrationMetadataUpdate partnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("partner_refresh_token_expiry")
  public BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }
  public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }


  /**
   **/
  public IntegrationMetadataUpdate scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("scopes")
  public String getScopes() {
    return scopes;
  }
  public void setScopes(String scopes) {
    this.scopes = scopes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationMetadataUpdate integrationMetadataUpdate = (IntegrationMetadataUpdate) o;
    return Objects.equals(this.additionalId1, integrationMetadataUpdate.additionalId1) &&
        Objects.equals(this.connectedAdvertiserId, integrationMetadataUpdate.connectedAdvertiserId) &&
        Objects.equals(this.connectedLbaId, integrationMetadataUpdate.connectedLbaId) &&
        Objects.equals(this.connectedMerchantId, integrationMetadataUpdate.connectedMerchantId) &&
        Objects.equals(this.connectedTagId, integrationMetadataUpdate.connectedTagId) &&
        Objects.equals(this.partnerAccessToken, integrationMetadataUpdate.partnerAccessToken) &&
        Objects.equals(this.partnerAccessTokenExpiry, integrationMetadataUpdate.partnerAccessTokenExpiry) &&
        Objects.equals(this.partnerMetadata, integrationMetadataUpdate.partnerMetadata) &&
        Objects.equals(this.partnerPrimaryEmail, integrationMetadataUpdate.partnerPrimaryEmail) &&
        Objects.equals(this.partnerRefreshToken, integrationMetadataUpdate.partnerRefreshToken) &&
        Objects.equals(this.partnerRefreshTokenExpiry, integrationMetadataUpdate.partnerRefreshTokenExpiry) &&
        Objects.equals(this.scopes, integrationMetadataUpdate.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalId1, connectedAdvertiserId, connectedLbaId, connectedMerchantId, connectedTagId, partnerAccessToken, partnerAccessTokenExpiry, partnerMetadata, partnerPrimaryEmail, partnerRefreshToken, partnerRefreshTokenExpiry, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationMetadataUpdate {\n");
    
    sb.append("    additionalId1: ").append(toIndentedString(additionalId1)).append("\n");
    sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
    sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
    sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
    sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
    sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
    sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
    sb.append("    partnerMetadata: ").append(toIndentedString(partnerMetadata)).append("\n");
    sb.append("    partnerPrimaryEmail: ").append(toIndentedString(partnerPrimaryEmail)).append("\n");
    sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
    sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

