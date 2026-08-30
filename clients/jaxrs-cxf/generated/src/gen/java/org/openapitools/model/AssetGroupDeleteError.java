package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetGroupDeleteError  {
  
 /**
  * Asset group id of the exception.
  */
  @ApiModelProperty(value = "Asset group id of the exception.")

  private String assetGroupId;

 /**
  * Error code associated with the error deleting asset group.
  */
  @ApiModelProperty(value = "Error code associated with the error deleting asset group.")

  private Integer code;

 /**
  * Error message associated with the error deleting asset group.
  */
  @ApiModelProperty(value = "Error message associated with the error deleting asset group.")

  private String message;
 /**
   * Asset group id of the exception.
   * @return assetGroupId
  **/
  @JsonProperty("asset_group_id")
  public String getAssetGroupId() {
    return assetGroupId;
  }

  public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  public AssetGroupDeleteError assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

 /**
   * Error code associated with the error deleting asset group.
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public AssetGroupDeleteError code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * Error message associated with the error deleting asset group.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AssetGroupDeleteError message(String message) {
    this.message = message;
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
    AssetGroupDeleteError assetGroupDeleteError = (AssetGroupDeleteError) o;
    return Objects.equals(this.assetGroupId, assetGroupDeleteError.assetGroupId) &&
        Objects.equals(this.code, assetGroupDeleteError.code) &&
        Objects.equals(this.message, assetGroupDeleteError.message);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

