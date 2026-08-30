package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupDeleteError   {
  @JsonProperty("asset_group_id")
  private String assetGroupId;

  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  /**
   * Asset group id of the exception.
   **/
  public AssetGroupDeleteError assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  
  @ApiModelProperty(value = "Asset group id of the exception.")
  @JsonProperty("asset_group_id")
  public String getAssetGroupId() {
    return assetGroupId;
  }
  public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  /**
   * Error code associated with the error deleting asset group.
   **/
  public AssetGroupDeleteError code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "Error code associated with the error deleting asset group.")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Error message associated with the error deleting asset group.
   **/
  public AssetGroupDeleteError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Error message associated with the error deleting asset group.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetGroupDeleteError assetGroupDeleteError = (AssetGroupDeleteError) o;
    return Objects.equals(assetGroupId, assetGroupDeleteError.assetGroupId) &&
        Objects.equals(code, assetGroupDeleteError.code) &&
        Objects.equals(message, assetGroupDeleteError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupId, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupDeleteError {\n");
    
    sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

