package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdatePartnerAssetAccessBodyAccessesInner  {
  
 /**
  * Unique identifier of a business partner to update asset access to.
  */
  @ApiModelProperty(example = "1234567890123", required = true, value = "Unique identifier of a business partner to update asset access to.")
  private String partnerId;

 /**
  * Unique identifier of the business asset.
  */
  @ApiModelProperty(example = "549755885175", required = true, value = "Unique identifier of the business asset.")
  private String assetId;

 /**
  * A non-empty array of permissions to assign to the partner.
  */
  @ApiModelProperty(example = "[\"ANALYST\",\"ADMIN\"]", required = true, value = "A non-empty array of permissions to assign to the partner.")
  @Valid
  private List<Permissions> permissions = new ArrayList<>();
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
  public UpdatePartnerAssetAccessBodyAccessesInner partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

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
  public UpdatePartnerAssetAccessBodyAccessesInner assetId(String assetId) {
    this.assetId = assetId;
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
  public UpdatePartnerAssetAccessBodyAccessesInner permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Adds a new item to the <code>permissions</code> list.
   */
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

