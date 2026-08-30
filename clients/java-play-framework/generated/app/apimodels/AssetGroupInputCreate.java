package apimodels;

import apimodels.AssetGroupBinding;
import apimodels.AssetGroupType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AssetGroupInputCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssetGroupInputCreate   {
  @JsonProperty("asset_group")
  @Valid

  private AssetGroupBinding assetGroup;

  @JsonProperty("asset_group_description")
  @NotNull

  private String assetGroupDescription;

  @JsonProperty("asset_group_name")
  @NotNull

  private String assetGroupName;

  @JsonProperty("asset_group_types")
  @NotNull
@Valid

  private List<AssetGroupType> assetGroupTypes = new ArrayList<>();

  public AssetGroupInputCreate assetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
    return this;
  }

   /**
   * Get assetGroup
   * @return assetGroup
  **/
  public AssetGroupBinding getAssetGroup() {
    return assetGroup;
  }

  public void setAssetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
  }

  public AssetGroupInputCreate assetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
    return this;
  }

   /**
   * Asset group description.
   * @return assetGroupDescription
  **/
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }

  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  public AssetGroupInputCreate assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

   /**
   * Asset Group name.
   * @return assetGroupName
  **/
  public String getAssetGroupName() {
    return assetGroupName;
  }

  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  public AssetGroupInputCreate assetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  public AssetGroupInputCreate addAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
    if (this.assetGroupTypes == null) {
      this.assetGroupTypes = new ArrayList<>();
    }
    this.assetGroupTypes.add(assetGroupTypesItem);
    return this;
  }

   /**
   * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
   * @return assetGroupTypes
  **/
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
    return Objects.equals(assetGroup, assetGroupInputCreate.assetGroup) &&
        Objects.equals(assetGroupDescription, assetGroupInputCreate.assetGroupDescription) &&
        Objects.equals(assetGroupName, assetGroupInputCreate.assetGroupName) &&
        Objects.equals(assetGroupTypes, assetGroupInputCreate.assetGroupTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroup, assetGroupDescription, assetGroupName, assetGroupTypes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

