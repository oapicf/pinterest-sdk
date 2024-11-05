package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * An object with a list of members that were deleted.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "An object with a list of members that were deleted.")
public class DeletedMembersResponse   {
  
  private List<@Pattern(regexp = "^\\d+$")String> deletedMembers = new ArrayList<>();

  /**
   * List of members whose business membership have been terminated.
   **/
  public DeletedMembersResponse deletedMembers(List<@Pattern(regexp = "^\\d+$")String> deletedMembers) {
    this.deletedMembers = deletedMembers;
    return this;
  }

  
  @ApiModelProperty(example = "[\"809944451643622187\",\"383791336903426391\"]", value = "List of members whose business membership have been terminated.")
  @JsonProperty("deleted_members")
  public List<@Pattern(regexp = "^\\d+$")String> getDeletedMembers() {
    return deletedMembers;
  }
  public void setDeletedMembers(List<@Pattern(regexp = "^\\d+$")String> deletedMembers) {
    this.deletedMembers = deletedMembers;
  }

  public DeletedMembersResponse addDeletedMembersItem(String deletedMembersItem) {
    if (this.deletedMembers == null) {
      this.deletedMembers = new ArrayList<>();
    }
    this.deletedMembers.add(deletedMembersItem);
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

