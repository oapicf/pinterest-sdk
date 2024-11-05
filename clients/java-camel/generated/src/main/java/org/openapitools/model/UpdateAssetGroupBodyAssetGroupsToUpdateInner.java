package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateAssetGroupBodyAssetGroupsToUpdateInner
 */

@JsonTypeName("UpdateAssetGroupBody_asset_groups_to_update_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateAssetGroupBodyAssetGroupsToUpdateInner {

  private String assetGroupId;

  private String name;

  private String description;

  @Valid
  private List<AssetGroupType> assetGroupTypes = new ArrayList<>();

  @Valid
  private List<String> assetsToAdd = new ArrayList<>();

  @Valid
  private List<String> assetsToRemove = new ArrayList<>();

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  /**
   * Unique identifier of the asset group to update.
   * @return assetGroupId
   */
  @NotNull 
  @Schema(name = "asset_group_id", example = "666791336903426391", description = "Unique identifier of the asset group to update.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_group_id")
  public String getAssetGroupId() {
    return assetGroupId;
  }

  public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Asset Group name
   * @return name
   */
  
  @Schema(name = "name", example = "Canada Ad Accounts", description = "Asset Group name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Asset group description
   * @return description
   */
  
  @Schema(name = "description", example = "Asset groups that has ad accounts shared in Canada", description = "Asset group description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner addAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
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

  public void setAssetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
    return this;
  }

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner addAssetsToAddItem(String assetsToAddItem) {
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

  public void setAssetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
  }

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetsToRemove(List<String> assetsToRemove) {
    this.assetsToRemove = assetsToRemove;
    return this;
  }

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner addAssetsToRemoveItem(String assetsToRemoveItem) {
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

  public void setAssetsToRemove(List<String> assetsToRemove) {
    this.assetsToRemove = assetsToRemove;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

