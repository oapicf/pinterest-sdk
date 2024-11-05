package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeleteAssetGroupResponseExceptionsInner
 */

@JsonTypeName("DeleteAssetGroupResponse_exceptions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteAssetGroupResponseExceptionsInner {

  private Integer code;

  private String message;

  private String assetGroupId;

  public DeleteAssetGroupResponseExceptionsInner code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Error code associated with the error deleting asset group.
   * @return code
   */
  
  @Schema(name = "code", example = "29", description = "Error code associated with the error deleting asset group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
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
  
  @Schema(name = "message", example = "You are not permitted to access that resource.", description = "Error message associated with the error deleting asset group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
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
  
  @Schema(name = "asset_group_id", example = "666791336903426391", description = "Asset group id of the exception.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

