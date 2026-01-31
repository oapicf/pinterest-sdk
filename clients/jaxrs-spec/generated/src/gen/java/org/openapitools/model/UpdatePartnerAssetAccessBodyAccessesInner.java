package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
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



@JsonTypeName("UpdatePartnerAssetAccessBody_accesses_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-26T05:38:03.166641305Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UpdatePartnerAssetAccessBodyAccessesInner   {
  private String partnerId;
  private String assetId;
  private @Valid List<Permissions> permissions = new ArrayList<>();

  public UpdatePartnerAssetAccessBodyAccessesInner() {
  }

  @JsonCreator
  public UpdatePartnerAssetAccessBodyAccessesInner(
    @JsonProperty(required = true, value = "partner_id") String partnerId,
    @JsonProperty(required = true, value = "asset_id") String assetId,
    @JsonProperty(required = true, value = "permissions") List<Permissions> permissions
  ) {
    this.partnerId = partnerId;
    this.assetId = assetId;
    this.permissions = permissions;
  }

  /**
   * Unique identifier of a business partner to update asset access to.
   **/
  public UpdatePartnerAssetAccessBodyAccessesInner partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890123", required = true, value = "Unique identifier of a business partner to update asset access to.")
  @JsonProperty(required = true, value = "partner_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=25)public String getPartnerId() {
    return partnerId;
  }

  @JsonProperty(required = true, value = "partner_id")
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * Unique identifier of the business asset.
   **/
  public UpdatePartnerAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "Unique identifier of the business asset.")
  @JsonProperty(required = true, value = "asset_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=25)public String getAssetId() {
    return assetId;
  }

  @JsonProperty(required = true, value = "asset_id")
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * A non-empty array of permissions to assign to the partner.
   **/
  public UpdatePartnerAssetAccessBodyAccessesInner permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(example = "[\"ANALYST\",\"ADMIN\"]", required = true, value = "A non-empty array of permissions to assign to the partner.")
  @JsonProperty(required = true, value = "permissions")
  @NotNull  @Size(min=1,max=50)public List<Permissions> getPermissions() {
    return permissions;
  }

  @JsonProperty(required = true, value = "permissions")
  public void setPermissions(List<Permissions> permissions) {
    this.permissions = permissions;
  }

  public UpdatePartnerAssetAccessBodyAccessesInner addPermissionsItem(Permissions permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }

    this.permissions.add(permissionsItem);
    return this;
  }

  public UpdatePartnerAssetAccessBodyAccessesInner removePermissionsItem(Permissions permissionsItem) {
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

