package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An object with a list of members that were deleted.
 */

@Schema(name = "DeletedMembersResponse", description = "An object with a list of members that were deleted.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletedMembersResponse {

  @Valid
  private List<@Pattern(regexp = "^\\d+$")String> deletedMembers = new ArrayList<>();

  public DeletedMembersResponse deletedMembers(List<@Pattern(regexp = "^\\d+$")String> deletedMembers) {
    this.deletedMembers = deletedMembers;
    return this;
  }

  public DeletedMembersResponse addDeletedMembersItem(String deletedMembersItem) {
    if (this.deletedMembers == null) {
      this.deletedMembers = new ArrayList<>();
    }
    this.deletedMembers.add(deletedMembersItem);
    return this;
  }

  /**
   * List of members whose business membership have been terminated.
   * @return deletedMembers
   */
  
  @Schema(name = "deleted_members", example = "[\"809944451643622187\",\"383791336903426391\"]", description = "List of members whose business membership have been terminated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted_members")
  public List<@Pattern(regexp = "^\\d+$")String> getDeletedMembers() {
    return deletedMembers;
  }

  public void setDeletedMembers(List<@Pattern(regexp = "^\\d+$")String> deletedMembers) {
    this.deletedMembers = deletedMembers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeletedMembersResponse deletedMembersResponse = (DeletedMembersResponse) o;
    return Objects.equals(this.deletedMembers, deletedMembersResponse.deletedMembers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMembers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletedMembersResponse {\n");
    sb.append("    deletedMembers: ").append(toIndentedString(deletedMembers)).append("\n");
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

