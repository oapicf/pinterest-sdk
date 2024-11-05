package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.DeleteAssetGroupResponseExceptionsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DeleteAssetGroupResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteAssetGroupResponse   {
  @JsonProperty("deleted_asset_groups")
  
  private List<String> deletedAssetGroups = null;

  @JsonProperty("exceptions")
  
  private List<DeleteAssetGroupResponseExceptionsInner> exceptions = null;

  public DeleteAssetGroupResponse deletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
    return this;
  }

  public DeleteAssetGroupResponse addDeletedAssetGroupsItem(String deletedAssetGroupsItem) {
    if (this.deletedAssetGroups == null) {
      this.deletedAssetGroups = new ArrayList<>();
    }
    this.deletedAssetGroups.add(deletedAssetGroupsItem);
    return this;
  }

  /**
   * A list of ids of successfully deleted asset groups.
   * @return deletedAssetGroups
   */
  @ApiModelProperty(value = "A list of ids of successfully deleted asset groups.")
  public List<String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }

  public void setDeletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

  public DeleteAssetGroupResponse exceptions(List<DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public DeleteAssetGroupResponse addExceptionsItem(DeleteAssetGroupResponseExceptionsInner exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
   */
  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

