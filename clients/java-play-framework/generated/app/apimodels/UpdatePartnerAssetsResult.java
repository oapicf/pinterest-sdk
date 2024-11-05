package apimodels;

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
 * An object containing the permissions a business partner has on the asset.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdatePartnerAssetsResult   {
  @JsonProperty("asset_id")
  @Pattern(regexp="^\\d+$")

  private String assetId;

  @JsonProperty("asset_type")
  
  private String assetType;

  @JsonProperty("partner_id")
  @Pattern(regexp="^\\d+$")

  private String partnerId;

  @JsonProperty("permissions")
  
  private List<String> permissions = null;

  public UpdatePartnerAssetsResult assetId(String assetId) {
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

  public UpdatePartnerAssetsResult assetType(String assetType) {
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

  public UpdatePartnerAssetsResult partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Unique identifier of a business partner.
   * @return partnerId
  **/
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public UpdatePartnerAssetsResult permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UpdatePartnerAssetsResult addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Permission levels member or partner has on an asset.
   * @return permissions
  **/
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
    return Objects.equals(assetId, updatePartnerAssetsResult.assetId) &&
        Objects.equals(assetType, updatePartnerAssetsResult.assetType) &&
        Objects.equals(partnerId, updatePartnerAssetsResult.partnerId) &&
        Objects.equals(permissions, updatePartnerAssetsResult.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, partnerId, permissions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

