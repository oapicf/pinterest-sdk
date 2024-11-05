package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The terminated asset access.
 */
@ApiModel(description="The terminated asset access.")

public class DeletePartnerAssetsResult  {
  
 /**
  * Unique identifier of a business asset.
  */
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  private String assetId;

 /**
  * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
  */
  @ApiModelProperty(example = "AD_ACCOUNT", value = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
  private String assetType;

 /**
  * Permission levels member or partner has on an asset.
  */
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
  private List<String> permissions = new ArrayList<>();

 /**
  * If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
  */
  @ApiModelProperty(example = "false", value = "If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.")
  private Boolean isSharedPartner;

 /**
  * Unique identifier of a business partner.
  */
  @ApiModelProperty(example = "140943737684417", value = "Unique identifier of a business partner.")
  private String partnerId;
 /**
  * Unique identifier of a business asset.
  * @return assetId
  */
  @JsonProperty("asset_id")
 @Pattern(regexp="^\\d+$")  public String getAssetId() {
    return assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
 public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
  public DeletePartnerAssetsResult assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
  * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
  * @return assetType
  */
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }

  /**
   * Sets the <code>assetType</code> property.
   */
 public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  /**
   * Sets the <code>assetType</code> property.
   */
  public DeletePartnerAssetsResult assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

 /**
  * Permission levels member or partner has on an asset.
  * @return permissions
  */
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
 public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
  public DeletePartnerAssetsResult permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Adds a new item to the <code>permissions</code> list.
   */
  public DeletePartnerAssetsResult addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

 /**
  * If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset.
  * @return isSharedPartner
  */
  @JsonProperty("is_shared_partner")
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }

  /**
   * Sets the <code>isSharedPartner</code> property.
   */
 public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
  }

  /**
   * Sets the <code>isSharedPartner</code> property.
   */
  public DeletePartnerAssetsResult isSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
    return this;
  }

 /**
  * Unique identifier of a business partner.
  * @return partnerId
  */
  @JsonProperty("partner_id")
 @Pattern(regexp="^\\d+$")  public String getPartnerId() {
    return partnerId;
  }

  /**
   * Sets the <code>partnerId</code> property.
   */
 public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * Sets the <code>partnerId</code> property.
   */
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

