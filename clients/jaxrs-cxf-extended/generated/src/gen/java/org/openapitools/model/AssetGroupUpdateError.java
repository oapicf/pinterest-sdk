package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetGroupUpdateError  {
  
  @ApiModelProperty(value = "")
  private String assetGroupId;

  @ApiModelProperty(value = "")
  private Integer code;

  @ApiModelProperty(value = "")
  private String message;
 /**
  * Get assetGroupId
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
  public AssetGroupUpdateError assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

 /**
  * Get code
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
  public AssetGroupUpdateError code(Integer code) {
    this.code = code;
    return this;
  }

 /**
  * Get message
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
  public AssetGroupUpdateError message(String message) {
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
    AssetGroupUpdateError assetGroupUpdateError = (AssetGroupUpdateError) o;
    return Objects.equals(this.assetGroupId, assetGroupUpdateError.assetGroupId) &&
        Objects.equals(this.code, assetGroupUpdateError.code) &&
        Objects.equals(this.message, assetGroupUpdateError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupId, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetGroupUpdateError {\n");
    
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

