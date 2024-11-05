package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateAssetGroupBody
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetGroupBody {

  private String assetGroupName;

  private String assetGroupDescription;

  @Valid
  private List<AssetGroupType> assetGroupTypes = new ArrayList<>();

  public CreateAssetGroupBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateAssetGroupBody(String assetGroupName, String assetGroupDescription, List<AssetGroupType> assetGroupTypes) {
    this.assetGroupName = assetGroupName;
    this.assetGroupDescription = assetGroupDescription;
    this.assetGroupTypes = assetGroupTypes;
  }

  public CreateAssetGroupBody assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

  /**
   * Asset Group name
   * @return assetGroupName
   */
  @NotNull 
  @Schema(name = "asset_group_name", example = "Canada Ad Accounts", description = "Asset Group name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_group_name")
  public String getAssetGroupName() {
    return assetGroupName;
  }

  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  public CreateAssetGroupBody assetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
    return this;
  }

  /**
   * Asset group description
   * @return assetGroupDescription
   */
  @NotNull 
  @Schema(name = "asset_group_description", example = "Asset groups that has ad accounts shared in Canada", description = "Asset group description", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_group_description")
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }

  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  public CreateAssetGroupBody assetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  public CreateAssetGroupBody addAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
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
    CreateAssetGroupBody createAssetGroupBody = (CreateAssetGroupBody) o;
    return Objects.equals(this.assetGroupName, createAssetGroupBody.assetGroupName) &&
        Objects.equals(this.assetGroupDescription, createAssetGroupBody.assetGroupDescription) &&
        Objects.equals(this.assetGroupTypes, createAssetGroupBody.assetGroupTypes);
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

