package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.server.api.model.Permissions;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthRespondInvitesBodyInvitesInnerAction   {
  
  private Boolean acceptInvite;
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();

  public AuthRespondInvitesBodyInvitesInnerAction () {

  }

  public AuthRespondInvitesBodyInvitesInnerAction (Boolean acceptInvite, Map<String, List<Permissions>> assetIdToPermissions) {
    this.acceptInvite = acceptInvite;
    this.assetIdToPermissions = assetIdToPermissions;
  }

    
  @JsonProperty("accept_invite")
  public Boolean getAcceptInvite() {
    return acceptInvite;
  }
  public void setAcceptInvite(Boolean acceptInvite) {
    this.acceptInvite = acceptInvite;
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
    AuthRespondInvitesBodyInvitesInnerAction authRespondInvitesBodyInvitesInnerAction = (AuthRespondInvitesBodyInvitesInnerAction) o;
    return Objects.equals(acceptInvite, authRespondInvitesBodyInvitesInnerAction.acceptInvite) &&
        Objects.equals(assetIdToPermissions, authRespondInvitesBodyInvitesInnerAction.assetIdToPermissions);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
