package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The terminated asset access.
 */

@Schema(name = "DeletePartnerAssetAccessResult", description = "The terminated asset access.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeletePartnerAssetAccessResult {

  private String assetId;

  private String assetType;

  private Boolean isSharedPartner;

  private String partnerId;

  @Valid
  private List<String> permissions = new ArrayList<>();

  public DeletePartnerAssetAccessResult assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * Unique identifier of a business asset.
   * @return assetId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "asset_id", description = "Unique identifier of a business asset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public DeletePartnerAssetAccessResult assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
   * @return assetType
   */
  
  @Schema(name = "asset_type", description = "Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public DeletePartnerAssetAccessResult isSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
    return this;
  }

  /**
   * If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
   * @return isSharedPartner
   */
  
  @Schema(name = "is_shared_partner", description = "If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_shared_partner")
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }

  public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
  }

  public DeletePartnerAssetAccessResult partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Unique identifier of a business partner.
   * @return partnerId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "partner_id", description = "Unique identifier of a business partner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public DeletePartnerAssetAccessResult permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public DeletePartnerAssetAccessResult addPermissionsItem(String permissionsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePartnerAssetAccessResult deletePartnerAssetAccessResult = (DeletePartnerAssetAccessResult) o;
    return Objects.equals(this.assetId, deletePartnerAssetAccessResult.assetId) &&
        Objects.equals(this.assetType, deletePartnerAssetAccessResult.assetType) &&
        Objects.equals(this.isSharedPartner, deletePartnerAssetAccessResult.isSharedPartner) &&
        Objects.equals(this.partnerId, deletePartnerAssetAccessResult.partnerId) &&
        Objects.equals(this.permissions, deletePartnerAssetAccessResult.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, isSharedPartner, partnerId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessResult {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    isSharedPartner: ").append(toIndentedString(isSharedPartner)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

