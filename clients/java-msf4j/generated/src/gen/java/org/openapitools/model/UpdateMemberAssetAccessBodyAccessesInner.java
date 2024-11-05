package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;

/**
 * UpdateMemberAssetAccessBodyAccessesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateMemberAssetAccessBodyAccessesInner   {
  @JsonProperty("asset_id")
  private String assetId;

  @JsonProperty("member_id")
  private String memberId;

  @JsonProperty("permissions")
  private List<Permissions> permissions = new ArrayList<>();

  public UpdateMemberAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Id of the asset to update.
   * @return assetId
  **/
  @ApiModelProperty(example = "549755885175", required = true, value = "Id of the asset to update.")
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
  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member on which to perform the update")
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
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * A non-empty array of permissions to assign to the member.
   * @return permissions
  **/
  @ApiModelProperty(example = "[\"ANALYST\",\"ADMIN\"]", required = true, value = "A non-empty array of permissions to assign to the member.")
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
    return Objects.equals(this.assetId, updateMemberAssetAccessBodyAccessesInner.assetId) &&
        Objects.equals(this.memberId, updateMemberAssetAccessBodyAccessesInner.memberId) &&
        Objects.equals(this.permissions, updateMemberAssetAccessBodyAccessesInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId, permissions);
  }

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

