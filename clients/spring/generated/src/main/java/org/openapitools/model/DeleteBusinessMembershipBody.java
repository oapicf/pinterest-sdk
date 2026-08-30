package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeleteBusinessMembershipMember;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * List of members with role to delete.
 */

@Schema(name = "DeleteBusinessMembershipBody", description = "List of members with role to delete.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeleteBusinessMembershipBody {

  private List<@Valid DeleteBusinessMembershipMember> members = new ArrayList<>();

  public DeleteBusinessMembershipBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeleteBusinessMembershipBody(List<@Valid DeleteBusinessMembershipMember> members) {
    this.members = members;
  }

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
   */
  @NotNull @Valid @Size(min = 1, max = 50) 
  @Schema(name = "members", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("members")
  public List<@Valid DeleteBusinessMembershipMember> getMembers() {
    return members;
  }

  @JsonProperty("members")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

