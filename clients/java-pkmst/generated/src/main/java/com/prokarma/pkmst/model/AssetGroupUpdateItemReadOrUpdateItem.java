package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AssetGroupType;
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
 * AssetGroupUpdateItemReadOrUpdateItem
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupUpdateItemReadOrUpdateItem   {
  @JsonProperty("asset_group_id")
  private String assetGroupId;

  @JsonProperty("asset_group_types")
  
  private List<AssetGroupType> assetGroupTypes = null;

  @JsonProperty("assets_to_add")
  
  private List<String> assetsToAdd = null;

  @JsonProperty("assets_to_remove")
  
  private List<String> assetsToRemove = null;

  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  public AssetGroupUpdateItemReadOrUpdateItem assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  /**
   * Unique identifier of the asset group to update.
   * @return assetGroupId
   */
  @ApiModelProperty(required = true, value = "Unique identifier of the asset group to update.")
  public String getAssetGroupId() {
    return assetGroupId;
  }

  public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  public AssetGroupUpdateItemReadOrUpdateItem assetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  public AssetGroupUpdateItemReadOrUpdateItem addAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
    if (this.assetGroupTypes == null) {
      this.assetGroupTypes = new ArrayList<>();
    }
    this.assetGroupTypes.add(assetGroupTypesItem);
    return this;
  }

  /**
   * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
   * @return assetGroupTypes
   */
  @ApiModelProperty(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", value = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
  public List<AssetGroupType> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  public void setAssetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  public AssetGroupUpdateItemReadOrUpdateItem assetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
    return this;
  }

  public AssetGroupUpdateItemReadOrUpdateItem addAssetsToAddItem(String assetsToAddItem) {
    if (this.assetsToAdd == null) {
      this.assetsToAdd = new ArrayList<>();
    }
    this.assetsToAdd.add(assetsToAddItem);
    return this;
  }

  /**
   * A list of asset ids to add to the asset group.
   * @return assetsToAdd
   */
  @ApiModelProperty(value = "A list of asset ids to add to the asset group.")
  public List<String> getAssetsToAdd() {
    return assetsToAdd;
  }

  public void setAssetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
  }

  public AssetGroupUpdateItemReadOrUpdateItem assetsToRemove(List<String> assetsToRemove) {
    this.assetsToRemove = assetsToRemove;
    return this;
  }

  public AssetGroupUpdateItemReadOrUpdateItem addAssetsToRemoveItem(String assetsToRemoveItem) {
    if (this.assetsToRemove == null) {
      this.assetsToRemove = new ArrayList<>();
    }
    this.assetsToRemove.add(assetsToRemoveItem);
    return this;
  }

  /**
   * A list of asset ids to remove from the asset group.
   * @return assetsToRemove
   */
  @ApiModelProperty(value = "A list of asset ids to remove from the asset group.")
  public List<String> getAssetsToRemove() {
    return assetsToRemove;
  }

  public void setAssetsToRemove(List<String> assetsToRemove) {
    this.assetsToRemove = assetsToRemove;
  }

  public AssetGroupUpdateItemReadOrUpdateItem description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Asset group description.
   * @return description
   */
  @ApiModelProperty(value = "Asset group description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AssetGroupUpdateItemReadOrUpdateItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Asset Group name.
   * @return name
   */
  @ApiModelProperty(value = "Asset Group name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

