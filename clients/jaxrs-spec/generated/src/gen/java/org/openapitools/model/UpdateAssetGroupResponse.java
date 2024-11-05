package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.UpdateAssetGroupResponseExceptionsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UpdateAssetGroupResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateAssetGroupResponse   {
  private @Valid List<@Valid AssetGroupBinding> updatedAssetGroups = new ArrayList<>();
  private @Valid List<@Valid UpdateAssetGroupResponseExceptionsInner> exceptions;

  /**
   * A list of successfully edited asset groups.
   **/
  public UpdateAssetGroupResponse updatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
    return this;
  }

  
  @ApiModelProperty(value = "A list of successfully edited asset groups.")
  @JsonProperty("updated_asset_groups")
  @Valid public List<@Valid AssetGroupBinding> getUpdatedAssetGroups() {
    return updatedAssetGroups;
  }

  @JsonProperty("updated_asset_groups")
  public void setUpdatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
  }

  public UpdateAssetGroupResponse addUpdatedAssetGroupsItem(AssetGroupBinding updatedAssetGroupsItem) {
    if (this.updatedAssetGroups == null) {
      this.updatedAssetGroups = new ArrayList<>();
    }

    this.updatedAssetGroups.add(updatedAssetGroupsItem);
    return this;
  }

  public UpdateAssetGroupResponse removeUpdatedAssetGroupsItem(AssetGroupBinding updatedAssetGroupsItem) {
    if (updatedAssetGroupsItem != null && this.updatedAssetGroups != null) {
      this.updatedAssetGroups.remove(updatedAssetGroupsItem);
    }

    return this;
  }
  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   **/
  public UpdateAssetGroupResponse exceptions(List<@Valid UpdateAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
  @JsonProperty("exceptions")
  @Valid public List<@Valid UpdateAssetGroupResponseExceptionsInner> getExceptions() {
    return exceptions;
  }

  @JsonProperty("exceptions")
  public void setExceptions(List<@Valid UpdateAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
  }

  public UpdateAssetGroupResponse addExceptionsItem(UpdateAssetGroupResponseExceptionsInner exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }

    this.exceptions.add(exceptionsItem);
    return this;
  }

  public UpdateAssetGroupResponse removeExceptionsItem(UpdateAssetGroupResponseExceptionsInner exceptionsItem) {
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

