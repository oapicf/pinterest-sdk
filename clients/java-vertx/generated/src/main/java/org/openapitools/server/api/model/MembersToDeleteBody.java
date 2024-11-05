package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.MembersToDeleteBodyMembersInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MembersToDeleteBody   {
  
  private List<MembersToDeleteBodyMembersInner> members = new ArrayList<>();

  public MembersToDeleteBody () {

  }

  public MembersToDeleteBody (List<MembersToDeleteBodyMembersInner> members) {
    this.members = members;
  }

    
  @JsonProperty("members")
  public List<MembersToDeleteBodyMembersInner> getMembers() {
    return members;
  }
  public void setMembers(List<MembersToDeleteBodyMembersInner> members) {
    this.members = members;
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
    return Objects.equals(members, membersToDeleteBody.members);
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
