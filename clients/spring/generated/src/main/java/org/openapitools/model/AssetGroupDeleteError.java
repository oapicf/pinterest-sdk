package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssetGroupDeleteError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssetGroupDeleteError {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String assetGroupId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer code;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String message;

  public AssetGroupDeleteError assetGroupId(@Nullable String assetGroupId) {
    this.assetGroupId = assetGroupId;
    return this;
  }

  /**
   * Asset group id of the exception.
   * @return assetGroupId
   */
  
  @Schema(name = "asset_group_id", description = "Asset group id of the exception.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_group_id")
  public @Nullable String getAssetGroupId() {
    return assetGroupId;
  }

  @JsonProperty("asset_group_id")
  public void setAssetGroupId(@Nullable String assetGroupId) {
    this.assetGroupId = assetGroupId;
  }

  public AssetGroupDeleteError code(@Nullable Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Error code associated with the error deleting asset group.
   * @return code
   */
  
  @Schema(name = "code", description = "Error code associated with the error deleting asset group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable Integer getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(@Nullable Integer code) {
    this.code = code;
  }

  public AssetGroupDeleteError message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Error message associated with the error deleting asset group.
   * @return message
   */
  
  @Schema(name = "message", description = "Error message associated with the error deleting asset group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  @JsonProperty("message")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

