package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An object containing the permissions a business partner has on the asset.
 **/
@ApiModel(description = "An object containing the permissions a business partner has on the asset.")
@JsonTypeName("UpdatePartnerAssetsResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdatePartnerAssetsResult   {
  private String assetId;
  private String assetType;
  private String partnerId;
  private @Valid List<String> permissions = new ArrayList<>();

  /**
   * Unique identifier of a business asset.
   **/
  public UpdatePartnerAssetsResult assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  @JsonProperty("asset_id")
   @Pattern(regexp="^\\d+$")public String getAssetId() {
    return assetId;
  }

  @JsonProperty("asset_id")
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   **/
  public UpdatePartnerAssetsResult assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  
  @ApiModelProperty(example = "AD_ACCOUNT", value = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }

  @JsonProperty("asset_type")
  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  /**
   * Unique identifier of a business partner.
   **/
  public UpdatePartnerAssetsResult partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  
  @ApiModelProperty(example = "140943737684417", value = "Unique identifier of a business partner.")
  @JsonProperty("partner_id")
   @Pattern(regexp="^\\d+$")public String getPartnerId() {
    return partnerId;
  }

  @JsonProperty("partner_id")
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * Permission levels member or partner has on an asset.
   **/
  public UpdatePartnerAssetsResult permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  @JsonProperty("permissions")
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public UpdatePartnerAssetsResult addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }

    this.permissions.add(permissionsItem);
    return this;
  }

  public UpdatePartnerAssetsResult removePermissionsItem(String permissionsItem) {
    if (permissionsItem != null && this.permissions != null) {
      this.permissions.remove(permissionsItem);
    }

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
    UpdatePartnerAssetsResult updatePartnerAssetsResult = (UpdatePartnerAssetsResult) o;
    return Objects.equals(this.assetId, updatePartnerAssetsResult.assetId) &&
        Objects.equals(this.assetType, updatePartnerAssetsResult.assetType) &&
        Objects.equals(this.partnerId, updatePartnerAssetsResult.partnerId) &&
        Objects.equals(this.permissions, updatePartnerAssetsResult.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, partnerId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetsResult {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

