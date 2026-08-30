package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.InviteType;
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

/**
 * Object declaring an asset role update to an invite.
 **/
@ApiModel(description = "Object declaring an asset role update to an invite.")
@JsonTypeName("CreateAssetInvitesRequestItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CreateAssetInvitesRequestItem   {
  private @Valid Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();
  private String inviteId;
  private InviteType inviteType;

  public CreateAssetInvitesRequestItem() {
  }

  @JsonCreator
  public CreateAssetInvitesRequestItem(
    @JsonProperty(required = true, value = "asset_id_to_permissions") Map<String, List<Permissions>> assetIdToPermissions,
    @JsonProperty(required = true, value = "invite_id") String inviteId,
    @JsonProperty(required = true, value = "invite_type") InviteType inviteType
  ) {
    this.assetIdToPermissions = assetIdToPermissions;
    this.inviteId = inviteId;
    this.inviteType = inviteType;
  }

  /**
   * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
   **/
  public CreateAssetInvitesRequestItem assetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
    return this;
  }

  
  @ApiModelProperty(example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", required = true, value = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.")
  @JsonProperty(required = true, value = "asset_id_to_permissions")
  @NotNull @Valid public Map<String, List<Permissions>> getAssetIdToPermissions() {
    return assetIdToPermissions;
  }

  @JsonProperty(required = true, value = "asset_id_to_permissions")
  public void setAssetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
  }

  public CreateAssetInvitesRequestItem putAssetIdToPermissionsItem(String key, List<Permissions> assetIdToPermissionsItem) {
    if (this.assetIdToPermissions == null) {
      this.assetIdToPermissions = new HashMap<>();
    }

    this.assetIdToPermissions.put(key, assetIdToPermissionsItem);
    return this;
  }

  public CreateAssetInvitesRequestItem removeAssetIdToPermissionsItem(String key) {
    if (this.assetIdToPermissions != null) {
      this.assetIdToPermissions.remove(key);
    }

    return this;
  }
  /**
   * Unique identifier of an invite.
   **/
  public CreateAssetInvitesRequestItem inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890123", required = true, value = "Unique identifier of an invite.")
  @JsonProperty(required = true, value = "invite_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getInviteId() {
    return inviteId;
  }

  @JsonProperty(required = true, value = "invite_id")
  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  /**
   **/
  public CreateAssetInvitesRequestItem inviteType(InviteType inviteType) {
    this.inviteType = inviteType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "invite_type")
  @NotNull public InviteType getInviteType() {
    return inviteType;
  }

  @JsonProperty(required = true, value = "invite_type")
  public void setInviteType(InviteType inviteType) {
    this.inviteType = inviteType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetInvitesRequestItem createAssetInvitesRequestItem = (CreateAssetInvitesRequestItem) o;
    return Objects.equals(this.assetIdToPermissions, createAssetInvitesRequestItem.assetIdToPermissions) &&
        Objects.equals(this.inviteId, createAssetInvitesRequestItem.inviteId) &&
        Objects.equals(this.inviteType, createAssetInvitesRequestItem.inviteType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIdToPermissions, inviteId, inviteType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetInvitesRequestItem {\n");
    
    sb.append("    assetIdToPermissions: ").append(toIndentedString(assetIdToPermissions)).append("\n");
    sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
    sb.append("    inviteType: ").append(toIndentedString(inviteType)).append("\n");
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
