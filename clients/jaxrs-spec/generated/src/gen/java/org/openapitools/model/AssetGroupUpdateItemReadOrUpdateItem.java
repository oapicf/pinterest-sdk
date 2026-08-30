package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AssetGroupUpdateItemReadOrUpdateItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupUpdateItemReadOrUpdateItem   {
  private String assetGroupId;
  private @Valid List<AssetGroupType> assetGroupTypes = new ArrayList<>();
  private @Valid List<String> assetsToAdd = new ArrayList<>();
  private @Valid List<String> assetsToRemove = new ArrayList<>();
  private String description;
  private String name;

  public AssetGroupUpdateItemReadOrUpdateItem() {
  }

  @JsonCreator
  public AssetGroupUpdateItemReadOrUpdateItem(
    @JsonProperty(required = true, value = "asset_group_id") String assetGroupId
  ) {
    this.assetGroupId = assetGroupId;
  }

  /**
   * Unique identifier of the asset group to update.
   **/
  public AssetGroupUpdateItemReadOrUpdateItem assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier of the asset group to update.")
  @JsonProperty(required = true, value = "asset_group_id")
  @NotNull public String getAssetGroupId() {
    return assetGroupId;
  }

  @JsonProperty(required = true, value = "asset_group_id")
  public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  /**
   * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
   **/
  public AssetGroupUpdateItemReadOrUpdateItem assetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  
  @ApiModelProperty(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", value = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
  @JsonProperty("asset_group_types")
  public List<AssetGroupType> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  @JsonProperty("asset_group_types")
  public void setAssetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  public AssetGroupUpdateItemReadOrUpdateItem addAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
    if (this.assetGroupTypes == null) {
      this.assetGroupTypes = new ArrayList<>();
    }

    this.assetGroupTypes.add(assetGroupTypesItem);
    return this;
  }

  public AssetGroupUpdateItemReadOrUpdateItem removeAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
    if (assetGroupTypesItem != null && this.assetGroupTypes != null) {
      this.assetGroupTypes.remove(assetGroupTypesItem);
    }

    return this;
  }
  /**
   * A list of asset ids to add to the asset group.
   **/
  public AssetGroupUpdateItemReadOrUpdateItem assetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
    return this;
  }

  
  @ApiModelProperty(value = "A list of asset ids to add to the asset group.")
  @JsonProperty("assets_to_add")
  public List<String> getAssetsToAdd() {
    return assetsToAdd;
  }

  @JsonProperty("assets_to_add")
  public void setAssetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
  }

  public AssetGroupUpdateItemReadOrUpdateItem addAssetsToAddItem(String assetsToAddItem) {
    if (this.assetsToAdd == null) {
      this.assetsToAdd = new ArrayList<>();
    }

    this.assetsToAdd.add(assetsToAddItem);
    return this;
  }

  public AssetGroupUpdateItemReadOrUpdateItem removeAssetsToAddItem(String assetsToAddItem) {
    if (assetsToAddItem != null && this.assetsToAdd != null) {
      this.assetsToAdd.remove(assetsToAddItem);
    }

    return this;
  }
  /**
   * A list of asset ids to remove from the asset group.
   **/
  public AssetGroupUpdateItemReadOrUpdateItem assetsToRemove(List<String> assetsToRemove) {
    this.assetsToRemove = assetsToRemove;
    return this;
  }

  
  @ApiModelProperty(value = "A list of asset ids to remove from the asset group.")
  @JsonProperty("assets_to_remove")
  public List<String> getAssetsToRemove() {
    return assetsToRemove;
  }

  @JsonProperty("assets_to_remove")
  public void setAssetsToRemove(List<String> assetsToRemove) {
    this.assetsToRemove = assetsToRemove;
  }

  public AssetGroupUpdateItemReadOrUpdateItem addAssetsToRemoveItem(String assetsToRemoveItem) {
    if (this.assetsToRemove == null) {
      this.assetsToRemove = new ArrayList<>();
    }

    this.assetsToRemove.add(assetsToRemoveItem);
    return this;
  }

  public AssetGroupUpdateItemReadOrUpdateItem removeAssetsToRemoveItem(String assetsToRemoveItem) {
    if (assetsToRemoveItem != null && this.assetsToRemove != null) {
      this.assetsToRemove.remove(assetsToRemoveItem);
    }

    return this;
  }
  /**
   * Asset group description.
   **/
  public AssetGroupUpdateItemReadOrUpdateItem description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Asset group description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Asset Group name.
   **/
  public AssetGroupUpdateItemReadOrUpdateItem name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Asset Group name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
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
