package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.InviteType;
import org.openapitools.model.Permissions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object declaring an asset role update to an invite.
 */

@Schema(name = "CreateAssetInvitesRequestItem", description = "Object declaring an asset role update to an invite.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetInvitesRequestItem {

  private String inviteId;

  private InviteType inviteType;

  @Valid
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();

  public CreateAssetInvitesRequestItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateAssetInvitesRequestItem(String inviteId, InviteType inviteType, Map<String, List<Permissions>> assetIdToPermissions) {
    this.inviteId = inviteId;
    this.inviteType = inviteType;
    this.assetIdToPermissions = assetIdToPermissions;
  }

  public CreateAssetInvitesRequestItem inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

  /**
   * Unique identifier of an invite.
   * @return inviteId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "invite_id", example = "1234567890123", description = "Unique identifier of an invite.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invite_id")
  public String getInviteId() {
    return inviteId;
  }

  public void setInviteId(String inviteId) {
    this.inviteId = inviteId;
  }

  public CreateAssetInvitesRequestItem inviteType(InviteType inviteType) {
    this.inviteType = inviteType;
    return this;
  }

  /**
   * Get inviteType
   * @return inviteType
   */
  @NotNull @Valid 
  @Schema(name = "invite_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invite_type")
  public InviteType getInviteType() {
    return inviteType;
  }

  public void setInviteType(InviteType inviteType) {
    this.inviteType = inviteType;
  }

  public CreateAssetInvitesRequestItem assetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
    return this;
  }

  public CreateAssetInvitesRequestItem putAssetIdToPermissionsItem(String key, List<Permissions> assetIdToPermissionsItem) {
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
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "asset_id_to_permissions", example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", description = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. ", requiredMode = Schema.RequiredMode.REQUIRED)
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

