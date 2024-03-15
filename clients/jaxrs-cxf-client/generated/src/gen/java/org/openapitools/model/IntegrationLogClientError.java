package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * System error details included in the log sent by the client.
 **/
@ApiModel(description="System error details included in the log sent by the client.")

public class IntegrationLogClientError  {
  
  @ApiModelProperty(value = "Original cause of the error.")
 /**
   * Original cause of the error.
  **/
  private String cause;

  @ApiModelProperty(value = "Column number in the line of the file that raised the error.")
 /**
   * Column number in the line of the file that raised the error.
  **/
  private Integer columnNumber;

  @ApiModelProperty(value = "Filename where the error happened.")
 /**
   * Filename where the error happened.
  **/
  private String fileName;

  @ApiModelProperty(value = "Line number where the error happened.")
 /**
   * Line number where the error happened.
  **/
  private Integer lineNumber;

  @ApiModelProperty(value = "Human-readable description of the error.")
 /**
   * Human-readable description of the error.
  **/
  private String message;

  @ApiModelProperty(value = "More detail about the message.")
 /**
   * More detail about the message.
  **/
  private String messageDetail;

  @ApiModelProperty(value = "Filename where the error happened.")
 /**
   * Filename where the error happened.
  **/
  private String name;

  @ApiModelProperty(value = "Integer that specifies the error code.")
 /**
   * Integer that specifies the error code.
  **/
  private Integer number;

  @ApiModelProperty(value = "Stack trace of where the error happened.")
 /**
   * Stack trace of where the error happened.
  **/
  private String stackTrace;
 /**
   * Original cause of the error.
   * @return cause
  **/
  @JsonProperty("cause")
  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public IntegrationLogClientError cause(String cause) {
    this.cause = cause;
    return this;
  }

 /**
   * Column number in the line of the file that raised the error.
   * @return columnNumber
  **/
  @JsonProperty("column_number")
  public Integer getColumnNumber() {
    return columnNumber;
  }

  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  public IntegrationLogClientError columnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
    return this;
  }

 /**
   * Filename where the error happened.
   * @return fileName
  **/
  @JsonProperty("file_name")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public IntegrationLogClientError fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

 /**
   * Line number where the error happened.
   * @return lineNumber
  **/
  @JsonProperty("line_number")
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public IntegrationLogClientError lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

 /**
   * Human-readable description of the error.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public IntegrationLogClientError message(String message) {
    this.message = message;
    return this;
  }

 /**
   * More detail about the message.
   * @return messageDetail
  **/
  @JsonProperty("message_detail")
  public String getMessageDetail() {
    return messageDetail;
  }

  public void setMessageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
  }

  public IntegrationLogClientError messageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
    return this;
  }

 /**
   * Filename where the error happened.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IntegrationLogClientError name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Integer that specifies the error code.
   * @return number
  **/
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public IntegrationLogClientError number(Integer number) {
    this.number = number;
    return this;
  }

 /**
   * Stack trace of where the error happened.
   * @return stackTrace
  **/
  @JsonProperty("stack_trace")
  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  public IntegrationLogClientError stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

