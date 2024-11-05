package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdatePartnerAssetAccessBodyAccessesInner  {
  
  @ApiModelProperty(example = "1234567890123", required = true, value = "Unique identifier of a business partner to update asset access to.")
 /**
   * Unique identifier of a business partner to update asset access to.
  **/
  private String partnerId;

  @ApiModelProperty(example = "549755885175", required = true, value = "Unique identifier of the business asset.")
 /**
   * Unique identifier of the business asset.
  **/
  private String assetId;

  @ApiModelProperty(example = "[\"ANALYST\",\"ADMIN\"]", required = true, value = "A non-empty array of permissions to assign to the partner.")
 /**
   * A non-empty array of permissions to assign to the partner.
  **/
  private List<Permissions> permissions = new ArrayList<>();
 /**
   * Unique identifier of a business partner to update asset access to.
   * @return partnerId
  **/
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public UpdatePartnerAssetAccessBodyAccessesInner partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

 /**
   * Unique identifier of the business asset.
   * @return assetId
  **/
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public UpdatePartnerAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
   * A non-empty array of permissions to assign to the partner.
   * @return permissions
  **/
  @JsonProperty("permissions")
  public List<Permissions> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permissions> permissions) {
    this.permissions = permissions;
  }

  public UpdatePartnerAssetAccessBodyAccessesInner permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UpdatePartnerAssetAccessBodyAccessesInner addPermissionsItem(Permissions permissionsItem) {
    this.permissions.add(permissionsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

