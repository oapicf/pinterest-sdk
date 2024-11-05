package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AssetGroupBinding;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * An object containing the permissions a you/your business partner has on the asset.
 */
@ApiModel(description = "An object containing the permissions a you/your business partner has on the asset.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GetPartnerAssetsResponse   {
  @JsonProperty("asset_id")
  private String assetId;

  @JsonProperty("asset_type")
  private String assetType;

  @JsonProperty("permissions")
  
  private List<String> permissions = null;

  @JsonProperty("asset_group_info")
  private AssetGroupBinding assetGroupInfo;

  public GetPartnerAssetsResponse assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Unique identifier of a business asset.
   * @return assetId
   */
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public GetPartnerAssetsResponse assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   * @return assetType
   */
  @ApiModelProperty(example = "AD_ACCOUNT", value = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public GetPartnerAssetsResponse permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public GetPartnerAssetsResponse addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
   * @return permissions
   */
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public GetPartnerAssetsResponse assetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
    return this;
  }

  /**
   * Get assetGroupInfo
   * @return assetGroupInfo
   */
  @ApiModelProperty(value = "")
  public AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }

  public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPartnerAssetsResponse getPartnerAssetsResponse = (GetPartnerAssetsResponse) o;
    return Objects.equals(this.assetId, getPartnerAssetsResponse.assetId) &&
        Objects.equals(this.assetType, getPartnerAssetsResponse.assetType) &&
        Objects.equals(this.permissions, getPartnerAssetsResponse.permissions) &&
        Objects.equals(this.assetGroupInfo, getPartnerAssetsResponse.assetGroupInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, permissions, assetGroupInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPartnerAssetsResponse {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    assetGroupInfo: ").append(toIndentedString(assetGroupInfo)).append("\n");
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

