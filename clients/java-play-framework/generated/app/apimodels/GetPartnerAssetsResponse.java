package apimodels;

import apimodels.AssetGroupBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An object containing the permissions a you/your business partner has on the asset.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetPartnerAssetsResponse   {
  @JsonProperty("asset_id")
  @Pattern(regexp="^\\d+$")
@Size(min=1,max=20)

  private String assetId;

  @JsonProperty("asset_type")
  
  private String assetType;

  @JsonProperty("permissions")
  
  private List<String> permissions = null;

  @JsonProperty("asset_group_info")
  @Valid

  private AssetGroupBinding assetGroupInfo;

  public GetPartnerAssetsResponse assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Unique identifier of a business asset.
   * @return assetId
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(assetId, getPartnerAssetsResponse.assetId) &&
        Objects.equals(assetType, getPartnerAssetsResponse.assetType) &&
        Objects.equals(permissions, getPartnerAssetsResponse.permissions) &&
        Objects.equals(assetGroupInfo, getPartnerAssetsResponse.assetGroupInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, permissions, assetGroupInfo);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

