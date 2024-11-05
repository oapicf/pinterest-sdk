package org.openapitools.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Permissions;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AuthRespondInvitesBodyInvitesInnerAction  {
  
  @ApiModelProperty(required = true, value = "Whether the invite/request is accepted.")
 /**
   * Whether the invite/request is accepted.
  **/
  private Boolean acceptInvite;

  @ApiModelProperty(example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", value = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. ")
 /**
   * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  **/
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();
 /**
   * Whether the invite/request is accepted.
   * @return acceptInvite
  **/
  @JsonProperty("accept_invite")
  public Boolean getAcceptInvite() {
    return acceptInvite;
  }

  public void setAcceptInvite(Boolean acceptInvite) {
    this.acceptInvite = acceptInvite;
  }

  public AuthRespondInvitesBodyInvitesInnerAction acceptInvite(Boolean acceptInvite) {
    this.acceptInvite = acceptInvite;
    return this;
  }

 /**
   * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
   * @return assetIdToPermissions
  **/
  @JsonProperty("asset_id_to_permissions")
  public Map<String, List<Permissions>> getAssetIdToPermissions() {
    return assetIdToPermissions;
  }

  public void setAssetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
  }

  public AuthRespondInvitesBodyInvitesInnerAction assetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
    return this;
  }

  public AuthRespondInvitesBodyInvitesInnerAction putAssetIdToPermissionsItem(String key, List<Permissions> assetIdToPermissionsItem) {
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
    AuthRespondInvitesBodyInvitesInnerAction authRespondInvitesBodyInvitesInnerAction = (AuthRespondInvitesBodyInvitesInnerAction) o;
    return Objects.equals(this.acceptInvite, authRespondInvitesBodyInvitesInnerAction.acceptInvite) &&
        Objects.equals(this.assetIdToPermissions, authRespondInvitesBodyInvitesInnerAction.assetIdToPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptInvite, assetIdToPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRespondInvitesBodyInvitesInnerAction {\n");
    
    sb.append("    acceptInvite: ").append(toIndentedString(acceptInvite)).append("\n");
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

