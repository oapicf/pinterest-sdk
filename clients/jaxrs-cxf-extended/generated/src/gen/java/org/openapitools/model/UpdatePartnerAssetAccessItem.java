package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  @Valid
  private List<Permissions> permissions = new ArrayList<>();
 /**
  * Unique identifier of the business asset.
  * @return assetId
  */
  @JsonProperty("asset_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getAssetId() {
    return assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
 public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Sets the <code>assetId</code> property.
   */
  public UpdatePartnerAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
  * Unique identifier of a business partner to update asset access to.
  * @return partnerId
  */
  @JsonProperty("partner_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getPartnerId() {
    return partnerId;
  }

  /**
   * Sets the <code>partnerId</code> property.
   */
 public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * Sets the <code>partnerId</code> property.
   */
  public UpdatePartnerAssetAccessItem partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

 /**
  * A non-empty array of permissions to assign to the partner.
  * @return permissions
  */
  @JsonProperty("permissions")
  @NotNull
 @Size(min=1,max=50)  public List<Permissions> getPermissions() {
    return permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
 public void setPermissions(List<Permissions> permissions) {
    this.permissions = permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
  public UpdatePartnerAssetAccessItem permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Adds a new item to the <code>permissions</code> list.
   */
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

