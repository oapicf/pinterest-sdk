package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeleteAssetGroupResponseExceptionsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteAssetGroupResponse  {
  
 /**
  * A list of ids of successfully deleted asset groups.
  */
  @ApiModelProperty(value = "A list of ids of successfully deleted asset groups.")
  private List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups = new ArrayList<>();

 /**
  * A list of errors associated with the asset groups. Will be returned if there is an error.
  */
  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
  @Valid
  private List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions;
 /**
  * A list of ids of successfully deleted asset groups.
  * @return deletedAssetGroups
  */
  @JsonProperty("deleted_asset_groups")
  public List<@Pattern(regexp = "^\\d+$")String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }

  /**
   * Sets the <code>deletedAssetGroups</code> property.
   */
 public void setDeletedAssetGroups(List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

  /**
   * Sets the <code>deletedAssetGroups</code> property.
   */
  public DeleteAssetGroupResponse deletedAssetGroups(List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>deletedAssetGroups</code> list.
   */
  public DeleteAssetGroupResponse addDeletedAssetGroupsItem(String deletedAssetGroupsItem) {
    this.deletedAssetGroups.add(deletedAssetGroupsItem);
    return this;
  }

 /**
  * A list of errors associated with the asset groups. Will be returned if there is an error.
  * @return exceptions
  */
  @JsonProperty("exceptions")
  public List<@Valid DeleteAssetGroupResponseExceptionsInner> getExceptions() {
    return exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
 public void setExceptions(List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
  public DeleteAssetGroupResponse exceptions(List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  /**
   * Adds a new item to the <code>exceptions</code> list.
   */
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

