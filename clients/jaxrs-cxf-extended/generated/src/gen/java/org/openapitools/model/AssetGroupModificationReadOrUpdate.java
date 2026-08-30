package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupUpdateError;
import org.openapitools.model.AssetGroupUpdateItemReadOrUpdateItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetGroupModificationReadOrUpdate  {
  
 /**
  * A list of asset groups and the data that will be used to update them.
  */
  @ApiModelProperty(value = "A list of asset groups and the data that will be used to update them.")
  @Valid
  private List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate = new ArrayList<>();

 /**
  * A list of errors associated with the asset groups. Will be returned if there is an error.
  */
  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
  @Valid
  private List<@Valid AssetGroupUpdateError> exceptions = new ArrayList<>();

 /**
  * A list of successfully edited asset groups.
  */
  @ApiModelProperty(value = "A list of successfully edited asset groups.")
  @Valid
  private List<@Valid AssetGroupBinding> updatedAssetGroups = new ArrayList<>();
 /**
  * A list of asset groups and the data that will be used to update them.
  * @return assetGroupsToUpdate
  */
  @JsonProperty("asset_groups_to_update")
  public List<@Valid AssetGroupUpdateItemReadOrUpdateItem> getAssetGroupsToUpdate() {
    return assetGroupsToUpdate;
  }

  /**
   * Sets the <code>assetGroupsToUpdate</code> property.
   */
 public void setAssetGroupsToUpdate(List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
  }

  /**
   * Sets the <code>assetGroupsToUpdate</code> property.
   */
  public AssetGroupModificationReadOrUpdate assetGroupsToUpdate(List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
    return this;
  }

  /**
   * Adds a new item to the <code>assetGroupsToUpdate</code> list.
   */
  public AssetGroupModificationReadOrUpdate addAssetGroupsToUpdateItem(AssetGroupUpdateItemReadOrUpdateItem assetGroupsToUpdateItem) {
    this.assetGroupsToUpdate.add(assetGroupsToUpdateItem);
    return this;
  }

 /**
  * A list of errors associated with the asset groups. Will be returned if there is an error.
  * @return exceptions
  */
  @JsonProperty("exceptions")
  public List<@Valid AssetGroupUpdateError> getExceptions() {
    return exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   * <br><em>N.B. <code>exceptions</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setExceptions(List<@Valid AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   * <br><em>N.B. <code>exceptions</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AssetGroupModificationReadOrUpdate exceptions(List<@Valid AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  /**
   * Adds a new item to the <code>exceptions</code> list.
   * <br><em>N.B. <code>exceptions</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AssetGroupModificationReadOrUpdate addExceptionsItem(AssetGroupUpdateError exceptionsItem) {
    this.exceptions.add(exceptionsItem);
    return this;
  }

 /**
  * A list of successfully edited asset groups.
  * @return updatedAssetGroups
  */
  @JsonProperty("updated_asset_groups")
  public List<@Valid AssetGroupBinding> getUpdatedAssetGroups() {
    return updatedAssetGroups;
  }

  /**
   * Sets the <code>updatedAssetGroups</code> property.
   * <br><em>N.B. <code>updatedAssetGroups</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUpdatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
  }

  /**
   * Sets the <code>updatedAssetGroups</code> property.
   * <br><em>N.B. <code>updatedAssetGroups</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AssetGroupModificationReadOrUpdate updatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>updatedAssetGroups</code> list.
   * <br><em>N.B. <code>updatedAssetGroups</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AssetGroupModificationReadOrUpdate addUpdatedAssetGroupsItem(AssetGroupBinding updatedAssetGroupsItem) {
    this.updatedAssetGroups.add(updatedAssetGroupsItem);
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

