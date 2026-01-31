package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Integration metadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class IntegrationMetadata   {
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
  @Valid

  private BigDecimal createdTimestamp;

  @JsonProperty("external_business_id")
  
  private String externalBusinessId;

  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("partner_access_token_expiry")
  @Valid

  private BigDecimal partnerAccessTokenExpiry;

  @JsonProperty("partner_metadata")
  
  private String partnerMetadata;

  @JsonProperty("partner_refresh_token_expiry")
  @Valid

  private BigDecimal partnerRefreshTokenExpiry;

  @JsonProperty("scopes")
  
  private String scopes;

  @JsonProperty("updated_timestamp")
  @Valid

  private BigDecimal updatedTimestamp;

  public IntegrationMetadata additionalId1(String additionalId1) {
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

  public IntegrationMetadata connectedAdvertiserId(String connectedAdvertiserId) {
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

  public IntegrationMetadata connectedLbaId(String connectedLbaId) {
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

  public IntegrationMetadata connectedMerchantId(String connectedMerchantId) {
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

  public IntegrationMetadata connectedTagId(String connectedTagId) {
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

  public IntegrationMetadata connectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
    return this;
  }

   /**
   * Get connectedUserId
   * @return connectedUserId
  **/
  public String getConnectedUserId() {
    return connectedUserId;
  }

  public void setConnectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

  public IntegrationMetadata createdTimestamp(BigDecimal createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * Get createdTimestamp
   * @return createdTimestamp
  **/
  public BigDecimal getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(BigDecimal createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  public IntegrationMetadata externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

   /**
   * Get externalBusinessId
   * @return externalBusinessId
  **/
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  public IntegrationMetadata id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IntegrationMetadata partnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
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

  public IntegrationMetadata partnerMetadata(String partnerMetadata) {
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

  public IntegrationMetadata partnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
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

  public IntegrationMetadata scopes(String scopes) {
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

  public IntegrationMetadata updatedTimestamp(BigDecimal updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

   /**
   * Get updatedTimestamp
   * @return updatedTimestamp
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

