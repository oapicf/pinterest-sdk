package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessAccessUserSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * An object containing the permissions a business member/partner has on the asset.
 **/
@ApiModel(description="An object containing the permissions a business member/partner has on the asset.")

public class UserSingleAssetBinding  {
  
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
 /**
   * Permission levels member or partner has on an asset.
  **/
  private List<String> permissions = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private BusinessAccessUserSummary user;
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

  public UserSingleAssetBinding permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UserSingleAssetBinding addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

 /**
   * Get user
   * @return user
  **/
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }

  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

  public UserSingleAssetBinding user(BusinessAccessUserSummary user) {
    this.user = user;
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
    UserSingleAssetBinding userSingleAssetBinding = (UserSingleAssetBinding) o;
    return Objects.equals(this.permissions, userSingleAssetBinding.permissions) &&
        Objects.equals(this.user, userSingleAssetBinding.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSingleAssetBinding {\n");
    
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

