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
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.UpdateAssetGroupResponseExceptionsInner;

/**
 * UpdateAssetGroupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateAssetGroupResponse   {
  @JsonProperty("updated_asset_groups")
  private List<@Valid AssetGroupBinding> updatedAssetGroups = null;

  @JsonProperty("exceptions")
  private List<@Valid UpdateAssetGroupResponseExceptionsInner> exceptions = null;

  public UpdateAssetGroupResponse updatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
    return this;
  }

  public UpdateAssetGroupResponse addUpdatedAssetGroupsItem(AssetGroupBinding updatedAssetGroupsItem) {
    if (this.updatedAssetGroups == null) {
      this.updatedAssetGroups = new ArrayList<>();
    }
    this.updatedAssetGroups.add(updatedAssetGroupsItem);
    return this;
  }

   /**
   * A list of successfully edited asset groups.
   * @return updatedAssetGroups
  **/
  @ApiModelProperty(value = "A list of successfully edited asset groups.")
  public List<@Valid AssetGroupBinding> getUpdatedAssetGroups() {
    return updatedAssetGroups;
  }

  public void setUpdatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
  }

  public UpdateAssetGroupResponse exceptions(List<@Valid UpdateAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public UpdateAssetGroupResponse addExceptionsItem(UpdateAssetGroupResponseExceptionsInner exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = ;
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

   /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
  **/
  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
  public List<@Valid UpdateAssetGroupResponseExceptionsInner> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<@Valid UpdateAssetGroupResponseExceptionsInner> exceptions) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

