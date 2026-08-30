package org.openapitools.model;

import org.openapitools.model.BusinessAccessUserSummary;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * An object containing the permissions a business member/partner has on the asset.
 */
public class UserSingleAssetBinding implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Permission levels member or partner has on an asset.
   */
  @JsonProperty("permissions")
  private List<String> permissions = new ArrayList<>();

  @JsonProperty("user")
  private BusinessAccessUserSummary user;

  /**
   * Permission levels member or partner has on an asset.
   * @return permissions
   */
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  /**
   * 
   * @return user
   */
  public BusinessAccessUserSummary getUser() {
    return user;
  }

  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
