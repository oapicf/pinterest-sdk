package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InviteAssetsSummaryProfilesInner  {
  
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of a business profile.")
 /**
   * Unique identifier of a business profile.
  **/
  private String id;

  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
 /**
   * Permission levels member or partner has on an asset.
  **/
  private List<String> permissions = new ArrayList<>();
 /**
   * Unique identifier of a business profile.
   * @return id
  **/
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InviteAssetsSummaryProfilesInner id(String id) {
    this.id = id;
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

  public InviteAssetsSummaryProfilesInner permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public InviteAssetsSummaryProfilesInner addPermissionsItem(String permissionsItem) {
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
    InviteAssetsSummaryProfilesInner inviteAssetsSummaryProfilesInner = (InviteAssetsSummaryProfilesInner) o;
    return Objects.equals(this.id, inviteAssetsSummaryProfilesInner.id) &&
        Objects.equals(this.permissions, inviteAssetsSummaryProfilesInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteAssetsSummaryProfilesInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

