package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdateMemberAssetAccessItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UpdateMemberAssetAccessItem {

  private String assetId;

  private String memberId;

  private List<Permissions> permissions = new ArrayList<>();

  public UpdateMemberAssetAccessItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateMemberAssetAccessItem(String assetId, String memberId, List<Permissions> permissions) {
    this.assetId = assetId;
    this.memberId = memberId;
    this.permissions = permissions;
  }

  public UpdateMemberAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Id of the asset to update.
   * @return assetId
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "asset_id", description = "Id of the asset to update.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  @JsonProperty("asset_id")
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public UpdateMemberAssetAccessItem memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Unique identifier of the member on which to perform the update
   * @return memberId
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "member_id", description = "Unique identifier of the member on which to perform the update", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("member_id")
  public String getMemberId() {
    return memberId;
  }

  @JsonProperty("member_id")
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public UpdateMemberAssetAccessItem permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UpdateMemberAssetAccessItem addPermissionsItem(Permissions permissionsItem) {
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
  @Schema(name = "permissions", description = "A non-empty array of permissions to assign to the member.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("permissions")
  public List<Permissions> getPermissions() {
    return permissions;
  }

  @JsonProperty("permissions")
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
    UpdateMemberAssetAccessItem updateMemberAssetAccessItem = (UpdateMemberAssetAccessItem) o;
    return Objects.equals(this.assetId, updateMemberAssetAccessItem.assetId) &&
        Objects.equals(this.memberId, updateMemberAssetAccessItem.memberId) &&
        Objects.equals(this.permissions, updateMemberAssetAccessItem.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetAccessItem {\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

