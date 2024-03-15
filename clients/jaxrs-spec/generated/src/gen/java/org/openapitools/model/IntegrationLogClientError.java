package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * System error details included in the log sent by the client.
 **/
@ApiModel(description = "System error details included in the log sent by the client.")
@JsonTypeName("IntegrationLogClientError")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationLogClientError   {
  private @Valid String cause;
  private @Valid Integer columnNumber;
  private @Valid String fileName;
  private @Valid Integer lineNumber;
  private @Valid String message;
  private @Valid String messageDetail;
  private @Valid String name;
  private @Valid Integer number;
  private @Valid String stackTrace;

  /**
   * Original cause of the error.
   **/
  public IntegrationLogClientError cause(String cause) {
    this.cause = cause;
    return this;
  }

  
  @ApiModelProperty(value = "Original cause of the error.")
  @JsonProperty("cause")
 @Size(max=512)  public String getCause() {
    return cause;
  }

  @JsonProperty("cause")
  public void setCause(String cause) {
    this.cause = cause;
  }

  /**
   * Column number in the line of the file that raised the error.
   **/
  public IntegrationLogClientError columnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Column number in the line of the file that raised the error.")
  @JsonProperty("column_number")
  public Integer getColumnNumber() {
    return columnNumber;
  }

  @JsonProperty("column_number")
  public void setColumnNumber(Integer columnNumber) {
    this.columnNumber = columnNumber;
  }

  /**
   * Filename where the error happened.
   **/
  public IntegrationLogClientError fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  
  @ApiModelProperty(value = "Filename where the error happened.")
  @JsonProperty("file_name")
 @Size(max=256)  public String getFileName() {
    return fileName;
  }

  @JsonProperty("file_name")
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Line number where the error happened.
   **/
  public IntegrationLogClientError lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  
  @ApiModelProperty(value = "Line number where the error happened.")
  @JsonProperty("line_number")
  public Integer getLineNumber() {
    return lineNumber;
  }

  @JsonProperty("line_number")
  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  /**
   * Human-readable description of the error.
   **/
  public IntegrationLogClientError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Human-readable description of the error.")
  @JsonProperty("message")
 @Size(max=512)  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * More detail about the message.
   **/
  public IntegrationLogClientError messageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
    return this;
  }

  
  @ApiModelProperty(value = "More detail about the message.")
  @JsonProperty("message_detail")
 @Size(max=1024)  public String getMessageDetail() {
    return messageDetail;
  }

  @JsonProperty("message_detail")
  public void setMessageDetail(String messageDetail) {
    this.messageDetail = messageDetail;
  }

  /**
   * Filename where the error happened.
   **/
  public IntegrationLogClientError name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Filename where the error happened.")
  @JsonProperty("name")
 @Size(max=256)  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Integer that specifies the error code.
   **/
  public IntegrationLogClientError number(Integer number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(value = "Integer that specifies the error code.")
  @JsonProperty("number")
  public Integer getNumber() {
    return number;
  }

  @JsonProperty("number")
  public void setNumber(Integer number) {
    this.number = number;
  }

  /**
   * Stack trace of where the error happened.
   **/
  public IntegrationLogClientError stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  
  @ApiModelProperty(value = "Stack trace of where the error happened.")
  @JsonProperty("stack_trace")
  public String getStackTrace() {
    return stackTrace;
  }

  @JsonProperty("stack_trace")
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

