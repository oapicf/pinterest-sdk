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



/**
 * Request body used to delete asset groups
 */

@ApiModel(description = "Request body used to delete asset groups")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteAssetGroupBody   {
  
  private List<String> assetGroupsToDelete = new ArrayList<>();

  /**
   * List of ids of asset groups to be deleted
   */
  public DeleteAssetGroupBody assetGroupsToDelete(List<String> assetGroupsToDelete) {
    this.assetGroupsToDelete = assetGroupsToDelete;
    return this;
  }

  
  @ApiModelProperty(example = "[\"666791336903426391\",\"666791336903426392\"]", required = true, value = "List of ids of asset groups to be deleted")
  @JsonProperty("asset_groups_to_delete")
  public List<String> getAssetGroupsToDelete() {
    return assetGroupsToDelete;
  }
  public void setAssetGroupsToDelete(List<String> assetGroupsToDelete) {
    this.assetGroupsToDelete = assetGroupsToDelete;
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
    return Objects.equals(assetGroupsToDelete, deleteAssetGroupBody.assetGroupsToDelete);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

