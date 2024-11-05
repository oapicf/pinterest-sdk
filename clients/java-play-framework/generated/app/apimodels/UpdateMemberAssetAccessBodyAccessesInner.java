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
 * UpdateMemberAssetAccessBodyAccessesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateMemberAssetAccessBodyAccessesInner   {
  @JsonProperty("asset_id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=25)

  private String assetId;

  @JsonProperty("member_id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=25)

  private String memberId;

  @JsonProperty("permissions")
  @NotNull
@Size(min=1,max=50)
@Valid

  private List<Permissions> permissions = new ArrayList<>();

  public UpdateMemberAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Id of the asset to update.
   * @return assetId
  **/
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public UpdateMemberAssetAccessBodyAccessesInner memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Unique identifier of the member on which to perform the update
   * @return memberId
  **/
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public UpdateMemberAssetAccessBodyAccessesInner permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UpdateMemberAssetAccessBodyAccessesInner addPermissionsItem(Permissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * A non-empty array of permissions to assign to the member.
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
    UpdateMemberAssetAccessBodyAccessesInner updateMemberAssetAccessBodyAccessesInner = (UpdateMemberAssetAccessBodyAccessesInner) o;
    return Objects.equals(assetId, updateMemberAssetAccessBodyAccessesInner.assetId) &&
        Objects.equals(memberId, updateMemberAssetAccessBodyAccessesInner.memberId) &&
        Objects.equals(permissions, updateMemberAssetAccessBodyAccessesInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId, permissions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetAccessBodyAccessesInner {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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

