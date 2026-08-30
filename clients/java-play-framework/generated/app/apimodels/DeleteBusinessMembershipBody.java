package apimodels;

import apimodels.DeleteBusinessMembershipMember;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * List of members with role to delete.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeleteBusinessMembershipBody   {
  @JsonProperty("members")
  @NotNull
@Size(min=1,max=50)
@Valid

  private List<@Valid DeleteBusinessMembershipMember> members = new ArrayList<>();

  public DeleteBusinessMembershipBody members(List<@Valid DeleteBusinessMembershipMember> members) {
    this.members = members;
    return this;
  }

  public DeleteBusinessMembershipBody addMembersItem(DeleteBusinessMembershipMember membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  public List<@Valid DeleteBusinessMembershipMember> getMembers() {
    return members;
  }

  public void setMembers(List<@Valid DeleteBusinessMembershipMember> members) {
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
    DeleteBusinessMembershipBody deleteBusinessMembershipBody = (DeleteBusinessMembershipBody) o;
    return Objects.equals(members, deleteBusinessMembershipBody.members);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

