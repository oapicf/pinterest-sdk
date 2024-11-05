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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="The terminated asset access.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnerAssetsResult   {
  
  private String assetId;
  private String assetType;
  private List<String> permissions = new ArrayList<>();
  private Boolean isSharedPartner;
  private String partnerId;

  /**
   * Unique identifier of a business asset.
   **/
  
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  @JsonProperty("asset_id")
 @Pattern(regexp="^\\d+$")  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  /**
   * Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
   **/
  
  @ApiModelProperty(example = "AD_ACCOUNT", value = "Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.")
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }
  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  /**
   * Permission levels member or partner has on an asset.
   **/
  
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  /**
   * If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset.
   **/
  
  @ApiModelProperty(example = "false", value = "If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.")
  @JsonProperty("is_shared_partner")
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }
  public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
  }

  /**
   * Unique identifier of a business partner.
   **/
  
  @ApiModelProperty(example = "140943737684417", value = "Unique identifier of a business partner.")
  @JsonProperty("partner_id")
 @Pattern(regexp="^\\d+$")  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletePartnerAssetsResult deletePartnerAssetsResult = (DeletePartnerAssetsResult) o;
    return Objects.equals(this.assetId, deletePartnerAssetsResult.assetId) &&
        Objects.equals(this.assetType, deletePartnerAssetsResult.assetType) &&
        Objects.equals(this.permissions, deletePartnerAssetsResult.permissions) &&
        Objects.equals(this.isSharedPartner, deletePartnerAssetsResult.isSharedPartner) &&
        Objects.equals(this.partnerId, deletePartnerAssetsResult.partnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, permissions, isSharedPartner, partnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetsResult {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    isSharedPartner: ").append(toIndentedString(isSharedPartner)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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

