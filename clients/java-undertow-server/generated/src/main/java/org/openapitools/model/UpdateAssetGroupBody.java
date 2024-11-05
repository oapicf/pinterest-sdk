/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateAssetGroupBodyAssetGroupsToUpdateInner;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateAssetGroupBody   {
  
  private List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate = new ArrayList<>();

  /**
   * A list of asset groups and the data that will be used to update them.
   */
  public UpdateAssetGroupBody assetGroupsToUpdate(List<UpdateAssetGroupBodyAssetGroupsToUpdateInner> assetGroupsToUpdate) {
    this.assetGroupsToUpdate = assetGroupsToUpdate;
    return this;
  }

  
  @ApiModelProperty(value = "A list of asset groups and the data that will be used to update them.")
  @JsonProperty("asset_groups_to_update")
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
    return Objects.equals(assetGroupsToUpdate, updateAssetGroupBody.assetGroupsToUpdate);
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

