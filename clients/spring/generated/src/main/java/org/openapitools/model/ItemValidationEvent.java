package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object describing an item validation event
 */

@Schema(name = "ItemValidationEvent", description = "Object describing an item validation event")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ItemValidationEvent {

  private @Nullable String attribute;

  private @Nullable Integer code;

  private @Nullable String message;

  public ItemValidationEvent attribute(@Nullable String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * The attribute that the item validation event references
   * @return attribute
   */
  
  @Schema(name = "attribute", example = "title", description = "The attribute that the item validation event references", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribute")
  public @Nullable String getAttribute() {
    return attribute;
  }

  public void setAttribute(@Nullable String attribute) {
    this.attribute = attribute;
  }

  public ItemValidationEvent code(@Nullable Integer code) {
    this.code = code;
    return this;
  }

  /**
   * The event code that the item validation event references
   * @return code
   */
  
  @Schema(name = "code", example = "106", description = "The event code that the item validation event references", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable Integer getCode() {
    return code;
  }

  public void setCode(@Nullable Integer code) {
    this.code = code;
  }

  public ItemValidationEvent message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Title message describing the item validation event
   * @return message
   */
  
  @Schema(name = "message", example = "Title is missing from product metadata.", description = "Title message describing the item validation event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ItemValidationEvent itemValidationEvent = (ItemValidationEvent) o;
    return Objects.equals(this.attribute, itemValidationEvent.attribute) &&
        Objects.equals(this.code, itemValidationEvent.code) &&
        Objects.equals(this.message, itemValidationEvent.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemValidationEvent {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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

