package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteBusinessMembership200Response  {
  
  @ApiModelProperty(value = "")

  private List<String> deletedMembers = new ArrayList<>();
 /**
   * Get deletedMembers
   * @return deletedMembers
  **/
  @JsonProperty("deleted_members")
  public List<String> getDeletedMembers() {
    return deletedMembers;
  }

  public void setDeletedMembers(List<String> deletedMembers) {
    this.deletedMembers = deletedMembers;
  }

  public DeleteBusinessMembership200Response deletedMembers(List<String> deletedMembers) {
    this.deletedMembers = deletedMembers;
    return this;
  }

  public DeleteBusinessMembership200Response addDeletedMembersItem(String deletedMembersItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

