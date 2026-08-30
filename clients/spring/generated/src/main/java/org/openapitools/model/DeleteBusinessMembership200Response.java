package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DeleteBusinessMembership200Response
 */

@JsonTypeName("delete_business_membership_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeleteBusinessMembership200Response {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Pattern(regexp = "^\\d+$")String> deletedMembers = new ArrayList<>();

  public DeleteBusinessMembership200Response deletedMembers(List<@Pattern(regexp = "^\\d+$")String> deletedMembers) {
    this.deletedMembers = deletedMembers;
    return this;
  }

  public DeleteBusinessMembership200Response addDeletedMembersItem(String deletedMembersItem) {
    if (this.deletedMembers == null) {
      this.deletedMembers = new ArrayList<>();
    }
    this.deletedMembers.add(deletedMembersItem);
    return this;
  }

  /**
   * Get deletedMembers
   * @return deletedMembers
   */
  
  @Schema(name = "deleted_members", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deleted_members")
  public List<@Pattern(regexp = "^\\d+$")String> getDeletedMembers() {
    return deletedMembers;
  }

  @JsonProperty("deleted_members")
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
    DeleteBusinessMembership200Response deleteBusinessMembership200Response = (DeleteBusinessMembership200Response) o;
    return Objects.equals(this.deletedMembers, deleteBusinessMembership200Response.deletedMembers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedMembers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteBusinessMembership200Response {\n");
    sb.append("    deletedMembers: ").append(toIndentedString(deletedMembers)).append("\n");
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

