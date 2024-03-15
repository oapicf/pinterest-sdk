package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Integration metadata
 */
@ApiModel(description="Integration metadata")

public class IntegrationMetadata  {
  
  @ApiModelProperty(value = "")
  private String id;

  @ApiModelProperty(value = "")
  private String externalBusinessId;

  @ApiModelProperty(value = "")
  private String connectedMerchantId;

  @ApiModelProperty(value = "")
  private String connectedUserId;

  @ApiModelProperty(value = "")
  private String connectedAdvertiserId;

  @ApiModelProperty(value = "")
  private String connectedLbaId;

  @ApiModelProperty(value = "")
  private String connectedTagId;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal partnerAccessTokenExpiry;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal partnerRefreshTokenExpiry;

  @ApiModelProperty(value = "")
  private String scopes;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal createdTimestamp;

  @ApiModelProperty(value = "")
  @Valid
  private BigDecimal updatedTimestamp;

  @ApiModelProperty(value = "")
  private String additionalId1;

  @ApiModelProperty(value = "")
  private String partnerMetadata;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public IntegrationMetadata id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get externalBusinessId
  * @return externalBusinessId
  */
  @JsonProperty("external_business_id")
  public String getExternalBusinessId() {
    return externalBusinessId;
  }

  /**
   * Sets the <code>externalBusinessId</code> property.
   */
 public void setExternalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
  }

  /**
   * Sets the <code>externalBusinessId</code> property.
   */
  public IntegrationMetadata externalBusinessId(String externalBusinessId) {
    this.externalBusinessId = externalBusinessId;
    return this;
  }

 /**
  * Get connectedMerchantId
  * @return connectedMerchantId
  */
  @JsonProperty("connected_merchant_id")
  public String getConnectedMerchantId() {
    return connectedMerchantId;
  }

  /**
   * Sets the <code>connectedMerchantId</code> property.
   */
 public void setConnectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
  }

  /**
   * Sets the <code>connectedMerchantId</code> property.
   */
  public IntegrationMetadata connectedMerchantId(String connectedMerchantId) {
    this.connectedMerchantId = connectedMerchantId;
    return this;
  }

 /**
  * Get connectedUserId
  * @return connectedUserId
  */
  @JsonProperty("connected_user_id")
  public String getConnectedUserId() {
    return connectedUserId;
  }

  /**
   * Sets the <code>connectedUserId</code> property.
   * <br><em>N.B. <code>connectedUserId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setConnectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
  }

  /**
   * Sets the <code>connectedUserId</code> property.
   * <br><em>N.B. <code>connectedUserId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public IntegrationMetadata connectedUserId(String connectedUserId) {
    this.connectedUserId = connectedUserId;
    return this;
  }

 /**
  * Get connectedAdvertiserId
  * @return connectedAdvertiserId
  */
  @JsonProperty("connected_advertiser_id")
  public String getConnectedAdvertiserId() {
    return connectedAdvertiserId;
  }

  /**
   * Sets the <code>connectedAdvertiserId</code> property.
   * <br><em>N.B. <code>connectedAdvertiserId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setConnectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
  }

  /**
   * Sets the <code>connectedAdvertiserId</code> property.
   * <br><em>N.B. <code>connectedAdvertiserId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public IntegrationMetadata connectedAdvertiserId(String connectedAdvertiserId) {
    this.connectedAdvertiserId = connectedAdvertiserId;
    return this;
  }

 /**
  * Get connectedLbaId
  * @return connectedLbaId
  */
  @JsonProperty("connected_lba_id")
  public String getConnectedLbaId() {
    return connectedLbaId;
  }

  /**
   * Sets the <code>connectedLbaId</code> property.
   */
 public void setConnectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
  }

  /**
   * Sets the <code>connectedLbaId</code> property.
   */
  public IntegrationMetadata connectedLbaId(String connectedLbaId) {
    this.connectedLbaId = connectedLbaId;
    return this;
  }

 /**
  * Get connectedTagId
  * @return connectedTagId
  */
  @JsonProperty("connected_tag_id")
  public String getConnectedTagId() {
    return connectedTagId;
  }

  /**
   * Sets the <code>connectedTagId</code> property.
   */
 public void setConnectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
  }

  /**
   * Sets the <code>connectedTagId</code> property.
   */
  public IntegrationMetadata connectedTagId(String connectedTagId) {
    this.connectedTagId = connectedTagId;
    return this;
  }

 /**
  * Get partnerAccessTokenExpiry
  * @return partnerAccessTokenExpiry
  */
  @JsonProperty("partner_access_token_expiry")
  public BigDecimal getPartnerAccessTokenExpiry() {
    return partnerAccessTokenExpiry;
  }

  /**
   * Sets the <code>partnerAccessTokenExpiry</code> property.
   */
 public void setPartnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
  }

  /**
   * Sets the <code>partnerAccessTokenExpiry</code> property.
   */
  public IntegrationMetadata partnerAccessTokenExpiry(BigDecimal partnerAccessTokenExpiry) {
    this.partnerAccessTokenExpiry = partnerAccessTokenExpiry;
    return this;
  }

 /**
  * Get partnerRefreshTokenExpiry
  * @return partnerRefreshTokenExpiry
  */
  @JsonProperty("partner_refresh_token_expiry")
  public BigDecimal getPartnerRefreshTokenExpiry() {
    return partnerRefreshTokenExpiry;
  }

  /**
   * Sets the <code>partnerRefreshTokenExpiry</code> property.
   */
 public void setPartnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
  }

  /**
   * Sets the <code>partnerRefreshTokenExpiry</code> property.
   */
  public IntegrationMetadata partnerRefreshTokenExpiry(BigDecimal partnerRefreshTokenExpiry) {
    this.partnerRefreshTokenExpiry = partnerRefreshTokenExpiry;
    return this;
  }

 /**
  * Get scopes
  * @return scopes
  */
  @JsonProperty("scopes")
  public String getScopes() {
    return scopes;
  }

  /**
   * Sets the <code>scopes</code> property.
   */
 public void setScopes(String scopes) {
    this.scopes = scopes;
  }

  /**
   * Sets the <code>scopes</code> property.
   */
  public IntegrationMetadata scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

 /**
  * Get createdTimestamp
  * @return createdTimestamp
  */
  @JsonProperty("created_timestamp")
  public BigDecimal getCreatedTimestamp() {
    return createdTimestamp;
  }

  /**
   * Sets the <code>createdTimestamp</code> property.
   */
 public void setCreatedTimestamp(BigDecimal createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  /**
   * Sets the <code>createdTimestamp</code> property.
   */
  public IntegrationMetadata createdTimestamp(BigDecimal createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

 /**
  * Get updatedTimestamp
  * @return updatedTimestamp
  */
  @JsonProperty("updated_timestamp")
  public BigDecimal getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  /**
   * Sets the <code>updatedTimestamp</code> property.
   */
 public void setUpdatedTimestamp(BigDecimal updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
  }

  /**
   * Sets the <code>updatedTimestamp</code> property.
   */
  public IntegrationMetadata updatedTimestamp(BigDecimal updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

 /**
  * Get additionalId1
  * @return additionalId1
  */
  @JsonProperty("additional_id_1")
  public String getAdditionalId1() {
    return additionalId1;
  }

  /**
   * Sets the <code>additionalId1</code> property.
   */
 public void setAdditionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
  }

  /**
   * Sets the <code>additionalId1</code> property.
   */
  public IntegrationMetadata additionalId1(String additionalId1) {
    this.additionalId1 = additionalId1;
    return this;
  }

 /**
  * Get partnerMetadata
  * @return partnerMetadata
  */
  @JsonProperty("partner_metadata")
  public String getPartnerMetadata() {
    return partnerMetadata;
  }

  /**
   * Sets the <code>partnerMetadata</code> property.
   */
 public void setPartnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
  }

  /**
   * Sets the <code>partnerMetadata</code> property.
   */
  public IntegrationMetadata partnerMetadata(String partnerMetadata) {
    this.partnerMetadata = partnerMetadata;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

