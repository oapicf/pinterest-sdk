/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * System error details included in the log sent by the client.
 */

@ApiModel(description = "System error details included in the log sent by the client.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationLogClientError   {
  
  private String cause;
  private Integer columnNumber;
  private String fileName;
  private Integer lineNumber;
  private String message;
  private String messageDetail;
  private String name;
  private Integer number;
  private String stackTrace;

  /**
   * Original cause of the error.
   */
  public IntegrationLogClientError cause(String cause) {
    this.cause = cause;
    return this;
  }

  
  @ApiModelProperty(value = "Original cause of the error.")
  @JsonProperty("cause")
  public String getCause() {
    return cause;
  }
  public void setCause(String cause) {
    this.cause = cause;
  }

  /**
   * Column number in the line of the file that raised the error.
   */
  public IntegrationLogClientError columnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Column number in the line of the file that raised the error.")
  @JsonProperty("column_number")
  public Integer getColumnNumber() {
    return columnNumber;
  }
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  /**
   * Filename where the error happened.
   */
  public IntegrationLogClientError fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  
  @ApiModelProperty(value = "Filename where the error happened.")
  @JsonProperty("file_name")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Line number where the error happened.
   */
  public IntegrationLogClientError lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Line number where the error happened.")
  @JsonProperty("line_number")
  public Integer getLineNumber() {
    return lineNumber;
  }
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Human-readable description of the error.
   */
  public IntegrationLogClientError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Human-readable description of the error.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * More detail about the message.
   */
  public IntegrationLogClientError messageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
    return this;
  }

  
  @ApiModelProperty(value = "More detail about the message.")
  @JsonProperty("message_detail")
  public String getMessageDetail() {
    return messageDetail;
  }
  public void setMessageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
  }

  /**
   * Filename where the error happened.
   */
  public IntegrationLogClientError name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Filename where the error happened.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Integer that specifies the error code.
   */
  public IntegrationLogClientError number(Integer number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(value = "Integer that specifies the error code.")
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }
  public void setNumber(Integer number) {
    this.number = number;
  }

  /**
   * Stack trace of where the error happened.
   */
  public IntegrationLogClientError stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  
  @ApiModelProperty(value = "Stack trace of where the error happened.")
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
    return Objects.equals(cause, integrationLogClientError.cause) &&
        Objects.equals(columnNumber, integrationLogClientError.columnNumber) &&
        Objects.equals(fileName, integrationLogClientError.fileName) &&
        Objects.equals(lineNumber, integrationLogClientError.lineNumber) &&
        Objects.equals(message, integrationLogClientError.message) &&
        Objects.equals(messageDetail, integrationLogClientError.messageDetail) &&
        Objects.equals(name, integrationLogClientError.name) &&
        Objects.equals(number, integrationLogClientError.number) &&
        Objects.equals(stackTrace, integrationLogClientError.stackTrace);
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

