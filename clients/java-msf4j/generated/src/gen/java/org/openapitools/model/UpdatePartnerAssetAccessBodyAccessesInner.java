package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;

/**
 * UpdatePartnerAssetAccessBodyAccessesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdatePartnerAssetAccessBodyAccessesInner   {
  @JsonProperty("partner_id")
  private String partnerId;

  @JsonProperty("asset_id")
  private String assetId;

  @JsonProperty("permissions")
  private List<Permissions> permissions = new ArrayList<>();

  public UpdatePartnerAssetAccessBodyAccessesInner partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Unique identifier of a business partner to update asset access to.
   * @return partnerId
  **/
  @ApiModelProperty(example = "1234567890123", required = true, value = "Unique identifier of a business partner to update asset access to.")
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
  **/
  @ApiModelProperty(example = "549755885175", required = true, value = "Unique identifier of the business asset.")
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
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * A non-empty array of permissions to assign to the partner.
   * @return permissions
  **/
  @ApiModelProperty(example = "[\"ANALYST\",\"ADMIN\"]", required = true, value = "A non-empty array of permissions to assign to the partner.")
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

