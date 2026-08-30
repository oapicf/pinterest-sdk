package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessMembershipMember;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("UpdateBusinessMembershipsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UpdateBusinessMembershipsResponse   {
  private @Valid List<@Valid BusinessMembershipMember> items = new ArrayList<>();

  public UpdateBusinessMembershipsResponse() {
  }

  /**
   * List of members with updated business access role.
   **/
  public UpdateBusinessMembershipsResponse items(List<@Valid BusinessMembershipMember> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(value = "List of members with updated business access role.")
  @JsonProperty("items")
  @Valid public List<@Valid BusinessMembershipMember> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid BusinessMembershipMember> items) {
    this.items = items;
  }

  public UpdateBusinessMembershipsResponse addItemsItem(BusinessMembershipMember itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public UpdateBusinessMembershipsResponse removeItemsItem(BusinessMembershipMember itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
