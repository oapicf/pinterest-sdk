package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

  /**
   * Unique identifier of the asset group to update.
   **/
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "666791336903426391", required = true, value = "Unique identifier of the asset group to update.")
  @JsonProperty("asset_group_id")
  public String getAssetGroupId() {
    return assetGroupId;
  }
  public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  /**
   * Asset Group name
   **/
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Canada Ad Accounts", value = "Asset Group name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Asset group description
   **/
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "Asset groups that has ad accounts shared in Canada", value = "Asset group description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
   **/
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  
  @ApiModelProperty(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", value = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
  @JsonProperty("asset_group_types")
  public List<AssetGroupType> getAssetGroupTypes() {
    return assetGroupTypes;
  }
  public void setAssetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  /**
   * A list of asset ids to add to the asset group.
   **/
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
    return this;
  }

  
  @ApiModelProperty(value = "A list of asset ids to add to the asset group.")
  @JsonProperty("assets_to_add")
  public List<String> getAssetsToAdd() {
    return assetsToAdd;
  }
  public void setAssetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
  }

  /**
   * A list of asset ids to remove from the asset group.
   **/
  public UpdateAssetGroupBodyAssetGroupsToUpdateInner assetsToRemove(List<String> assetsToRemove) {
    this.assetsToRemove = assetsToRemove;
    return this;
  }

  
  @ApiModelProperty(value = "A list of asset ids to remove from the asset group.")
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
    return Objects.equals(assetGroupId, updateAssetGroupBodyAssetGroupsToUpdateInner.assetGroupId) &&
        Objects.equals(name, updateAssetGroupBodyAssetGroupsToUpdateInner.name) &&
        Objects.equals(description, updateAssetGroupBodyAssetGroupsToUpdateInner.description) &&
        Objects.equals(assetGroupTypes, updateAssetGroupBodyAssetGroupsToUpdateInner.assetGroupTypes) &&
        Objects.equals(assetsToAdd, updateAssetGroupBodyAssetGroupsToUpdateInner.assetsToAdd) &&
        Objects.equals(assetsToRemove, updateAssetGroupBodyAssetGroupsToUpdateInner.assetsToRemove);
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

