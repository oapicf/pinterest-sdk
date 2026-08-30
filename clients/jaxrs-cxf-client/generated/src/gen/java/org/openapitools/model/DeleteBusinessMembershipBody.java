package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeleteBusinessMembershipMember;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of members with role to delete.
 */
@ApiModel(description="List of members with role to delete.")

public class DeleteBusinessMembershipBody  {
  
  @ApiModelProperty(required = true, value = "")

  private List<DeleteBusinessMembershipMember> members = new ArrayList<>();
 /**
   * Get members
   * @return members
  **/
  @JsonProperty("members")
  public List<DeleteBusinessMembershipMember> getMembers() {
    return members;
  }

  public void setMembers(List<DeleteBusinessMembershipMember> members) {
    this.members = members;
  }

  public DeleteBusinessMembershipBody members(List<DeleteBusinessMembershipMember> members) {
    this.members = members;
    return this;
  }

  public DeleteBusinessMembershipBody addMembersItem(DeleteBusinessMembershipMember membersItem) {
    this.members.add(membersItem);
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
    DeleteBusinessMembershipBody deleteBusinessMembershipBody = (DeleteBusinessMembershipBody) o;
    return Objects.equals(this.members, deleteBusinessMembershipBody.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteBusinessMembershipBody {\n");
    
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

