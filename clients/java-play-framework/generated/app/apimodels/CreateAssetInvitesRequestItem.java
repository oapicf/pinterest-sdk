package apimodels;

import apimodels.InviteType;
import apimodels.Permissions;
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
 * Object declaring an asset role update to an invite.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateAssetInvitesRequestItem   {
  @JsonProperty("invite_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String inviteId;

  @JsonProperty("invite_type")
  @NotNull
@Valid

  private InviteType inviteType;

  @JsonProperty("asset_id_to_permissions")
  @NotNull
@Size(min=1)
@Valid

  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();

  public CreateAssetInvitesRequestItem inviteId(String inviteId) {
    this.inviteId = inviteId;
    return this;
  }

   /**
   * Unique identifier of an invite.
   * @return inviteId
  **/
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
  **/
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
    CreateAssetInvitesRequestItem createAssetInvitesRequestItem = (CreateAssetInvitesRequestItem) o;
    return Objects.equals(inviteId, createAssetInvitesRequestItem.inviteId) &&
        Objects.equals(inviteType, createAssetInvitesRequestItem.inviteType) &&
        Objects.equals(assetIdToPermissions, createAssetInvitesRequestItem.assetIdToPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inviteId, inviteType, assetIdToPermissions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

