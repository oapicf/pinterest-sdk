package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupUpdateError;
import org.openapitools.model.AssetGroupUpdateItemReadOrUpdateItem;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetGroupModificationReadOrUpdate  {
  
 /**
  * A list of asset groups and the data that will be used to update them.
  */
  @ApiModelProperty(value = "A list of asset groups and the data that will be used to update them.")

  private List<AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate = new ArrayList<>();

 /**
  * A list of errors associated with the asset groups. Will be returned if there is an error.
  */
  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")

  private List<AssetGroupUpdateError> exceptions = new ArrayList<>();

 /**
  * A list of successfully edited asset groups.
  */
  @ApiModelProperty(value = "A list of successfully edited asset groups.")

  private List<AssetGroupBinding> updatedAssetGroups = new ArrayList<>();
 /**
   * A list of asset groups and the data that will be used to update them.
   * @return assetGroupsToUpdate
  **/
  @JsonProperty("asset_groups_to_update")
  public List<AssetGroupUpdateItemReadOrUpdateItem> getAssetGroupsToUpdate() {
    return assetGroupsToUpdate;
  }

  public void setAssetGroupsToUpdate(List<AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
  }

  public AssetGroupModificationReadOrUpdate assetGroupsToUpdate(List<AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
    return this;
  }

  public AssetGroupModificationReadOrUpdate addAssetGroupsToUpdateItem(AssetGroupUpdateItemReadOrUpdateItem assetGroupsToUpdateItem) {
    this.assetGroupsToUpdate.add(assetGroupsToUpdateItem);
    return this;
  }

 /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public List<AssetGroupUpdateError> getExceptions() {
    return exceptions;
  }


 /**
   * A list of successfully edited asset groups.
   * @return updatedAssetGroups
  **/
  @JsonProperty("updated_asset_groups")
  public List<AssetGroupBinding> getUpdatedAssetGroups() {
    return updatedAssetGroups;
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
    return Objects.equals(this.assetGroupsToUpdate, assetGroupModificationReadOrUpdate.assetGroupsToUpdate) &&
        Objects.equals(this.exceptions, assetGroupModificationReadOrUpdate.exceptions) &&
        Objects.equals(this.updatedAssetGroups, assetGroupModificationReadOrUpdate.updatedAssetGroups);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

