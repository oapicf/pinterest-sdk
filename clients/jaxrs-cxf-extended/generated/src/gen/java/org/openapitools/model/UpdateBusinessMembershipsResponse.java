package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessMembershipMember;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateBusinessMembershipsResponse  {
  
 /**
  * List of members with updated business access role.
  */
  @ApiModelProperty(value = "List of members with updated business access role.")
  @Valid
  private List<@Valid BusinessMembershipMember> items = new ArrayList<>();
 /**
  * List of members with updated business access role.
  * @return items
  */
  @JsonProperty("items")
  public List<@Valid BusinessMembershipMember> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid BusinessMembershipMember> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public UpdateBusinessMembershipsResponse items(List<@Valid BusinessMembershipMember> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public UpdateBusinessMembershipsResponse addItemsItem(BusinessMembershipMember itemsItem) {
    this.items.add(itemsItem);
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
    UpdateBusinessMembershipsResponse updateBusinessMembershipsResponse = (UpdateBusinessMembershipsResponse) o;
    return Objects.equals(this.items, updateBusinessMembershipsResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBusinessMembershipsResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

