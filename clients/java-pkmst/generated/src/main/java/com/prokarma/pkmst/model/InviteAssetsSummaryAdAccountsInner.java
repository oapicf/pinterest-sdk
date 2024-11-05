package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * InviteAssetsSummaryAdAccountsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class InviteAssetsSummaryAdAccountsInner   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("permissions")
  
  private List<String> permissions = null;

  public InviteAssetsSummaryAdAccountsInner id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of a business ad account.
   * @return id
   */
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business ad account.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InviteAssetsSummaryAdAccountsInner permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  public InviteAssetsSummaryAdAccountsInner addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * Permission levels member or partner has on an asset.
   * @return permissions
   */
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
    InviteAssetsSummaryAdAccountsInner inviteAssetsSummaryAdAccountsInner = (InviteAssetsSummaryAdAccountsInner) o;
    return Objects.equals(this.id, inviteAssetsSummaryAdAccountsInner.id) &&
        Objects.equals(this.permissions, inviteAssetsSummaryAdAccountsInner.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteAssetsSummaryAdAccountsInner {\n");
    
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

