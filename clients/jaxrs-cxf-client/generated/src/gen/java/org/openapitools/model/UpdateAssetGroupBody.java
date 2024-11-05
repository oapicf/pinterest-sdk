package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateAssetGroupBodyAssetGroupsToUpdateInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateAssetGroupBody  {
  
  @ApiModelProperty(value = "A list of asset groups and the data that will be used to update them.")
 /**
   * A list of asset groups and the data that will be used to update them.
  **/
  private List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate = new ArrayList<>();
 /**
   * A list of asset groups and the data that will be used to update them.
   * @return assetGroupsToUpdate
  **/
  @JsonProperty("asset_groups_to_update")
  public List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> getAssetGroupsToUpdate() {
    return assetGroupsToUpdate;
  }

  public void setAssetGroupsToUpdate(List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
  }

  public UpdateAssetGroupBody assetGroupsToUpdate(List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
    return this;
  }

  public UpdateAssetGroupBody addAssetGroupsToUpdateItem(UpdateAssetGroupBodyAssetGroupsToUpdateInner assetGroupsToUpdateItem) {
    this.assetGroupsToUpdate.add(assetGroupsToUpdateItem);
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
    UpdateAssetGroupBody updateAssetGroupBody = (UpdateAssetGroupBody) o;
    return Objects.equals(this.assetGroupsToUpdate, updateAssetGroupBody.assetGroupsToUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupsToUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetGroupBody {\n");
    
    sb.append("    assetGroupsToUpdate: ").append(toIndentedString(assetGroupsToUpdate)).append("\n");
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

