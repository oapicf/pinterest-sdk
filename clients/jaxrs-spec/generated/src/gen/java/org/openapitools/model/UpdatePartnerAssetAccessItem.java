package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("UpdatePartnerAssetAccessItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UpdatePartnerAssetAccessItem   {
  private String assetId;
  private String partnerId;
  private @Valid List<Permissions> permissions = new ArrayList<>();

  public UpdatePartnerAssetAccessItem() {
  }

  @JsonCreator
  public UpdatePartnerAssetAccessItem(
    @JsonProperty(required = true, value = "asset_id") String assetId,
    @JsonProperty(required = true, value = "partner_id") String partnerId,
    @JsonProperty(required = true, value = "permissions") List<Permissions> permissions
  ) {
    this.assetId = assetId;
    this.partnerId = partnerId;
    this.permissions = permissions;
  }

  /**
   * Unique identifier of the business asset.
   **/
  public UpdatePartnerAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of the business asset.")
  @JsonProperty(required = true, value = "asset_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=25)public String getAssetId() {
    return assetId;
  }

  @JsonProperty(required = true, value = "asset_id")
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Unique identifier of a business partner to update asset access to.
   **/
  public UpdatePartnerAssetAccessItem partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of a business partner to update asset access to.")
  @JsonProperty(required = true, value = "partner_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=25)public String getPartnerId() {
    return partnerId;
  }

  @JsonProperty(required = true, value = "partner_id")
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * A non-empty array of permissions to assign to the partner.
   **/
  public UpdatePartnerAssetAccessItem permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A non-empty array of permissions to assign to the partner.")
  @JsonProperty(required = true, value = "permissions")
  @NotNull  @Size(min=1,max=50)public List<Permissions> getPermissions() {
    return permissions;
  }

  @JsonProperty(required = true, value = "permissions")
  public void setPermissions(List<Permissions> permissions) {
    this.permissions = permissions;
  }

  public UpdatePartnerAssetAccessItem addPermissionsItem(Permissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }

    this.permissions.add(permissionsItem);
    return this;
  }

  public UpdatePartnerAssetAccessItem removePermissionsItem(Permissions permissionsItem) {
    if (permissionsItem != null && this.permissions != null) {
      this.permissions.remove(permissionsItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePartnerAssetAccessItem updatePartnerAssetAccessItem = (UpdatePartnerAssetAccessItem) o;
    return Objects.equals(this.assetId, updatePartnerAssetAccessItem.assetId) &&
        Objects.equals(this.partnerId, updatePartnerAssetAccessItem.partnerId) &&
        Objects.equals(this.permissions, updatePartnerAssetAccessItem.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, partnerId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetAccessItem {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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
