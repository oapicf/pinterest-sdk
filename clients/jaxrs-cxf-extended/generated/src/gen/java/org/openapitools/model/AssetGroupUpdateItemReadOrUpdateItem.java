package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetGroupUpdateItemReadOrUpdateItem  {
  
 /**
  * Unique identifier of the asset group to update.
  */
  @ApiModelProperty(required = true, value = "Unique identifier of the asset group to update.")
  private String assetGroupId;

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
  * Asset group description.
  */
  @ApiModelProperty(value = "Asset group description.")
  private String description;

 /**
  * Asset Group name.
  */
  @ApiModelProperty(value = "Asset Group name.")
  private String name;
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
  public AssetGroupUpdateItemReadOrUpdateItem assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
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
  public AssetGroupUpdateItemReadOrUpdateItem assetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>assetGroupTypes</code> list.
   */
  public AssetGroupUpdateItemReadOrUpdateItem addAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
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
  public AssetGroupUpdateItemReadOrUpdateItem assetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
    return this;
  }

  /**
   * Adds a new item to the <code>assetsToAdd</code> list.
   */
  public AssetGroupUpdateItemReadOrUpdateItem addAssetsToAddItem(String assetsToAddItem) {
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
  public AssetGroupUpdateItemReadOrUpdateItem assetsToRemove(List<String> assetsToRemove) {
    this.assetsToRemove = assetsToRemove;
    return this;
  }

  /**
   * Adds a new item to the <code>assetsToRemove</code> list.
   */
  public AssetGroupUpdateItemReadOrUpdateItem addAssetsToRemoveItem(String assetsToRemoveItem) {
    this.assetsToRemove.add(assetsToRemoveItem);
    return this;
  }

 /**
  * Asset group description.
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
  public AssetGroupUpdateItemReadOrUpdateItem description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Asset Group name.
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
  public AssetGroupUpdateItemReadOrUpdateItem name(String name) {
    this.name = name;
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
    AssetGroupUpdateItemReadOrUpdateItem assetGroupUpdateItemReadOrUpdateItem = (AssetGroupUpdateItemReadOrUpdateItem) o;
    return Objects.equals(this.assetGroupId, assetGroupUpdateItemReadOrUpdateItem.assetGroupId) &&
        Objects.equals(this.assetGroupTypes, assetGroupUpdateItemReadOrUpdateItem.assetGroupTypes) &&
        Objects.equals(this.assetsToAdd, assetGroupUpdateItemReadOrUpdateItem.assetsToAdd) &&
        Objects.equals(this.assetsToRemove, assetGroupUpdateItemReadOrUpdateItem.assetsToRemove) &&
        Objects.equals(this.description, assetGroupUpdateItemReadOrUpdateItem.description) &&
        Objects.equals(this.name, assetGroupUpdateItemReadOrUpdateItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupId, assetGroupTypes, assetsToAdd, assetsToRemove, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupUpdateItemReadOrUpdateItem {\n");
    
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
    sb.append("    assetGroupTypes: ").append(toIndentedString(assetGroupTypes)).append("\n");
    sb.append("    assetsToAdd: ").append(toIndentedString(assetsToAdd)).append("\n");
    sb.append("    assetsToRemove: ").append(toIndentedString(assetsToRemove)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

