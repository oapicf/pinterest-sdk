/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.Permissions;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class UpdateMemberAssetAccessBodyAccessesInner {
  
  @SerializedName("asset_id")
  private String assetId = null;
  @SerializedName("member_id")
  private String memberId = null;
  @SerializedName("permissions")
  private List<Permissions> permissions = null;

  /**
   * Id of the asset to update.
   **/
  @ApiModelProperty(required = true, value = "Id of the asset to update.")
  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Unique identifier of the member on which to perform the update
   **/
  @ApiModelProperty(required = true, value = "Unique identifier of the member on which to perform the update")
  public String getMemberId() {
    return memberId;
  }
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  /**
   * A non-empty array of permissions to assign to the member.
   **/
  @ApiModelProperty(required = true, value = "A non-empty array of permissions to assign to the member.")
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
    return (this.assetId == null ? updateMemberAssetAccessBodyAccessesInner.assetId == null : this.assetId.equals(updateMemberAssetAccessBodyAccessesInner.assetId)) &&
        (this.memberId == null ? updateMemberAssetAccessBodyAccessesInner.memberId == null : this.memberId.equals(updateMemberAssetAccessBodyAccessesInner.memberId)) &&
        (this.permissions == null ? updateMemberAssetAccessBodyAccessesInner.permissions == null : this.permissions.equals(updateMemberAssetAccessBodyAccessesInner.permissions));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.assetId == null ? 0: this.assetId.hashCode());
    result = 31 * result + (this.memberId == null ? 0: this.memberId.hashCode());
    result = 31 * result + (this.permissions == null ? 0: this.permissions.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetAccessBodyAccessesInner {\n");
    
    sb.append("  assetId: ").append(assetId).append("\n");
    sb.append("  memberId: ").append(memberId).append("\n");
    sb.append("  permissions: ").append(permissions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
