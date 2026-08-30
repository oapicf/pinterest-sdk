package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssetGroupDeleteError;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AssetGroupDeletion implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("deleted_asset_groups")
  private List<String> deletedAssetGroups = new ArrayList<>();

  @JsonProperty("exceptions")
  private List<AssetGroupDeleteError> exceptions;

  /**
   * 
   * @return deletedAssetGroups
   */
  public List<String> getDeletedAssetGroups() {
    return deletedAssetGroups;
  }

  public void setDeletedAssetGroups(List<String> deletedAssetGroups) {
    this.deletedAssetGroups = deletedAssetGroups;
  }

  /**
   * 
   * @return exceptions
   */
  public List<AssetGroupDeleteError> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<AssetGroupDeleteError> exceptions) {
    this.exceptions = exceptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetGroupDeletion assetGroupDeletion = (AssetGroupDeletion) o;
    return Objects.equals(this.deletedAssetGroups, assetGroupDeletion.deletedAssetGroups) &&
        Objects.equals(this.exceptions, assetGroupDeletion.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAssetGroups, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupDeletion {\n");
    
    sb.append("    deletedAssetGroups: ").append(toIndentedString(deletedAssetGroups)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
