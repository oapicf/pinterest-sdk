package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssetGroupBinding;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateAssetGroupResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetGroupResponse   {
  private AssetGroupBinding assetGroup;

  /**
   **/
  public CreateAssetGroupResponse assetGroup(AssetGroupBinding assetGroup) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetGroupResponse createAssetGroupResponse = (CreateAssetGroupResponse) o;
    return Objects.equals(this.assetGroup, createAssetGroupResponse.assetGroup);
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

