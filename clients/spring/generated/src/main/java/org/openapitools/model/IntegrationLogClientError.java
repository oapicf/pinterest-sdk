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
 * System error details included in the log sent by the client.
 */

@Schema(name = "IntegrationLogClientError", description = "System error details included in the log sent by the client.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationLogClientError {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String cause;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer columnNumber;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String fileName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer lineNumber;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String message;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String messageDetail;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer number;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String stackTrace;

  public IntegrationLogClientError cause(@Nullable String cause) {
    this.cause = cause;
    return this;
  }

  /**
   * Original cause of the error.
   * @return cause
   */
  @Size(max = 512) 
  @Schema(name = "cause", description = "Original cause of the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cause")
  public @Nullable String getCause() {
    return cause;
  }

  @JsonProperty("cause")
  public void setCause(@Nullable String cause) {
    this.cause = cause;
  }

  public IntegrationLogClientError columnNumber(@Nullable Integer columnNumber) {
    this.columnNumber = columnNumber;
    return this;
  }

  /**
   * Column number in the line of the file that raised the error.
   * @return columnNumber
   */
  
  @Schema(name = "column_number", description = "Column number in the line of the file that raised the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("column_number")
  public @Nullable Integer getColumnNumber() {
    return columnNumber;
  }

  @JsonProperty("column_number")
  public void setColumnNumber(@Nullable Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  public IntegrationLogClientError fileName(@Nullable String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Filename where the error happened.
   * @return fileName
   */
  @Size(max = 256) 
  @Schema(name = "file_name", description = "Filename where the error happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_name")
  public @Nullable String getFileName() {
    return fileName;
  }

  @JsonProperty("file_name")
  public void setFileName(@Nullable String fileName) {
    this.fileName = fileName;
  }

  public IntegrationLogClientError lineNumber(@Nullable Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * Line number where the error happened.
   * @return lineNumber
   */
  
  @Schema(name = "line_number", description = "Line number where the error happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line_number")
  public @Nullable Integer getLineNumber() {
    return lineNumber;
  }

  @JsonProperty("line_number")
  public void setLineNumber(@Nullable Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public IntegrationLogClientError message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Human-readable description of the error.
   * @return message
   */
  @Size(max = 8192) 
  @Schema(name = "message", description = "Human-readable description of the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public IntegrationLogClientError messageDetail(@Nullable String messageDetail) {
    this.messageDetail = messageDetail;
    return this;
  }

  /**
   * More detail about the message.
   * @return messageDetail
   */
  @Size(max = 1024) 
  @Schema(name = "message_detail", description = "More detail about the message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message_detail")
  public @Nullable String getMessageDetail() {
    return messageDetail;
  }

  @JsonProperty("message_detail")
  public void setMessageDetail(@Nullable String messageDetail) {
    this.messageDetail = messageDetail;
  }

  public IntegrationLogClientError name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Filename where the error happened.
   * @return name
   */
  @Size(max = 256) 
  @Schema(name = "name", description = "Filename where the error happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public IntegrationLogClientError number(@Nullable Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Integer that specifies the error code.
   * @return number
   */
  
  @Schema(name = "number", description = "Integer that specifies the error code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public @Nullable Integer getNumber() {
    return number;
  }

  @JsonProperty("number")
  public void setNumber(@Nullable Integer number) {
    this.number = number;
  }

  public IntegrationLogClientError stackTrace(@Nullable String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  /**
   * Stack trace of where the error happened.
   * @return stackTrace
   */
  
  @Schema(name = "stack_trace", description = "Stack trace of where the error happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stack_trace")
  public @Nullable String getStackTrace() {
    return stackTrace;
  }

  @JsonProperty("stack_trace")
  public void setStackTrace(@Nullable String stackTrace) {
    this.stackTrace = stackTrace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationLogClientError integrationLogClientError = (IntegrationLogClientError) o;
    return Objects.equals(this.cause, integrationLogClientError.cause) &&
        Objects.equals(this.columnNumber, integrationLogClientError.columnNumber) &&
        Objects.equals(this.fileName, integrationLogClientError.fileName) &&
        Objects.equals(this.lineNumber, integrationLogClientError.lineNumber) &&
        Objects.equals(this.message, integrationLogClientError.message) &&
        Objects.equals(this.messageDetail, integrationLogClientError.messageDetail) &&
        Objects.equals(this.name, integrationLogClientError.name) &&
        Objects.equals(this.number, integrationLogClientError.number) &&
        Objects.equals(this.stackTrace, integrationLogClientError.stackTrace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cause, columnNumber, fileName, lineNumber, message, messageDetail, name, number, stackTrace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationLogClientError {\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    columnNumber: ").append(toIndentedString(columnNumber)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageDetail: ").append(toIndentedString(messageDetail)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
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

