package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.UpdateAssetGroupResponseExceptionsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateAssetGroupResponse  {
  
  @ApiModelProperty(value = "A list of successfully edited asset groups.")
  @Valid
 /**
   * A list of successfully edited asset groups.
  **/
  private List<@Valid AssetGroupBinding> updatedAssetGroups = new ArrayList<>();

  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
  @Valid
 /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
  **/
  private List<@Valid UpdateAssetGroupResponseExceptionsInner> exceptions;
 /**
   * A list of successfully edited asset groups.
   * @return updatedAssetGroups
  **/
  @JsonProperty("updated_asset_groups")
  public List<@Valid AssetGroupBinding> getUpdatedAssetGroups() {
    return updatedAssetGroups;
  }

  public void setUpdatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
  }

  public UpdateAssetGroupResponse updatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
    return this;
  }

  public UpdateAssetGroupResponse addUpdatedAssetGroupsItem(AssetGroupBinding updatedAssetGroupsItem) {
    this.updatedAssetGroups.add(updatedAssetGroupsItem);
    return this;
  }

 /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public List<@Valid UpdateAssetGroupResponseExceptionsInner> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<@Valid UpdateAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
  }

  public UpdateAssetGroupResponse exceptions(List<@Valid UpdateAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public UpdateAssetGroupResponse addExceptionsItem(UpdateAssetGroupResponseExceptionsInner exceptionsItem) {
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
    UpdateAssetGroupResponse updateAssetGroupResponse = (UpdateAssetGroupResponse) o;
    return Objects.equals(this.updatedAssetGroups, updateAssetGroupResponse.updatedAssetGroups) &&
        Objects.equals(this.exceptions, updateAssetGroupResponse.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedAssetGroups, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetGroupResponse {\n");
    
    sb.append("    updatedAssetGroups: ").append(toIndentedString(updatedAssetGroups)).append("\n");
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

