package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="An object with a list of members that were deleted.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletedMembersResponse   {
  
  private List<@Pattern(regexp = "^\\d+$")String> deletedMembers = new ArrayList<>();

  /**
   * List of members whose business membership have been terminated.
   **/
  
  @ApiModelProperty(example = "[\"809944451643622187\",\"383791336903426391\"]", value = "List of members whose business membership have been terminated.")
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

