package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateMemberAssetAccessItem  {
  
 /**
  * Id of the asset to update.
  */
  @ApiModelProperty(required = true, value = "Id of the asset to update.")

  private String assetId;

 /**
  * Unique identifier of the member on which to perform the update
  */
  @ApiModelProperty(required = true, value = "Unique identifier of the member on which to perform the update")

  private String memberId;

 /**
  * A non-empty array of permissions to assign to the member.
  */
  @ApiModelProperty(required = true, value = "A non-empty array of permissions to assign to the member.")

  private List<Permissions> permissions = new ArrayList<>();
 /**
   * Id of the asset to update.
   * @return assetId
  **/
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public UpdateMemberAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
   * Unique identifier of the member on which to perform the update
   * @return memberId
  **/
  @JsonProperty("member_id")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public UpdateMemberAssetAccessItem memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

 /**
   * A non-empty array of permissions to assign to the member.
   * @return permissions
  **/
  @JsonProperty("permissions")
  public List<Permissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permissions> permissions) {
    this.permissions = permissions;
  }

  public UpdateMemberAssetAccessItem permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UpdateMemberAssetAccessItem addPermissionsItem(Permissions permissionsItem) {
    this.permissions.add(permissionsItem);
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
    UpdateMemberAssetAccessItem updateMemberAssetAccessItem = (UpdateMemberAssetAccessItem) o;
    return Objects.equals(this.assetId, updateMemberAssetAccessItem.assetId) &&
        Objects.equals(this.memberId, updateMemberAssetAccessItem.memberId) &&
        Objects.equals(this.permissions, updateMemberAssetAccessItem.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetAccessItem {\n");
    
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

