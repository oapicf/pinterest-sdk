package apimodels;

import apimodels.AssetGroupType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AssetGroupUpdateItemReadOrUpdateItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssetGroupUpdateItemReadOrUpdateItem   {
  @JsonProperty("asset_group_id")
  @NotNull

  private String assetGroupId;

  @JsonProperty("asset_group_types")
  @Valid

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(assetGroupId, assetGroupUpdateItemReadOrUpdateItem.assetGroupId) &&
        Objects.equals(assetGroupTypes, assetGroupUpdateItemReadOrUpdateItem.assetGroupTypes) &&
        Objects.equals(assetsToAdd, assetGroupUpdateItemReadOrUpdateItem.assetsToAdd) &&
        Objects.equals(assetsToRemove, assetGroupUpdateItemReadOrUpdateItem.assetsToRemove) &&
        Objects.equals(description, assetGroupUpdateItemReadOrUpdateItem.description) &&
        Objects.equals(name, assetGroupUpdateItemReadOrUpdateItem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupId, assetGroupTypes, assetsToAdd, assetsToRemove, description, name);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

