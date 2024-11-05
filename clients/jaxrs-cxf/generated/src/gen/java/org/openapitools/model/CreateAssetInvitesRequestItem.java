package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.InviteType;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Object declaring an asset role update to an invite.
 **/
@ApiModel(description="Object declaring an asset role update to an invite.")

public class CreateAssetInvitesRequestItem  {
  
  @ApiModelProperty(example = "1234567890123", required = true, value = "Unique identifier of an invite.")
 /**
   * Unique identifier of an invite.
  **/
  private String inviteId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private InviteType inviteType;

  @ApiModelProperty(example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", required = true, value = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. ")
  @Valid
 /**
   * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  **/
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();
 /**
   * Unique identifier of an invite.
   * @return inviteId
  **/
  @JsonProperty("invite_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public CreateAssetInvitesRequestItem inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

 /**
   * Get inviteType
   * @return inviteType
  **/
  @JsonProperty("invite_type")
  @NotNull
  public InviteType getInviteType() {
    return inviteType;
  }

  public void setInviteType(InviteType inviteType) {
    this.inviteType = inviteType;
  }

  public CreateAssetInvitesRequestItem inviteType(InviteType inviteType) {
    this.inviteType = inviteType;
    return this;
  }

 /**
   * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
   * @return assetIdToPermissions
  **/
  @JsonProperty("asset_id_to_permissions")
  @NotNull
 @Size(min=1)  public Map<String, List<Permissions>> getAssetIdToPermissions() {
    return assetIdToPermissions;
  }

  public void setAssetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
  }

  public CreateAssetInvitesRequestItem assetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
    return this;
  }

  public CreateAssetInvitesRequestItem putAssetIdToPermissionsItem(String key, List<Permissions> assetIdToPermissionsItem) {
    this.assetIdToPermissions.put(key, assetIdToPermissionsItem);
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
    CreateAssetInvitesRequestItem createAssetInvitesRequestItem = (CreateAssetInvitesRequestItem) o;
    return Objects.equals(this.inviteId, createAssetInvitesRequestItem.inviteId) &&
        Objects.equals(this.inviteType, createAssetInvitesRequestItem.inviteType) &&
        Objects.equals(this.assetIdToPermissions, createAssetInvitesRequestItem.assetIdToPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteId, inviteType, assetIdToPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetInvitesRequestItem {\n");
    
    sb.append("    inviteId: ").append(toIndentedString(inviteId)).append("\n");
    sb.append("    inviteType: ").append(toIndentedString(inviteType)).append("\n");
    sb.append("    assetIdToPermissions: ").append(toIndentedString(assetIdToPermissions)).append("\n");
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

