package org.openapitools.model;

import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupUpdateError;
import org.openapitools.model.AssetGroupUpdateItemReadOrUpdateItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AssetGroupModificationReadOrUpdate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of asset groups and the data that will be used to update them.
   */
  @JsonProperty("asset_groups_to_update")
  private List<AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate = new ArrayList<>();

  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   */
  @JsonProperty("exceptions")
  private List<AssetGroupUpdateError> exceptions = new ArrayList<>();

  /**
   * A list of successfully edited asset groups.
   */
  @JsonProperty("updated_asset_groups")
  private List<AssetGroupBinding> updatedAssetGroups = new ArrayList<>();

  /**
   * A list of asset groups and the data that will be used to update them.
   * @return assetGroupsToUpdate
   */
  public List<AssetGroupUpdateItemReadOrUpdateItem> getAssetGroupsToUpdate() {
    return assetGroupsToUpdate;
  }

  public void setAssetGroupsToUpdate(List<AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
  }

  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
   */
  public List<AssetGroupUpdateError> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * A list of successfully edited asset groups.
   * @return updatedAssetGroups
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
