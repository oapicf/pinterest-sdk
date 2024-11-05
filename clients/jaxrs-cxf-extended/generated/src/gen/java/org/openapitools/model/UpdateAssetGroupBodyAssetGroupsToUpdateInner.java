package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateAssetGroupBodyAssetGroupsToUpdateInner  {
  
 /**
  * Unique identifier of the asset group to update.
  */
  @ApiModelProperty(example = "666791336903426391", required = true, value = "Unique identifier of the asset group to update.")
  private String assetGroupId;

 /**
  * Asset Group name
  */
  @ApiModelProperty(example = "Canada Ad Accounts", value = "Asset Group name")
  private String name;

 /**
  * Asset group description
  */
  @ApiModelProperty(example = "Asset groups that has ad accounts shared in Canada", value = "Asset group description")
  private String description;

 /**
  * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  */
  @ApiModelProperty(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", value = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
  @Valid
  private List<AssetGroupType> assetGroupTypes = new ArrayList<>();

 /**
  * A list of asset ids to add to the asset group.
  */
  @ApiModelProperty(value = "A list of asset ids to add to the asset group.")
  private List<String> assetsToAdd = new ArrayList<>();

 /**
  * A list of asset ids to remove from the asset group.
  */
  @ApiModelProperty(value = "A list of asset ids to remove from the asset group.")
  private List<String> assetsToRemove = new ArrayList<>();
 /**
  * Unique identifier of the asset group to update.
  * @return assetGroupId
  */
  @JsonProperty("asset_group_id")
  @NotNull
  public String getAssetGroupId() {
    return assetGroupId;
  }

  /**
   * Sets the <code>assetGroupId</code> property.
   */
 public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  /**
   * Sets the <code>assetGroupId</code> property.
   */
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

 /**
  * Asset Group name
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Asset group description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  * @return assetGroupTypes
  */
  @JsonProperty("asset_group_types")
  public List<AssetGroupType> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  /**
   * Sets the <code>assetGroupTypes</code> property.
   */
 public void setAssetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  /**
   * Sets the <code>assetGroupTypes</code> property.
   */
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>assetGroupTypes</code> list.
   */
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner addAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
    this.assetGroupTypes.add(assetGroupTypesItem);
    return this;
  }

 /**
  * A list of asset ids to add to the asset group.
  * @return assetsToAdd
  */
  @JsonProperty("assets_to_add")
  public List<String> getAssetsToAdd() {
    return assetsToAdd;
  }

  /**
   * Sets the <code>assetsToAdd</code> property.
   */
 public void setAssetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
  }

  /**
   * Sets the <code>assetsToAdd</code> property.
   */
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
    return this;
  }

  /**
   * Adds a new item to the <code>assetsToAdd</code> list.
   */
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner addAssetsToAddItem(String assetsToAddItem) {
    this.assetsToAdd.add(assetsToAddItem);
    return this;
  }

 /**
  * A list of asset ids to remove from the asset group.
  * @return assetsToRemove
  */
  @JsonProperty("assets_to_remove")
  public List<String> getAssetsToRemove() {
    return assetsToRemove;
  }

  /**
   * Sets the <code>assetsToRemove</code> property.
   */
 public void setAssetsToRemove(List<String> assetsToRemove) {
    this.assetsToRemove = assetsToRemove;
  }

  /**
   * Sets the <code>assetsToRemove</code> property.
   */
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetsToRemove(List<String> assetsToRemove) {
    this.assetsToRemove = assetsToRemove;
    return this;
  }

  /**
   * Adds a new item to the <code>assetsToRemove</code> list.
   */
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner addAssetsToRemoveItem(String assetsToRemoveItem) {
    this.assetsToRemove.add(assetsToRemoveItem);
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
    UpdateAssetGroupBodyAssetGroupsToUpdateInner updateAssetGroupBodyAssetGroupsToUpdateInner = (UpdateAssetGroupBodyAssetGroupsToUpdateInner) o;
    return Objects.equals(this.assetGroupId, updateAssetGroupBodyAssetGroupsToUpdateInner.assetGroupId) &&
        Objects.equals(this.name, updateAssetGroupBodyAssetGroupsToUpdateInner.name) &&
        Objects.equals(this.description, updateAssetGroupBodyAssetGroupsToUpdateInner.description) &&
        Objects.equals(this.assetGroupTypes, updateAssetGroupBodyAssetGroupsToUpdateInner.assetGroupTypes) &&
        Objects.equals(this.assetsToAdd, updateAssetGroupBodyAssetGroupsToUpdateInner.assetsToAdd) &&
        Objects.equals(this.assetsToRemove, updateAssetGroupBodyAssetGroupsToUpdateInner.assetsToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupId, name, description, assetGroupTypes, assetsToAdd, assetsToRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetGroupBodyAssetGroupsToUpdateInner {\n");
    
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    assetGroupTypes: ").append(toIndentedString(assetGroupTypes)).append("\n");
    sb.append("    assetsToAdd: ").append(toIndentedString(assetsToAdd)).append("\n");
    sb.append("    assetsToRemove: ").append(toIndentedString(assetsToRemove)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

