package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * The terminated asset access.
 **/
@ApiModel(description="The terminated asset access.")

public class DeletePartnerAssetsResult  {
  
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
 /**
   * Unique identifier of a business asset.
  **/
  private String assetId;

  @ApiModelProperty(example = "AD_ACCOUNT", value = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
 /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
  **/
  private String assetType;

  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
 /**
   * Permission levels member or partner has on an asset.
  **/
  private List<String> permissions = new ArrayList<>();

  @ApiModelProperty(example = "false", value = "If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.")
 /**
   * If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
  **/
  private Boolean isSharedPartner;

  @ApiModelProperty(example = "140943737684417", value = "Unique identifier of a business partner.")
 /**
   * Unique identifier of a business partner.
  **/
  private String partnerId;
 /**
   * Unique identifier of a business asset.
   * @return assetId
  **/
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public DeletePartnerAssetsResult assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   * @return assetType
  **/
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public DeletePartnerAssetsResult assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

 /**
   * Permission levels member or partner has on an asset.
   * @return permissions
  **/
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public DeletePartnerAssetsResult permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public DeletePartnerAssetsResult addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

 /**
   * If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset.
   * @return isSharedPartner
  **/
  @JsonProperty("is_shared_partner")
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }

  public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
  }

  public DeletePartnerAssetsResult isSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
    return this;
  }

 /**
   * Unique identifier of a business partner.
   * @return partnerId
  **/
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public DeletePartnerAssetsResult partnerId(String partnerId) {
    this.partnerId = partnerId;
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
    DeletePartnerAssetsResult deletePartnerAssetsResult = (DeletePartnerAssetsResult) o;
    return Objects.equals(this.assetId, deletePartnerAssetsResult.assetId) &&
        Objects.equals(this.assetType, deletePartnerAssetsResult.assetType) &&
        Objects.equals(this.permissions, deletePartnerAssetsResult.permissions) &&
        Objects.equals(this.isSharedPartner, deletePartnerAssetsResult.isSharedPartner) &&
        Objects.equals(this.partnerId, deletePartnerAssetsResult.partnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, permissions, isSharedPartner, partnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetsResult {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    isSharedPartner: ").append(toIndentedString(isSharedPartner)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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

