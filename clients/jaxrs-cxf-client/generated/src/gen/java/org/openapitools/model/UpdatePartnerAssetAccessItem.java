package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdatePartnerAssetAccessItem  {
  
 /**
  * Unique identifier of the business asset.
  */
  @ApiModelProperty(required = true, value = "Unique identifier of the business asset.")

  private String assetId;

 /**
  * Unique identifier of a business partner to update asset access to.
  */
  @ApiModelProperty(required = true, value = "Unique identifier of a business partner to update asset access to.")

  private String partnerId;

 /**
  * A non-empty array of permissions to assign to the partner.
  */
  @ApiModelProperty(required = true, value = "A non-empty array of permissions to assign to the partner.")

  private List<Permissions> permissions = new ArrayList<>();
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

  public UpdatePartnerAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

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

  public UpdatePartnerAssetAccessItem partnerId(String partnerId) {
    this.partnerId = partnerId;
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

  public UpdatePartnerAssetAccessItem permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UpdatePartnerAssetAccessItem addPermissionsItem(Permissions permissionsItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

