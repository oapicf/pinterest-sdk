package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class InviteAssetsSummaryAdAccountsInner  {
  
 /**
  * Unique identifier of a business ad account.
  */
  @ApiModelProperty(example = "549755885175", value = "Unique identifier of a business ad account.")
  private String id;

 /**
  * Permission levels member or partner has on an asset.
  */
  @ApiModelProperty(example = "[\"FINANCE_MANAGER\",\"CATALOGS_MANAGER\",\"AUDIENCE_MANAGER\"]", value = "Permission levels member or partner has on an asset.")
  private List<String> permissions = new ArrayList<>();
 /**
  * Unique identifier of a business ad account.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public InviteAssetsSummaryAdAccountsInner id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Permission levels member or partner has on an asset.
  * @return permissions
  */
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
 public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  /**
   * Sets the <code>permissions</code> property.
   */
  public InviteAssetsSummaryAdAccountsInner permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Adds a new item to the <code>permissions</code> list.
   */
  public InviteAssetsSummaryAdAccountsInner addPermissionsItem(String permissionsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

