package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupUpdateError;
import org.openapitools.model.AssetGroupUpdateItemReadOrUpdateItem;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupModificationReadOrUpdate   {
  @JsonProperty("asset_groups_to_update")
  private List<AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate = null;

  @JsonProperty("exceptions")
  private List<AssetGroupUpdateError> exceptions = null;

  @JsonProperty("updated_asset_groups")
  private List<AssetGroupBinding> updatedAssetGroups = null;

  /**
   * A list of asset groups and the data that will be used to update them.
   **/
  public AssetGroupModificationReadOrUpdate assetGroupsToUpdate(List<AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
    return this;
  }

  
  @ApiModelProperty(value = "A list of asset groups and the data that will be used to update them.")
  @JsonProperty("asset_groups_to_update")
  public List<AssetGroupUpdateItemReadOrUpdateItem> getAssetGroupsToUpdate() {
    return assetGroupsToUpdate;
  }
  public void setAssetGroupsToUpdate(List<AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
  }

  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   **/
  public AssetGroupModificationReadOrUpdate exceptions(List<AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
  @JsonProperty("exceptions")
  public List<AssetGroupUpdateError> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * A list of successfully edited asset groups.
   **/
  public AssetGroupModificationReadOrUpdate updatedAssetGroups(List<AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
    return this;
  }

  
  @ApiModelProperty(value = "A list of successfully edited asset groups.")
  @JsonProperty("updated_asset_groups")
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
    AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate = (AssetGroupModificationReadOrUpdate) o;
    return Objects.equals(assetGroupsToUpdate, assetGroupModificationReadOrUpdate.assetGroupsToUpdate) &&
        Objects.equals(exceptions, assetGroupModificationReadOrUpdate.exceptions) &&
        Objects.equals(updatedAssetGroups, assetGroupModificationReadOrUpdate.updatedAssetGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupsToUpdate, exceptions, updatedAssetGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupModificationReadOrUpdate {\n");
    
    sb.append("    assetGroupsToUpdate: ").append(toIndentedString(assetGroupsToUpdate)).append("\n");
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

