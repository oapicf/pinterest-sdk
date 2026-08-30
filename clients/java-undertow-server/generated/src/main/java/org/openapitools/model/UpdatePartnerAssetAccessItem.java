/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UpdatePartnerAssetAccessItem   {
  
  private String assetId;
  private String partnerId;
  private List<Permissions> permissions = new ArrayList<>();

  /**
   * Unique identifier of the business asset.
   */
  public UpdatePartnerAssetAccessItem assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of the business asset.")
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Unique identifier of a business partner to update asset access to.
   */
  public UpdatePartnerAssetAccessItem partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of a business partner to update asset access to.")
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * A non-empty array of permissions to assign to the partner.
   */
  public UpdatePartnerAssetAccessItem permissions(List<Permissions> permissions) {
    this.permissions = permissions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A non-empty array of permissions to assign to the partner.")
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
    UpdatePartnerAssetAccessItem updatePartnerAssetAccessItem = (UpdatePartnerAssetAccessItem) o;
    return Objects.equals(assetId, updatePartnerAssetAccessItem.assetId) &&
        Objects.equals(partnerId, updatePartnerAssetAccessItem.partnerId) &&
        Objects.equals(permissions, updatePartnerAssetAccessItem.permissions);
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

