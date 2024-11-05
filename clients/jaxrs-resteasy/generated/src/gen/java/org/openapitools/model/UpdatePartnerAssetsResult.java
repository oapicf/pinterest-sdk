package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="An object containing the permissions a business partner has on the asset.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdatePartnerAssetsResult   {
  
  private String assetId;
  private String assetType;
  private String partnerId;
  private List<String> permissions = new ArrayList<>();

  /**
   * Unique identifier of a business asset.
   **/
  
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  @JsonProperty("asset_id")
 @Pattern(regexp="^\\d+$")  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   **/
  
  @ApiModelProperty(example = "AD_ACCOUNT", value = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }
  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  /**
   * Unique identifier of a business partner.
   **/
  
  @ApiModelProperty(example = "140943737684417", value = "Unique identifier of a business partner.")
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

