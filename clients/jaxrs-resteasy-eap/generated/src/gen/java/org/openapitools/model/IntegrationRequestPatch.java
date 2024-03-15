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

@ApiModel(description="Schema used for updating the integration metadata.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationRequestPatch   {
  
  private String connectedMerchantId;
  private String connectedAdvertiserId;
  private String connectedLbaId;
  private String connectedTagId;
  private String partnerAccessToken;
  private String partnerRefreshToken;
  private String partnerPrimaryEmail;
  private BigDecimal partnerAccessTokenExpiry;
  private BigDecimal partnerRefreshTokenExpiry;
  private String scopes;
  private String additionalId1;
  private String partnerMetadata;

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
  @JsonProperty("partner_access_token")
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }
  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  /**
   **/
  
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
    IntegrationRequestPatch integrationRequestPatch = (IntegrationRequestPatch) o;
    return Objects.equals(this.connectedMerchantId, integrationRequestPatch.connectedMerchantId) &&
        Objects.equals(this.connectedAdvertiserId, integrationRequestPatch.connectedAdvertiserId) &&
        Objects.equals(this.connectedLbaId, integrationRequestPatch.connectedLbaId) &&
        Objects.equals(this.connectedTagId, integrationRequestPatch.connectedTagId) &&
        Objects.equals(this.partnerAccessToken, integrationRequestPatch.partnerAccessToken) &&
        Objects.equals(this.partnerRefreshToken, integrationRequestPatch.partnerRefreshToken) &&
        Objects.equals(this.partnerPrimaryEmail, integrationRequestPatch.partnerPrimaryEmail) &&
        Objects.equals(this.partnerAccessTokenExpiry, integrationRequestPatch.partnerAccessTokenExpiry) &&
        Objects.equals(this.partnerRefreshTokenExpiry, integrationRequestPatch.partnerRefreshTokenExpiry) &&
        Objects.equals(this.scopes, integrationRequestPatch.scopes) &&
        Objects.equals(this.additionalId1, integrationRequestPatch.additionalId1) &&
        Objects.equals(this.partnerMetadata, integrationRequestPatch.partnerMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectedMerchantId, connectedAdvertiserId, connectedLbaId, connectedTagId, partnerAccessToken, partnerRefreshToken, partnerPrimaryEmail, partnerAccessTokenExpiry, partnerRefreshTokenExpiry, scopes, additionalId1, partnerMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationRequestPatch {\n");
    
    sb.append("    connectedMerchantId: ").append(toIndentedString(connectedMerchantId)).append("\n");
    sb.append("    connectedAdvertiserId: ").append(toIndentedString(connectedAdvertiserId)).append("\n");
    sb.append("    connectedLbaId: ").append(toIndentedString(connectedLbaId)).append("\n");
    sb.append("    connectedTagId: ").append(toIndentedString(connectedTagId)).append("\n");
    sb.append("    partnerAccessToken: ").append(toIndentedString(partnerAccessToken)).append("\n");
    sb.append("    partnerRefreshToken: ").append(toIndentedString(partnerRefreshToken)).append("\n");
    sb.append("    partnerPrimaryEmail: ").append(toIndentedString(partnerPrimaryEmail)).append("\n");
    sb.append("    partnerAccessTokenExpiry: ").append(toIndentedString(partnerAccessTokenExpiry)).append("\n");
    sb.append("    partnerRefreshTokenExpiry: ").append(toIndentedString(partnerRefreshTokenExpiry)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

