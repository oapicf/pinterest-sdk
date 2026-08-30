package org.openapitools.model;

import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AssetGroupInputCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("asset_group")
  private AssetGroupBinding assetGroup;

  /**
   * Asset group description.
   */
  @JsonProperty("asset_group_description")
  private String assetGroupDescription;

  /**
   * Asset Group name.
   */
  @JsonProperty("asset_group_name")
  private String assetGroupName;

  /**
   * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
   */
  @JsonProperty("asset_group_types")
  private List<AssetGroupType> assetGroupTypes = new ArrayList<>();

  /**
   * 
   * @return assetGroup
   */
  public AssetGroupBinding getAssetGroup() {
    return assetGroup;
  }

  public void setAssetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
  }

  /**
   * Asset group description.
   * @return assetGroupDescription
   */
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }

  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  /**
   * Asset Group name.
   * @return assetGroupName
   */
  public String getAssetGroupName() {
    return assetGroupName;
  }

  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  /**
   * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
   * @return assetGroupTypes
   */
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
    AssetGroupInputCreate assetGroupInputCreate = (AssetGroupInputCreate) o;
    return Objects.equals(this.assetGroup, assetGroupInputCreate.assetGroup) &&
        Objects.equals(this.assetGroupDescription, assetGroupInputCreate.assetGroupDescription) &&
        Objects.equals(this.assetGroupName, assetGroupInputCreate.assetGroupName) &&
        Objects.equals(this.assetGroupTypes, assetGroupInputCreate.assetGroupTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroup, assetGroupDescription, assetGroupName, assetGroupTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupInputCreate {\n");
    
    sb.append("    assetGroup: ").append(toIndentedString(assetGroup)).append("\n");
    sb.append("    assetGroupDescription: ").append(toIndentedString(assetGroupDescription)).append("\n");
    sb.append("    assetGroupName: ").append(toIndentedString(assetGroupName)).append("\n");
    sb.append("    assetGroupTypes: ").append(toIndentedString(assetGroupTypes)).append("\n");
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
