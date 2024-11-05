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
 * UpdatePartnerAssetAccessBodyAccessesInner
 */

@JsonTypeName("UpdatePartnerAssetAccessBody_accesses_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdatePartnerAssetAccessBodyAccessesInner {

  private String partnerId;

  private String assetId;

  @Valid
  private List<Permissions> permissions = new ArrayList<>();

  public UpdatePartnerAssetAccessBodyAccessesInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdatePartnerAssetAccessBodyAccessesInner(String partnerId, String assetId, List<Permissions> permissions) {
    this.partnerId = partnerId;
    this.assetId = assetId;
    this.permissions = permissions;
  }

  public UpdatePartnerAssetAccessBodyAccessesInner partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Unique identifier of a business partner to update asset access to.
   * @return partnerId
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "partner_id", example = "1234567890123", description = "Unique identifier of a business partner to update asset access to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public UpdatePartnerAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Unique identifier of the business asset.
   * @return assetId
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "asset_id", example = "549755885175", description = "Unique identifier of the business asset.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public UpdatePartnerAssetAccessBodyAccessesInner permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UpdatePartnerAssetAccessBodyAccessesInner addPermissionsItem(Permissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * A non-empty array of permissions to assign to the partner.
   * @return permissions
   */
  @NotNull @Valid @Size(min = 1, max = 50) 
  @Schema(name = "permissions", example = "[\"ANALYST\",\"ADMIN\"]", description = "A non-empty array of permissions to assign to the partner.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    UpdatePartnerAssetAccessBodyAccessesInner updatePartnerAssetAccessBodyAccessesInner = (UpdatePartnerAssetAccessBodyAccessesInner) o;
    return Objects.equals(this.partnerId, updatePartnerAssetAccessBodyAccessesInner.partnerId) &&
        Objects.equals(this.assetId, updatePartnerAssetAccessBodyAccessesInner.assetId) &&
        Objects.equals(this.permissions, updatePartnerAssetAccessBodyAccessesInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, assetId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetAccessBodyAccessesInner {\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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

