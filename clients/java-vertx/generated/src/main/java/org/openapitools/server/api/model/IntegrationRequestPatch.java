package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Schema used for updating the integration metadata.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public IntegrationRequestPatch () {

  }

  public IntegrationRequestPatch (String connectedMerchantId, String connectedAdvertiserId, String connectedLbaId, String connectedTagId, String partnerAccessToken, String partnerRefreshToken, String partnerPrimaryEmail, BigDecimal partnerAccessTokenExpiry, BigDecimal partnerRefreshTokenExpiry, String scopes, String additionalId1, String partnerMetadata) {
    this.connectedMerchantId = connectedMerchantId;
    this.connectedAdvertiserId = connectedAdvertiserId;
    this.connectedLbaId = connectedLbaId;
    this.connectedTagId = connectedTagId;
    this.partnerAccessToken = partnerAccessToken;
    this.partnerRefreshToken = partnerRefreshToken;
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    this.scopes = scopes;
    this.additionalId1 = additionalId1;
    this.partnerMetadata = partnerMetadata;
  }

    
  @JsonProperty("connected_merchant_id")
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }
  public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
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
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }
  public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
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

    
  @JsonProperty("additional_id_1")
  public String getAdditionalId1() {
    return additionalId1;
  }
  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

    
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
    return Objects.equals(connectedMerchantId, integrationRequestPatch.connectedMerchantId) &&
        Objects.equals(connectedAdvertiserId, integrationRequestPatch.connectedAdvertiserId) &&
        Objects.equals(connectedLbaId, integrationRequestPatch.connectedLbaId) &&
        Objects.equals(connectedTagId, integrationRequestPatch.connectedTagId) &&
        Objects.equals(partnerAccessToken, integrationRequestPatch.partnerAccessToken) &&
        Objects.equals(partnerRefreshToken, integrationRequestPatch.partnerRefreshToken) &&
        Objects.equals(partnerPrimaryEmail, integrationRequestPatch.partnerPrimaryEmail) &&
        Objects.equals(partnerAccessTokenExpiry, integrationRequestPatch.partnerAccessTokenExpiry) &&
        Objects.equals(partnerRefreshTokenExpiry, integrationRequestPatch.partnerRefreshTokenExpiry) &&
        Objects.equals(scopes, integrationRequestPatch.scopes) &&
        Objects.equals(additionalId1, integrationRequestPatch.additionalId1) &&
        Objects.equals(partnerMetadata, integrationRequestPatch.partnerMetadata);
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
