package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The terminated asset access.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The terminated asset access.")
public class DeletePartnerAssetAccessResult   {
  
  private String assetId;

  private String assetType;

  private Boolean isSharedPartner;

  private String partnerId;

  private List<String> permissions = new ArrayList<>();

  /**
   * Unique identifier of a business asset.
   **/
  public DeletePartnerAssetAccessResult assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of a business asset.")
  @JsonProperty("asset_id")
 @Pattern(regexp="^\\d+$")  public String getAssetId() {
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
   * If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset. If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset.
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
 @Pattern(regexp="^\\d+$")  public String getPartnerId() {
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

  public DeletePartnerAssetAccessResult addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
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
    DeletePartnerAssetAccessResult deletePartnerAssetAccessResult = (DeletePartnerAssetAccessResult) o;
    return Objects.equals(this.assetId, deletePartnerAssetAccessResult.assetId) &&
        Objects.equals(this.assetType, deletePartnerAssetAccessResult.assetType) &&
        Objects.equals(this.isSharedPartner, deletePartnerAssetAccessResult.isSharedPartner) &&
        Objects.equals(this.partnerId, deletePartnerAssetAccessResult.partnerId) &&
        Objects.equals(this.permissions, deletePartnerAssetAccessResult.permissions);
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

