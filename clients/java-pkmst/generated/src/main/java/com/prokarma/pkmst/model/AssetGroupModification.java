package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AssetGroupBinding;
import com.prokarma.pkmst.model.AssetGroupUpdateError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AssetGroupModification
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupModification   {
  @JsonProperty("exceptions")
  
  private List<AssetGroupUpdateError> exceptions = null;

  @JsonProperty("updated_asset_groups")
  
  private List<AssetGroupBinding> updatedAssetGroups = null;

  public AssetGroupModification exceptions(List<AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public AssetGroupModification addExceptionsItem(AssetGroupUpdateError exceptionsItem) {
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
  @ApiModelProperty(readOnly = true, value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
  public List<AssetGroupUpdateError> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
  }

  public AssetGroupModification updatedAssetGroups(List<AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
    return this;
  }

  public AssetGroupModification addUpdatedAssetGroupsItem(AssetGroupBinding updatedAssetGroupsItem) {
    if (this.updatedAssetGroups == null) {
      this.updatedAssetGroups = new ArrayList<>();
    }
    this.updatedAssetGroups.add(updatedAssetGroupsItem);
    return this;
  }

  /**
   * A list of successfully edited asset groups.
   * @return updatedAssetGroups
   */
  @ApiModelProperty(readOnly = true, value = "A list of successfully edited asset groups.")
  public List<AssetGroupBinding> getUpdatedAssetGroups() {
    return updatedAssetGroups;
  }

  public void setUpdatedAssetGroups(List<AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetGroupModification assetGroupModification = (AssetGroupModification) o;
    return Objects.equals(this.exceptions, assetGroupModification.exceptions) &&
        Objects.equals(this.updatedAssetGroups, assetGroupModification.updatedAssetGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions, updatedAssetGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupModification {\n");
    
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    updatedAssetGroups: ").append(toIndentedString(updatedAssetGroups)).append("\n");
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

