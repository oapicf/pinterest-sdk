package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.vertxweb.server.model.Permissions;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthRespondInviteAction   {
  
  private Boolean acceptInvite;
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();

  public AuthRespondInviteAction () {

  }

  public AuthRespondInviteAction (Boolean acceptInvite, Map<String, List<Permissions>> assetIdToPermissions) {
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
    AuthRespondInviteAction authRespondInviteAction = (AuthRespondInviteAction) o;
    return Objects.equals(acceptInvite, authRespondInviteAction.acceptInvite) &&
        Objects.equals(assetIdToPermissions, authRespondInviteAction.assetIdToPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptInvite, assetIdToPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRespondInviteAction {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
