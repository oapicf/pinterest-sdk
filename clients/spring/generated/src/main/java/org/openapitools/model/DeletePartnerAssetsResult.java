package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The terminated asset access.
 */

@Schema(name = "DeletePartnerAssetsResult", description = "The terminated asset access.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnerAssetsResult {

  private String assetId;

  private String assetType;

  @Valid
  private List<String> permissions = new ArrayList<>();

  private Boolean isSharedPartner;

  private String partnerId;

  public DeletePartnerAssetsResult assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Unique identifier of a business asset.
   * @return assetId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "asset_id", example = "549755885175", description = "Unique identifier of a business asset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public DeletePartnerAssetsResult assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   * @return assetType
   */
  
  @Schema(name = "asset_type", example = "AD_ACCOUNT", description = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public DeletePartnerAssetsResult permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public DeletePartnerAssetsResult addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Permission levels member or partner has on an asset.
   * @return permissions
   */
  
  @Schema(name = "permissions", example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", description = "Permission levels member or partner has on an asset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public DeletePartnerAssetsResult isSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
    return this;
  }

  /**
   * If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
   * @return isSharedPartner
   */
  
  @Schema(name = "is_shared_partner", example = "false", description = "If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_shared_partner")
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }

  public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
  }

  public DeletePartnerAssetsResult partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Unique identifier of a business partner.
   * @return partnerId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "partner_id", example = "140943737684417", description = "Unique identifier of a business partner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DeletePartnerAssetsResult deletePartnerAssetsResult = (DeletePartnerAssetsResult) o;
    return Objects.equals(this.assetId, deletePartnerAssetsResult.assetId) &&
        Objects.equals(this.assetType, deletePartnerAssetsResult.assetType) &&
        Objects.equals(this.permissions, deletePartnerAssetsResult.permissions) &&
        Objects.equals(this.isSharedPartner, deletePartnerAssetsResult.isSharedPartner) &&
        Objects.equals(this.partnerId, deletePartnerAssetsResult.partnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, permissions, isSharedPartner, partnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetsResult {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    isSharedPartner: ").append(toIndentedString(isSharedPartner)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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

