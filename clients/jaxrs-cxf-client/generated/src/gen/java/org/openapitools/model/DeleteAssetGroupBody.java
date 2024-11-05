package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Request body used to delete asset groups
 **/
@ApiModel(description="Request body used to delete asset groups")

public class DeleteAssetGroupBody  {
  
  @ApiModelProperty(example = "[\"666791336903426391\",\"666791336903426392\"]", required = true, value = "List of ids of asset groups to be deleted")
 /**
   * List of ids of asset groups to be deleted
  **/
  private List<String> assetGroupsToDelete = new ArrayList<>();
 /**
   * List of ids of asset groups to be deleted
   * @return assetGroupsToDelete
  **/
  @JsonProperty("asset_groups_to_delete")
  public List<String> getAssetGroupsToDelete() {
    return assetGroupsToDelete;
  }

  public void setAssetGroupsToDelete(List<String> assetGroupsToDelete) {
    this.assetGroupsToDelete = assetGroupsToDelete;
  }

  public DeleteAssetGroupBody assetGroupsToDelete(List<String> assetGroupsToDelete) {
    this.assetGroupsToDelete = assetGroupsToDelete;
    return this;
  }

  public DeleteAssetGroupBody addAssetGroupsToDeleteItem(String assetGroupsToDeleteItem) {
    this.assetGroupsToDelete.add(assetGroupsToDeleteItem);
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
    DeleteAssetGroupBody deleteAssetGroupBody = (DeleteAssetGroupBody) o;
    return Objects.equals(this.assetGroupsToDelete, deleteAssetGroupBody.assetGroupsToDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupsToDelete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAssetGroupBody {\n");
    
    sb.append("    assetGroupsToDelete: ").append(toIndentedString(assetGroupsToDelete)).append("\n");
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

