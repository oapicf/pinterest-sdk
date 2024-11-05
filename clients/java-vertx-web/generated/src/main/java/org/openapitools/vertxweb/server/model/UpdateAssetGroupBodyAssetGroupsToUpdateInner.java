package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AssetGroupType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAssetGroupBodyAssetGroupsToUpdateInner   {
  
  private String assetGroupId;
  private String name;
  private String description;
  private List<AssetGroupType> assetGroupTypes = new ArrayList<>();
  private List<String> assetsToAdd = new ArrayList<>();
  private List<String> assetsToRemove = new ArrayList<>();

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner () {

  }

  public UpdateAssetGroupBodyAssetGroupsToUpdateInner (String assetGroupId, String name, String description, List<AssetGroupType> assetGroupTypes, List<String> assetsToAdd, List<String> assetsToRemove) {
    this.assetGroupId = assetGroupId;
    this.name = name;
    this.description = description;
    this.assetGroupTypes = assetGroupTypes;
    this.assetsToAdd = assetsToAdd;
    this.assetsToRemove = assetsToRemove;
  }

    
  @JsonProperty("asset_group_id")
  public String getAssetGroupId() {
    return assetGroupId;
  }
  public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("asset_group_types")
  public List<AssetGroupType> getAssetGroupTypes() {
    return assetGroupTypes;
  }
  public void setAssetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

    
  @JsonProperty("assets_to_add")
  public List<String> getAssetsToAdd() {
    return assetsToAdd;
  }
  public void setAssetsToAdd(List<String> assetsToAdd) {
    this.assetsToAdd = assetsToAdd;
  }

    
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
