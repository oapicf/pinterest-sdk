package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AssetGroupDeleteError implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Asset group id of the exception.
   */
  @JsonProperty("asset_group_id")
  private String assetGroupId;

  /**
   * Error code associated with the error deleting asset group.
   */
  @JsonProperty("code")
  private Integer code;

  /**
   * Error message associated with the error deleting asset group.
   */
  @JsonProperty("message")
  private String message;

  /**
   * Asset group id of the exception.
   * @return assetGroupId
   */
  public String getAssetGroupId() {
    return assetGroupId;
  }

  public void setAssetGroupId(String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  /**
   * Error code associated with the error deleting asset group.
   * @return code
   */
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Error message associated with the error deleting asset group.
   * @return message
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
