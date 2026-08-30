package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Exception details for a batch operation item.
 */

@Schema(name = "Pinterest.Lib.BatchItemException", description = "Exception details for a batch operation item.")
@JsonTypeName("Pinterest.Lib.BatchItemException")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinterestLibBatchItemException {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer code;

  private String message;

  public PinterestLibBatchItemException() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PinterestLibBatchItemException(String message) {
    this.message = message;
  }

  public PinterestLibBatchItemException code(@Nullable Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  
  @Schema(name = "code", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable Integer getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(@Nullable Integer code) {
    this.code = code;
  }

  public PinterestLibBatchItemException message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   */
  @NotNull 
  @Schema(name = "message", example = "Advertiser not found.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
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
    PinterestLibBatchItemException pinterestLibBatchItemException = (PinterestLibBatchItemException) o;
    return Objects.equals(this.code, pinterestLibBatchItemException.code) &&
        Objects.equals(this.message, pinterestLibBatchItemException.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinterestLibBatchItemException {\n");
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

