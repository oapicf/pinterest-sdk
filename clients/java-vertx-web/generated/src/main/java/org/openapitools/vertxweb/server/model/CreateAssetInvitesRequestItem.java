package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.vertxweb.server.model.InviteType;
import org.openapitools.vertxweb.server.model.Permissions;

/**
 * Object declaring an asset role update to an invite.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAssetInvitesRequestItem   {
  
  private String inviteId;
  private InviteType inviteType;
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();

  public CreateAssetInvitesRequestItem () {

  }

  public CreateAssetInvitesRequestItem (String inviteId, InviteType inviteType, Map<String, List<Permissions>> assetIdToPermissions) {
    this.inviteId = inviteId;
    this.inviteType = inviteType;
    this.assetIdToPermissions = assetIdToPermissions;
  }

    
  @JsonProperty("invite_id")
  public String getInviteId() {
    return inviteId;
  }
  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

    
  @JsonProperty("invite_type")
  public InviteType getInviteType() {
    return inviteType;
  }
  public void setInviteType(InviteType inviteType) {
    this.inviteType = inviteType;
  }

    
  @JsonProperty("asset_id_to_permissions")
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
    return Objects.equals(inviteId, createAssetInvitesRequestItem.inviteId) &&
        Objects.equals(inviteType, createAssetInvitesRequestItem.inviteType) &&
        Objects.equals(assetIdToPermissions, createAssetInvitesRequestItem.assetIdToPermissions);
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
