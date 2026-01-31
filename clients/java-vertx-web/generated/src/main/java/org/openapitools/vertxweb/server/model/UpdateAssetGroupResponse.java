package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AssetGroupBinding;
import org.openapitools.vertxweb.server.model.UpdateAssetGroupResponseExceptionsInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAssetGroupResponse   {
  
  private List<UpdateAssetGroupResponseExceptionsInner> exceptions;
  private List<AssetGroupBinding> updatedAssetGroups = new ArrayList<>();

  public UpdateAssetGroupResponse () {

  }

  public UpdateAssetGroupResponse (List<UpdateAssetGroupResponseExceptionsInner> exceptions, List<AssetGroupBinding> updatedAssetGroups) {
    this.exceptions = exceptions;
    this.updatedAssetGroups = updatedAssetGroups;
  }

    
  @JsonProperty("exceptions")
  public List<UpdateAssetGroupResponseExceptionsInner> getExceptions() {
    return exceptions;
  }
  public void setExceptions(List<UpdateAssetGroupResponseExceptionsInner> exceptions) {
    this.exceptions = exceptions;
  }

    
  @JsonProperty("updated_asset_groups")
  public List<AssetGroupBinding> getUpdatedAssetGroups() {
    return updatedAssetGroups;
  }
  public void setUpdatedAssetGroups(List<AssetGroupBinding> updatedAssetGroups) {
    this.updatedAssetGroups = updatedAssetGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAssetGroupResponse updateAssetGroupResponse = (UpdateAssetGroupResponse) o;
    return Objects.equals(exceptions, updateAssetGroupResponse.exceptions) &&
        Objects.equals(updatedAssetGroups, updateAssetGroupResponse.updatedAssetGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions, updatedAssetGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetGroupResponse {\n");
    
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    updatedAssetGroups: ").append(toIndentedString(updatedAssetGroups)).append("\n");
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
