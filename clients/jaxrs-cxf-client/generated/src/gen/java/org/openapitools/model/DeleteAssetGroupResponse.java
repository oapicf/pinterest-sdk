package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeleteAssetGroupResponseExceptionsInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteAssetGroupResponse  {
  
  @ApiModelProperty(value = "A list of ids of successfully deleted asset groups.")
 /**
   * A list of ids of successfully deleted asset groups.
  **/
  private List<String> deletedAssetGroups = new ArrayList<>();

  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
 /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
  **/
  private List<DeleteAssetGroupResponseExceptionsInner> exceptions;
 /**
   * A list of ids of successfully deleted asset groups.
   * @return deletedAssetGroups
  **/
  @JsonProperty("deleted_asset_groups")
  public List<String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }

  public void setDeletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

  public DeleteAssetGroupResponse deletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
    return this;
  }

  public DeleteAssetGroupResponse addDeletedAssetGroupsItem(String deletedAssetGroupsItem) {
    this.deletedAssetGroups.add(deletedAssetGroupsItem);
    return this;
  }

 /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public List<DeleteAssetGroupResponseExceptionsInner> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
  }

  public DeleteAssetGroupResponse exceptions(List<DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public DeleteAssetGroupResponse addExceptionsItem(DeleteAssetGroupResponseExceptionsInner exceptionsItem) {
    this.exceptions.add(exceptionsItem);
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
    DeleteAssetGroupResponse deleteAssetGroupResponse = (DeleteAssetGroupResponse) o;
    return Objects.equals(this.deletedAssetGroups, deleteAssetGroupResponse.deletedAssetGroups) &&
        Objects.equals(this.exceptions, deleteAssetGroupResponse.exceptions);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

