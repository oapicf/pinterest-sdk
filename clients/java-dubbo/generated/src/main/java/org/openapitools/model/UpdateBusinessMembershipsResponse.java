package org.openapitools.model;

import org.openapitools.model.BusinessMembershipMember;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class UpdateBusinessMembershipsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of members with updated business access role.
   */
  @JsonProperty("items")
  private List<BusinessMembershipMember> items = new ArrayList<>();

  /**
   * List of members with updated business access role.
   * @return items
   */
  public List<BusinessMembershipMember> getItems() {
    return items;
  }

  public void setItems(List<BusinessMembershipMember> items) {
    this.items = items;
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
