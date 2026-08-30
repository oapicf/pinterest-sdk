package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupUpdateError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetGroupModification  {
  
 /**
  * A list of errors associated with the asset groups. Will be returned if there is an error.
  */
  @ApiModelProperty(value = "A list of errors associated with the asset groups. Will be returned if there is an error.")

  @Valid

  private List<@Valid AssetGroupUpdateError> exceptions = new ArrayList<>();

 /**
  * A list of successfully edited asset groups.
  */
  @ApiModelProperty(value = "A list of successfully edited asset groups.")

  @Valid

  private List<@Valid AssetGroupBinding> updatedAssetGroups = new ArrayList<>();
 /**
   * A list of errors associated with the asset groups. Will be returned if there is an error.
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public List<@Valid AssetGroupUpdateError> getExceptions() {
    return exceptions;
  }


 /**
   * A list of successfully edited asset groups.
   * @return updatedAssetGroups
  **/
  @JsonProperty("updated_asset_groups")
  public List<@Valid AssetGroupBinding> getUpdatedAssetGroups() {
    return updatedAssetGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetGroupModification assetGroupModification = (AssetGroupModification) o;
    return Objects.equals(this.exceptions, assetGroupModification.exceptions) &&
        Objects.equals(this.updatedAssetGroups, assetGroupModification.updatedAssetGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions, updatedAssetGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupModification {\n");
    
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    updatedAssetGroups: ").append(toIndentedString(updatedAssetGroups)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

