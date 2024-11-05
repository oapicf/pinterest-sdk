package org.openapitools.model;

import org.openapitools.model.AssetGroupBinding;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAssetGroupResponse  {
  
  @ApiModelProperty(value = "")
  private AssetGroupBinding assetGroup;
 /**
   * Get assetGroup
   * @return assetGroup
  **/
  @JsonProperty("asset_group")
  public AssetGroupBinding getAssetGroup() {
    return assetGroup;
  }

  public void setAssetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
  }

  public CreateAssetGroupResponse assetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
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
    CreateAssetGroupResponse createAssetGroupResponse = (CreateAssetGroupResponse) o;
    return Objects.equals(this.assetGroup, createAssetGroupResponse.assetGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetGroupResponse {\n");
    
    sb.append("    assetGroup: ").append(toIndentedString(assetGroup)).append("\n");
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

