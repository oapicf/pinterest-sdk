package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * The terminated asset access.
 **/

@ApiModel(description = "The terminated asset access.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeletePartnerAssetAccessResult   {
  @JsonProperty("asset_id")
  private String assetId;

  @JsonProperty("asset_type")
  private String assetType;

  @JsonProperty("is_shared_partner")
  private Boolean isSharedPartner;

  @JsonProperty("partner_id")
  private String partnerId;

  @JsonProperty("permissions")
  private List<String> permissions = null;

  /**
   * Unique identifier of a business asset.
   **/
  public DeletePartnerAssetAccessResult assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of a business asset.")
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
   **/
  public DeletePartnerAssetAccessResult assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.")
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }
  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  /**
   * If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
   **/
  public DeletePartnerAssetAccessResult isSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
    return this;
  }

  
  @ApiModelProperty(value = "If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.")
  @JsonProperty("is_shared_partner")
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }
  public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
  }

  /**
   * Unique identifier of a business partner.
   **/
  public DeletePartnerAssetAccessResult partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of a business partner.")
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * Permission levels member or partner has on an asset.
   **/
  public DeletePartnerAssetAccessResult permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePartnerAssetAccessResult deletePartnerAssetAccessResult = (DeletePartnerAssetAccessResult) o;
    return Objects.equals(assetId, deletePartnerAssetAccessResult.assetId) &&
        Objects.equals(assetType, deletePartnerAssetAccessResult.assetType) &&
        Objects.equals(isSharedPartner, deletePartnerAssetAccessResult.isSharedPartner) &&
        Objects.equals(partnerId, deletePartnerAssetAccessResult.partnerId) &&
        Objects.equals(permissions, deletePartnerAssetAccessResult.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, isSharedPartner, partnerId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessResult {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    isSharedPartner: ").append(toIndentedString(isSharedPartner)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

