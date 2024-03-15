package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Schema used for updating the integration metadata.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class IntegrationRequestPatch   {
  @JsonProperty("connected_merchant_id")
  
  private String connectedMerchantId;

  @JsonProperty("connected_advertiser_id")
  
  private String connectedAdvertiserId;

  @JsonProperty("connected_lba_id")
  
  private String connectedLbaId;

  @JsonProperty("connected_tag_id")
  
  private String connectedTagId;

  @JsonProperty("partner_access_token")
  
  private String partnerAccessToken;

  @JsonProperty("partner_refresh_token")
  
  private String partnerRefreshToken;

  @JsonProperty("partner_primary_email")
  
  private String partnerPrimaryEmail;

  @JsonProperty("partner_access_token_expiry")
  @Valid

  private BigDecimal partnerAccessTokenExpiry;

  @JsonProperty("partner_refresh_token_expiry")
  @Valid

  private BigDecimal partnerRefreshTokenExpiry;

  @JsonProperty("scopes")
  
  private String scopes;

  @JsonProperty("additional_id_1")
  
  private String additionalId1;

  @JsonProperty("partner_metadata")
  
  private String partnerMetadata;

  public IntegrationRequestPatch connectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
    return this;
  }

   /**
   * Get connectedMerchantId
   * @return connectedMerchantId
  **/
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }

  public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

  public IntegrationRequestPatch connectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
    return this;
  }

   /**
   * Get connectedAdvertiserId
   * @return connectedAdvertiserId
  **/
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }

  public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  public IntegrationRequestPatch connectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
    return this;
  }

   /**
   * Get connectedLbaId
   * @return connectedLbaId
  **/
  public String getConnectedLbaId() {
    return connectedLbaId;
  }

  public void setConnectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

  public IntegrationRequestPatch connectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
    return this;
  }

   /**
   * Get connectedTagId
   * @return connectedTagId
  **/
  public String getConnectedTagId() {
    return connectedTagId;
  }

  public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

  public IntegrationRequestPatch partnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
    return this;
  }

   /**
   * Get partnerAccessToken
   * @return partnerAccessToken
  **/
  public String getPartnerAccessToken() {
    return partnerAccessToken;
  }

  public void setPartnerAccessToken(String partnerAccessToken) {
    this.partnerAccessToken = partnerAccessToken;
  }

  public IntegrationRequestPatch partnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
    return this;
  }

   /**
   * Get partnerRefreshToken
   * @return partnerRefreshToken
  **/
  public String getPartnerRefreshToken() {
    return partnerRefreshToken;
  }

  public void setPartnerRefreshToken(String partnerRefreshToken) {
    this.partnerRefreshToken = partnerRefreshToken;
  }

  public IntegrationRequestPatch partnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
    return this;
  }

   /**
   * Get partnerPrimaryEmail
   * @return partnerPrimaryEmail
  **/
  public String getPartnerPrimaryEmail() {
    return partnerPrimaryEmail;
  }

  public void setPartnerPrimaryEmail(String partnerPrimaryEmail) {
    this.partnerPrimaryEmail = partnerPrimaryEmail;
  }

  public IntegrationRequestPatch partnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    return this;
  }

   /**
   * Get partnerAccessTokenExpiry
   * @return partnerAccessTokenExpiry
  **/
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  public IntegrationRequestPatch partnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    return this;
  }

   /**
   * Get partnerRefreshTokenExpiry
   * @return partnerRefreshTokenExpiry
  **/
  public BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  public IntegrationRequestPatch scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  public String getScopes() {
    return scopes;
  }

  public void setScopes(String scopes) {
    this.scopes = scopes;
  }

  public IntegrationRequestPatch additionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
    return this;
  }

   /**
   * Get additionalId1
   * @return additionalId1
  **/
  public String getAdditionalId1() {
    return additionalId1;
  }

  public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

  public IntegrationRequestPatch partnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
  }

   /**
   * Get partnerMetadata
   * @return partnerMetadata
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

