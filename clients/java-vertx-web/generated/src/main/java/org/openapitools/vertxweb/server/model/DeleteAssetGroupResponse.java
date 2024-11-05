package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.DeleteAssetGroupResponseExceptionsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteAssetGroupResponse   {
  
  private List<String> deletedAssetGroups = new ArrayList<>();
  private List<DeleteAssetGroupResponseExceptionsInner> exceptions;

  public DeleteAssetGroupResponse () {

  }

  public DeleteAssetGroupResponse (List<String> deletedAssetGroups, List<DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.deletedAssetGroups = deletedAssetGroups;
    this.exceptions = exceptions;
  }

    
  @JsonProperty("deleted_asset_groups")
  public List<String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }
  public void setDeletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

    
  @JsonProperty("exceptions")
  public List<DeleteAssetGroupResponseExceptionsInner> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteAssetGroupResponse deleteAssetGroupResponse = (DeleteAssetGroupResponse) o;
    return Objects.equals(deletedAssetGroups, deleteAssetGroupResponse.deletedAssetGroups) &&
        Objects.equals(exceptions, deleteAssetGroupResponse.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAssetGroups, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAssetGroupResponse {\n");
    
    sb.append("    deletedAssetGroups: ").append(toIndentedString(deletedAssetGroups)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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
