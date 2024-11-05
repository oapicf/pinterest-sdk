package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * An object containing the permissions a business member has on the asset.
 */
@ApiModel(description = "An object containing the permissions a business member has on the asset.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UsersForIndividualAssetResponse   {
  @JsonProperty("asset_id")
  private String assetId;

  @JsonProperty("member_id")
  private String memberId;

  @JsonProperty("permissions")
  private List<String> permissions = null;

  public UsersForIndividualAssetResponse assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Unique identifier of a business asset.
   * @return assetId
  **/
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business asset.")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public UsersForIndividualAssetResponse memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Unique identifier of the business member with asset access.
   * @return memberId
  **/
  @ApiModelProperty(example = "140943737684417", value = "Unique identifier of the business member with asset access.")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public UsersForIndividualAssetResponse permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UsersForIndividualAssetResponse addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Permission levels member or partner has on an asset.
   * @return permissions
  **/
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

