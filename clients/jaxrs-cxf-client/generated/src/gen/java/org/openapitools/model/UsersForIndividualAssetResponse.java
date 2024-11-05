package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * An object containing the permissions a business member has on the asset.
 **/
@ApiModel(description="An object containing the permissions a business member has on the asset.")

public class UsersForIndividualAssetResponse  {
  
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
 /**
   * Unique identifier of a business asset.
  **/
  private String assetId;

  @ApiModelProperty(example = "140943737684417", value = "Unique identifier of the business member with asset access.")
 /**
   * Unique identifier of the business member with asset access.
  **/
  private String memberId;

  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
 /**
   * Permission levels member or partner has on an asset.
  **/
  private List<String> permissions = new ArrayList<>();
 /**
   * Unique identifier of a business asset.
   * @return assetId
  **/
  @JsonProperty("asset_id")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public UsersForIndividualAssetResponse assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

 /**
   * Unique identifier of the business member with asset access.
   * @return memberId
  **/
  @JsonProperty("member_id")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public UsersForIndividualAssetResponse memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

 /**
   * Permission levels member or partner has on an asset.
   * @return permissions
  **/
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public UsersForIndividualAssetResponse permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UsersForIndividualAssetResponse addPermissionsItem(String permissionsItem) {
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
    UsersForIndividualAssetResponse usersForIndividualAssetResponse = (UsersForIndividualAssetResponse) o;
    return Objects.equals(this.assetId, usersForIndividualAssetResponse.assetId) &&
        Objects.equals(this.memberId, usersForIndividualAssetResponse.memberId) &&
        Objects.equals(this.permissions, usersForIndividualAssetResponse.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, memberId, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersForIndividualAssetResponse {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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

