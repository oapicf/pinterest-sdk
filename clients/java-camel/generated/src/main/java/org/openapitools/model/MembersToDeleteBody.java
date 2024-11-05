package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MembersToDeleteBodyMembersInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MembersToDeleteBody
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MembersToDeleteBody {

  @Valid
  private List<@Valid MembersToDeleteBodyMembersInner> members = new ArrayList<>();

  public MembersToDeleteBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MembersToDeleteBody(List<@Valid MembersToDeleteBodyMembersInner> members) {
    this.members = members;
  }

  public MembersToDeleteBody members(List<@Valid MembersToDeleteBodyMembersInner> members) {
    this.members = members;
    return this;
  }

  public MembersToDeleteBody addMembersItem(MembersToDeleteBodyMembersInner membersItem) {
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
  public List<@Valid MembersToDeleteBodyMembersInner> getMembers() {
    return members;
  }

  public void setMembers(List<@Valid MembersToDeleteBodyMembersInner> members) {
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

