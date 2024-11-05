package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.UpdateAssetGroupBodyAssetGroupsToUpdateInner;
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
 * UpdateAssetGroupBody
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateAssetGroupBody   {
  @JsonProperty("asset_groups_to_update")
  
  private List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate = null;

  public UpdateAssetGroupBody assetGroupsToUpdate(List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
    return this;
  }

  public UpdateAssetGroupBody addAssetGroupsToUpdateItem(UpdateAssetGroupBodyAssetGroupsToUpdateInner assetGroupsToUpdateItem) {
    if (this.assetGroupsToUpdate == null) {
      this.assetGroupsToUpdate = new ArrayList<>();
    }
    this.assetGroupsToUpdate.add(assetGroupsToUpdateItem);
    return this;
  }

  /**
   * A list of asset groups and the data that will be used to update them.
   * @return assetGroupsToUpdate
   */
  @ApiModelProperty(value = "A list of asset groups and the data that will be used to update them.")
  public List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> getAssetGroupsToUpdate() {
    return assetGroupsToUpdate;
  }

  public void setAssetGroupsToUpdate(List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

