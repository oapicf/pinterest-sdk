package apimodels;

import apimodels.AssetGroupBinding;
import apimodels.UpdateAssetGroupResponseExceptionsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateAssetGroupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateAssetGroupResponse   {
  @JsonProperty("updated_asset_groups")
  @Valid

  private List<@Valid AssetGroupBinding> updatedAssetGroups = null;

  @JsonProperty("exceptions")
  @Valid

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
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

   /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
  **/
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
    return Objects.equals(updatedAssetGroups, updateAssetGroupResponse.updatedAssetGroups) &&
        Objects.equals(exceptions, updateAssetGroupResponse.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedAssetGroups, exceptions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

