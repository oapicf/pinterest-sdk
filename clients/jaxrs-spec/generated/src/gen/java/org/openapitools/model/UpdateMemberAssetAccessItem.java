package org.openapitools.model;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("UpdateMemberAssetAccessItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UpdateMemberAssetAccessItem   {
  private String assetId;
  private String memberId;
  private @Valid List<Permissions> permissions = new ArrayList<>();

  public UpdateMemberAssetAccessItem() {
  }

  @JsonCreator
  public UpdateMemberAssetAccessItem(
    @JsonProperty(required = true, value = "asset_id") String assetId,
    @JsonProperty(required = true, value = "member_id") String memberId,
    @JsonProperty(required = true, value = "permissions") List<Permissions> permissions
  ) {
    this.assetId = assetId;
    this.memberId = memberId;
    this.permissions = permissions;
  }

  /**
   * Id of the asset to update.
   **/
  public UpdateMemberAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Id of the asset to update.")
  @JsonProperty(required = true, value = "asset_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=25)public String getAssetId() {
    return assetId;
  }

  @JsonProperty(required = true, value = "asset_id")
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Unique identifier of the member on which to perform the update
   **/
  public UpdateMemberAssetAccessItem memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of the member on which to perform the update")
  @JsonProperty(required = true, value = "member_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=25)public String getMemberId() {
    return memberId;
  }

  @JsonProperty(required = true, value = "member_id")
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  /**
   * A non-empty array of permissions to assign to the member.
   **/
  public UpdateMemberAssetAccessItem permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A non-empty array of permissions to assign to the member.")
  @JsonProperty(required = true, value = "permissions")
  @NotNull  @Size(min=1,max=50)public List<Permissions> getPermissions() {
    return permissions;
  }

  @JsonProperty(required = true, value = "permissions")
  public void setPermissions(List<Permissions> permissions) {
    this.permissions = permissions;
  }

  public UpdateMemberAssetAccessItem addPermissionsItem(Permissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }

    this.permissions.add(permissionsItem);
    return this;
  }

  public UpdateMemberAssetAccessItem removePermissionsItem(Permissions permissionsItem) {
    if (permissionsItem != null && this.permissions != null) {
      this.permissions.remove(permissionsItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
