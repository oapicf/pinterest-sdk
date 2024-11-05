package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DeleteAssetGroupResponseExceptionsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteAssetGroupResponseExceptionsInner   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("asset_group_id")
  private String assetGroupId;

  public DeleteAssetGroupResponseExceptionsInner code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Error code associated with the error deleting asset group.
   * @return code
   */
  @ApiModelProperty(example = "29", value = "Error code associated with the error deleting asset group.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public DeleteAssetGroupResponseExceptionsInner message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message associated with the error deleting asset group.
   * @return message
   */
  @ApiModelProperty(example = "You are not permitted to access that resource.", value = "Error message associated with the error deleting asset group.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DeleteAssetGroupResponseExceptionsInner assetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  /**
   * Asset group id of the exception.
   * @return assetGroupId
   */
  @ApiModelProperty(example = "666791336903426391", value = "Asset group id of the exception.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

