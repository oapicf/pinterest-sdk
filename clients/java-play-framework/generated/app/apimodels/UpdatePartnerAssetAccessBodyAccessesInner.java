package apimodels;

import apimodels.Permissions;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * UpdatePartnerAssetAccessBodyAccessesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdatePartnerAssetAccessBodyAccessesInner   {
  @JsonProperty("partner_id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=25)

  private String partnerId;

  @JsonProperty("asset_id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=25)

  private String assetId;

  @JsonProperty("permissions")
  @NotNull
@Size(min=1,max=50)
@Valid

  private List<Permissions> permissions = new ArrayList<>();

  public UpdatePartnerAssetAccessBodyAccessesInner partnerId(String partnerId) {
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

  public UpdatePartnerAssetAccessBodyAccessesInner assetId(String assetId) {
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

  public UpdatePartnerAssetAccessBodyAccessesInner permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UpdatePartnerAssetAccessBodyAccessesInner addPermissionsItem(Permissions permissionsItem) {
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
    UpdatePartnerAssetAccessBodyAccessesInner updatePartnerAssetAccessBodyAccessesInner = (UpdatePartnerAssetAccessBodyAccessesInner) o;
    return Objects.equals(partnerId, updatePartnerAssetAccessBodyAccessesInner.partnerId) &&
        Objects.equals(assetId, updatePartnerAssetAccessBodyAccessesInner.assetId) &&
        Objects.equals(permissions, updatePartnerAssetAccessBodyAccessesInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, assetId, permissions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetAccessBodyAccessesInner {\n");
    
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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

