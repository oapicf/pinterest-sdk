package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UpdatePartnerAssetAccessItem   {
  
  private String assetId;
  private String partnerId;
  private List<Permissions> permissions = new ArrayList<>();

  /**
   * Unique identifier of the business asset.
   **/
  
  @ApiModelProperty(required = true, value = "Unique identifier of the business asset.")
  @JsonProperty("asset_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Unique identifier of a business partner to update asset access to.
   **/
  
  @ApiModelProperty(required = true, value = "Unique identifier of a business partner to update asset access to.")
  @JsonProperty("partner_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  /**
   * A non-empty array of permissions to assign to the partner.
   **/
  
  @ApiModelProperty(required = true, value = "A non-empty array of permissions to assign to the partner.")
  @JsonProperty("permissions")
  @NotNull
 @Size(min=1,max=50)  public List<Permissions> getPermissions() {
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

