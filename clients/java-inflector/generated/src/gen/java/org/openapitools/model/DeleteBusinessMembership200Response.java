package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeleteBusinessMembership200Response   {
  @JsonProperty("deleted_members")
  private List<String> deletedMembers = null;

  /**
   **/
  public DeleteBusinessMembership200Response deletedMembers(List<String> deletedMembers) {
    this.deletedMembers = deletedMembers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("deleted_members")
  public List<String> getDeletedMembers() {
    return deletedMembers;
  }
  public void setDeletedMembers(List<String> deletedMembers) {
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
    return Objects.equals(deletedMembers, deleteBusinessMembership200Response.deletedMembers);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

