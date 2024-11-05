package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.AssetGroupBinding;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAssetGroupResponse   {
  
  private AssetGroupBinding assetGroup;

  public CreateAssetGroupResponse () {

  }

  public CreateAssetGroupResponse (AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
  }

    
  @JsonProperty("asset_group")
  public AssetGroupBinding getAssetGroup() {
    return assetGroup;
  }
  public void setAssetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
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
    return Objects.equals(assetGroup, createAssetGroupResponse.assetGroup);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
