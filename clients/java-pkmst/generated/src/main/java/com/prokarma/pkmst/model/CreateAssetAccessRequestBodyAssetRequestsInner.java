package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.Permissions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreateAssetAccessRequestBodyAssetRequestsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetAccessRequestBodyAssetRequestsInner   {
  @JsonProperty("partner_id")
  private String partnerId;

  @JsonProperty("asset_id_to_permissions")
  
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();

  public CreateAssetAccessRequestBodyAssetRequestsInner partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  /**
   * Unique identifier of a business partner to request asset access to.
   * @return partnerId
   */
  @ApiModelProperty(example = "809944451643622187", required = true, value = "Unique identifier of a business partner to request asset access to.")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public CreateAssetAccessRequestBodyAssetRequestsInner assetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
    return this;
  }

  public CreateAssetAccessRequestBodyAssetRequestsInner putAssetIdToPermissionsItem(String key, List<Permissions> assetIdToPermissionsItem) {
    if (this.assetIdToPermissions == null) {
      this.assetIdToPermissions = new HashMap<>());
    }
    this.assetIdToPermissions.put(key, assetIdToPermissionsItem);
    return this;
  }

  /**
   * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
   * @return assetIdToPermissions
   */
  @ApiModelProperty(example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", required = true, value = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. ")
  public Map<String, List<Permissions>> getAssetIdToPermissions() {
    return assetIdToPermissions;
  }

  public void setAssetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetAccessRequestBodyAssetRequestsInner createAssetAccessRequestBodyAssetRequestsInner = (CreateAssetAccessRequestBodyAssetRequestsInner) o;
    return Objects.equals(this.partnerId, createAssetAccessRequestBodyAssetRequestsInner.partnerId) &&
        Objects.equals(this.assetIdToPermissions, createAssetAccessRequestBodyAssetRequestsInner.assetIdToPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerId, assetIdToPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetAccessRequestBodyAssetRequestsInner {\n");
    
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    assetIdToPermissions: ").append(toIndentedString(assetIdToPermissions)).append("\n");
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

