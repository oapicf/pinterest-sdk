package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Permissions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateAssetAccessRequestItem
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CreateAssetAccessRequestItem {

  @Valid
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();

  private String partnerId;

  public CreateAssetAccessRequestItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateAssetAccessRequestItem(Map<String, List<Permissions>> assetIdToPermissions, String partnerId) {
    this.assetIdToPermissions = assetIdToPermissions;
    this.partnerId = partnerId;
  }

  public CreateAssetAccessRequestItem assetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
    return this;
  }

  public CreateAssetAccessRequestItem putAssetIdToPermissionsItem(String key, List<Permissions> assetIdToPermissionsItem) {
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
  @NotNull @Valid 
  @Schema(name = "asset_id_to_permissions", example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", description = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_id_to_permissions")
  public Map<String, List<Permissions>> getAssetIdToPermissions() {
    return assetIdToPermissions;
  }

  public void setAssetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
  }

  public CreateAssetAccessRequestItem partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Unique identifier of a business partner to request asset access to.
   * @return partnerId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "partner_id", description = "Unique identifier of a business partner to request asset access to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetAccessRequestItem createAssetAccessRequestItem = (CreateAssetAccessRequestItem) o;
    return Objects.equals(this.assetIdToPermissions, createAssetAccessRequestItem.assetIdToPermissions) &&
        Objects.equals(this.partnerId, createAssetAccessRequestItem.partnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIdToPermissions, partnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetAccessRequestItem {\n");
    sb.append("    assetIdToPermissions: ").append(toIndentedString(assetIdToPermissions)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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

