package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssetGroupUpdateItemReadOrUpdateItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupUpdateItemReadOrUpdateItem {

  private String assetGroupId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<AssetGroupType> assetGroupTypes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> assetsToAdd = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> assetsToRemove = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String description;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  public AssetGroupUpdateItemReadOrUpdateItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AssetGroupUpdateItemReadOrUpdateItem(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  public AssetGroupUpdateItemReadOrUpdateItem assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  /**
   * Unique identifier of the asset group to update.
   * @return assetGroupId
   */
  @NotNull 
  @Schema(name = "asset_group_id", description = "Unique identifier of the asset group to update.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_group_id")
  public String getAssetGroupId() {
    return assetGroupId;
  }

  @JsonProperty("asset_group_id")
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
  @Valid 
  @Schema(name = "asset_group_types", example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", description = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_group_types")
  public List<AssetGroupType> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  @JsonProperty("asset_group_types")
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
  
  @Schema(name = "assets_to_add", description = "A list of asset ids to add to the asset group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assets_to_add")
  public List<String> getAssetsToAdd() {
    return assetsToAdd;
  }

  @JsonProperty("assets_to_add")
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
  
  @Schema(name = "assets_to_remove", description = "A list of asset ids to remove from the asset group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assets_to_remove")
  public List<String> getAssetsToRemove() {
    return assetsToRemove;
  }

  @JsonProperty("assets_to_remove")
  public void setAssetsToRemove(List<String> assetsToRemove) {
    this.assetsToRemove = assetsToRemove;
  }

  public AssetGroupUpdateItemReadOrUpdateItem description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Asset group description.
   * @return description
   */
  
  @Schema(name = "description", description = "Asset group description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public AssetGroupUpdateItemReadOrUpdateItem name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Asset Group name.
   * @return name
   */
  
  @Schema(name = "name", description = "Asset Group name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

