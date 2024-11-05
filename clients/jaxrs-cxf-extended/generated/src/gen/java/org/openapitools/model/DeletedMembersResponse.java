package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An object with a list of members that were deleted.
 */
@ApiModel(description="An object with a list of members that were deleted.")

public class DeletedMembersResponse  {
  
 /**
  * List of members whose business membership have been terminated.
  */
  @ApiModelProperty(example = "[\"809944451643622187\",\"383791336903426391\"]", value = "List of members whose business membership have been terminated.")
  private List<@Pattern(regexp = "^\\d+$")String> deletedMembers = new ArrayList<>();
 /**
  * List of members whose business membership have been terminated.
  * @return deletedMembers
  */
  @JsonProperty("deleted_members")
  public List<@Pattern(regexp = "^\\d+$")String> getDeletedMembers() {
    return deletedMembers;
  }

  /**
   * Sets the <code>deletedMembers</code> property.
   */
 public void setDeletedMembers(List<@Pattern(regexp = "^\\d+$")String> deletedMembers) {
    this.deletedMembers = deletedMembers;
  }

  /**
   * Sets the <code>deletedMembers</code> property.
   */
  public DeletedMembersResponse deletedMembers(List<@Pattern(regexp = "^\\d+$")String> deletedMembers) {
    this.deletedMembers = deletedMembers;
    return this;
  }

  /**
   * Adds a new item to the <code>deletedMembers</code> list.
   */
  public DeletedMembersResponse addDeletedMembersItem(String deletedMembersItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

