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
 * The terminated asset access.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeletePartnerAssetsResult   {
  @JsonProperty("asset_id")
  @Pattern(regexp="^\\d+$")

  private String assetId;

  @JsonProperty("asset_type")
  
  private String assetType;

  @JsonProperty("permissions")
  
  private List<String> permissions = null;

  @JsonProperty("is_shared_partner")
  
  private Boolean isSharedPartner;

  @JsonProperty("partner_id")
  @Pattern(regexp="^\\d+$")

  private String partnerId;

  public DeletePartnerAssetsResult assetId(String assetId) {
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

  public DeletePartnerAssetsResult assetType(String assetType) {
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

  public DeletePartnerAssetsResult permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public DeletePartnerAssetsResult addPermissionsItem(String permissionsItem) {
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

  public DeletePartnerAssetsResult isSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
    return this;
  }

   /**
   * If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
   * @return isSharedPartner
  **/
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }

  public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
  }

  public DeletePartnerAssetsResult partnerId(String partnerId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePartnerAssetsResult deletePartnerAssetsResult = (DeletePartnerAssetsResult) o;
    return Objects.equals(assetId, deletePartnerAssetsResult.assetId) &&
        Objects.equals(assetType, deletePartnerAssetsResult.assetType) &&
        Objects.equals(permissions, deletePartnerAssetsResult.permissions) &&
        Objects.equals(isSharedPartner, deletePartnerAssetsResult.isSharedPartner) &&
        Objects.equals(partnerId, deletePartnerAssetsResult.partnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, permissions, isSharedPartner, partnerId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

