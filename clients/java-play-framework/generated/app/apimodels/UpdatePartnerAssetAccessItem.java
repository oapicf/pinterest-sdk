package apimodels;

import apimodels.Permissions;
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
 * UpdatePartnerAssetAccessItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdatePartnerAssetAccessItem   {
  @JsonProperty("asset_id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=25)

  private String assetId;

  @JsonProperty("partner_id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=25)

  private String partnerId;

  @JsonProperty("permissions")
  @NotNull
@Size(min=1,max=50)
@Valid

  private List<Permissions> permissions = new ArrayList<>();

  public UpdatePartnerAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Unique identifier of the business asset.
   * @return assetId
  **/
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public UpdatePartnerAssetAccessItem partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Unique identifier of a business partner to update asset access to.
   * @return partnerId
  **/
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public UpdatePartnerAssetAccessItem permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UpdatePartnerAssetAccessItem addPermissionsItem(Permissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * A non-empty array of permissions to assign to the partner.
   * @return permissions
  **/
  public List<Permissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permissions> permissions) {
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
    UpdatePartnerAssetAccessItem updatePartnerAssetAccessItem = (UpdatePartnerAssetAccessItem) o;
    return Objects.equals(assetId, updatePartnerAssetAccessItem.assetId) &&
        Objects.equals(partnerId, updatePartnerAssetAccessItem.partnerId) &&
        Objects.equals(permissions, updatePartnerAssetAccessItem.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, partnerId, permissions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetAccessItem {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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

