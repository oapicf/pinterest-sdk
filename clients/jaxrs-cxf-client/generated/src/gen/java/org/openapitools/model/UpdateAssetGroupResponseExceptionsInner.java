package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateAssetGroupResponseExceptionsInner  {
  
  @ApiModelProperty(example = "29", value = "Error code associated with the error editing asset group.")
 /**
   * Error code associated with the error editing asset group.
  **/
  private Integer code;

  @ApiModelProperty(example = "You are not permitted to access that resource.", value = "Error message associated with the error editing asset group.")
 /**
   * Error message associated with the error editing asset group.
  **/
  private String message;

  @ApiModelProperty(example = "666791336903426391", value = "Asset group id of the exception.")
 /**
   * Asset group id of the exception.
  **/
  private String assetGroupId;
 /**
   * Error code associated with the error editing asset group.
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public UpdateAssetGroupResponseExceptionsInner code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * Error message associated with the error editing asset group.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UpdateAssetGroupResponseExceptionsInner message(String message) {
    this.message = message;
    return this;
  }

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

  public UpdateAssetGroupResponseExceptionsInner assetGroupId(String assetGroupId) {
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
    UpdateAssetGroupResponseExceptionsInner updateAssetGroupResponseExceptionsInner = (UpdateAssetGroupResponseExceptionsInner) o;
    return Objects.equals(this.code, updateAssetGroupResponseExceptionsInner.code) &&
        Objects.equals(this.message, updateAssetGroupResponseExceptionsInner.message) &&
        Objects.equals(this.assetGroupId, updateAssetGroupResponseExceptionsInner.assetGroupId);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

