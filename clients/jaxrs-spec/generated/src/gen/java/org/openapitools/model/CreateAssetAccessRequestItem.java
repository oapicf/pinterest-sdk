package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Permissions;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CreateAssetAccessRequestItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CreateAssetAccessRequestItem   {
  private @Valid Map<String, List<Permissions>> assetIdToPermissions = new HashMap<>();
  private String partnerId;

  public CreateAssetAccessRequestItem() {
  }

  @JsonCreator
  public CreateAssetAccessRequestItem(
    @JsonProperty(required = true, value = "asset_id_to_permissions") Map<String, List<Permissions>> assetIdToPermissions,
    @JsonProperty(required = true, value = "partner_id") String partnerId
  ) {
    this.assetIdToPermissions = assetIdToPermissions;
    this.partnerId = partnerId;
  }

  /**
   * An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
   **/
  public CreateAssetAccessRequestItem assetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
    return this;
  }

  
  @ApiModelProperty(example = "{\"549760723247\":[\"ANALYST\"],\"549760723248\":[\"ANALYST\",\"ADMIN\"],\"809944451643622187\":[\"PROFILE_PUBLISHER\"]}", required = true, value = "An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.")
  @JsonProperty(required = true, value = "asset_id_to_permissions")
  @NotNull @Valid public Map<String, List<Permissions>> getAssetIdToPermissions() {
    return assetIdToPermissions;
  }

  @JsonProperty(required = true, value = "asset_id_to_permissions")
  public void setAssetIdToPermissions(Map<String, List<Permissions>> assetIdToPermissions) {
    this.assetIdToPermissions = assetIdToPermissions;
  }

  public CreateAssetAccessRequestItem putAssetIdToPermissionsItem(String key, List<Permissions> assetIdToPermissionsItem) {
    if (this.assetIdToPermissions == null) {
      this.assetIdToPermissions = new HashMap<>();
    }

    this.assetIdToPermissions.put(key, assetIdToPermissionsItem);
    return this;
  }

  public CreateAssetAccessRequestItem removeAssetIdToPermissionsItem(String key) {
    if (this.assetIdToPermissions != null) {
      this.assetIdToPermissions.remove(key);
    }

    return this;
  }
  /**
   * Unique identifier of a business partner to request asset access to.
   **/
  public CreateAssetAccessRequestItem partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of a business partner to request asset access to.")
  @JsonProperty(required = true, value = "partner_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getPartnerId() {
    return partnerId;
  }

  @JsonProperty(required = true, value = "partner_id")
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
    CreateAssetAccessRequestItem createAssetAccessRequestItem = (CreateAssetAccessRequestItem) o;
    return Objects.equals(this.assetIdToPermissions, createAssetAccessRequestItem.assetIdToPermissions) &&
        Objects.equals(this.partnerId, createAssetAccessRequestItem.partnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetIdToPermissions, partnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetAccessRequestItem {\n");
    
    sb.append("    assetIdToPermissions: ").append(toIndentedString(assetIdToPermissions)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
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
