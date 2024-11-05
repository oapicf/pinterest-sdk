package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeleteAssetGroupResponseExceptionsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DeleteAssetGroupResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteAssetGroupResponse   {
  private @Valid List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups = new ArrayList<>();
  private @Valid List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions;

  /**
   * A list of ids of successfully deleted asset groups.
   **/
  public DeleteAssetGroupResponse deletedAssetGroups(List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
    return this;
  }

  
  @ApiModelProperty(value = "A list of ids of successfully deleted asset groups.")
  @JsonProperty("deleted_asset_groups")
  public List< @Pattern(regexp="^\\d+$")String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }

  @JsonProperty("deleted_asset_groups")
  public void setDeletedAssetGroups(List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

  public DeleteAssetGroupResponse addDeletedAssetGroupsItem(String deletedAssetGroupsItem) {
    if (this.deletedAssetGroups == null) {
      this.deletedAssetGroups = new ArrayList<>();
    }

    this.deletedAssetGroups.add(deletedAssetGroupsItem);
    return this;
  }

  public DeleteAssetGroupResponse removeDeletedAssetGroupsItem(String deletedAssetGroupsItem) {
    if (deletedAssetGroupsItem != null && this.deletedAssetGroups != null) {
      this.deletedAssetGroups.remove(deletedAssetGroupsItem);
    }

    return this;
  }
  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   **/
  public DeleteAssetGroupResponse exceptions(List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
  @JsonProperty("exceptions")
  @Valid public List<@Valid DeleteAssetGroupResponseExceptionsInner> getExceptions() {
    return exceptions;
  }

  @JsonProperty("exceptions")
  public void setExceptions(List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
  }

  public DeleteAssetGroupResponse addExceptionsItem(DeleteAssetGroupResponseExceptionsInner exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }

    this.exceptions.add(exceptionsItem);
    return this;
  }

  public DeleteAssetGroupResponse removeExceptionsItem(DeleteAssetGroupResponseExceptionsInner exceptionsItem) {
    if (exceptionsItem != null && this.exceptions != null) {
      this.exceptions.remove(exceptionsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

