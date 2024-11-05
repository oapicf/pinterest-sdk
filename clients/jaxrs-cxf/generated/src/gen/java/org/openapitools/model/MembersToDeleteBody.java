package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MembersToDeleteBodyMembersInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MembersToDeleteBody  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private List<@Valid MembersToDeleteBodyMembersInner> members = new ArrayList<>();
 /**
   * Get members
   * @return members
  **/
  @JsonProperty("members")
  @NotNull
 @Size(min=1,max=50)  public List<@Valid MembersToDeleteBodyMembersInner> getMembers() {
    return members;
  }

  public void setMembers(List<@Valid MembersToDeleteBodyMembersInner> members) {
    this.members = members;
  }

  public MembersToDeleteBody members(List<@Valid MembersToDeleteBodyMembersInner> members) {
    this.members = members;
    return this;
  }

  public MembersToDeleteBody addMembersItem(MembersToDeleteBodyMembersInner membersItem) {
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
    MembersToDeleteBody membersToDeleteBody = (MembersToDeleteBody) o;
    return Objects.equals(this.members, membersToDeleteBody.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembersToDeleteBody {\n");
    
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
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

