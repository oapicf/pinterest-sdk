package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Error which occurred when applying a bid options operation to a specific item.
 */

@Schema(name = "AdvancedAuctionOperationError", description = "Error which occurred when applying a bid options operation to a specific item.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdvancedAuctionOperationError {

  private Integer code;

  private String message;

  public AdvancedAuctionOperationError code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * The error code for the item bid option operation validation error
   * @return code
   */
  
  @Schema(name = "code", example = "6", description = "The error code for the item bid option operation validation error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public AdvancedAuctionOperationError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message describing the item bid option operation validation error
   * @return message
   */
  
  @Schema(name = "message", example = "Bid in micro currency should be non-negative", description = "Message describing the item bid option operation validation error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
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
    AdvancedAuctionOperationError advancedAuctionOperationError = (AdvancedAuctionOperationError) o;
    return Objects.equals(this.code, advancedAuctionOperationError.code) &&
        Objects.equals(this.message, advancedAuctionOperationError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedAuctionOperationError {\n");
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

