package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The terminated asset access.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeletePartnerAssetAccessResult   {
  
  private String assetId;
  private String assetType;
  private Boolean isSharedPartner;
  private String partnerId;
  private List<String> permissions = new ArrayList<>();

  public DeletePartnerAssetAccessResult () {

  }

  public DeletePartnerAssetAccessResult (String assetId, String assetType, Boolean isSharedPartner, String partnerId, List<String> permissions) {
    this.assetId = assetId;
    this.assetType = assetType;
    this.isSharedPartner = isSharedPartner;
    this.partnerId = partnerId;
    this.permissions = permissions;
  }

    
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

    
  @JsonProperty("asset_type")
  public String getAssetType() {
    return assetType;
  }
  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

    
  @JsonProperty("is_shared_partner")
  public Boolean getIsSharedPartner() {
    return isSharedPartner;
  }
  public void setIsSharedPartner(Boolean isSharedPartner) {
    this.isSharedPartner = isSharedPartner;
  }

    
  @JsonProperty("partner_id")
  public String getPartnerId() {
    return partnerId;
  }
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

    
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
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
    DeletePartnerAssetAccessResult deletePartnerAssetAccessResult = (DeletePartnerAssetAccessResult) o;
    return Objects.equals(assetId, deletePartnerAssetAccessResult.assetId) &&
        Objects.equals(assetType, deletePartnerAssetAccessResult.assetType) &&
        Objects.equals(isSharedPartner, deletePartnerAssetAccessResult.isSharedPartner) &&
        Objects.equals(partnerId, deletePartnerAssetAccessResult.partnerId) &&
        Objects.equals(permissions, deletePartnerAssetAccessResult.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetType, isSharedPartner, partnerId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessResult {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    isSharedPartner: ").append(toIndentedString(isSharedPartner)).append("\n");
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
