package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MembersToDeleteBodyMembersInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("MembersToDeleteBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MembersToDeleteBody   {
  private @Valid List<@Valid MembersToDeleteBodyMembersInner> members = new ArrayList<>();

  /**
   **/
  public MembersToDeleteBody members(List<@Valid MembersToDeleteBodyMembersInner> members) {
    this.members = members;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("members")
  @NotNull @Valid  @Size(min=1,max=50)public List<@Valid MembersToDeleteBodyMembersInner> getMembers() {
    return members;
  }

  @JsonProperty("members")
  public void setMembers(List<@Valid MembersToDeleteBodyMembersInner> members) {
    this.members = members;
  }

  public MembersToDeleteBody addMembersItem(MembersToDeleteBodyMembersInner membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }

    this.members.add(membersItem);
    return this;
  }

  public MembersToDeleteBody removeMembersItem(MembersToDeleteBodyMembersInner membersItem) {
    if (membersItem != null && this.members != null) {
      this.members.remove(membersItem);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

