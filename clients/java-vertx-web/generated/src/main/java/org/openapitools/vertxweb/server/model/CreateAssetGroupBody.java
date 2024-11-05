package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AssetGroupType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAssetGroupBody   {
  
  private String assetGroupName;
  private String assetGroupDescription;
  private List<AssetGroupType> assetGroupTypes = new ArrayList<>();

  public CreateAssetGroupBody () {

  }

  public CreateAssetGroupBody (String assetGroupName, String assetGroupDescription, List<AssetGroupType> assetGroupTypes) {
    this.assetGroupName = assetGroupName;
    this.assetGroupDescription = assetGroupDescription;
    this.assetGroupTypes = assetGroupTypes;
  }

    
  @JsonProperty("asset_group_name")
  public String getAssetGroupName() {
    return assetGroupName;
  }
  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

    
  @JsonProperty("asset_group_description")
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }
  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

    
  @JsonProperty("asset_group_types")
  public List<AssetGroupType> getAssetGroupTypes() {
    return assetGroupTypes;
  }
  public void setAssetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetGroupBody createAssetGroupBody = (CreateAssetGroupBody) o;
    return Objects.equals(assetGroupName, createAssetGroupBody.assetGroupName) &&
        Objects.equals(assetGroupDescription, createAssetGroupBody.assetGroupDescription) &&
        Objects.equals(assetGroupTypes, createAssetGroupBody.assetGroupTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupName, assetGroupDescription, assetGroupTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetGroupBody {\n");
    
    sb.append("    assetGroupName: ").append(toIndentedString(assetGroupName)).append("\n");
    sb.append("    assetGroupDescription: ").append(toIndentedString(assetGroupDescription)).append("\n");
    sb.append("    assetGroupTypes: ").append(toIndentedString(assetGroupTypes)).append("\n");
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
