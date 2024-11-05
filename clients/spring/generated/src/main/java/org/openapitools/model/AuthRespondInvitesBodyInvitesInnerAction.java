package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Permissions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AuthRespondInvitesBodyInvitesInnerAction
 */

@JsonTypeName("AuthRespondInvitesBody_invites_inner_action")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AuthRespondInvitesBodyInvitesInnerAction {

  private Boolean acceptInvite;

  @Valid
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();

  public AuthRespondInvitesBodyInvitesInnerAction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthRespondInvitesBodyInvitesInnerAction(Boolean acceptInvite) {
    this.acceptInvite = acceptInvite;
  }

  public AuthRespondInvitesBodyInvitesInnerAction acceptInvite(Boolean acceptInvite) {
    this.acceptInvite = acceptInvite;
    return this;
  }

  /**
   * Whether the invite/request is accepted.
   * @return acceptInvite
   */
  @NotNull 
  @Schema(name = "accept_invite", description = "Whether the invite/request is accepted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accept_invite")
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
   */
  @Valid @Size(min = 1) 
  @Schema(name = "asset_id_to_permissions", example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", description = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

