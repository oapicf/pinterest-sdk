package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EventProcessingStatus;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConversionApiResponseEventsItems
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionApiResponseEventsItems {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> errorMessage = JsonNullable.<String>undefined();

  private EventProcessingStatus status;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> warningMessage = JsonNullable.<String>undefined();

  public ConversionApiResponseEventsItems() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionApiResponseEventsItems(EventProcessingStatus status) {
    this.status = status;
  }

  public ConversionApiResponseEventsItems errorMessage(String errorMessage) {
    this.errorMessage = JsonNullable.of(errorMessage);
    return this;
  }

  /**
   * Error message containing more information about why the event failed to be processed.
   * @return errorMessage
   */
  
  @Schema(name = "error_message", example = "", description = "Error message containing more information about why the event failed to be processed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_message")
  public JsonNullable<String> getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(JsonNullable<String> errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ConversionApiResponseEventsItems status(EventProcessingStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Whether the event was processed successfully.
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", example = "processed", description = "Whether the event was processed successfully.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public EventProcessingStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(EventProcessingStatus status) {
    this.status = status;
  }

  public ConversionApiResponseEventsItems warningMessage(String warningMessage) {
    this.warningMessage = JsonNullable.of(warningMessage);
    return this;
  }

  /**
   * Warning messages about any fields in the event which are not standard. These are not critical to event processing.
   * @return warningMessage
   */
  
  @Schema(name = "warning_message", example = "", description = "Warning messages about any fields in the event which are not standard. These are not critical to event processing.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ConversionApiResponseEventsItems conversionApiResponseEventsItems = (ConversionApiResponseEventsItems) o;
    return equalsNullable(this.errorMessage, conversionApiResponseEventsItems.errorMessage) &&
        Objects.equals(this.status, conversionApiResponseEventsItems.status) &&
        equalsNullable(this.warningMessage, conversionApiResponseEventsItems.warningMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(errorMessage), status, hashCodeNullable(warningMessage));
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
    sb.append("class ConversionApiResponseEventsItems {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    warningMessage: ").append(toIndentedString(warningMessage)).append("\n");
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

