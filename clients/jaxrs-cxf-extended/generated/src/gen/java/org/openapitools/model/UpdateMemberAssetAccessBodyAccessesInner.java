package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateMemberAssetAccessBodyAccessesInner  {
  
 /**
  * Id of the asset to update.
  */
  @ApiModelProperty(example = "549755885175", required = true, value = "Id of the asset to update.")
  private String assetId;

 /**
  * Unique identifier of the member on which to perform the update
  */
  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member on which to perform the update")
  private String memberId;

 /**
  * A non-empty array of permissions to assign to the member.
  */
  @ApiModelProperty(example = "[\"ANALYST\",\"ADMIN\"]", required = true, value = "A non-empty array of permissions to assign to the member.")
  @Valid
  private List<Permissions> permissions = new ArrayList<>();
 /**
  * Id of the asset to update.
  * @return assetId
  */
  @JsonProperty("asset_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getAssetId() {
    return assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
 public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
  public UpdateMemberAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
  * Unique identifier of the member on which to perform the update
  * @return memberId
  */
  @JsonProperty("member_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getMemberId() {
    return memberId;
  }

  /**
   * Sets the <code>memberId</code> property.
   */
 public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  /**
   * Sets the <code>memberId</code> property.
   */
  public UpdateMemberAssetAccessBodyAccessesInner memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

 /**
  * A non-empty array of permissions to assign to the member.
  * @return permissions
  */
  @JsonProperty("permissions")
  @NotNull
 @Size(min=1,max=50)  public List<Permissions> getPermissions() {
    return permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
 public void setPermissions(List<Permissions> permissions) {
    this.permissions = permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
  public UpdateMemberAssetAccessBodyAccessesInner permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Adds a new item to the <code>permissions</code> list.
   */
  public UpdateMemberAssetAccessBodyAccessesInner addPermissionsItem(Permissions permissionsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

