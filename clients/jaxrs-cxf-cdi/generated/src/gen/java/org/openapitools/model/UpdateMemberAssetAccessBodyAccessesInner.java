package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class UpdateMemberAssetAccessBodyAccessesInner   {
  
  private String assetId;

  private String memberId;

  private List<Permissions> permissions = new ArrayList<>();

  /**
   * Id of the asset to update.
   **/
  public UpdateMemberAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "Id of the asset to update.")
  @JsonProperty("asset_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  /**
   * Unique identifier of the member on which to perform the update
   **/
  public UpdateMemberAssetAccessBodyAccessesInner memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  
  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member on which to perform the update")
  @JsonProperty("member_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getMemberId() {
    return memberId;
  }
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  /**
   * A non-empty array of permissions to assign to the member.
   **/
  public UpdateMemberAssetAccessBodyAccessesInner permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(example = "[\"ANALYST\",\"ADMIN\"]", required = true, value = "A non-empty array of permissions to assign to the member.")
  @JsonProperty("permissions")
  @NotNull
 @Size(min=1,max=50)  public List<Permissions> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<Permissions> permissions) {
    this.permissions = permissions;
  }

  public UpdateMemberAssetAccessBodyAccessesInner addPermissionsItem(Permissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

