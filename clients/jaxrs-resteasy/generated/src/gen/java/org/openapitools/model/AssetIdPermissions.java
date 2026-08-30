package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetTypeResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="An object containing the permissions a business member has on the asset.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetIdPermissions   {
  
  private AssetGroupBinding assetGroupInfo;
  private String assetId;
  private AssetTypeResponse assetType;
  private List<String> permissions = new ArrayList<>();

  /**
   * An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;.
   **/
  
  @ApiModelProperty(value = "An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'.")
  @JsonProperty("asset_group_info")
  @Valid
  public AssetGroupBinding getAssetGroupInfo() {
    return assetGroupInfo;
  }
  public void setAssetGroupInfo(AssetGroupBinding assetGroupInfo) {
    this.assetGroupInfo = assetGroupInfo;
  }

  /**
   * Unique identifier of a business asset.
   **/
  
  @ApiModelProperty(example = "549755885175", required = true, value = "Unique identifier of a business asset.")
  @JsonProperty("asset_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(min=1,max=20)  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("asset_type")
  @NotNull
  @Valid
  public AssetTypeResponse getAssetType() {
    return assetType;
  }
  public void setAssetType(AssetTypeResponse assetType) {
    this.assetType = assetType;
  }

  /**
   * Permission levels member or partner has on an asset.
   **/
  
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", required = true, value = "Permission levels member or partner has on an asset.")
  @JsonProperty("permissions")
  @NotNull
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
    AssetIdPermissions assetIdPermissions = (AssetIdPermissions) o;
    return Objects.equals(this.assetGroupInfo, assetIdPermissions.assetGroupInfo) &&
        Objects.equals(this.assetId, assetIdPermissions.assetId) &&
        Objects.equals(this.assetType, assetIdPermissions.assetType) &&
        Objects.equals(this.permissions, assetIdPermissions.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupInfo, assetId, assetType, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetIdPermissions {\n");
    
    sb.append("    assetGroupInfo: ").append(toIndentedString(assetGroupInfo)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
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

