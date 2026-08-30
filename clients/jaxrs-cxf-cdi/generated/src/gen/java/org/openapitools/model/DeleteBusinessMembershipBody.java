package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeleteBusinessMembershipMember;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * List of members with role to delete.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "List of members with role to delete.")
public class DeleteBusinessMembershipBody   {
  
  private List<@Valid DeleteBusinessMembershipMember> members = new ArrayList<>();

  /**
   **/
  public DeleteBusinessMembershipBody members(List<@Valid DeleteBusinessMembershipMember> members) {
    this.members = members;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("members")
  @NotNull
 @Size(min=1,max=50)  public List<@Valid DeleteBusinessMembershipMember> getMembers() {
    return members;
  }
  public void setMembers(List<@Valid DeleteBusinessMembershipMember> members) {
    this.members = members;
  }

  public DeleteBusinessMembershipBody addMembersItem(DeleteBusinessMembershipMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

