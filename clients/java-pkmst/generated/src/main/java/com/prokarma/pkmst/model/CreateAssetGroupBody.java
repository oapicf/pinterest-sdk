package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AssetGroupType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreateAssetGroupBody
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetGroupBody   {
  @JsonProperty("asset_group_name")
  private String assetGroupName;

  @JsonProperty("asset_group_description")
  private String assetGroupDescription;

  @JsonProperty("asset_group_types")
  
  private List<AssetGroupType> assetGroupTypes = new ArrayList<>();

  public CreateAssetGroupBody assetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
    return this;
  }

  /**
   * Asset Group name
   * @return assetGroupName
   */
  @ApiModelProperty(example = "Canada Ad Accounts", required = true, value = "Asset Group name")
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
  @ApiModelProperty(example = "Asset groups that has ad accounts shared in Canada", required = true, value = "Asset group description")
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
  @ApiModelProperty(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", required = true, value = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
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

