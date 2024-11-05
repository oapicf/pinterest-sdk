package apimodels;

import apimodels.Permissions;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AuthRespondInvitesBodyInvitesInnerAction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AuthRespondInvitesBodyInvitesInnerAction   {
  @JsonProperty("accept_invite")
  @NotNull

  private Boolean acceptInvite;

  @JsonProperty("asset_id_to_permissions")
  @Size(min=1)
@Valid

  private Map<String, List<Permissions>> assetIdToPermissions = null;

  public AuthRespondInvitesBodyInvitesInnerAction acceptInvite(Boolean acceptInvite) {
    this.acceptInvite = acceptInvite;
    return this;
  }

   /**
   * Whether the invite/request is accepted.
   * @return acceptInvite
  **/
  public Boolean getAcceptInvite() {
    return acceptInvite;
  }

  public void setAcceptInvite(Boolean acceptInvite) {
    this.acceptInvite = acceptInvite;
  }

  public AuthRespondInvitesBodyInvitesInnerAction assetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
    return this;
  }

  public AuthRespondInvitesBodyInvitesInnerAction putAssetIdToPermissionsItem(String key, List<Permissions> assetIdToPermissionsItem) {
    if (this.assetIdToPermissions == null) {
      this.assetIdToPermissions = new HashMap<>();
    }
    this.assetIdToPermissions.put(key, assetIdToPermissionsItem);
    return this;
  }

   /**
   * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
   * @return assetIdToPermissions
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

