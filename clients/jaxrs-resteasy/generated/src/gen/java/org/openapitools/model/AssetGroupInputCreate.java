package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupInputCreate   {
  
  private AssetGroupBinding assetGroup;
  private String assetGroupDescription;
  private String assetGroupName;
  private List<AssetGroupType> assetGroupTypes = new ArrayList<>();

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("asset_group")
  @Valid
  public AssetGroupBinding getAssetGroup() {
    return assetGroup;
  }
  public void setAssetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
  }

  /**
   * Asset group description.
   **/
  
  @ApiModelProperty(example = "Asset groups that has ad accounts shared in Canada", required = true, value = "Asset group description.")
  @JsonProperty("asset_group_description")
  @NotNull
  public String getAssetGroupDescription() {
    return assetGroupDescription;
  }
  public void setAssetGroupDescription(String assetGroupDescription) {
    this.assetGroupDescription = assetGroupDescription;
  }

  /**
   * Asset Group name.
   **/
  
  @ApiModelProperty(example = "Canada Ad Accounts", required = true, value = "Asset Group name.")
  @JsonProperty("asset_group_name")
  @NotNull
  public String getAssetGroupName() {
    return assetGroupName;
  }
  public void setAssetGroupName(String assetGroupName) {
    this.assetGroupName = assetGroupName;
  }

  /**
   * Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
   **/
  
  @ApiModelProperty(example = "[\"BRAND\",\"LOCATION_OR_LANGUAGE\",\"PRODUCT_LINE\",\"OTHER\"]", required = true, value = "Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.")
  @JsonProperty("asset_group_types")
  @NotNull
  @Valid
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

