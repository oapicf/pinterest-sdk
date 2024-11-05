package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * BusinessMemberAssetsSummaryAdAccountsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BusinessMemberAssetsSummaryAdAccountsInner   {
  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")
@Size(min=1,max=20)

  private String id;

  @JsonProperty("permissions")
  
  private List<String> permissions = null;

  public BusinessMemberAssetsSummaryAdAccountsInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of a business ad account.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BusinessMemberAssetsSummaryAdAccountsInner permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public BusinessMemberAssetsSummaryAdAccountsInner addPermissionsItem(String permissionsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessMemberAssetsSummaryAdAccountsInner businessMemberAssetsSummaryAdAccountsInner = (BusinessMemberAssetsSummaryAdAccountsInner) o;
    return Objects.equals(id, businessMemberAssetsSummaryAdAccountsInner.id) &&
        Objects.equals(permissions, businessMemberAssetsSummaryAdAccountsInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMemberAssetsSummaryAdAccountsInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

