package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateAssetGroupResponseExceptionsInner
 */

@JsonTypeName("UpdateAssetGroupResponse_exceptions_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UpdateAssetGroupResponseExceptionsInner {

  private @Nullable String assetGroupId;

  private @Nullable Integer code;

  private @Nullable String message;

  public UpdateAssetGroupResponseExceptionsInner assetGroupId(@Nullable String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  /**
   * Asset group id of the exception.
   * @return assetGroupId
   */
  
  @Schema(name = "asset_group_id", example = "666791336903426391", description = "Asset group id of the exception.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_group_id")
  public @Nullable String getAssetGroupId() {
    return assetGroupId;
  }

  public void setAssetGroupId(@Nullable String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  public UpdateAssetGroupResponseExceptionsInner code(@Nullable Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Error code associated with the error editing asset group.
   * @return code
   */
  
  @Schema(name = "code", example = "29", description = "Error code associated with the error editing asset group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable Integer getCode() {
    return code;
  }

  public void setCode(@Nullable Integer code) {
    this.code = code;
  }

  public UpdateAssetGroupResponseExceptionsInner message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message associated with the error editing asset group.
   * @return message
   */
  
  @Schema(name = "message", example = "You are not permitted to access that resource.", description = "Error message associated with the error editing asset group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  public void setMessage(@Nullable String message) {
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
    UpdateAssetGroupResponseExceptionsInner updateAssetGroupResponseExceptionsInner = (UpdateAssetGroupResponseExceptionsInner) o;
    return Objects.equals(this.assetGroupId, updateAssetGroupResponseExceptionsInner.assetGroupId) &&
        Objects.equals(this.code, updateAssetGroupResponseExceptionsInner.code) &&
        Objects.equals(this.message, updateAssetGroupResponseExceptionsInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroupId, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAssetGroupResponseExceptionsInner {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

