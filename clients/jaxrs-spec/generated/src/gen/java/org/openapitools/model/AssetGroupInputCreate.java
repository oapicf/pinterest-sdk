package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AssetGroupInputCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupInputCreate   {
  private AssetGroupBinding assetGroup;
  private String assetGroupDescription;
  private String assetGroupName;
  private @Valid List<AssetGroupType> assetGroupTypes = new ArrayList<>();

  public AssetGroupInputCreate() {
  }

  @JsonCreator
  public AssetGroupInputCreate(
    @JsonProperty(required = true, value = "asset_group_description") String assetGroupDescription,
    @JsonProperty(required = true, value = "asset_group_name") String assetGroupName,
    @JsonProperty(required = true, value = "asset_group_types") List<AssetGroupType> assetGroupTypes
  ) {
    this.assetGroupDescription = assetGroupDescription;
    this.assetGroupName = assetGroupName;
    this.assetGroupTypes = assetGroupTypes;
  }

  /**
   **/
  public AssetGroupInputCreate assetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("asset_group")
  @Valid public AssetGroupBinding getAssetGroup() {
    return assetGroup;
  }

  @JsonProperty("asset_group")
  public void setAssetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
  }

  /**
   * Asset group description.
   **/
  public AssetGroupInputCreate assetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
    return this;
  }

  
  @ApiModelProperty(example = "Asset groups that has ad accounts shared in Canada", required = true, value = "Asset group description.")
  @JsonProperty(required = true, value = "asset_group_description")
  @NotNull public String getAssetGroupDescription() {
    return assetGroupDescription;
  }

  @JsonProperty(required = true, value = "asset_group_description")
  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  /**
   * Asset Group name.
   **/
  public AssetGroupInputCreate assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

  
  @ApiModelProperty(example = "Canada Ad Accounts", required = true, value = "Asset Group name.")
  @JsonProperty(required = true, value = "asset_group_name")
  @NotNull public String getAssetGroupName() {
    return assetGroupName;
  }

  @JsonProperty(required = true, value = "asset_group_name")
  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  /**
   * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
   **/
  public AssetGroupInputCreate assetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  
  @ApiModelProperty(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", required = true, value = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
  @JsonProperty(required = true, value = "asset_group_types")
  @NotNull public List<AssetGroupType> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  @JsonProperty(required = true, value = "asset_group_types")
  public void setAssetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  public AssetGroupInputCreate addAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
    if (this.assetGroupTypes == null) {
      this.assetGroupTypes = new ArrayList<>();
    }

    this.assetGroupTypes.add(assetGroupTypesItem);
    return this;
  }

  public AssetGroupInputCreate removeAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
    if (assetGroupTypesItem != null && this.assetGroupTypes != null) {
      this.assetGroupTypes.remove(assetGroupTypesItem);
    }

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
