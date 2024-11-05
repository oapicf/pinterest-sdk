package apimodels;

import apimodels.BusinessAccessUserSummary;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An object containing the permissions a business member/partner has on the asset.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UserSingleAssetBinding   {
  @JsonProperty("permissions")
  
  private List<String> permissions = null;

  @JsonProperty("user")
  @Valid

  private BusinessAccessUserSummary user;

  public UserSingleAssetBinding permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public UserSingleAssetBinding addPermissionsItem(String permissionsItem) {
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
  public List<String> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  public UserSingleAssetBinding user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
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
    return Objects.equals(permissions, userSingleAssetBinding.permissions) &&
        Objects.equals(user, userSingleAssetBinding.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, user);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

