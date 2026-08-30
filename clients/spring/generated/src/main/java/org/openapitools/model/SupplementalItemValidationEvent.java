package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
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
 * Item validation event
 */

@Schema(name = "SupplementalItemValidationEvent", description = "Item validation event")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SupplementalItemValidationEvent {

  private String attribute;

  private Integer code;

  private String message;

  public SupplementalItemValidationEvent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SupplementalItemValidationEvent(String attribute, Integer code, String message) {
    this.attribute = attribute;
    this.code = code;
    this.message = message;
  }

  public SupplementalItemValidationEvent attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * The item attribute referenced by the validation event eg. price, availability, ad_link
   * @return attribute
   */
  @NotNull 
  @Schema(name = "attribute", example = "price", description = "The item attribute referenced by the validation event eg. price, availability, ad_link", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attribute")
  public String getAttribute() {
    return attribute;
  }

  @JsonProperty("attribute")
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public SupplementalItemValidationEvent code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * The event code that the item validation event references
   * @return code
   */
  @NotNull 
  @Schema(name = "code", example = "113", description = "The event code that the item validation event references", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(Integer code) {
    this.code = code;
  }

  public SupplementalItemValidationEvent message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Title message describing the item validation event
   * @return message
   */
  @NotNull 
  @Schema(name = "message", example = "Some supplemental item data was not published due to incorrect formatting", description = "Title message describing the item validation event", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SupplementalItemValidationEvent supplementalItemValidationEvent = (SupplementalItemValidationEvent) o;
    return Objects.equals(this.attribute, supplementalItemValidationEvent.attribute) &&
        Objects.equals(this.code, supplementalItemValidationEvent.code) &&
        Objects.equals(this.message, supplementalItemValidationEvent.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupplementalItemValidationEvent {\n");
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

