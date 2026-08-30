package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.model.AssetGroupType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssetGroupInputCreate
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupInputCreate {

  private AssetGroupBinding assetGroup;

  private String assetGroupDescription;

  private String assetGroupName;

  @Valid
  private List<AssetGroupType> assetGroupTypes = new ArrayList<>();

  public AssetGroupInputCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AssetGroupInputCreate(String assetGroupDescription, String assetGroupName, List<AssetGroupType> assetGroupTypes) {
    this.assetGroupDescription = assetGroupDescription;
    this.assetGroupName = assetGroupName;
    this.assetGroupTypes = assetGroupTypes;
  }

  public AssetGroupInputCreate assetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
    return this;
  }

  /**
   * Get assetGroup
   * @return assetGroup
   */
  @Valid 
  @Schema(name = "asset_group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_group")
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
   */
  @NotNull 
  @Schema(name = "asset_group_description", example = "Asset groups that has ad accounts shared in Canada", description = "Asset group description.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_group_description")
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
   */
  @NotNull 
  @Schema(name = "asset_group_name", example = "Canada Ad Accounts", description = "Asset Group name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_group_name")
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
   */
  @NotNull @Valid 
  @Schema(name = "asset_group_types", example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", description = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.", requiredMode = Schema.RequiredMode.REQUIRED)
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

