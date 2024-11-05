package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateMemberAssetAccessBodyAccessesInner
 */

@JsonTypeName("UpdateMemberAssetAccessBody_accesses_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateMemberAssetAccessBodyAccessesInner {

  private String assetId;

  private String memberId;

  @Valid
  private List<Permissions> permissions = new ArrayList<>();

  public UpdateMemberAssetAccessBodyAccessesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateMemberAssetAccessBodyAccessesInner(String assetId, String memberId, List<Permissions> permissions) {
    this.assetId = assetId;
    this.memberId = memberId;
    this.permissions = permissions;
  }

  public UpdateMemberAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Id of the asset to update.
   * @return assetId
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "asset_id", example = "549755885175", description = "Id of the asset to update.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public UpdateMemberAssetAccessBodyAccessesInner memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Unique identifier of the member on which to perform the update
   * @return memberId
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "member_id", example = "140943737684417", description = "Unique identifier of the member on which to perform the update", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("member_id")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public UpdateMemberAssetAccessBodyAccessesInner permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UpdateMemberAssetAccessBodyAccessesInner addPermissionsItem(Permissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * A non-empty array of permissions to assign to the member.
   * @return permissions
   */
  @NotNull @Valid @Size(min = 1, max = 50) 
  @Schema(name = "permissions", example = "[\"ANALYST\",\"ADMIN\"]", description = "A non-empty array of permissions to assign to the member.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permissions")
  public List<Permissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permissions> permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMemberAssetAccessBodyAccessesInner updateMemberAssetAccessBodyAccessesInner = (UpdateMemberAssetAccessBodyAccessesInner) o;
    return Objects.equals(this.assetId, updateMemberAssetAccessBodyAccessesInner.assetId) &&
        Objects.equals(this.memberId, updateMemberAssetAccessBodyAccessesInner.memberId) &&
        Objects.equals(this.permissions, updateMemberAssetAccessBodyAccessesInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetAccessBodyAccessesInner {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

