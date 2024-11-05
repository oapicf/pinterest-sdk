package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAssetAccessRequestBodyAssetRequestsInner  {
  
 /**
  * Unique identifier of a business partner to request asset access to.
  */
  @ApiModelProperty(example = "809944451643622187", required = true, value = "Unique identifier of a business partner to request asset access to.")
  private String partnerId;

 /**
  * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  */
  @ApiModelProperty(example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", required = true, value = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. ")
  @Valid
  private Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();
 /**
  * Unique identifier of a business partner to request asset access to.
  * @return partnerId
  */
  @JsonProperty("partner_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getPartnerId() {
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
  public CreateAssetAccessRequestBodyAssetRequestsInner partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

 /**
  * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  * @return assetIdToPermissions
  */
  @JsonProperty("asset_id_to_permissions")
  @NotNull
 @Size(min=1)  public Map<String, List<Permissions>> getAssetIdToPermissions() {
    return assetIdToPermissions;
  }

  /**
   * Sets the <code>assetIdToPermissions</code> property.
   */
 public void setAssetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
  }

  /**
   * Sets the <code>assetIdToPermissions</code> property.
   */
  public CreateAssetAccessRequestBodyAssetRequestsInner assetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
    return this;
  }

  /**
   * Puts a new item into the <code>assetIdToPermissions</code> map.
   */
  public CreateAssetAccessRequestBodyAssetRequestsInner putAssetIdToPermissionsItem(String key, List<Permissions> assetIdToPermissionsItem) {
    this.assetIdToPermissions.put(key, assetIdToPermissionsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

