package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetGroupDeleteError;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupDeletion   {
  
  private List<String> deletedAssetGroups = new ArrayList<>();
  private List<@Valid AssetGroupDeleteError> exceptions;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deleted_asset_groups")
  public List<String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }
  public void setDeletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("exceptions")
  public List<@Valid AssetGroupDeleteError> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<@Valid AssetGroupDeleteError> exceptions) {
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
    AssetGroupDeletion assetGroupDeletion = (AssetGroupDeletion) o;
    return Objects.equals(this.deletedAssetGroups, assetGroupDeletion.deletedAssetGroups) &&
        Objects.equals(this.exceptions, assetGroupDeletion.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAssetGroups, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupDeletion {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

