package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

@ApiModel(description="Object declaring an asset role update to an invite.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetInvitesRequestItem   {
  
  private String inviteId;
  private InviteType inviteType;
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();

  /**
   * Unique identifier of an invite.
   **/
  
  @ApiModelProperty(example = "1234567890123", required = true, value = "Unique identifier of an invite.")
  @JsonProperty("invite_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getInviteId() {
    return inviteId;
  }
  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("invite_type")
  @NotNull
  @Valid
  public InviteType getInviteType() {
    return inviteType;
  }
  public void setInviteType(InviteType inviteType) {
    this.inviteType = inviteType;
  }

  /**
   * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
   **/
  
  @ApiModelProperty(example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", required = true, value = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. ")
  @JsonProperty("asset_id_to_permissions")
  @NotNull
 @Size(min=1)  @Valid
  public Map<String, List<Permissions>> getAssetIdToPermissions() {
    return assetIdToPermissions;
  }
  public void setAssetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

