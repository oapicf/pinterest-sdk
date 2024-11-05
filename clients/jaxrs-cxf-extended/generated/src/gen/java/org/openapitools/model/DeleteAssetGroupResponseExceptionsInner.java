package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteAssetGroupResponseExceptionsInner  {
  
 /**
  * Error code associated with the error deleting asset group.
  */
  @ApiModelProperty(example = "29", value = "Error code associated with the error deleting asset group.")
  private Integer code;

 /**
  * Error message associated with the error deleting asset group.
  */
  @ApiModelProperty(example = "You are not permitted to access that resource.", value = "Error message associated with the error deleting asset group.")
  private String message;

 /**
  * Asset group id of the exception.
  */
  @ApiModelProperty(example = "666791336903426391", value = "Asset group id of the exception.")
  private String assetGroupId;
 /**
  * Error code associated with the error deleting asset group.
  * @return code
  */
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public DeleteAssetGroupResponseExceptionsInner code(Integer code) {
    this.code = code;
    return this;
  }

 /**
  * Error message associated with the error deleting asset group.
  * @return message
  */
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public DeleteAssetGroupResponseExceptionsInner message(String message) {
    this.message = message;
    return this;
  }

 /**
  * Asset group id of the exception.
  * @return assetGroupId
  */
  @JsonProperty("asset_group_id")
  public String getAssetGroupId() {
    return assetGroupId;
  }

  /**
   * Sets the <code>assetGroupId</code> property.
   */
 public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  /**
   * Sets the <code>assetGroupId</code> property.
   */
  public DeleteAssetGroupResponseExceptionsInner assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
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
    DeleteAssetGroupResponseExceptionsInner deleteAssetGroupResponseExceptionsInner = (DeleteAssetGroupResponseExceptionsInner) o;
    return Objects.equals(this.code, deleteAssetGroupResponseExceptionsInner.code) &&
        Objects.equals(this.message, deleteAssetGroupResponseExceptionsInner.message) &&
        Objects.equals(this.assetGroupId, deleteAssetGroupResponseExceptionsInner.assetGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, assetGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteAssetGroupResponseExceptionsInner {\n");
    
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

