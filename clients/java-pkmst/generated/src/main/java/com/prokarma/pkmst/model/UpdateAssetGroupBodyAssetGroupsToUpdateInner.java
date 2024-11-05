package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * UpdateAssetGroupBodyAssetGroupsToUpdateInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateAssetGroupBodyAssetGroupsToUpdateInner   {
  @JsonProperty("asset_group_id")
  private String assetGroupId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("asset_group_types")
  
  private List<AssetGroupType> assetGroupTypes = null;

  @JsonProperty("assets_to_add")
  
  private List<String> assetsToAdd = null;

  @JsonProperty("assets_to_remove")
  
  private List<String> assetsToRemove = null;

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  /**
   * Unique identifier of the asset group to update.
   * @return assetGroupId
   */
  @ApiModelProperty(example = "666791336903426391", required = true, value = "Unique identifier of the asset group to update.")
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
  @ApiModelProperty(example = "Canada Ad Accounts", value = "Asset Group name")
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
  @ApiModelProperty(example = "Asset groups that has ad accounts shared in Canada", value = "Asset group description")
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
  @ApiModelProperty(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", value = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
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
  @ApiModelProperty(value = "A list of asset ids to add to the asset group.")
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
  @ApiModelProperty(value = "A list of asset ids to remove from the asset group.")
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

