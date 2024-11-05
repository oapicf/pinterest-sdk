package apimodels;

import apimodels.DeleteAssetGroupResponseExceptionsInner;
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
 * DeleteAssetGroupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DeleteAssetGroupResponse   {
  @JsonProperty("deleted_asset_groups")
  
  private List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups = null;

  @JsonProperty("exceptions")
  @Valid

  private List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions = null;

  public DeleteAssetGroupResponse deletedAssetGroups(List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups) {
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
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }

  public void setDeletedAssetGroups(List<@Pattern(regexp = "^\\d+$")String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

  public DeleteAssetGroupResponse exceptions(List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions) {
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
  **/
  public List<@Valid DeleteAssetGroupResponseExceptionsInner> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<@Valid DeleteAssetGroupResponseExceptionsInner> exceptions) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

