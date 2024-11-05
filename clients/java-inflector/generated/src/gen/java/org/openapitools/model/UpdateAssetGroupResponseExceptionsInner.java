package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateAssetGroupResponseExceptionsInner   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("asset_group_id")
  private String assetGroupId;

  /**
   * Error code associated with the error editing asset group.
   **/
  public UpdateAssetGroupResponseExceptionsInner code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "29", value = "Error code associated with the error editing asset group.")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Error message associated with the error editing asset group.
   **/
  public UpdateAssetGroupResponseExceptionsInner message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "You are not permitted to access that resource.", value = "Error message associated with the error editing asset group.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Asset group id of the exception.
   **/
  public UpdateAssetGroupResponseExceptionsInner assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "666791336903426391", value = "Asset group id of the exception.")
  @JsonProperty("asset_group_id")
  public String getAssetGroupId() {
    return assetGroupId;
  }
  public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAssetGroupResponseExceptionsInner updateAssetGroupResponseExceptionsInner = (UpdateAssetGroupResponseExceptionsInner) o;
    return Objects.equals(code, updateAssetGroupResponseExceptionsInner.code) &&
        Objects.equals(message, updateAssetGroupResponseExceptionsInner.message) &&
        Objects.equals(assetGroupId, updateAssetGroupResponseExceptionsInner.assetGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, assetGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetGroupResponseExceptionsInner {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
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

