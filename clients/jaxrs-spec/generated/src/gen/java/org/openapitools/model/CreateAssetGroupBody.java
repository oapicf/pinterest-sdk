package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AssetGroupType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateAssetGroupBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetGroupBody   {
  private String assetGroupName;
  private String assetGroupDescription;
  private @Valid List<AssetGroupType> assetGroupTypes = new ArrayList<>();

  /**
   * Asset Group name
   **/
  public CreateAssetGroupBody assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

  
  @ApiModelProperty(example = "Canada Ad Accounts", required = true, value = "Asset Group name")
  @JsonProperty("asset_group_name")
  @NotNull public String getAssetGroupName() {
    return assetGroupName;
  }

  @JsonProperty("asset_group_name")
  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  /**
   * Asset group description
   **/
  public CreateAssetGroupBody assetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
    return this;
  }

  
  @ApiModelProperty(example = "Asset groups that has ad accounts shared in Canada", required = true, value = "Asset group description")
  @JsonProperty("asset_group_description")
  @NotNull public String getAssetGroupDescription() {
    return assetGroupDescription;
  }

  @JsonProperty("asset_group_description")
  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  /**
   * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
   **/
  public CreateAssetGroupBody assetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
    return this;
  }

  
  @ApiModelProperty(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", required = true, value = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
  @JsonProperty("asset_group_types")
  @NotNull public List<AssetGroupType> getAssetGroupTypes() {
    return assetGroupTypes;
  }

  @JsonProperty("asset_group_types")
  public void setAssetGroupTypes(List<AssetGroupType> assetGroupTypes) {
    this.assetGroupTypes = assetGroupTypes;
  }

  public CreateAssetGroupBody addAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
    if (this.assetGroupTypes == null) {
      this.assetGroupTypes = new ArrayList<>();
    }

    this.assetGroupTypes.add(assetGroupTypesItem);
    return this;
  }

  public CreateAssetGroupBody removeAssetGroupTypesItem(AssetGroupType assetGroupTypesItem) {
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

