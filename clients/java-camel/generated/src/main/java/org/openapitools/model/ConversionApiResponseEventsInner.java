package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConversionApiResponseEventsInner
 */

@JsonTypeName("ConversionApiResponse_events_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionApiResponseEventsInner {

  /**
   * Whether the event was processed successfully.
   */
  public enum StatusEnum {
    FAILED("failed"),
    
    PROCESSED("processed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  private JsonNullable<String> warningMessage = JsonNullable.<String>undefined();

  public ConversionApiResponseEventsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionApiResponseEventsInner(StatusEnum status) {
    this.status = status;
  }

  public ConversionApiResponseEventsInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Whether the event was processed successfully.
   * @return status
  */
  @NotNull 
  @Schema(name = "status", example = "processed", description = "Whether the event was processed successfully.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ConversionApiResponseEventsInner errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.of(errorMessage);
    return this;
  }

  /**
   * Error message containing more information about why the event failed to be processed.
   * @return errorMessage
  */
  
  @Schema(name = "error_message", description = "Error message containing more information about why the event failed to be processed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_message")
  public JsonNullable<String> getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ConversionApiResponseEventsInner warningMessage(String warningMessage) {
    this.warningMessage = JsonNullable.of(warningMessage);
    return this;
  }

  /**
   * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
   * @return warningMessage
  */
  
  @Schema(name = "warning_message", description = "Warning messages about any fields in the event which are not standard. These are not critical to event processing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warning_message")
  public JsonNullable<String> getWarningMessage() {
    return warningMessage;
  }

  public void setWarningMessage(JsonNullable<String> warningMessage) {
    this.warningMessage = warningMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionApiResponseEventsInner conversionApiResponseEventsInner = (ConversionApiResponseEventsInner) o;
    return Objects.equals(this.status, conversionApiResponseEventsInner.status) &&
        equalsNullable(this.errorMessage, conversionApiResponseEventsInner.errorMessage) &&
        equalsNullable(this.warningMessage, conversionApiResponseEventsInner.warningMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, hashCodeNullable(errorMessage), hashCodeNullable(warningMessage));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionApiResponseEventsInner {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
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

