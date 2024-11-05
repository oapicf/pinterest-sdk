/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeleteAssetGroupResponseExceptionsInner;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteAssetGroupResponse   {
  
  private List<String> deletedAssetGroups = new ArrayList<>();
  private List<DeleteAssetGroupResponseExceptionsInner> exceptions;

  /**
   * A list of ids of successfully deleted asset groups.
   */
  public DeleteAssetGroupResponse deletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
    return this;
  }

  
  @ApiModelProperty(value = "A list of ids of successfully deleted asset groups.")
  @JsonProperty("deleted_asset_groups")
  public List<String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }
  public void setDeletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   */
  public DeleteAssetGroupResponse exceptions(List<DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
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

