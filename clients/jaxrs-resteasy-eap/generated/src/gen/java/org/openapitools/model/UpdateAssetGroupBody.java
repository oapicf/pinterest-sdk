package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateAssetGroupBodyAssetGroupsToUpdateInner;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateAssetGroupBody   {
  
  private List<@Valid UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate = new ArrayList<>();

  /**
   * A list of asset groups and the data that will be used to update them.
   **/
  
  @ApiModelProperty(value = "A list of asset groups and the data that will be used to update them.")
  @JsonProperty("asset_groups_to_update")
  public List<@Valid UpdateAssetGroupBodyAssetGroupsToUpdateInner> getAssetGroupsToUpdate() {
    return assetGroupsToUpdate;
  }
  public void setAssetGroupsToUpdate(List<@Valid UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate) {
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

