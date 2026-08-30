package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupUpdateError;
import org.openapitools.model.AssetGroupUpdateItemReadOrUpdateItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AssetGroupModificationReadOrUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupModificationReadOrUpdate   {
  private @Valid List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate = new ArrayList<>();
  private @Valid List<@Valid AssetGroupUpdateError> exceptions = new ArrayList<>();
  private @Valid List<@Valid AssetGroupBinding> updatedAssetGroups = new ArrayList<>();

  public AssetGroupModificationReadOrUpdate() {
  }

  /**
   * A list of asset groups and the data that will be used to update them.
   **/
  public AssetGroupModificationReadOrUpdate assetGroupsToUpdate(List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
    return this;
  }

  
  @ApiModelProperty(value = "A list of asset groups and the data that will be used to update them.")
  @JsonProperty("asset_groups_to_update")
  @Valid public List<@Valid AssetGroupUpdateItemReadOrUpdateItem> getAssetGroupsToUpdate() {
    return assetGroupsToUpdate;
  }

  @JsonProperty("asset_groups_to_update")
  public void setAssetGroupsToUpdate(List<@Valid AssetGroupUpdateItemReadOrUpdateItem> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
  }

  public AssetGroupModificationReadOrUpdate addAssetGroupsToUpdateItem(AssetGroupUpdateItemReadOrUpdateItem assetGroupsToUpdateItem) {
    if (this.assetGroupsToUpdate == null) {
      this.assetGroupsToUpdate = new ArrayList<>();
    }

    this.assetGroupsToUpdate.add(assetGroupsToUpdateItem);
    return this;
  }

  public AssetGroupModificationReadOrUpdate removeAssetGroupsToUpdateItem(AssetGroupUpdateItemReadOrUpdateItem assetGroupsToUpdateItem) {
    if (assetGroupsToUpdateItem != null && this.assetGroupsToUpdate != null) {
      this.assetGroupsToUpdate.remove(assetGroupsToUpdateItem);
    }

    return this;
  }
  /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   **/
  public AssetGroupModificationReadOrUpdate exceptions(List<@Valid AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")
  @JsonProperty("exceptions")
  @Valid public List<@Valid AssetGroupUpdateError> getExceptions() {
    return exceptions;
  }

  @JsonProperty("exceptions")
  public void setExceptions(List<@Valid AssetGroupUpdateError> exceptions) {
    this.exceptions = exceptions;
  }

  public AssetGroupModificationReadOrUpdate addExceptionsItem(AssetGroupUpdateError exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }

    this.exceptions.add(exceptionsItem);
    return this;
  }

  public AssetGroupModificationReadOrUpdate removeExceptionsItem(AssetGroupUpdateError exceptionsItem) {
    if (exceptionsItem != null && this.exceptions != null) {
      this.exceptions.remove(exceptionsItem);
    }

    return this;
  }
  /**
   * A list of successfully edited asset groups.
   **/
  public AssetGroupModificationReadOrUpdate updatedAssetGroups(List<@Valid AssetGroupBinding> updatedAssetGroups) {
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

  public AssetGroupModificationReadOrUpdate addUpdatedAssetGroupsItem(AssetGroupBinding updatedAssetGroupsItem) {
    if (this.updatedAssetGroups == null) {
      this.updatedAssetGroups = new ArrayList<>();
    }

    this.updatedAssetGroups.add(updatedAssetGroupsItem);
    return this;
  }

  public AssetGroupModificationReadOrUpdate removeUpdatedAssetGroupsItem(AssetGroupBinding updatedAssetGroupsItem) {
    if (updatedAssetGroupsItem != null && this.updatedAssetGroups != null) {
      this.updatedAssetGroups.remove(updatedAssetGroupsItem);
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
