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
 * System error details included in the log sent by the client.
 */

@Schema(name = "IntegrationLogClientError", description = "System error details included in the log sent by the client.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationLogClientError {

  private String cause;

  private Integer columnNumber;

  private String fileName;

  private Integer lineNumber;

  private String message;

  private String messageDetail;

  private String name;

  private Integer number;

  private String stackTrace;

  public IntegrationLogClientError cause(String cause) {
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
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public IntegrationLogClientError columnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
    return this;
  }

  /**
   * Column number in the line of the file that raised the error.
   * @return columnNumber
  */
  
  @Schema(name = "column_number", description = "Column number in the line of the file that raised the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("column_number")
  public Integer getColumnNumber() {
    return columnNumber;
  }

  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  public IntegrationLogClientError fileName(String fileName) {
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
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public IntegrationLogClientError lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * Line number where the error happened.
   * @return lineNumber
  */
  
  @Schema(name = "line_number", description = "Line number where the error happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("line_number")
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public IntegrationLogClientError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Human-readable description of the error.
   * @return message
  */
  @Size(max = 512) 
  @Schema(name = "message", description = "Human-readable description of the error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IntegrationLogClientError messageDetail(String messageDetail) {
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
  public String getMessageDetail() {
    return messageDetail;
  }

  public void setMessageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
  }

  public IntegrationLogClientError name(String name) {
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
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IntegrationLogClientError number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Integer that specifies the error code.
   * @return number
  */
  
  @Schema(name = "number", description = "Integer that specifies the error code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public IntegrationLogClientError stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  /**
   * Stack trace of where the error happened.
   * @return stackTrace
  */
  
  @Schema(name = "stack_trace", description = "Stack trace of where the error happened.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stack_trace")
  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

