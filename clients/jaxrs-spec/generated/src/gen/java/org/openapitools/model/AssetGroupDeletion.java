package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AssetGroupDeletion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupDeletion   {
  private @Valid List<String> deletedAssetGroups = new ArrayList<>();
  private @Valid List<@Valid AssetGroupDeleteError> exceptions;

  public AssetGroupDeletion() {
  }

  /**
   **/
  public AssetGroupDeletion deletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("deleted_asset_groups")
  public List<String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }

  @JsonProperty("deleted_asset_groups")
  public void setDeletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

  public AssetGroupDeletion addDeletedAssetGroupsItem(String deletedAssetGroupsItem) {
    if (this.deletedAssetGroups == null) {
      this.deletedAssetGroups = new ArrayList<>();
    }

    this.deletedAssetGroups.add(deletedAssetGroupsItem);
    return this;
  }

  public AssetGroupDeletion removeDeletedAssetGroupsItem(String deletedAssetGroupsItem) {
    if (deletedAssetGroupsItem != null && this.deletedAssetGroups != null) {
      this.deletedAssetGroups.remove(deletedAssetGroupsItem);
    }

    return this;
  }
  /**
   **/
  public AssetGroupDeletion exceptions(List<@Valid AssetGroupDeleteError> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exceptions")
  @Valid public List<@Valid AssetGroupDeleteError> getExceptions() {
    return exceptions;
  }

  @JsonProperty("exceptions")
  public void setExceptions(List<@Valid AssetGroupDeleteError> exceptions) {
    this.exceptions = exceptions;
  }

  public AssetGroupDeletion addExceptionsItem(AssetGroupDeleteError exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }

    this.exceptions.add(exceptionsItem);
    return this;
  }

  public AssetGroupDeletion removeExceptionsItem(AssetGroupDeleteError exceptionsItem) {
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
